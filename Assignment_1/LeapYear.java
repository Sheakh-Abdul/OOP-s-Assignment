import java.util.* ;

class LeapYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year = ");
		int n = sc.nextInt();
		
		int k = n%4;
		System.out.println("Using If-Else");



		if ( k==0 )
			System.out.println(n+" is a Leap Year");
		else
			System.out.println(n+" is not a Leap Year");

		System.out.println("Using Switch Case");



		switch (k) {
		case 0:
			System.out.print(n+" is a Leap Year");
			break;
		default :
			System.out.print(n+" is not a Leap Year");
			break;
		}
}
}