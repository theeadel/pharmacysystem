/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pharmacysystem;

/**
 *
 * @author adela
 */
public interface medicationType {
    public String getname();
    public String getDosage();
    public float getPrice();
    public int getquantity();
    public void setquantity(int quantity);
    public void setPrice(float price);
}

