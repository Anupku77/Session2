import java.util.Scanner;

public class DayMonth {

	public static void main(String[] args) {
		
		System.out.println("Enter the first three letter of month(NO CAPS): ");
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		
		switch(month)
		{			
			case "jan":
			case "mar":
			case "may":
			case "oct":
			case "jul":
			case "aug":
			case "dec": System.out.println("This month has 31 days");
			            break;
			case "apr":
			case "jun":
			case "sep":
			case "nov":System.out.println("This month has 30 days");
            			break;
			case "feb":System.out.println("This month has 28 days");
            			break;
			default:System.out.println("Please give the month in correct format!!");
			break;
			
		}
		scan.close();
	}
	

}
