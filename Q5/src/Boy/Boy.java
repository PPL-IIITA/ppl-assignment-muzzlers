
package Boy;

import Girl.Girl;
import java.util.Random;

/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class Boy  {
    /* A class boy . boys attribues are defined here*/
    String name,gf_name;
    int attractiveness, budget, iq, iq_required;
    int expense=0,happiness=0;
    Random random=new Random();
    Girl ob,oldgf;
    /*Type of boys(here 1.miser 2.generous 3.geeky)*/
    int type;
    int Bcompatability=0;
    boolean committed=false;
    //  public String getname;
    //list of various getter and setter functions 
     public void set_BoyType(int m){
        this.type=m;
    }
    public int get_boyType(){
        return type;
    }
    public int get_iq(){
        return iq;
    }
    public boolean is_Bcommitted(Boy ob){
        return (ob.committed )   ;
    }
    public void set_gf_Name(String name){
        this.gf_name=name;
    }
    public void set_Bcompatability(int m){
        this.Bcompatability=m;
    }
    public int get_Bcompatability(){
        return Bcompatability;
    }
    public void set_expense(int m){
        this.expense+=m;
    }
    public Girl get_oldgf(){
        return oldgf;
    }
    public void set_oldgf(Girl g){
        this.oldgf=g;
    }
    public int get_expense(){
        return expense;
    }
    public Girl get_GF(){
        return ob;
    }
    public void set_Bhappiness(int m){
        this.happiness+=m;
    }
    public int get_Bhappiness(){
        return happiness;
    }
    public String get_gf_name(){
        return gf_name;
    }
    public int getBAttractiveness(){
        return attractiveness;
    }
    public void set_Bcommitted(Boy b,Girl g){
        b.committed =true;  
         ob=g;
    }
    public String get_Bname(){
        return name  ;
    }
    public int min_Attractiveness(){
        return iq_required;
    }
    public int get_Bbudget(){
        return budget;
    }
    public void Bclear(){
        this.committed=false;
        this.expense=0;
        this.happiness=0;
    }
   
    //this is a constructor of the class boy
   public Boy(int type,String name, int attractiveness, int budget,int iq,int iq_required)throws Exception { 
       this.type =type ;
       this.name = name;
       this.attractiveness = attractiveness; 
       this.budget=budget;
       this.iq = iq; 
       this.iq_required=iq_required;
  
   } 
   //just to get the all values
   @Override 
   public String toString()
   {
     return "Boy [name=" + name + "happiness"+ happiness+"]";
   }
}
    

