public class Weapon extends Item{
//Weapon class takes properties from Item class now can add properties exclisove for this class
  
  private int damage;
  private int durability;
  
  public Weapon(String name, int weigh, int dam, int dura){
  //Weapon constructor takes in two int values for damage and durability
   super(name, weigh);
   damage = dam;
   durability = dura;
  }
}