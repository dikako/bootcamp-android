package stockbit.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.Properties;

public class Utils {

    public static Properties ELEMENTS;

    public static void loadElementProperties(String directory) {
        File folder = new File(directory);
        File[] listFiles = folder.listFiles();
        ELEMENTS = new Properties();

        for (int i = 0; i < Objects.requireNonNull(listFiles).length; ++i) {
            if (listFiles[i].isFile() && listFiles[i].toString().contains(".properties")) {
                try {
                    ELEMENTS.load(Files.newInputStream(Paths.get(directory + listFiles[i].getName())));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
