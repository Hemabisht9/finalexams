package assignmentfinalexams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileread {

    public static void main(String[] args) {
    	doesFileExist("src\\assignmentfinalexams\\infofile.properties");
    }

    public static void doesFileExist(String filePath) {
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("src\\assignmentfinalexams\\infofile.properties");
            properties.load(inputStream);

            for (String keyword : properties.stringPropertyNames()) {
                System.out.println("Keyword: " + keyword);
                String meanings = properties.getProperty(keyword);
                String[] meaningsArray = meanings.split(",");
                for (String meaning : meaningsArray) {
                    System.out.println(" - " + meaning.trim());
                    System.out.println(" - " + meaning);
                }
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

