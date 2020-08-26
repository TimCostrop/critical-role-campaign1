package critical.role.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItunesImage {
	@XmlAttribute
	public String getHref() {
		return "https://d3t3ozftmdmh3i.cloudfront.net/staging/podcast_uploaded_nologo/1428610/bfff4761a218248e.jpeg";
	}
}
