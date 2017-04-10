
package Gift;

import Boy.Boy;
import Gifts.Gift;
import Girl.Girl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class givegifts {
    public static void GiveGift( List<Boy> boys,List<Gift> gifts){
        //this functions decides the way to give the gifts
        //here below we sort the gift on the basis of price of each gifts
       if (gifts.size() > 0) {
             Collections.sort(gifts, new Comparator<Gift>() {
             @Override
             public int compare(final Gift object1, final Gift object2) {
              return ((object1.get_value()-(object2.get_value())));
                }
            });
        }
       //assign the gifts to couple
    String FILENAME = "gift_log.txt";
    try (BufferedWriter bq = new BufferedWriter(new FileWriter(FILENAME,false))) {

      for(Boy b:boys){
        if( b.is_Bcommitted(b)){
            for(Gift g: gifts){
                
                if((b.get_Bbudget()-b.get_expense())>g.get_value()){
                    
                    b.set_expense(g.get_value());
                    Girl gf=b.get_GF();
                    if(gf.get_GirlType()==1)
                       gf.set_Ghappiness((int) (Math.log(b.get_expense())/gf.getGMaintainance())+2*g.get_value());
                    if(gf.get_GirlType()==2)
                        gf.set_Ghappiness((g.get_price()+g.get_value())/gf.getGMaintainance());
                    if(gf.get_GirlType()==3)
                        gf.set_Ghappiness((int) (Math.exp(g.get_price()+g.get_value())/gf.getGMaintainance()));
                    if(b.get_boyType()==1)
                        b.set_Bhappiness(b.get_Bbudget()-b.get_expense());
                    if(b.get_boyType()==2)
                        b.set_Bhappiness(gf.get_Ghappiness());
                    if(b.get_boyType()==3)
                        b.set_Bhappiness(gf.getGIQ());
                    //setting the value of compatibility of couples
                    b.set_Bcompatability(Math.abs(gf.getGIQ()-b.get_iq())+Math.abs(b.getBAttractiveness()-gf.getGAttractiveness()));
                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj = new Date();
                    //System.out.println(df.format(dateobj));
                    //write  gifts log into the file
                    //try (BufferedWriter bq = new BufferedWriter(new FileWriter(FILENAME,true))) {
			String content = "time :"+df.format(dateobj)+"  "+b.get_Bname()+" gifted "+b.get_gf_name()+" of value "+g.get_value();
			bq.write(content);
                        bq.newLine();
                        
                  /*  catch (IOException e) {
                		e.printStackTrace();
                    }*/
                }
                    
                else
                    break;
                
            }
        }
      }
     }
        catch (IOException e) {
                		e.printStackTrace();
                    }
            
    }
}
