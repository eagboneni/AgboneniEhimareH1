public class Item {

  private String nameOfItem;
  private int weightOfItem;
  
  /**
   * Constructor for item class takes in 
   * String and int  
   */
  public Item(String name, int weight){
  //Item constructor, takes in string and int for the item
    nameOfItem = name;
    weightOfItem = weight;
  }
  
      /**
   * The set method for getting the name of the item
   * @param name
   */
  public void setNameOfItem(String name){
  //Stores value for name of the item
    nameOfItem = name;
  }
  
      /**
   * The set method for getting the weight of the item 
   * @param weight
   */
  public void setWeightOfItem(int weight){
  //Stores value for the weight of the item 
    weightOfItem = weight;
  }
    /**
   *The get method that returns the name of the item
   * @return nameOfItem
   */
  public String getNameOfItem(){
  //Returns the item's name
    return nameOfItem;
  }
    /**
   *The get method that returns the value for weight of the item 
   * @return weightOfItem
   */
  public int getWeightOfItem(){
  //Returns the weight of item
    return weightOfItem;
  }
   /**
   * The examine method displays a string that describes the item
   */
   public void examine(){
  //Displays discription of the item with it's name and weight
    System.out.println("The " + this.getNameOfItem() + " weighs " + this.getWeightOfItem() + " pounds" );
  }
  
}