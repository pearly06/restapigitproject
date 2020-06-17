package InputOutPut;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class modifyXMLFile {

	public static void main(String[] args) throws TransformerException {
		/*update above XML file via DOM XML Parser.

		Update the staff attribute id = 2
		Update salary value to 200000
		Append a new “age” element under staff
		Delete “firstname” element under staff
		File : file.xml – Newly modified XML file.

		<?xml version="1.0" encoding="UTF-8" standalone="no" ?> 
		<company>
		   <staff id="2">
			<lastname>mook kim</lastname>
			<nickname>mkyong</nickname>
			<salary>2000000</salary> 
		        <age>28</age> 
		   </staff>
		</company>*/
		
		try {
			String filepath = "D:\\programs\\testData\\xml\\file.xml";
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbfactory.newDocumentBuilder();
			Document doc = db.parse(filepath);
			// Get the root element
			Node company = doc.getFirstChild();
			// Get the staff element , it may not working if tag has spaces, or
			// whatever weird characters in front...it's better to use
			// getElementsByTagName() to get it directly.
			// Node staff = company.getFirstChild();
			// Get the staff element by tag name directly
			Node staff = doc.getElementsByTagName("staff").item(0);
			// update staff attribute
			NamedNodeMap attr = staff.getAttributes();
			Node nodeAttr = attr.getNamedItem("id");
			nodeAttr.setTextContent("2");
			// append a new node to staff
			Element age = doc.createElement("age");
			age.appendChild(doc.createTextNode("29"));
			staff.appendChild(age);
			// loop the staff child node
			NodeList list = staff.getChildNodes();
			for(int i=0;i<list.getLength();i++) {
				Node node = list.item(i);
				// get the salary element, and update the value
				if("salary".equals(node.getNodeName())) {
					node.setTextContent("20000000");
				}
				//remove firstname
				if("firstname".equals(node.getNodeName())) {
					staff.removeChild(node);
				}
			}
			// write the content into xml file
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);
			
		}catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		   } catch (IOException ioe) {
			ioe.printStackTrace();
		   } catch (SAXException sae) {
			sae.printStackTrace();
		   }

	}

}
