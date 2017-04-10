/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoupleArray;

import Boy.Boy;
import Couple.Couple;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Dollar
 */
public class CoupleArray {
    public static void printCouple(List<Couple> couple){
        String FILENAME = "UnorderedLog.txt";
        int s=0;
                for(Couple c: couple){
                if(c!=null)
                {
                    if(s++==10)
                        break;
                    else{
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
			String content = c.get_female()+" Is Commited with "+c.get_male();
			bw.write(content);
                        System.out.println(content);
                        bw.newLine();
                        } catch (IOException e) {
                        }
                    }
                }
                }
    }
}
