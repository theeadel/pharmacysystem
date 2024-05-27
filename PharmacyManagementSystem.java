/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacysystem;

import java.util.Scanner;

/**
 *
 * @author adela
 */
 public class PharmacyManagementSystem {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in); 
    String Username= "admin";
    String Password= "123";
    Scanner input1 = new Scanner(System.in);
    System.out.println("\nEnter Username : ");
    String username = input1.next();
    Scanner input2 = new Scanner(System.in);
    System.out.println("\nEnter Password : ");
    String password = input2.next();
    if (username.equalsIgnoreCase (Username) && password.equalsIgnoreCase(Password)) {
        System.out.println("\n--Access Granted! Welcome!--");
    }
    else if (username.equalsIgnoreCase(Username)) {
        System.out.println("\nInInvalid Password! You cannot log in to the system. Please try again.");
         System.exit(0);
    }
    else if (password.equalsIgnoreCase(Password)) {
        System.out.println("\nInvalid Username! You cannot log in to the system. Please try again.");
         System.exit(0);
    }
    else{
        System.out.println("\nInvalid Username & Password! You cannot log in to the system. Please try again.");
        System.exit(0);
    }
    Scanner scan=new Scanner(System.in);
        Scanner sc= new Scanner (System.in);
        System.out.println("Welcome to Tripoli Pharmacy Management System ");
        int nbr;
        
        
        
        MedicationManager manager = new MedicationManager();
        
  

        
GenericMedication ibuprofen = new GenericMedication("Ibuprofen", "10mg", 10.0f, 10);
manager.addMedication(ibuprofen);
GenericMedication aspirin = new GenericMedication("Aspirin", "20mg", 10.0f, 10);
manager.addMedication(aspirin);
GenericMedication acetaminophen = new GenericMedication("Acetaminophen", "15mg", 10.0f, 10);
manager.addMedication(acetaminophen);
GenericMedication loratadine = new GenericMedication("Loratadine", "10mg", 10.0f, 10);
manager.addMedication(loratadine);
GenericMedication ranitidin20mg = new GenericMedication("Ranitidine", "20mg", 10.0f, 10);
manager.addMedication(ranitidin20mg);
GenericMedication diphenhydramine= new GenericMedication("Diphenhydramine", "10mg", 10.0f, 10);
manager.addMedication(diphenhydramine);
GenericMedication doxylamine = new GenericMedication("Doxylamine", "10mg", 10.0f, 10);
manager.addMedication(doxylamine);
GenericMedication meclizine = new GenericMedication("Meclizine", "12.5mg", 10.0f, 10);
manager.addMedication(meclizine);
GenericMedication fexofenadine = new GenericMedication("Fexofenadine", "10mg", 10.0f, 10);
manager.addMedication(fexofenadine);
GenericMedication cetirizine = new GenericMedication("Cetirizine", "10mg", 10.0f, 10);
manager.addMedication(cetirizine);


