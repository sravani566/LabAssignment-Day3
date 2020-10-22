package labass3;

public class CommisionEmployee extends Employee implements IncreaseSalary
{
	private int perecentage;
	private int weeklySale;
	public CommisionEmployee(int perecentage, int weeklySale) 
        {
		this.perecentage = perecentage;
		this.weeklySale = weeklySale;
	}
	@Override
	public int getSalary() 
        {
		System.out.println("Salary of comission employee is ");
		return (perecentage*weeklySale)/100;
	}
        @Override
	public int increasedSalary() 
        {
		return 5;
	}
	@Override
	public double getPayment() 
        {
		return (perecentage*weeklySale)/100;
	}
	@Override
	public String toString() 
        {
		StringBuilder builder = new StringBuilder();
		builder.append("CommisionEmployee [perecentage=");
		builder.append(perecentage);
		builder.append(", weeklySale=");
		builder.append(weeklySale);
		builder.append(", salary=");
		builder.append((perecentage*weeklySale)/100);
		builder.append("]");
                return builder.toString();
	}
	
}
