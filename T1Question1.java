import java.util.*;

public class T1Question1
{
    public static void main(String[]args){
		//Variable Declaration
		Scanner key = new Scanner(System.in);
		int survey;
		double payment;
		System.out.print("How many survey you did today ? ");
		survey = key.nextInt();
		//Boolean Operation
		if(survey < 5){
			payment = survey * 10;
			System.out.println("Total of payment for " + survey + " survey is : " + payment + "RM");
		}
		else if(survey >= 5){
			payment = (survey / 5*70.00) + survey % 5 * 10;
			System.out.println("Total of payment for " + survey + " survey is : " + payment + "RM");
		}
		else{
			System.out.println("Wrong input !");
		}

    }
}
