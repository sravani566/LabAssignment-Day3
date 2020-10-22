package labass3;

public class Invoice implements Payable
{
	String partNum;
	String partDescription;
	int quality;
	double pricePayPerItem;
	public Invoice(String partNum, String partDescription, int quality, double pricePayPerItem) 
        {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quality = quality;
		this.pricePayPerItem = pricePayPerItem;
	}
	public String getPartNum() 
        {
		return partNum;
	}
	public void setPartNum(String partNum) 
        {
		this.partNum = partNum;
	}
	public String getPartDescription() 
        {
                return partDescription;
	}
	public void setPartDescription(String partDescription) 
        {
		this.partDescription = partDescription;
	}
	public int getQuality() 
        {
		return quality;
	}
	public void setQuality(int quality) 
        {
		this.quality = quality;
	}
	public double getPricePayPerItem() 
        {
		return pricePayPerItem;
        }
	@Override
	public String toString() 
        {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [partNum=");
		builder.append(partNum);
		builder.append(", partDescription=");
		builder.append(partDescription);
		builder.append(", quality=");
		builder.append(quality);
		builder.append(", pricePayPerItem=");
		builder.append(pricePayPerItem);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public double getPayment() 
        {
		System.out.println(this.toString());
		return getQuality()*getPricePayPerItem();
	}
	
}
