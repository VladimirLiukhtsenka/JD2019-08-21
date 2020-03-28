package by.it.liukhtenko.training.jd02_07_XML;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;


public class ClassValidator {
    public static void main(String[] args) {
        String sName = "D:\\Java\\GitHub\\JD2019-08-21\\src\\by\\it\\liukhtenko\\training\\jd02_07_XML\\BuyersCar.xsd";
        String xmlFile = "D:\\Java\\GitHub\\JD2019-08-21\\src\\by\\it\\liukhtenko\\training\\jd02_07_XML\\Buyers+xsd.xml";
        String lang = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(lang);
        File shemaLocation = new File(sName);
        try {
            Schema schema = factory.newSchema(shemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(xmlFile);
            validator.validate(source);
            System.out.println("Valid");
        } catch (SAXException e) {
            e.printStackTrace();
            System.out.println("Invalid");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO ERROR");
        }

    }
}
