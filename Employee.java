package labass3;
abstract class Employee implements Payable {
	private int rate;
	public Employee()
	{
	}
	public abstract int getSalary();
	public void setRate(int rate)
	{
		this.rate=rate;
	}
        public int getRate()
	{
		return rate;
	}
}