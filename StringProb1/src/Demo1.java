import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc.nextLine();
System.out.println("print in reverse");
for(int i=str.length()-1;i>=0;i--)
{
	System.out.print(str.charAt(i));
}
	}

}
