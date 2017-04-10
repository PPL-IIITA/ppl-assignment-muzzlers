
package Gift;

import Gifts.Gift;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class ReadGifts {
    public static List<Gift> readGiftFromCSV(String fileName)
        {
            List<Gift> gifts = new ArrayList<>();
             Path pathToFile = Paths.get(fileName);
        
            // create an instance of BufferedReader
            // using try with resource, Java 8.2 feature to close resources 
            try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
            {
                // read the first line from the text file 
                String line = br.readLine();
                // loop until all lines are read 
                while (line != null) {
                    // use string.split to load a string array with the values from // each line of // the file, using a comma as the delimiter 
                    String[] attributes = line.split(","); 
                    Gift Gift= createGift(attributes); 
                    // adding Gifts into ArrayList 
                    gifts.add(Gift); 
                    // read next line before looping // if end of file reached, line would be null  
                    line = br.readLine(); } 
            } 
            catch (IOException ioe) {
            } 
            
            return gifts;
        } 
    
    public static Gift createGift(String[] metadata)
        { //creating the Gift local data 
            String name = metadata[0];
            int price = Integer.parseInt(metadata[1]);
            int budget = Integer.parseInt(metadata[2]);
            int a = Integer.parseInt(metadata[3]);
            int ram;
             ram = Integer.parseInt(metadata[4]);
        
        // create and return Gift of this metadata
        return new Gift(name, price,budget);
        
        }


    
}
