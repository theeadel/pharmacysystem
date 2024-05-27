/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacysystem;

/**
 *
 * @author adela
 */
// Abstract class for medication types
abstract class medication implements medicationType {
    protected String name;
    protected String dosage;
    protected float price;
    protected int quantity;

    public medication(String name, String dosage,float price,int quantity) {
        this.name = name;
        this.dosage = dosage;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public float getPrice() {
        return price;
    }
    public int getquantity(){
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    

    public abstract String getType();
}
