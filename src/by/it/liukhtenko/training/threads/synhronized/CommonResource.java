package by.it.liukhtenko.training.threads.synhronized;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CommonResource implements AutoCloseable {
    private FileWriter fileWriter;

    public CommonResource(String file) throws IOException {
        fileWriter = new FileWriter(file, true);
    }

    public synchronized void writing(String info, int i) {
        try {
            fileWriter.append(info + i);
            System.out.println(info + i);
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(500));
            fileWriter.append("->" + info.charAt(0) + i + " ");
            System.out.println("->" + info.charAt(0) + i + " ");
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {
        if (fileWriter != null) {
            fileWriter.close();
        }
    }
}
