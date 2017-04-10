package CreateCSV;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Dollar
 */
public class CreateCSV {
     
    static String FILENAME;
    public static void generateBoys(){
     FILENAME = "boy.txt";
     //System.out.println("done before");

     /*for(int i=1 ; i<=100 ; i++){
      String s = "B" + i + "," + ThreadLocalRandom.current().nextInt(4, 11) + "," + ThreadLocalRandom.current().nextInt(60000,90000) + "," + ThreadLocalRandom.current().nextInt(110,130) + "," + ThreadLocalRandom.current().nextInt(110,130);
      */
     try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,false))){
        for(int i=1 ; i<=100 ; i++){
        String s = "B" + i + "," + ThreadLocalRandom.current().nextInt(4, 11) + "," + ThreadLocalRandom.current().nextInt(60000,90000) + "," + ThreadLocalRandom.current().nextInt(110,130) + "," + ThreadLocalRandom.current().nextInt(110,130);
        bw.write(s);
        bw.newLine();
       // System.out.println("done");

        }
     }
        catch (IOException e) {
        System.out.println("in exception done");

	e.printStackTrace();
        }
        
    }
    public static void generateGirls(){
        FILENAME = "girl.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,false))){
           for(int i=0 ; i<100 ; i++){
            String s = "G" + i + "," + ThreadLocalRandom.current().nextInt(4, 11) + "," + ThreadLocalRandom.current().nextInt(4,11) + "," + ThreadLocalRandom.current().nextInt(20000,90000) + "," + ThreadLocalRandom.current().nextInt(20000,90000)+ "," + ThreadLocalRandom.current().nextInt(110,130)+ "," + ThreadLocalRandom.current().nextInt(110,130);
      
            bw.write(s);
                bw.newLine();
            }
        }catch (IOException e) {
		e.printStackTrace();
            }
        
    }
     public static void generateGifts(){
        FILENAME = "gift.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,false))){
            for(int i=0 ; i<100 ; i++){
            String s = "B" + i + "," + ThreadLocalRandom.current().nextInt(4, 11) + "," + ThreadLocalRandom.current().nextInt(105,130) + "," + ThreadLocalRandom.current().nextInt(2000,3000) + "," + ThreadLocalRandom.current().nextInt(105,130) + "," + ThreadLocalRandom.current().nextInt(1,4);   
            bw.write(s);
                bw.newLine();
            }
        }
        catch (IOException e) {
		e.printStackTrace();
            }
        
    }
}
