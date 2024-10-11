public class Coffee {
  private double price;
  private String name;
  private String flavor;
  private int size;

// makes base item
public Coffee() {
  this(5.0, "unknown", "unknown", 1);
}
// makes the input equal to the variable
public Coffee(double price, String name, String flavor, int size) {
  this.price = price;
  this.name = name;
  this.flavor = flavor;
  this.size = size;
}
//the get methods return the value of the varriable.

 
  public double getPrice() {
    return price;
  }
/
public String getName() {
  return name;
  
}

  public String getFlavor(){
    return flavor;
  }

  public int getSize() {
    return size;
  }
  //the set methods set the prices equivilent to the inputs
public void setPrice(double newPrice) {
  price = newPrice;
}

public void setName(String newName) {
  name = newName;
}

public void setFlavor(String newFlavor) {
  flavor = newFlavor;
}

public void setSize(int newSize) {
  size = newSize;
}
 // to string concatinatets that information
public String toString() {
  return price + " (" + name +" " +flavor + " "+ size +")";
}











  
}