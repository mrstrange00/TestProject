import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char lc=' ';
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x!=' ')
			{
				System.out.print(x);
			}
			else if(lc!=' ')
				System.out.print(x);
			lc=x;
		}
	}

}

