/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

import Boy.Boy;
import Couple.Couple;
import CreateCSV.CreateCSV;
import Girl.Girl;
import Make_pair.Make_pair;
import ReadBoyData.ReadBoyData;
import ReadGirlData.ReadGirlData;
import java.util.List;
import CoupleArray.CoupleArray;
import CoupleSortedArray.CouplesortedArray;
import java.util.ArrayList;
/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class Q7 {
    public static void main(String[] args)throws Exception {
         CreateCSV.generateBoys();
         CreateCSV.generateGirls();
         List<Boy> boys = ReadBoyData.readboyFromCSV("boy.txt");
         List<Girl> girls = ReadGirlData.readGirlFromCSV("girl.txt");
                
          List<Couple> couple = new ArrayList<>() ;
          int c=0;
         for(Girl g : girls){
            for(Boy b : boys){
                c=Make_pair.MakePair(g, b,c,couple);
                }
         }
         CoupleArray.printCouple(couple);
         CouplesortedArray.printSortedCouple(couple);
         
    }
}
