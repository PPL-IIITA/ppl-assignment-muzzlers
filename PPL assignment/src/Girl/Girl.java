
package Girl;

import Boy.Boy;
import static java.lang.Math.random;
import java.util.Random;
/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class Girl {
    //Attributes of class girl
    String name,bf_name;
    int attractiveness,bf_attractiveness,maintainance,bf_maintainance,iq,bf_iq,happiness=0;
  
    boolean committed=false;
    public Boy obj;
  
    int Gcompatability=0;

       // 1.for the choosy, 2. for the normal ,3. for desperate girls
    int type;        
    Random random=new Random();
    //is_committed() return true if committed
    public boolean is_Gcommitted(Girl ob){
        return (ob.committed )   ;
    }
    //setter and geeter functions for Girl
    public void set_Gcompatability(int m){
        this.Gcompatability=m;
    }
    public int get_Gcompatability(){
        return Gcompatability;
    }
    public void set_GirlType(int m){
        this.type=m;
    }
    public int get_GirlType(){
        return type;
    }
    public void set_Gcommitted(Girl b,Boy by){
        b.committed =true ;
        obj=by;
    }
    public void set_Ghappiness(int val){
        this.happiness=val;
    }
    public int get_Ghappiness(){
        return happiness;
    }
    //this is the constructor for girl class
    public Girl(String name, int att,int b_att,int main,int b_main,int iq,int b_iq) throws Exception{ 
       this.name = name;
        this.type = random.nextInt(3-1)+1;
       this.attractiveness = att;
       this.bf_attractiveness=b_att;
       this.maintainance=main;
       this.bf_maintainance=b_main;
       this.iq=iq;
       this.bf_iq=b_iq;
   } 
    @Override
    public String toString()
   {
     return "Girl: [name="+name+"    attractiveness="+ attractiveness+"  bf_att="+bf_attractiveness+"    maintainance="+maintainance+"  bf_mai.=  "+bf_maintainance+"    iq= "+iq+" bf_iq="+bf_iq+"]";
   }
    
    // type() return the type of girl
    public int get_Gtype(Girl ob){
        return(ob.type);
    }
   
    
    public void setGName(String name){
        this.name=name;
    }
    public void set_bf_Name(String name){
        this.bf_name=name;
    }
    public String getGname(){
        return name;
    }
    public void setGAttractiveness(int att){
        this.attractiveness=att;
    }
    public int getGAttractiveness(){
        return attractiveness;
    }
    public void setBfAttractiveness(int att){
        this.bf_attractiveness=att;
    }
    public int getBfAttractiveness(){
        return bf_attractiveness;
    }
    
    public void setGMaintainance(int ma){
        this.maintainance=ma;
    }
    public int getGMaintainance(){
        return maintainance;
    }
    public void setBfMaintainance(int ma){
        this.bf_maintainance=ma;
    }
   public  int getBfMaintainance(){
        return bf_maintainance;
    }
    public void setGIQ(int iq){
        this.iq=iq;
    }
     public int getGIQ(){
        return iq;
    }
    public void setBfIQ(int iq){
        this.bf_iq=iq;
    }
    public int getBfIQ(){
        return bf_iq;
    }
}
