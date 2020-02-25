import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		int l=str.length()-1;
		boolean flag=true;
		for(int i=0;i<l;i++,l--)
		{
		char x=str.charAt(i);
		char y=str.charAt(l);
		if(x!=y)
		{
			flag=false;
		}
		}
		if(flag)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
