import app.Scanner;

public class App {
    public static <and> void main(final String[] args) throws Exception {
     
     String planets[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
     Scanner input = new Scanner(System.in);

     System.out.println("please enter a planet");
     String answer = input.nextLine();

     for (int i = 0; i < planets.length; i++){
         if (answer.equals(planets[i])){
             System.out.println(answer + "is position" + (i+1) + "from the sun");
         }
        }
    

    }
}
        


       
       
    
