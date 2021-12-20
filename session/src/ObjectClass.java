
public class ObjectClass {
int id;
public ObjectClass(int id)
{
	this.id=id;
}
public int hashCode()
{
	return id;
}
public static void main(String[] args) {
	ObjectClass d=new ObjectClass(2);
	System.out.println(d);
	System.out.println(d.hashCode());
}
}
