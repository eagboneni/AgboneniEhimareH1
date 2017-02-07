public class Item {

  private String nameOfItem;
  private int weightOfItem;
  
  
  public Item(String name, int weight){
  //Item constructor, takes in string and int for the item
    nameOfItem = name;
    weightOfitem = weight;
  }
  

  public void setNameOfItem(String name){
  //Stores value for name of the item
    nameOfItem = name;
  }
  
  public void setWeightOfItem(int weight){
  //Stores value for the weight of the item 
    weightOfitem = weight;
  }
  
  

  
}