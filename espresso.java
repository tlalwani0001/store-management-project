public class espresso extends Coffee {
  private int espressoShots;
  private boolean hasMilk;

public espresso() {
  espressoShots = 0;
  hasMilk = false;
}
// makes the input equal to the variable
// the super class gets the variables from the super class in order for it to be used in the subclass
public espresso(double price, String name, String flavor, int size, int espressoShots, Boolean hasMilk ) {
  super(price, name, flavor, size);
  this.espressoShots = espressoShots;
  this.hasMilk = hasMilk;
}


//the get methods return the value of the varriable.


public int getEspressoShots(){
  return espressoShots;
}

  public void setEspressoShots(int newEspressoShots){
    espressoShots = newEspressoShots;
  }

public Boolean getHasMilk() {
  return hasMilk;
}
  //the set methods set the prices equivilent to the inputs

public void setHasMilk(Boolean newHasMilk){
  hasMilk = newHasMilk;
}

   // to string concatinatets that information
public String toString() {
  return super.toString() + "\nEspressoShots: " + espressoShots + "\n has Milk? " + hasMilk;
}













  
}