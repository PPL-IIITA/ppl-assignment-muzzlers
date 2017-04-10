/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import Boy.Boy;
import Gifts.Gift;
import Girl.Girl;
import K_happy_couple.Happy;
import K_happy_couple.compatible;
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
public class Q2 {
    //main class for question 2 !!!!! ENJOY YIPEEEEEEEE...!!
    public static void main(String[] args) {
            
         List<Boy> boys = ReadBoyData.readboyFromCSV("boy.txt");
         List<Girl> girls = ReadGirlData.readGirlFromCSV("girl.txt");
         List<Gift> gifts = ReadGifts.readGiftFromCSV("gift.txt");
        for(Girl g : girls){
            for(Boy b : boys){
                Make_pair.MakePair(g, b);
                }
         }
         givegifts.GiveGift(boys, gifts);
         Happy.K_happy(girls, boys);
         compatible.K_compatible(girls, boys);
        
          
  
    }
}
