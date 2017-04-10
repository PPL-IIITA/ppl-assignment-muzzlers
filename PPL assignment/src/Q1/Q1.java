package Q1;
/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
import java.util.List; 
import Boy.Boy;
import Gifts.Gift;
import Girl.Girl;
import CreateCSV.CreateCSV;
import ReadBoyData.ReadBoyData;
import ReadGirlData.ReadGirlData;
import Make_pair.Make_pair;
import Gift.ReadGifts;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    //main class for question 1 !!!!! ENJOY YIPEEEEEEEE...!!
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
    }
}
