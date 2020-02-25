import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Demo7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the word");
			String word=brr.readLine();
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		int count=0;
		boolean flag=false;
		while((line=br.readLine())!=null) {
		StringTokenizer st=new StringTokenizer(line," ");
		while(st.hasMoreTokens()){
		String x=(String)st.nextToken();
		if(x.equals(word)) {
			flag=true;
		}
		}
		System.out.println("no. of word"+line);
		}
		if(flag) {
		System.out.println("given word is exist");}
		else
			System.out.println("file does not exist");}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
