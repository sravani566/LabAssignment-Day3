package labass3;
public class Tester2 {
	public static void main(String[] args)
	{
	Invoice invoice  = new Invoice("1", "Bag", 3, 1000.0);
	String k=invoice.toString();
	System.out.println(k);
	}
}