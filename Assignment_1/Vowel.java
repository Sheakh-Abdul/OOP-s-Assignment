import java.util.* ;

class Vowel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character = ");
		char n = sc.next().charAt(0);
		n = Character.toLowerCase(n);
		
		



		if ( n == 'a' || n == 'o' || n== 'u' || n== 'i' || n=='e' )
			System.out.println(n+" is a Vowel");
		else
			System.out.println(n+" is not a Vowel");
		
	}
}