/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
package Make_pair;
import Boy.Boy;
import Girl.Girl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Make_pair {
    //this function make pair of valid couple by fulfilling all the constarints
    public static void MakePair( Girl g, Boy b){
        if(!g.is_Gcommitted(g) && !b.is_Bcommitted(b)){
            if(  g.getBfAttractiveness()<=b.getBAttractiveness()){
                if(g.getGMaintainance()<=b.get_Bbudget()){
                    //set the boy and her sweatheart to committed
                    b.set_Bcommitted(b,g);
                    g.set_Gcommitted(g,b);
                    b.set_gf_Name(g.getGname());
                    g.set_bf_Name(b.get_Bname());
                    // write the couple formed data inti committed file 
                    String FILENAME = "commitment_log.txt";
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
			String content = "time :"+df.format(dateobj)+"  "+b.get_Bname()+" is committed to "+g.getGname();
			bw.write(content);
                        bw.newLine();
                        } catch (IOException e) {
			e.printStackTrace();
                    }
                }
            }
            
        }
    }
}
