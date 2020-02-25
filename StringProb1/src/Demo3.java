import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char x=str.charAt(i);
			if(x!=' ')
			System.out.print(str.charAt(i));
			else
				System.out.println();
		}
	}

}
