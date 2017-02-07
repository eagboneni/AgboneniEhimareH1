public class ItemCreate{

public static void main(String[]args)
{
  //Creates the specified item based on set variables
  Item sword = new Item("Bastard sword", 125);

  examine(sword);
  
}
   public static void examine(Item i){
  //Displays discription of the item with it's name and weight
    System.out.println("The " + i.getNameOfItem() + " weighs " + i.getWeightOfItem() + " pounds" );
  }
  
}