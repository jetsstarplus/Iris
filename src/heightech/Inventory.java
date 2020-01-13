/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heightech;

/**
 *
 * @author User
 */
public class Inventory {
    private String item_name;
    private String item_number;
    private int item_Quantity;
    private int price;

    public Inventory(String item_name, String item_number, int item_Quantity, int price) {
        this.item_name = item_name;
        this.item_number = item_number;
        this.item_Quantity = item_Quantity;
        this.price = price;
    }

    public Inventory() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_number() {
        return item_number;
    }

    public void setItem_number(String item_number) {
        this.item_number = item_number;
    }

    public int getItem_Quantity() {
        return item_Quantity;
    }

    public void setItem_Quantity(int item_Quantity) {
        this.item_Quantity = item_Quantity;
    }
    
    
}
