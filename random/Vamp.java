package random;
import java.util.Scanner;
import java.util.Random;
public class Vamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        int Score=0;
        while(true){
            System.out.println("Do you want to roll? yes=1 no=2");

            int roll=scan.nextInt();
            if(roll==1)
            {
                int number=rand.nextInt(6)+1;
                System.out.println(number);
                if ((number>1)||(number<7))
                {
                    Score=Score+number;
                    System.out.println("Score= "+Score);
                }
                else if (number==1)
                {
                    System.out.println("You lose!");
                    break;
                }
            }

            else if  (roll==2)
            {
                System.out.println(Score);
                break;
            }
            else {System.out.println("Error");
            }
        }
    }
}







