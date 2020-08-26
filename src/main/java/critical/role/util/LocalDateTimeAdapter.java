package critical.role.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
	@Override
	public LocalDateTime unmarshal(String s) throws Exception {
		return LocalDateTime.parse(s, DateTimeFormatter.RFC_1123_DATE_TIME);
	}

	@Override
	public String marshal(LocalDateTime localDateTime) throws Exception {
		return localDateTime.atZone(ZoneId.of("GMT")).format(DateTimeFormatter.RFC_1123_DATE_TIME);
	}
}
