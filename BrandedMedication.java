/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacysystem;

/**
 *
 * @author adela
 */
class BrandedMedication extends medication {
    protected String brandName;

    public BrandedMedication(String name, String dosage, String brandName,float price,int quantity) {
        super(name, dosage,price,quantity);
        this.brandName = brandName;
    }

    public String getType() {
        return "Branded";
    }

    public String getBrandName() {
        return brandName;
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


