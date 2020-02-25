
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a="hello";
	String b=new String("hello");
	String c=new String("hello");
	String d="hello";
	System.out.println(a==b);
	System.out.println(c==b);
	System.out.println(c==d);
	System.out.println(a==d);
	System.out.println(a.equals(b));
	System.out.println(c.equals(b));
	System.out.println(c.equals(d));
	System.out.println(a.equals(d));
	System.out.println(a.compareTo(b)==0);
	System.out.println(a.compareTo(d)==0);
	}
}
