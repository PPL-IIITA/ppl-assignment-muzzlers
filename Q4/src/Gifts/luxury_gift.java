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
public class luxury_gift extends Gift {
    float difficulty=0;
    String name="Luxury-gift";
    int luxury_rate=0;
    public luxury_gift(String name,int price,int value,int luxury_rate,int difficulty) {
        super(name,price,value);
        this.luxury_rate=luxury_rate;
        this.difficulty=difficulty;
    }
    
}
