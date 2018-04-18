package random;
import java.util.Scanner;
public class Ham {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Key in how large you want your array to be");
    int num=scan.nextInt();
    int []list=new int[num];
    int []list2=new int[num];
    System.out.println("Key in "+num+" different numbers");
    for (int i=0; i<list.length; i++)
    {
         list[i]=scan.nextInt();
         list2[i]=list[i]*5;
         System.out.println(list2[i]);
    }

    }

	
	
	
}
