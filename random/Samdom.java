package random;
import java.util.Random;

public class Samdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	        Random rand=new Random();
	        int number=rand.nextInt(25);
	   
	        System.out.println(number);

	        System.out.println("This is a random array");
	        int []numbers= new int[50];
	        for(int i=0; i<numbers.length; i++)
	        {
	            numbers[i]=rand.nextInt(62-25+1)+25;
	            System.out.println(numbers[i]);
	        }
	    }

	

		
		
		
	}


