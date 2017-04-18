
package ReadGirlData;

import Girl.Girl;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class ReadGirlData {
    //this is to read data fromgirl .csv and write to all attributes of girl
     public static List<Girl> readGirlFromCSV(String fileName)throws Exception
        {
            List<Girl> girls = new ArrayList<>();
             Path pathToFile = Paths.get(fileName);
            try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
            {
                String line = br.readLine();
                while (line != null) {
                    String[] attributes = line.split(","); 
                    Girl Girl = createGirl(attributes); 
                    girls.add(Girl); 
                    line = br.readLine(); } 
            } 
            catch (IOException ioe) {
                                ioe.printStackTrace();

            } 
            return girls;
        } 
        public static Girl createGirl(String[] metadata)throws Exception
        { 
            String name = metadata[0];
            int att = Integer.parseInt(metadata[1]);
            int b_att = Integer.parseInt(metadata[2]);
            int main = Integer.parseInt(metadata[3]);
            int b_main = Integer.parseInt(metadata[4]);
            int iq = Integer.parseInt(metadata[5]);
            int b_iq = Integer.parseInt(metadata[6]);
        return new Girl(name, att, b_att, main, b_main, iq, b_iq);
        
        }
}
