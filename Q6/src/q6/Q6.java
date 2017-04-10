/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

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
public class Q6 {
    public static void main(String[] args) {
         CreateCSV.generateBoys();
         CreateCSV.generateGirls();
         List<Boy> boys = ReadBoyData.readboyFromCSV("boy.txt");
         List<Girl> girls = ReadGirlData.readGirlFromCSV("girl.txt");
         List<Gift> gifts = ReadGifts.readGiftFromCSV("gift.txt");       
        int c=0;
        for(Girl g : girls){
            for(Boy b : boys){
                c=Make_pair.MakePair(g, b,c);
                }
         }
         int i,t=7;
         for(i=1;i<=t;i++)
         givegifts.GiveGift(boys, gifts,i);
         //Happy.K_happy(girls, boys);
 
        
        
          
  
    }
}
