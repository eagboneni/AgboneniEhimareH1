public class Food extends Item{

private int nutrition;
private int quantity;

/**
   * Constructor for item class takes in 
   * String and 3 int values  
   */
public Food(String name, int weight, int nutri, int quant){
  super(name, weight);
  nutrition = nutri;
  quantity  = quant;
}
  /**
   * The set method for getting the nutrition value for the food
   * @param nutri
   */
public void setNutrition(int nutri){
  nutrition = nutri;
}
/**
 * The get method for returning the nutrition value of the food
 * @return nutrition 
 */
public int getNutrition(){
  return nutrition;
}
 /**
   * The set method for getting the quantity value for the food
   * @param quant
   */
public void setQuantity(int quant){
  quantity = quant;
}
/**
 * The get method for returning the quantity value of the food
 * @return quantity 
 */
public int getQuantity(){
  return quantity;
}

 /**
  * examine method that prints description of the food
  */
public void examine(){
    System.out.println(this.getQuantity() + " " + this.getNameOfItem());
    System.out.println("Nutrition = " + this.getNutrition());
    System.out.println("Total weight = " + super.getWeightOfItem()*this.getQuantity());
}
}