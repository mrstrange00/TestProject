package module_question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class question_p {

	public static void main(String[] args) 
 {
		int c=0;
		question_method q=new question_method();
		do
		{
			try
			{
				System.out.println("MENU");
				BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("1.Add question\n2.Display question\n3.Calculate question marks\n");
				System.out.println("Select Any :");
				c=Integer.parseInt(b.readLine());
				switch(c)
				{
					case 1:
						 q.addQuestion();
						  break;
					case 2:
						 q.displayQuestion();
						  break;
					case 3: 
						 q.CalculatetotalMarks(); 
						  break;
					default : 
						 System.out.println("There is no method to perform any operation");
						 
				}
			}
			catch(IOException e)
			{
			 System.out.println(e);
			}
		}while(c<=3);

	}

}
