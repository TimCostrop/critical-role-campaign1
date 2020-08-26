package critical.role.xml;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlType(name = "enclosure")
@XmlAccessorType(XmlAccessType.FIELD)
public class Enclosure {
	@XmlAttribute
	private String url;
	@XmlAttribute
	private String type = "audio/x-m4a";

	public Enclosure(String url) {
		this.url = url;
	}
}
