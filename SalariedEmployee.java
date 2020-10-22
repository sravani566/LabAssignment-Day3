package labass3;

public class SalariedEmployee extends Employee implements IncreaseSalary
{
	private int salary;
	public SalariedEmployee(int salary) 
        {
		this.salary = salary;
	}
	@Override
	public int getSalary() 
        {
		System.out.println("Salaried employee: ");
		return salary;
        }
	@Override
	public int increasedSalary() 
        {
		return 5;
	}
	
	@Override
	public String toString() 
        {
		StringBuilder builder = new StringBuilder();
		builder.append("SalariedEmployee [salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public double getPayment() {
          System.out.println(this.toString());
		return salary;
	}
}
