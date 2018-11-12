public class Car extends Vehicle // q.5
{
			
	public Car (String brand, int kilometers) // q.8
	{
		super(brand, kilometers);
	}
	@Override	
	public String doStuff()
	{
		return "Je suis " + this.getBrand() + " et je fais vroum vroum!";
	}
}
