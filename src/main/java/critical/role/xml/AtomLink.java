package critical.role.xml;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AtomLink {
	@XmlAttribute
	private String href = "https://raw.githubusercontent.com/TimCostrop/critical-role-campaign1/master/feed.xml";
	@XmlAttribute
	private String rel = "self";
	@XmlAttribute
	private String type = "application/rss+xml";
}
