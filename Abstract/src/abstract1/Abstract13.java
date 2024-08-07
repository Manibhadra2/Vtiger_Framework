package abstract1;
abstract class Flipkart
{
	 abstract void Dress();
	 abstract void Pen();
	 public void m1() {
		 System.out.println("hiii");
	 }
}
class Amazon extends Flipkart
 {
	 public void Dress()
	 {
		 System.out.println("gins");
	 }
	 public void Pen()
	 {
		 System.out.println("elcos shine");
	 }
 }
public class Abstract13 {

	public static void main(String[] args) {
		Flipkart f=new Amazon();
		
        f.Dress();
        f.Pen();
        f.m1();
	}

}
