public class Main {
 
/*

Jalen White 
W#0453163
Date: 01/22/25



*/


public static void main(String[] args) {

Car myCar = new Car();
Car myCar2 = new Car("Tesla");
Car myCar3 = new Car("Nissan", 2019);
Car myCar4 = new Car("Ford" , 2021 , "Black");



System.out.println("====================================");
System.out.println("   Display for initial values with no args   ");
System.out.println("====================================");
myCar.display();


System.out.println("\n====================================");
System.out.println("   Display for initial values with all parameters   ");
System.out.println("====================================");
myCar2.display();




System.out.println("\n====================================");
System.out.println("   Display for another car with all parameters   ");
System.out.println("===================================="); 
myCar3.display();


System.out.println("\n====================================");
System.out.println("   Display for the fourth car with all parameters   ");
System.out.println("===================================="); 
myCar4.display();







}

}