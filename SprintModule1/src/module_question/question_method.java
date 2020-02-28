package module_question ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class question_method {
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	Set<Question> s=new LinkedHashSet<Question>();
 
	public void addQuestion()
	{
		System.out.println("\nADD QUESTION\n");
		try
	{
		
		int j=0;
		System.out.println("Enter no. of questions");
		int n=Integer.parseInt(b.readLine());
		
		
		while(j<n)
		{    String [] str=new String[4];
			Question q=new Question();
			System.out.println("Enter Question ID : ");
			BigInteger questionId=new BigInteger(b.readLine());
			System.out.println("Enter Question : ");
			String questionTitle=b.readLine();
			System.out.println("Enter Question marks : ");
			BigDecimal questionMarks=new BigDecimal(b.readLine());
			System.out.println("Enter question option : ");
			for(int i=0;i<4;i++)
			{
				str[i]=b.readLine();
					
			}
			q.setQuestionOptions(str);
			System.out.println("Enter correct Answer option in number : ");
			int questionAnswer=Integer.parseInt(b.readLine());
			q.setQuestionId(questionId);
			q.setQuestionTitle(questionTitle);
			q.setQuestionTitle(questionTitle);
			q.setQuestionMarks(questionMarks);
			q.setQuestionAnswer(questionAnswer);
			s.add(q);
			j++;
		}
		
		
		System.out.println("Done.");
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	catch(IOException e1)
	{
		System.out.println(e1);
	}
	}
	public void displayQuestion()
	{
		System.out.println("\n*****************DISPLAY QUESTION*************** \n");
	   try
	   {
			 Iterator<Question> it=s.iterator();
			
			while(it.hasNext())
			{
				Question qu=it.next();
				System.out.println(qu.getQuestionId()+") "+qu.getQuestionTitle()+"\n");
				
	     	for(int i=0;i<4;i++)
	     	{
	     		System.out.println(qu.getQuestionOptions()[i]);
	     	}
			}
	   }
			 
	  	 catch(Exception e1)
		{
		   System.out.println(e1);
		}
	}
	public void CalculatetotalMarks()
	  {
		System.out.println("\nCALCULATE QUESTION MARKS\n");
		try
		{
			 Iterator<Question> it=s.iterator();
			 BigDecimal sum=new BigDecimal(0.0);
				while(it.hasNext())
				{
					Question qu=it.next();
					System.out.println(qu.getQuestionId()+") "+qu.getQuestionTitle()+"\n");
					System.out.println(Arrays.toString(qu.getQuestionOptions()).replaceAll("^.|.$", "").replace(", ", "\n")+"\n");
					System.out.println("Enter your answer option in number: ");
					int ans=Integer.parseInt(b.readLine());
					System.out.print("\n");
				    qu.setChosenAnswer(ans);
					if(qu.getQuestionAnswer()==qu.getChosenAnswer())
					{
					   System.out.println("************Correct answer*************");
					   System.out.print("\n");
					   sum=sum.add(qu.getQuestionMarks());
					}
					else
					{
						System.out.println("*********Answer is not correct**********");
						System.out.println("Correct answer is : "+qu.getQuestionAnswer()+"\n");
					}
				}
		System.out.println("Total marks : "+sum+"\n");
		 
	   }
	   catch(IOException e1)
	    {
	   System.out.println(e1);
	    }
	   catch(NullPointerException e)
	    {
			   System.out.println(e);
		}
	}
}


