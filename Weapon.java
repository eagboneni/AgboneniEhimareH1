public class Weapon extends Item{
//Weapon class takes properties from Item class now can add properties exclisove for this class
  
  private int damage;
  private int durability;
  /**
   * Constructor for weapon class takes in 
   * String and 3 int values 
   */
  
  public Weapon(String name, int weight, int dam, int dura){
  //Weapon constructor takes in two int values for damage and durability
   super(name, weight);
   damage = dam;
   durability = dura;
  }
  
  /**
   * The set method for getting the damage value for the weapon
   * @param dam
   */
  
  public void setDamage(int dam){
    damage = dam;
  }
  
  /**
   *The get method that returns the value for damage for the weapon 
   * @return damage
   */
  public int getDamage(){
    return damage; 
  }
    /**
   * The set method for getting the durability value for the weapon
   * @param dura
   */
  public void setDurability(int dura){
    durability = dura;
  }
    /**
   *The get method that returns the value for durability for the weapon 
   * @return durability
   */
  public int getDurability(){
    return durability;
  }
  /**
   * The examine method displays a string that describes the weapon
   */
  public void examine(){
    System.out.println(this.getNameOfItem() + " weighs " + this.getWeightOfItem());
    System.out.println("Damage = " + this.getDamage());
    System.out.println("Durability = " + this.getDurability());
  }
}