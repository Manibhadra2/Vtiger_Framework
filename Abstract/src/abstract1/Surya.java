package abstract1;
interface Chintu{
	
	
    public default void m2() {
    System.out.println("hoo");	
    }

public class Surya implements Chintu {
	
	public static void main(String[] args) {
    Surya c=new Surya();
     c.m2();
}}}
