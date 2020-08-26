package critical.role;

import critical.role.xml.Rss;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {
	public static void main(String[] args) throws Exception {
		final JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);
		final Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(new Rss(), new File("feed.xml"));
	}
}
