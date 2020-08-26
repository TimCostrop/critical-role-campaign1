package critical.role.xml;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Image {
	private String url = "https://d3t3ozftmdmh3i.cloudfront.net/staging/podcast_uploaded_nologo/1428610/bfff4761a218248e.jpeg";
	private String title = "Critical Role";
	private String link = "https://critrole.com";
}
