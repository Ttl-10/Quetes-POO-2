public abstract class Vehicle // q.1
{
	private String brand; // q.2 - attributs
	private int kilometers;

	public Vehicle(String brand, int kilometers) // q.3 - constructeur
	{
		this.brand=brand;
		this.kilometers=kilometers;
	}
	public String getBrand() //  q.4 - get
	{
		return this.brand;
	}
	public void setBrand(String brand) // q.4 - set
	{
		this.brand=brand;
	}
	public int getKilometers() // q.4 - get
	{
		return this.kilometers;	
	}
	public void setKilometers(int kilometers) // q.4 - set
	{
		this.kilometers=kilometers;
	}
	public abstract String doStuff(); // q.7
	
}
