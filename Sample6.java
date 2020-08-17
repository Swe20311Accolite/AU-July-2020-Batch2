import java.io.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
public class Sample6 {
    public static void main(String args[])
    {
        try {
            DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
            DocumentBuilder d1 = d.newDocumentBuilder();
            File f1 = new File("E:\\intellij\\Assignment\\Samplexml.xml");
            Document document = d1.parse(f1);
            NodeList l = document.getElementsByTagName("stores");
            int n = l.getLength();
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                Element e = (Element) l.item(i);
                if ((e.getNodeName()).equals("stores")) {
                    System.out.println("product id,name,cost " + e.getElementsByTagName("pid").item(0).getTextContent() + " "
                            + e.getElementsByTagName("name").item(0).getTextContent() + ","
                            + e.getElementsByTagName("cost").item(0).getTextContent());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

