public class Hangar // méthode
{
	public static void main(String[] args)
	{
		Vehicle car= new Car("Citroen", 101075);
		Vehicle boat=new Boat("Queen Mary", 260575);
		System.out.println(car.doStuff());
		System.out.println(boat.doStuff());
	}

}
