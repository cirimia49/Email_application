import java.util.Scanner;
public class Email_Application_Testing {
    public static void main(String [] args){
            Email_BackEnd employee1  = new Email_BackEnd("Smith", "Constantin");
            Email_BackEnd employee2  = new Email_BackEnd("Doe", "Marcus");
            
                   
           
            //Display the informations of an account
            System.out.println(employee1.showInfo());
            
            //Display the information and change password. Print out account with old password and new created password
            System.out.println(employee2.showInfo());
            employee2.changePassword("password");
            System.out.println(employee2.showInfo());

    }
}
