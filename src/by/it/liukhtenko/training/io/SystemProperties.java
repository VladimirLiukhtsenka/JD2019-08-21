package by.it.liukhtenko.training.io;

import java.io.DataInputStream;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);

    }
}
