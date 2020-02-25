import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
		for(int j=0;j<=i;j++ )
		{
			char x=str.charAt(j);
			System.out.print(x);
		}
		System.out.println();
		}
	}

}
