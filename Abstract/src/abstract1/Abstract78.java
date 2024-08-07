package abstract1;

 abstract class Car //1
 {
	abstract void Type();
	abstract void Gear1();
 }
 abstract class House1 extends Car //1
 {
	 abstract void color();
	 abstract void length();
	// @override
	 abstract void Type();
	 abstract void Gear();
 }
 abstract class Road extends Car  //2
 {
	abstract void shit();
    abstract void gear();
    //override
    abstract void Type();
	abstract void Gear1();
 }
 abstract class Bank extends Car //3
 {
	abstract void wm();
	abstract void TM();
 }
 abstract class Central extends House1 //1
 {
	abstract void Loan();
	abstract void HomeLoan();
 }
 abstract class canara extends House1 //2
 {
	abstract void VehicleLoan();
	abstract void GoldLoan();
 }
 abstract class StateBank extends Road //3
 {
	abstract void Saving();
 }
 abstract class Union extends Road //4
 {
	abstract void Branch();
 }
 abstract class Unisix extends Bank //5
 {
	 abstract void GetMoney();
 }
 abstract class wipro extends Bank //6
 {
	 abstract void Position();
 } 
 class Abstract78 extends House1 //1
{ 
	@Override
	void color() {
		System.out.println("white");
		
	}
	@Override
	void length() {
		System.out.println("0988");
		
	}
	@Override
	void Type() {
		System.out.println("String");
		
	}
	@Override
	void Gear() {
		System.out.println("4");	
	}
	public static void main(String[] args) {
	 Abstract78 a=new Abstract78();
	 a.Gear();
	 a.Type();
	 a.length();
	 a.color();
	}
	@Override
	void Gear1() {
		// TODO Auto-generated method stub
		
	}	 
 }
 class Copy1 extends Road
 {

	@Override
	void shit() {
		System.out.println(6);
		
	}

	@Override
	void gear() {
     System.out.println(4);		
	}
	@Override
	void Type() {
       System.out.println("4 wheel");		
	}

	@Override
	void Gear1() {
      System.out.println(9);		
	}
	public static void main(String[] args) {
	  Road r=new Copy1();
	  r.shit();
	  r.gear();
	  r.Type();
	  r.Gear1();
	    
	}
}
 class Watch extends canara
 {

	@Override
	void VehicleLoan() {
		System.out.println(8978347);
		
	}

	@Override
	void GoldLoan() {
      System.out.println(976487687);		
	}

	@Override
	void color() {
		System.out.println(98286873);
		
	}

	@Override
	void length() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void Type() {
		System.out.println("Op");
		
	}

	@Override
	void Gear() {
		System.out.println(8);
		
	}

	@Override
	void Gear1() {
       System.out.println(9);		
	}
	 
 }
 class Pup extends StateBank
 {

	@Override
	void Saving() {
		System.out.println(897893749);
		
	}

	@Override
	void shit() {
		System.out.println(9);
		
	}

	@Override
	void gear() {
		System.out.println(6);
		
	}

	@Override
	void Type() {
		System.out.println("jack");
		
	}

	@Override
	void Gear1() {
		System.out.println("9873498");
		
	}
	 
 }
 