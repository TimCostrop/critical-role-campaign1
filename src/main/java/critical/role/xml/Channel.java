package critical.role.xml;

import critical.role.Feed;
import critical.role.util.LocalDateTimeAdapter;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class Channel {
	private String link = "https://critrole.com";
	private String language = "en-us";
	private String copyright = "Critical Role";
	private Image image = new Image();
	private ItunesOwner owner = new ItunesOwner();

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String explicit = "Yes";

	@XmlElement(name = "image")
	private ItunesImage itunesImage = new ItunesImage();

	@XmlElement(name = "link", namespace = "http://www.w3.org/2005/Atom")
	private AtomLink atomLink = new AtomLink();

	@XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
	private LocalDateTime pubDate = LocalDateTime.of(2020, 8, 26, 20, 16, 48);

	private String title = "Critical Role";

	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String author = "Critical Role";
	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String summary = "Welcome to Critical Role, where a bunch of nerdy-ass voice actors sit around and play Dungeons &amp; Dragons! Join Dungeon Master Matthew Mercer and an all-star cast of world-class performers each week as they travel through imaginary realms for more adventure than you can shake a magic staff at. Need a deeper dive? Be sure to catch Talks Machina with Brian W. Foster, the official Critical Role companion show, right here on Critical Role.";
	@XmlElement(namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String type = "episodic";

	@XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
	private LocalDateTime lastBuildDate = LocalDateTime.of(2020, 8, 26, 20, 16, 48);

	private List<Episode> item = Feed.episodeList;
}
