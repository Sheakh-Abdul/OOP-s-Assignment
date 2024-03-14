import java.util.* ;
class GradeSystem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Number: ");
		int n = sc.nextInt();
		if ( n > 91 && n <= 100)
			System.out.print("Your Grade: A+");
		else if ( n > 81 && n <= 90)
			System.out.print("Your Grade: A");
		else if ( n > 71 && n <= 80)
			System.out.print("Your Grade: B");
		else if ( n > 61 && n <= 70)
			System.out.print("Your Grade: C");
		else if ( n > 51 && n <= 60)
			System.out.print("Your Grade: D");
		else if ( n > 41 && n <= 50)
			System.out.print("Your Grade: E");
		else 
			System.out.print("Your Grade: F");
	}
}