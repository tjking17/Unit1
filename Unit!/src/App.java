import java.util.Random;
public class App {

    

    public static <and> void main(final String[] args) throws Exception {
        int randNumber;
        int userNumber;
        Boolean win = false;
        unsighed seed = int()time(0);


        srand(seed);
        randNumber = 1 + rand()%10;
        cout<<"im think of a number. Can you guess what it is?"<<endl;
        cin>> userNumber;

        while (!win)
        {
            if (userNUmber < randNumber)
            {
                cout<<"Too low, try again."<<endl;
                cin>> userNumber;
            }
            else //Winner
            {
                cout<< "Congratulations, you guess the correct number." <<endl;
                win = true;
            }
        }
        



