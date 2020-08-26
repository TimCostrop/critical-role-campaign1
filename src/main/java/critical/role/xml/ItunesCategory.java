package critical.role.xml;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlType(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItunesCategory {

	@XmlAttribute(required = true)
	private String text = "Leisure";

	@XmlElement
	private ItunesCategory category = new ItunesCategory("Games");


	public ItunesCategory(String text) {
		this.text = text;
	}
}
