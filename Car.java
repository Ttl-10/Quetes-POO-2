public class Car extends Vehicle // q.8
{
			
	public Car (String brand, int kilometers)
	{
		super(brand, kilometers);
	}
	@Override	
	public String doStuff()
	{
		return "Je suis " + this.getBrand() + " et je fais vroum vroum!";
	}
}
