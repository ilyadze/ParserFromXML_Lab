import model.Car;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = getCars("cars.xml");
        for (Car car:cars) {
            System.out.println(car);
        }


    }


    public static List<Car> getCars(String nameFile) {
        List<Car> cars = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setIgnoringComments(true);

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(nameFile);
            NodeList list = document.getElementsByTagName("car");
            for (int i = 0; i < list.getLength(); i++) {
                Node nNode = list.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    Car car = new Car();
                    car.setManufacture(eElement.getElementsByTagName("manufacture").item(0).getTextContent());
                    car.setModel(eElement.getElementsByTagName("model").item(0).getTextContent());
                    car.setBodyType(eElement.getElementsByTagName("body_type").item(0).getTextContent());
                    car.setColor(eElement.getElementsByTagName("color").item(0).getTextContent());
                    car.setPrice(Double.valueOf(eElement.getElementsByTagName("price").item(0).getTextContent()));
                    car.setEnginePower(Integer.valueOf(eElement.getElementsByTagName("engine_power").item(0).getTextContent()));
                    car.setYearOfIssue(Integer.valueOf(eElement.getElementsByTagName("year_of_issue").item(0).getTextContent()));

                    cars.add(car);
                }
            }



        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        return cars;
    }


}