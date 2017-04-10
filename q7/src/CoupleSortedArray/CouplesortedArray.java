/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoupleSortedArray;

import Couple.Couple;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Dollar
 */
public class CouplesortedArray {
 public static void printSortedCouple(List<Couple> couple){
        String FILENAME = "SortedLog.txt";
        if (couple.size() > 0) {
             Collections.sort(couple, new Comparator <Couple>() {
             @Override
             public int compare(final Couple object1, final Couple object2) {
              int k=0;
                 if(object1.get_male().equals(object2.get_male()))
                  k=1;
                 else
                     k=0;
                 return k;
                }
            });
        }
        int s=0;
                for(Couple c: couple){
                    if(s++==10)
                        break;
                    else{
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
			String content = c.get_female()+" Is Commited with "+c.get_male();
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
