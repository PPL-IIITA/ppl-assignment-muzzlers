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
public class compatible {
      //hey this is to getthe best k compatible couple ,for easyness k=10
    public static void K_compatible(List<Girl> girls,List<Boy> boys){
        List<Boy> boys1;
        boys1=boys;
        //sorting boys on the basis of compatibility
        if (boys.size() > 0) {
             Collections.sort(boys, new Comparator<Boy>() {
             @Override
             public int compare(final Boy object1, final Boy object2) {
              return (-(object1.get_Bcompatability()-(object2.get_Bcompatability())));
                }
            });
        }
        int c=0;
        //writing data into comapatibility log
        String FILENAME = "K_compatability_log.txt";
                for(Boy b: boys1){
                    if(c++==10)
                        break;
                    else{
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
			String content = b.get_Bname()+" is "+c+" most compatible  with "+b.get_GF().getGname();
			bw.write(content);
                        System.out.println(content);
                        bw.newLine();
                        } catch (IOException e) {
			e.printStackTrace();
                        }
                    }
                }
    }
   
}
