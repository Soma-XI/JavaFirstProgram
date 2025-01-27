public class Car {

private String Name;
private int Model;
private String Color;
private int Year;


public String getName() {
return Name;

}

public int getModel() {
return Model;

}

public String getColor() {
return Color;
}


public int getYear() {
return Year;
}




public void setName(String n) {
Name = n;    
}


public void setModel(int m) {
Model = m;    
}


public void setColor(String c) {
Color = c;
}


public void setYear(int y) {
Year = y;
}

//constructor 


//constructor no args


public Car() {
   Name = "nameless";
   Model = 0;
   Color = "colorless";
   Year = 0;
}


public Car(String n) {
   Name = n;
   Model = 0;
   Color = "colorless";
   Year = 0;
}

public Car(String n, int m) {
   Name = n;
   Model = m;
   Color = "colorless";
   Year = 0;
}

public Car(String n, int m, String c) {
   Name = n;
   Model = m;
   Color = c;
   Year = 0;
}




//Display Method
public void display() {
      System.out.println("Car Name: " + Name);
      System.out.println("Car Model: " + Model);
      System.out.println("Car Color: " + Color);
      System.out.println("Car Year: " + Year);
   }







}