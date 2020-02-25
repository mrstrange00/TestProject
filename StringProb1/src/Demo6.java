import java.util.StringTokenizer;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="all izz well";
int count=0;
StringTokenizer st=new StringTokenizer(str," ");
while(st.hasMoreTokens()){
	count++;
	System.out.println(st.nextToken());
}
System.out.println("no. of word"+count);
	}

}
