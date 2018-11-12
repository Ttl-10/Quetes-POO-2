public class Boat extends Vehicle // q.6
{
	public Boat (String brand, int kilometers) // q.8
	{
		super(brand, kilometers);
	}
	@Override	
	public String doStuff()
	{
		return "Je suis " + this.getBrand() + " et je fais glou glou!";
	}
}
