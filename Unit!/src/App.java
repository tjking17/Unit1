import app.Scanner;

public class App {
    public static <and> void main(final String[] args) throws Exception {
     
     Scanner input = new Scanner(System.in);
     String password = "Rocks2020";
     int tries = 0;
     boolean secretMessageGiven = false;

     while (tries <3) {
         if (secretMessageGiven == false) {
             System.out.println("Enter the password");
             String enteredPassword = input.nextLine();

             if (enteredPassword.equals(password)) {
                 System.out.println("ACCESS GRANTED");
                 System.out.println("DONT FORGET TO SLEEP");
                 secretMessageGiven = true;
             }

             else {
                 System.out.println("ACCESS DENIED");
                 tries++;
                 System.out.println("YOU HAVE" + (3 - tries) + "ATTEMPTS REMAINING");
             }
            }
        }
        if (tries == 3) {
            System.out.println("TOO MANY ATTEMPTS");
        }
    }
}
             
    
    

    
        


       
       
    
