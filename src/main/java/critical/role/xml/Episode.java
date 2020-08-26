package critical.role.xml;

import critical.role.util.LocalDateTimeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlType(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Episode {

	private String title;
	private String description;
	private String guid = UUID.randomUUID().toString();

	@XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
	private LocalDateTime pubDate;

	private Enclosure enclosure;

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String summary;

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String explicit = "Yes";

	private ItunesImage image;

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private int season = 1;

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private int episode;

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String episodeType = "full";

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private int duration;

	public Episode(String url, String title, int episode, LocalDateTime pubDate, int duration) {
		this.enclosure = new Enclosure(url);
		this.title = title;
		this.description = title;
		this.summary = title;
		this.episode = episode;
		this.pubDate = pubDate;
		this.duration = duration;
	}
}
