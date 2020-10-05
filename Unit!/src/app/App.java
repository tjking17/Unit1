package app;

public class App {

    public static void main(final String[] args) throws Exception {
        for (int i = 4; i < 20; i++) {
            if (i % 2 ==0){
                System.out.println(i + " Can 20 be divided by 4 ");
            } else {
                System.out.println(i + "Can 4 be divided by 20");
            }          
        }    for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        System.out.println("All finished");

    }
}
