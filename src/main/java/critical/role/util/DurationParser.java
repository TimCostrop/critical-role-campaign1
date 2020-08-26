package critical.role.util;

public abstract class DurationParser {

	/**
	 * @param timeFormat should be in HH:mm:ss format
	 * @return the amount of seconds
	 */
	public static int parse(String timeFormat) {
		final String[] split = timeFormat.split(":");
		final int hours = Integer.parseInt(split[0]);
		final int minutes = Integer.parseInt(split[1]);
		final int seconds = Integer.parseInt(split[2]);

		return seconds + minutes * 60 + hours * 3600;
	}
}
