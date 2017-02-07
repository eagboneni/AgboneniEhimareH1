public class Item {

  private String nameOfItem;
  private int weightOfItem;
  
  
  public Item(String name, int weight){
  //Item constructor, takes in string and int for the item
    nameOfItem = name;
    weightOfItem = weight;
  }
  

  public void setNameOfItem(String name){
  //Stores value for name of the item
    nameOfItem = name;
  }
  
  public void setWeightOfItem(int weight){
  //Stores value for the weight of the item 
    weightOfItem = weight;
  }
  
  public String getNameOfItem(){
  //Returns the item's name
    return nameOfItem;
  }
  
  public int getWeightOfItem(){
  //Returns the weight of item
    return weightOfItem;
  }
  
  
   public static void examine(Item i){
  //Displays discription of the item with it's name and weight
    System.out.println("The " + i.getNameOfItem() + " weighs " + i.getWeightOfItem() + " pounds" );
  }
  
}