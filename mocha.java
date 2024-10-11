public class mocha extends Coffee{
  private Boolean hasCaramel;
  private String additionalFlavors;


public mocha() {
hasCaramel = false;
  additionalFlavors = "none";
}
// makes the input equal to the variable
// the super class gets the variables from the super class in order for it to be used in the subclass

public mocha (double price, String name, String flavor, int size, Boolean hasCaramel, String additionalFlavors) {
   super(price, name, flavor, size);
  this.hasCaramel = hasCaramel;
  this.additionalFlavors = additionalFlavors;
}
//the get methods return the value of the varriable.
  
public boolean getHasCaramel(){
  return hasCaramel;
}

  public void setHasCarael(Boolean newHasCaramel){
    hasCaramel = newHasCaramel;
  }
  //the set methods set the prices equivilent to the inputs




public String getAdditionalFlavors(){
  return additionalFlavors;
}

public void setAdditionalFlavors(String newAdditionalFlavors){
  additionalFlavors = newAdditionalFlavors;
}


   // to string concatinatets that information

  
public String toString() {
  return super.toString() + "\nHas caramel? " + hasCaramel + "\n any addtional Flavors? " + additionalFlavors;
}