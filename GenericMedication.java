/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacysystem;

/**
 *
 * @author adela
 */
 class GenericMedication extends medication {
    public GenericMedication(String name, String dosage,float price,int quantity) {
        super(name, dosage,price,quantity);
    }

    public String getType() {
        return "Generic";
    }

    @Override
    public String getname() {
        return super.name;
    }

    @Override
    public void setquantity(int quantity) {
       super.quantity=quantity;
    }

    @Override
    public void setPrice(float price) {
        super.price=price;
    }


}

