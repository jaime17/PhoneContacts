/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.*;
/**
 *
 * @author jaime
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myPhone = new MobilePhone();
    public static void main(String[] args) {
        
        
        int option;
        printMenu();
        option = scanner.nextInt();
        while(option > 0 && option < 7){
            switch(option){
                case 1: 
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                    
                case 3:
                    deleteContact();
                    break;
                    
                case 4: 
                    queryContact();
                    break;
                case 5: 
                    allContacts();
                    break;
                case 6: 
                    printMenu();
                    break;
                default:
                    break;
            }
            System.out.println("Option");
            option=scanner.nextInt();
        } 
    }
    
    public static void printMenu(){
        System.out.println("Menu " );
        System.out.println("0 Quit");
        System.out.println("1 Add Contact");
        System.out.println("2 update contact");
        System.out.println("3 Delete contact");
        System.out.println("4 Query contact");
        System.out.println("5 list all contact");
        System.out.println("6 Print options");
    }
    
    public static void addContact(){
        String name;
        int number;
        System.out.println("Contact name: ");
        name = scanner.next();
        System.out.println("Telephone number");
        number = scanner.nextInt();
        
        if (myPhone.addContact(name, number)){
            System.out.println("Contact succesfely added");
        }else{
            System.out.println("Contact already in list");
        }
       
    }
    
    public static void updateContact(){
        String name;
        int number;
        System.out.println("new Contact name: ");
        name = scanner.next();
        System.out.println("new Telephone number");
        number = scanner.nextInt();
        
        if(myPhone.updateContact(name, number)){
            System.out.println("update contact");
        }else{
            System.out.println("Contact not found");
        }
    }
    
    public static void deleteContact(){
        String name;
        System.out.println("Delete contact: ");
        name = scanner.next();
      if(myPhone.removeContact(name)){
          System.out.println("Contact removed");
      }else{
          System.out.println("Contact not found");
      }
      
    }
    
    public static void queryContact(){
        String name;
        System.out.println("Contact");
        name= scanner.next();
        System.out.println(myPhone.queryContact(name));
        
    } 
    
    public static void allContacts(){
         myPhone.listContact();
      
    }
    
}
           
