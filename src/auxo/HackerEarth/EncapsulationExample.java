package auxo.HackerEarth;

public class EncapsulationExample {
    public static void main(String[] args) {
       /* Player  player=new Player();
        player.name="pavi";
       // player.health=20;
        player.weapon="Sword";
        int damage=10;
        player.loseHealth(damage);
        System.out.println("Reamaining Health = "+player.healthRemaining());
        damage=11;
        player.loseHealth(damage);
        System.out.println("Reamaining Health = "+player.healthRemaining());*/
       EnhancePlayer player=new EnhancePlayer ("pavi",10,"Sword");
        System.out.println("Initial health is"+player.getHealth());
    }
}

class Player
{
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health=this.health - damage;
        if(this.health<=0)
        {
            System.out.println("player Knocked out");
        }
    }
    public int healthRemaining(){
        return  this.health;
    }
}

class EnhancePlayer
{
    private String name;
    private int hitpoints=100;
    private String weapon;
   public EnhancePlayer(String name,int health,String weapon)
   {
       this.name=name;
       if(health>0&& health<=100)
       {
           this.hitpoints=health;
       }
       this.weapon=weapon;
   }

   public void LoseHealth(int damage)
   {
       this.hitpoints=this.hitpoints-damage;
       if(this.hitpoints<=0)
       {
           System.out.println("Player Knocked");
       }
   }
   public int getHealth()
   {
       return hitpoints;
   }
}
