/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gifts;

/**
 *
 * @author Dollar
 */
public class utility_gift extends Gift {
    
   
    String name="utility-gift";
    int utility_value;
    int utility_class;
    public utility_gift(String name,int price,int value,int utility_value,int utility_rate) {
        super(name,price,value);
        this.utility_value=utility_value;
        this.utility_class=utility_rate;
    }
    
}
