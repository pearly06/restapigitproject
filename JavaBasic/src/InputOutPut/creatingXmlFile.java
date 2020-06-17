package InputOutPut;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class creatingXmlFile {
	public static final String XmlFilePath ="D:\\programs\\testData\\xml\\xmlfile.xml" ;

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory documentfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentbuilder = documentfactory.newDocumentBuilder();
			Document document = documentbuilder.newDocument();
			// root element
			Element root = document.createElement("Company");
			document.appendChild(root);
			// employee element
			Element employee = document.createElement("Employee");
			root.appendChild(employee);
			// set an attribute to staff element
			Attr attr = document.createAttribute("id");
			attr.setNodeValue("10");
			employee.setAttributeNode(attr);
			  // firstname element
			Element firstName = document.createElement("firstname");
			firstName.appendChild(document.createTextNode("James"));
			employee.appendChild(firstName);
			// lastname element
			Element lastname = document.createElement("lastname");
			lastname.appendChild(document.createTextNode("Harley"));
			employee.appendChild(lastname);
			
			// email element
            Element email = document.createElement("email");
            email.appendChild(document.createTextNode("james@example.org"));
            employee.appendChild(email);
           
            StreamResult streamresult = new StreamResult(new File(XmlFilePath));
            
            // If you use
               // StreamResult result = new StreamResult(System.out);
               // the output will be pushed to the standard output ...
               // You can use that for debugging 
            
         // create the xml file
            //transform the DOM Object to an XML File
            
            TransformerFactory transformerfactory = TransformerFactory.newInstance();
            Transformer transformer = transformerfactory.newTransformer();
            
            DOMSource domsource = new DOMSource(document);
             transformer.transform(domsource, streamresult);
            System.out.println("Done creating XML File");
			
		}catch(ParserConfigurationException | TransformerException pce) {
			pce.printStackTrace();
		}
		
	}

}
