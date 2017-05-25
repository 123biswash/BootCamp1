package biswash;
import java.util.*;
public class dob3letters{
	public static void main(String[] args){
		System.out.println("Enter first three letter of the month (all lowercase): ");
		Scanner s = new Scanner(System.in);
		String month = s.next();
		month = month.toLowerCase();
		int days=31;
		switch(month){
		case "feb":  
			days=28;
			break;
		case "apr":case "jun":case "sep":case "nov":
			days=30;
			break;
		}
		System.out.println("This month has "+ days+ " days.");	
	}
		
}