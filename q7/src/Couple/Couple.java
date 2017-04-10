/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Couple;
/**
 *
 * @author Dollar
 */
public class Couple {
    String male,female;
     public Couple(String male,String female){
        this.male=male;
        this.female=female;
    }
    public void set_male(String male){
            this.male=male;
    }
    public void set_female(String female){
            this.female=female;
    }
    public String get_male(){
           return male;
    }
    public String get_female(){
           return female;
    }
}
