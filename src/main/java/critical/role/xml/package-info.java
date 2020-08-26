@XmlSchema(
	xmlns = {
		@XmlNs(prefix = "atom", namespaceURI = "http://www.w3.org/2005/Atom"),
		@XmlNs(prefix = "itunes", namespaceURI = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	},
	elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED
)

package critical.role.xml;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;
