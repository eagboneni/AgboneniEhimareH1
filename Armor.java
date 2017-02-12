public class Armor extends Item{

  private int defence;
  private int durability;
  
  /**
   * Constructor for armor class takes in 
   * String and 3 int values 
   */
  public Armor(String name, int weight, int def, int dura){
   super(name, weight);
   defence = def;
   durability = dura;
  }
    /**
   * The set method for getting the durability value for the armor
   * @param dura
   */
  public void setDurability(int dura){
    durability = dura;
  }
   /**
   *The get method that returns the value for durability for the armor
   * @return durability
   */
    public int getDurability(){
    return durability;
  }
  /**
   * set method that gets the defense value for the armor
   * @param def
   */
    public void setDefence(int def){
      defence = def;
    }
    
    /**
     * get method that returns the value for defense of the armor
     * @return defense
     */
    public int getDefence(){
      return defence;
    }
   /**
   * The examine method displays a string that describes the armor
   */
     public void examine(){
    System.out.println(this.getNameOfItem() + " weighs " + this.getWeightOfItem());
    System.out.println("Defence = " + this.getDefence());
    System.out.println("Durability = " + this.getDurability());
}
}