/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import Boy.Boy;
import CreateCSV.CreateCSV;
import Gifts.Gift;
import Girl.Girl;
import Make_pair.Make_pair;
import ReadBoyData.ReadBoyData;
import Gift.ReadGifts;
import Gift.givegifts;
import ReadGirlData.ReadGirlData;
import java.util.List;
/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class Q8 {
    //main class for question 2 !!!!! ENJOY YIPEEEEEEEE...!!
    public static void main(String[] args) {
         CreateCSV.generateBoys();
         CreateCSV.generateGirls();
         //CreateCSV.generateGifts();
         List<Boy> boys = ReadBoyData.readboyFromCSV("boy.txt");
         List<Girl> girls = ReadGirlData.readGirlFromCSV("girl.txt");
         List<Gift> gifts = ReadGifts.readGiftFromCSV("gift.txt");
        for(Girl g : girls){
            for(Boy b : boys){
                Make_pair.MakePair(g, b);
                }
         }
         givegifts.GiveGift(boys, gifts);
         
        
          
  
    }
}
