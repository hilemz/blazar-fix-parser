package net.openblazar.fixparser.fix;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class FixField {

	private final int field;
	private final String value;

	public FixField(int field, String value) {
		if (value == null) {
			throw new IllegalArgumentException("Fix Field value cannot be null.");
		}
		this.value = value;
		this.field = field;
	}

	public int getField() {
		return field;
	}

	public String getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		FixField fixField = (FixField) o;

		if (getField() != fixField.getField()) return false;
		return getValue().equals(fixField.getValue());

	}

	@Override
	public int hashCode() {
		int result = getField();
		result = 31 * result + getValue().hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "FixField{" +
				"field=" + field +
				", value=" + value +
				'}';
	}

}
