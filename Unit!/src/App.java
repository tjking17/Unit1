

 
 
 import java.util.Scanner;

    
public class App {
    public static <and> void main(final String[] args) throws Exception {
     
        System.out.println("Please enter in a number.");
      int n1, n2,j, flag;
  Long int  i;
  printf("Enter First  numbers(intevals): ", i);
  scanf("%d", n1);
  printf("Enter Second  numbers(intevals): ", i);
  scanf("%d", n2);
  printf("Prime numbers between %d and %d are: ", n1);
  for(i=n1+1; i<n2; ++i)
  {
      flag=0;
      for(j=2; j<=i/2; ++j)
      {
        if(i%j==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
        printf("%ld ",i);
  }
}

    private static void printf(String string, int i) {
    }

    private static void scanf(String string, int n1) {
    }
}
        


       
       
    
