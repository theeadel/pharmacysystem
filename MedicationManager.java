/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacysystem;

import java.util.ArrayList;

/**
 *
 * @author adela
 */
import java.util.ArrayList;
import java.util.Iterator;

public class MedicationManager {
    protected ArrayList<GenericMedication> genericmedications;
    protected ArrayList<BrandedMedication> brandedmedications;

    public MedicationManager() {
        genericmedications = new ArrayList<GenericMedication>();
        brandedmedications = new ArrayList<BrandedMedication>();
    }

    public void addMedication(GenericMedication medication) {
        genericmedications.add(medication);
    }
    

    public void addBrandedMedication(BrandedMedication medication) {
        brandedmedications.add(medication);
    }


    public void removeMedication(String medicationName) {
    for (Iterator<GenericMedication> iterator = genericmedications.iterator(); iterator.hasNext();) {
        GenericMedication medication = iterator.next();
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            iterator.remove();
            return;
        }
    }

    for (Iterator<BrandedMedication> iterator = brandedmedications.iterator(); iterator.hasNext();) {
        BrandedMedication medication = iterator.next();
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            iterator.remove();
            return;
        }
    }
    System.out.println("Medication not found.");
}
    public void printGeneric() {
    System.out.println("Generic Medications:");
    for (GenericMedication medication : genericmedications) {
        System.out.println("Name: " + medication.getName() + "  --- Dosage: " + medication.getDosage()+"  ---price: "
        +medication.getPrice()+"  ---quantity:"+medication.getquantity()+"\n---------------------------------------"
                + "---------------------------------------------");
    }
    }
    public void printBranded(){
    System.out.println("Branded Medications:");
    for (BrandedMedication medication : brandedmedications) {
        System.out.println("Name: " + medication.getName() + "  ---Dosage: " + medication.getDosage() + "  --- Brand: "
                + medication.getBrandName()+"  ---price: "+medication.getPrice()+"---quantity:"+medication.getquantity()+"\n---------------------------------------"
                + "---------------------------------------------");
    }
}
public boolean searchMedication(String medicationName) {
    // Search for generic medication
    for (GenericMedication medication : genericmedications) {
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            System.out.println("Medication found:");
            System.out.println("Name: " + medication.getName() + "  --- Dosage: " + medication.getDosage()+"\n---------------------");
            return true;
        }
    }

    // Search for branded medication
    for (BrandedMedication medication : brandedmedications) {
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            System.out.println("Medication found:");
            System.out.println("Name: " + medication.getName() + "  ---Dosage: " + medication.getDosage() + "  --- Brand: " + medication.getBrandName()+"  ---price: "+medication.getPrice()+"\n--------------------"
                    + "-------------------"
                + "---------------------------------------------");
            return true;
        }
    }

    System.out.println("Medication not found.");
    return false;
}
public void sellMedication(String medicationName, int quantity) {
    for (GenericMedication medication : genericmedications) {
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            if (medication.getquantity() >= quantity) {
                float price=quantity*medication.getPrice();
                System.out.println("---Sold " + quantity + " units of " + medication.getName() + " for "+price+"$$");
                medication.setquantity(medication.getquantity() - quantity);
            } else {
                System.out.println("---Insufficient stock for " + medication.getName() + " we have only "+medication.getquantity()+"piece");
            }
            return;
        }
    }

    for (BrandedMedication medication : brandedmedications) {
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            if (medication.getquantity() >= quantity) {
                float price=quantity*medication.getPrice();
                System.out.println("---Sold " + quantity + " units of " + medication.getName() + " for "+price+"$$");
                medication.setquantity(medication.getquantity() - quantity);
            } else {
                System.out.println("---Insufficient stock for " + medication.getName() + " we have only "+medication.getquantity()+"piece");
            }
            return;
        }
    }

    System.out.println("Medication not found.");
}
public void applyInsuranceDiscount(String medicationName ,int quantity, boolean hasInsurance) {
    for (GenericMedication medication : genericmedications) {
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            if (medication.getquantity() >= quantity) {
                float price=(float) (quantity*medication.getPrice()*0.4);
                System.out.println("---Sold " + quantity + " units of " + medication.getName() + " for "+price+"$$");
                medication.setquantity(medication.getquantity() - quantity);
            } else {
                System.out.println("---Insufficient stock for " + medication.getName() + " we have only "+medication.getquantity()+" piece");
            }
           return;
            
        }
    }

    for (BrandedMedication medication : brandedmedications) {
        if (medication.getName().equalsIgnoreCase(medicationName)) {
            if (medication.getquantity() >= quantity) {
                 float price=(float) (quantity*medication.getPrice()*0.4);
                System.out.println("Sold " + quantity + " units of " + medication.getName() + "for"+price+"$$");
                medication.setquantity(medication.getquantity() - quantity);
            } else {
                System.out.println("Insufficient stock for " + medication.getName() + " we have only "+medication.getquantity()+"piece");
            }
            return;
        }
    }

}
}






