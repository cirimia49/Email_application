import java.util.Scanner;

public class Email_BackEnd implements Email_Interface{
        private String lastName;
        private String firstName;
        private String password;
        private String departament;
        private static final String companyName = "google.com";
        private String altEmail;
        private static final int length = 8;
        private String emailAdressGenerated;

        public Email_BackEnd(String lastName, String firstName){
           
            this.lastName = lastName;
            this.firstName = firstName;
            System.out.println("Creating an email adress for: " + this.firstName + " " + this.lastName);

            this.departament = setDepartament();
            this.emailAdressGenerated = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.departament.toLowerCase() + companyName.toLowerCase();
            this.password = generateRandomPassword(length);

        }

        public String setDepartament(){
            System.out.println("Enter the departament where the employee is working." + "\n" + "Please press: " + "\n" + "1 for Marketing," + "\n" + "2 for Software or" +  "\n" + "3 for Sales");
            Scanner kb = new Scanner(System.in);
            int departament_ = kb.nextInt();
           
            if(departament_ == 1)
                return "Marketing";
            else if (departament_ == 2)
                return "Software";
            else if (departament_ == 3)
                return "Sales";
            else
                return "";
        }

        public String generateRandomPassword(int length){
            String possibleChars = "1234567890qwertyuiopasdfghjklzxcvbnm!@#$%^&*";
            char [] randomPassword = new char[length];

            for(int i = 0; i < length; i++){
                int random_ = (int)(Math.random() * possibleChars.length());
                randomPassword[i] = possibleChars.charAt(random_);
                            }
            return new String (randomPassword);
        }
        
      
        public void setAlternateEmail(String altEmail){
         this.altEmail = altEmail;
        }
        
        public void changePassword(String password){
         this.password = password;
        }
        
       
        public String getAlternateEmail(){
         return altEmail;
        }
        
        public String getPassword(){
         return password;
        }
        
        public String showInfo(){
        return "Name: " +firstName + " " + lastName +", email: " + emailAdressGenerated +", password: " + password ;
        }

    }

