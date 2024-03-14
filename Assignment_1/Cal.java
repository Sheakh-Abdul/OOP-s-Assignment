import java.util.* ;

class Cal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number = ");
		int n = sc.nextInt();
		System.out.print("Enter a Number = ");
		int m = sc.nextInt();
		System.out.print("Enter a Operator = ");
		char c = sc.next().charAt(0);
		//int k = n%4;
		



		switch (c) {
		case '+':
			System.out.print(n+m);
			break;
		case '-':
			System.out.print(n-m);
			break;
		case '*':
			System.out.print(n*m);
			break;
		case '/':
			System.out.print(n/m);
			break;
		case '%':
			System.out.print(n%m);
			break;
		default :
			System.out.print("Enter a Valid Operator");
			break;
		}
}
}