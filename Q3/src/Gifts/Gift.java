
package Gifts;

/**
 *
 * @author Arpit Gupta
 * (RIT2015032)
 * IIIT-Allahabad
 */
public class Gift {
    //Attribute of gifts
    int  price, value,luxury_rating=0,utility_value=0,utility_class=0;
    String type;
    float difficulty_to_find;
    //constructor of gift
    public Gift(String type, int price, int value)throws Exception { 
       this.type=type;
       this.price=price; 
       this.value=value;
      /* if(type.equalsIgnoreCase("utility")){
           this.utility_value=a;
           this.utility_class=b;
        }
       if(type.equalsIgnoreCase("luxury")){
           this.luxury_rating=a;
           this.difficulty_to_find=b;
       }*/
    } 
    //setter and required getter function of gift
     public int get_price(){
        return price;
    }
     public int get_value(){
        return value;
    }
      public String get_type(){
        return type;
    }
    
}
