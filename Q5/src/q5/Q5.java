/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

import Boy.Boy;
import CreateCSV.CreateCSV;
import Gifts.Gift;
import Girl.Girl;
import K_happy_couple.Happy;
import K_happy_couple.compatible;
import Make_pair.Make_pair;
import ReadBoyData.ReadBoyData;
import Gift.ReadGifts;
import Gift.givegifts;
import ReadGirlData.ReadGirlData;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class Q5 {
    //main class for question 2 !!!!! ENJOY YIPEEEEEEEE...!!
    public static void main(String[] args) {
         CreateCSV.generateBoys();
         CreateCSV.generateGirls();
         //CreateCSV.generateGifts();
         List<Boy> boys = ReadBoyData.readboyFromCSV("boy.txt");
         List<Girl> girls = ReadGirlData.readGirlFromCSV("girl.txt");
         List<Gift> gifts = ReadGifts.readGiftFromCSV("gift.txt");
        List<Boy> boys1;
        boys1=boys;
        //sort the committed boys on the basis of happiness
        if (boys.size() > 0) {
             Collections.sort(boys, new Comparator <Boy>() {
             @Override
             public int compare(final Boy object1, final Boy object2) {
              return (-(object1.getBAttractiveness()-(object2.getBAttractiveness())));
                }
            });
        }
        List<Girl> girl1;
        girl1=girls;
        //sort the committed boys on the basis of happiness
        if (girls.size() > 0) {
             Collections.sort(girls, new Comparator <Girl>() {
             @Override
             public int compare(final Girl object1, final Girl object2) {
              return (-(object1.getGMaintainance()-(object2.getGMaintainance())));
                }
            });
        } 
        int c=0;
        for(Girl g : girls){
            for(Boy b : boys){
                c=Make_pair.MakePair(g, b,c);
                }
         }
         givegifts.GiveGift(boys, gifts);
         Happy.K_happy(girls, boys);
 
        
        
          
  
    }
}
