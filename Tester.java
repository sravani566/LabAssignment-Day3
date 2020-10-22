package labass3;

public class Tester 
{
	public static void main(String[] args)
	{
		SalariedEmployee se=new SalariedEmployee(54000);
		System.out.println(se);
		HourlyEmployee he=new HourlyEmployee(2500,60);
		System.out.println(he);
		CommisionEmployee ce=new CommisionEmployee(9000,50);
		System.out.println(ce);
	}
}
