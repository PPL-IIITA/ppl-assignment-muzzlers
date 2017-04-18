/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_happy_couple;

import Boy.Boy;
import Girl.Girl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class Happy {
   //hey this is to getthe best k happiest couple ,for easyness k=10
    public static void K_happy(List<Girl> girls,List<Boy> boys)throws Exception{
        List<Boy> boys1;
        boys1=boys;
        //sort the committed boys on the basis of happiness
        if (boys.size() > 0) {
             Collections.sort(boys, new Comparator <Boy>() {
             @Override
             public int compare(final Boy object1, final Boy object2) {
              return (-(object1.get_Bhappiness()-(object2.get_Bhappiness())));
                }
            });
        }
        //writing the log to the file 
        int c=0;
        String FILENAME = "K_happy_log.txt";
                for(Boy b: boys1){
                    if(c++==10)
                        break;
                    else{
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
			String content = b.get_Bname()+" is "+c+"happiest with "+b.get_GF().getGname();
                        System.out.println(content);
			bw.write(content);
                        bw.newLine();
                        } catch (IOException e) {
			e.printStackTrace();
                        }
                    }
                }
    }
   
}
