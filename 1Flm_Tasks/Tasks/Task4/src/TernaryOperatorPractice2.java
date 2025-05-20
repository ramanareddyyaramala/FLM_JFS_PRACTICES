import java.util.Scanner;

public class TernaryOperatorPractice2 {
	
		public static void main(String[] args) {
		Scanner sc=	new Scanner(System.in);
		System.out.println("Enter the Marks You Got:");
		int marks=sc.nextInt();
		String result=(marks>85 && marks<=100)?"Grade A+":(marks>70 && marks<=85)?"Grade A":(marks>60 && marks<=70)?"Grade B+":
								(marks>50 && marks<=60)?"Grade B":"fail";
		System.out.println(result);
		}
}
