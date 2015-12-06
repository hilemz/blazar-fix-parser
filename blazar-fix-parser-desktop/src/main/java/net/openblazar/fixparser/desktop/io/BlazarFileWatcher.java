package net.openblazar.fixparser.desktop.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class BlazarFileWatcher implements Runnable {

	private final static Logger LOGGER = LoggerFactory.getLogger(BlazarFileWatcher.class);

	private final Map<WatchKey, Path> registeredPaths = new ConcurrentHashMap<WatchKey, Path>();
	private final Set<BlazarFileWatcherListener> listeners = new
			HashSet<BlazarFileWatcherListener>();

	private final WatchService watchService;
	private volatile boolean run = false;

	public BlazarFileWatcher() throws IOException {
		this.watchService = FileSystems.getDefault().newWatchService();
	}

	public void addFileWatcherListener(BlazarFileWatcherListener listener) {
		synchronized (listeners) {
			listeners.add(listener);
		}
	}

	public void removeFileWatcherListener(BlazarFileWatcherListener listener) {
		synchronized (listeners) {
			listeners.remove(listener);
		}
	}

	private WatchEvent<Path> cast(WatchEvent<?> event) {
		return (WatchEvent<Path>) event;
	}

	public void registerFile(Path path) throws IOException {
		WatchKey key = path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
		registeredPaths.put(key, path);

		LOGGER.info("Watch Service for file " + path.getFileName() + " has been registered.");
	}

	public void run() {
		run = true;
		while (run) {
			WatchKey key = null;
			try {
				key = watchService.take();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			Path path = registeredPaths.get(key);
			if (path == null) {
				continue;
			}

			for (WatchEvent<?> event : key.pollEvents()) {
				WatchEvent.Kind kind = event.kind();

				if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
					notifyListeners(path);
				}
			}
		}
	}

	public void sendStop() throws IOException {
		run = false;
		watchService.close();
	}

	private void notifyListeners(final Path path) {
		synchronized (listeners) {
			for (BlazarFileWatcherListener listener : listeners) {
				listener.onFileModified(path);
			}
		}
	}
}
