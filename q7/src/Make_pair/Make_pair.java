/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
package Make_pair;
import Boy.Boy;
import Couple.Couple;
import Girl.Girl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Make_pair {
    //this function make pair of valid couple by fulfilling all the constarints

    /**
     *
     * @param g
     * @param b
     * @param c
     * @param couple
     * @return
     */
    public static int MakePair( Girl g, Boy b,int c,List<Couple> couple){
        if(!g.is_Gcommitted(g) && !b.is_Bcommitted(b)){
            if(  g.getBfAttractiveness()<=b.getBAttractiveness()){
                if(g.getGMaintainance()<=b.get_Bbudget()){
                    if(g.get_oldbf()!=b && b.get_oldgf()!=g)
                    //set the boy and her sweatheart to committed
                    c++;
                    b.set_Bcommitted(b,g);
                    g.set_Gcommitted(g,b);
                    b.set_gf_Name(g.getGname());
                    b.set_oldgf(g);
                    g.set_bf_Name(b.get_Bname());
                    g.set_oldbf(b);
                    
                    Couple k=new Couple (b.get_Bname(),g.getGname());
                    couple.add(k);
                    // write the couple formed data inti committed file 
                    String FILENAME = "commitment_log.txt";
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    //try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
                        String content;
                        if(c%2==0)
                             content = "time :"+df.format(dateobj)+"  "+b.get_Bname()+" is committed to "+g.getGname();
			else
                             content = "time :"+df.format(dateobj)+"  "+g.getGname()+" is committed to "+b.get_Bname();
                            
                        //bw.write(content);
                        //bw.newLine();
                      //  } catch (IOException e) {
			//e.printStackTrace();
                    //}
                }
            }


            
        }
        return c;
    }
}
