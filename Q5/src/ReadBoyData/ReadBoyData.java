package ReadBoyData;
import Boy.Boy;
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
public class ReadBoyData {
   //this to read the data of boys ie his attribute from the boy.csv 
    public static List<Boy> readboyFromCSV(String fileName)throws Exception
        {
            List<Boy> boys = new ArrayList<>();
             Path pathToFile = Paths.get(fileName);
           try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
            {
   
                // read the first line from the text file 
                String line = br.readLine();
                // loop until all lines are read 
                while (line != null) {
                    // use string.split to load a string array with the values from // each line of // the file, using a comma as the delimiter 
                    String[] attributes = line.split(","); 
                    Boy Boy = createBoy(attributes); 
                    // adding book into ArrayList 
                    boys.add(Boy); 
                    // read next line before looping // if end of file reached, line would be null  
                    line = br.readLine(); } 
            } 
            catch (IOException ioe) {
            
                ioe.printStackTrace();
            } 
            
            return boys;
        } 
    public static Boy createBoy(String[] metadata)throws Exception
        { 
            String name = metadata[0];
            int attractiveness = Integer.parseInt(metadata[1]);
            int budget = Integer.parseInt(metadata[2]);
            int iq = Integer.parseInt(metadata[3]);
            int type=0;
            int iq_required = Integer.parseInt(metadata[4]);        
        // create and return boy of this metadata
        return new Boy(type,name, attractiveness,budget,iq,iq_required);
        
        }
    }
    

    
