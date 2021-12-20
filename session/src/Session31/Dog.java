package Session31;

public  abstract class Dog {
	double weight;
	int nails;
	String Breed;
	public Dog(double weight,int nails,String Breed)
	{
		this.weight= weight;
		this.nails= nails;
		this.Breed= Breed;
	}
	void bark();
	
	abstract void bite();
	abstract void eat();
	public void poop()
	{
		System.out.println("Pooping");
	}
	

}
