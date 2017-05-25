package biswash;

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		System.out.println("Hello. Enter month(1-12): \n");
		Scanner s=new Scanner(System.in);
		int month=s.nextInt();
		int days=31;
		if (month==2){
			days=28;
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}
		System.out.println("\nThe number of days in the month is "+days);
		s.close();
	}

}
