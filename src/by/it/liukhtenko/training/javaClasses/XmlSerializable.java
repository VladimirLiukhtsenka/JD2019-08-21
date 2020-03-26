package by.it.liukhtenko.training.javaClasses;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XmlSerializable {
    public static void main(String[] args) {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
                new FileOutputStream
                        ("D:\\Java\\GitHub\\JD2019-08-21\\src\\by\\it\\liukhtenko\\training\\javaClasses\\serial.xml")))) {
        Bean bean = new Bean("I am bean",42);
        xmlEncoder.writeObject(bean);
        xmlEncoder.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Bean bean = new Bean();
        System.out.println(Bean.field + bean.getName());
        String s = "^[\\w-\\+]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-zA-Z]{2,})$";
    }
}
