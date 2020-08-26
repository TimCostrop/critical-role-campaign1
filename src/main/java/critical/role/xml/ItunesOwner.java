package critical.role.xml;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlType(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItunesOwner {
	private String name = "Critical Role";
	private String email = "info@critrole.com";
}
