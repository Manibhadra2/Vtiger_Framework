package abstract1;
abstract class House
{
	public void Kichen()
	 {
		System.out.println("cook"); 
	 }
	public abstract void Cycle();
}
public class Abstract12 extends House {
	public void Cycle()
	{
		System.out.println("work is ongoing");
	}
   public void Wash()
   {
	   System.out.println("fruits");
   }
	public static void main(String[] args) {
		House h=new Abstract12();
		Abstract12 a=(Abstract12)h;
		h.Kichen();
		h.Cycle();
		a.Wash();
		 
	}

}
