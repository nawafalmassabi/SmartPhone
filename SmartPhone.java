//This is class name/
public class SmartPhone {
	  String name;
      String model;
      int releasedate;
// print method
private void printInfo() {
	
System.out.println("Name "+name);
System.out.println("Model "+model);
System.out.println("Releasedate "+releasedate);
}


	public static void main(String[] args) {

	SmartPhone phone1 = new SmartPhone(); //add object1
	SmartPhone phone2 = new SmartPhone(); // add object2     
	
	// add object1 variable
	phone1.name ="Iphone";
	phone1.model ="pro 11";
	phone1.releasedate = 2019;
	
	// add object2 variable
	phone2.name ="Galaxy";
	phone2.model ="S20";
	phone2.releasedate = 2020;
	
	phone1.printInfo();
	phone2.printInfo();
    }
}  