BrandedMedication lipitor = new BrandedMedication("Lipitor", "20mg", "Pfizer", 10.0f, 10);
manager.addBrandedMedication(lipitor);
BrandedMedication crestor = new BrandedMedication("Crestor", "10mg", "AstraZeneca", 10.0f, 10);
manager.addBrandedMedication(crestor);
BrandedMedication nexium = new BrandedMedication("Nexium", "20mg", "AstraZeneca", 10.0f, 10);
manager.addBrandedMedication(nexium);
BrandedMedication plavix = new BrandedMedication("Plavix", "75mg", "Bristol-Myers Squibb", 10.0f, 10);
manager.addBrandedMedication(plavix);
BrandedMedication advair = new BrandedMedication("Advair", "100mg", "GlaxoSmithKline", 10.0f, 10);
manager.addBrandedMedication(advair);
BrandedMedication symbicort = new BrandedMedication("Symbicort", "80mg", "AstraZeneca", 10.0f, 10);
manager.addBrandedMedication(symbicort);
BrandedMedication abilify = new BrandedMedication("Abilify", "10mg", "Otsuka Pharmaceutical Co., Ltd.", 10.0f, 10);
manager.addBrandedMedication(abilify);
BrandedMedication zetia = new BrandedMedication("Zetia", "10mg", "Merck & Co., Inc.", 10.0f, 10);
manager.addBrandedMedication(zetia);
BrandedMedication januvia = new BrandedMedication("Januvia", "100mg", "Merck & Co., Inc.", 10.0f, 10);
manager.addBrandedMedication(januvia);
BrandedMedication lyrica = new BrandedMedication("Lyrica", "75mg", "Pfizer", 10.0f, 10);
manager.addBrandedMedication(lyrica);
        char choice=0;
        

        do{
        System.out.println("Please choose the number of your Sevice :");
        System.out.println("1-Add Medication");  
        System.out.println("2-Remove Medication");
        System.out.println("3-Search Medication"); //boolean
        System.out.println("4- show (Generic/Branded) Medication");
        System.out.println("5-Selling Medication");
        System.out.println("6-sell with Insurance");
            System.out.println("7-see all the available medications");
        System.out.println("8-Exit");
        System.out.print("your number choosen :");
        nbr =sc.nextInt();
            System.out.println("\n\n-----------------------------------");
        switch (nbr){
            case 1:


        System.out.print("how many medication name you want to enter: ");
        int numMedications = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < numMedications; i++) {
            System.out.print("Enter the name of medication #" + (i+1) + ": ");
            String name = input.nextLine();

            System.out.print("Enter the dosage of medication #" + (i+1) + ": ");
            String dosage = input.nextLine();
            System.out.print("Enter the price of "+name+" with a dosage of "+dosage+": " );
            float price=sc.nextFloat();
            System.out.print(" enter the quantity of "+name+" : ");
            int quantity=sc.nextInt();
            System.out.print("\nIs this medication generic or branded? (G/B): ");
            String type = input1.next();

            if (type.equalsIgnoreCase("G")) {
                GenericMedication medication = new GenericMedication(name, dosage,price,quantity);
                manager.addMedication(medication);
            } else if (type.equalsIgnoreCase("B")) {
                System.out.print("Enter the brand name of the medication: ");
                String brand = input.nextLine();

                BrandedMedication medication = new BrandedMedication(name, dosage, brand,price,quantity);
                manager.addBrandedMedication(medication);
            } else {
                System.out.println("Invalid medication type. Skipping medication #" + (i+1));
            }
        }
        
        System.out.println("Medications added:");
           break; 
                case 2:
    System.out.print("Enter the name of the medication to remove: ");
    String medicationName = input.nextLine();
    manager.removeMedication(medicationName);
    System.out.println("Medication removed.");

            break;
        
        case 3:
    System.out.print("Enter the name of the medication to search for: ");
    String medicationsearch = input.nextLine();
    boolean sr = manager.searchMedication(medicationsearch);
    break;
        case 4:
            System.out.println("please choose a number");
            System.out.println("1-genericMedication");
            System.out.println("2-BrandedMedication");
           char scanforcase4=sc.next().charAt(0);
           if(scanforcase4=='1'){
            manager.printGeneric();
           }
           else if(scanforcase4=='2'){
               manager.printBranded();
           }else{
               System.out.println("enter a valid number ");
           }

           
        break;
        case 5:

            System.out.print("---Enter the name of the medication to sell: ");
    String medicationName1 = input.next();
    System.out.print("---Enter the quantity to sell: ");
    int quantity = sc.nextInt();
    manager.sellMedication(medicationName1, quantity);
            break;
        case 6:
            System.out.println("---confirm insurrence (y/n)");
            boolean hasInsuranceg=false;
            char u=input1.next().charAt(0);
            if(u=='y' ||u=='Y')
                hasInsuranceg=true;
            else
                hasInsuranceg=false;  
            System.out.println("--enter the name of the medication : ");
            String p=input.nextLine();
            System.out.println("---enter the qunatity you want to sell : ");
            int i=sc.nextInt();
            manager.applyInsuranceDiscount(p, i, hasInsuranceg);
            break;
        case 7:
            manager.printBranded();
            manager.printGeneric();
            break;
       
        default: System.out.println("error");
        
        }
            System.out.println("do you want to continue (y/n)");
       choice=scan.next().charAt(0);
        } while (choice=='y'|| choice=='Y');
        
 
    }
 }



