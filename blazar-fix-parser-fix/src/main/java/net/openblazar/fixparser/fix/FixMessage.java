package net.openblazar.fixparser.fix;

import net.openblazar.fixparser.fix.enums.FixType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class FixMessage {

	private final List<FixField> fields = new ArrayList<FixField>();
	private final FixType fixType;

	public FixMessage(FixType fixType) {
		if (fixType == null) {
			throw new IllegalArgumentException("Fix Type cannot be null");
		}
		this.fixType = fixType;
	}

	public boolean addField(FixField fixField) {
		return fields.add(fixField);
	}

	public List<FixField> getFields() {
		return Collections.unmodifiableList(fields);
	}

	public boolean removeField(FixField fixField) {
		return fields.remove(fixField);
	}

	public FixType getFixType() {
		return fixType;
	}

	@Override
	public String toString() {
		return "FixMessage{" +
				"fields=" + fields +
				'}';
	}

}
