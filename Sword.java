/**
 * @author Gabriel Octa Mahardika 1972037
 */
public class Sword extends Item implements Weapon{
    public Sword() {
        setName("Sword");
    }
    @Override
    public void attack(GameCharacter attacker, GameCharacter enemy) {
        if(((Monster)enemy).isFlyingUnit()){
            System.out.println("Enemy out of range");
        }
        else{
            int totalDamage = attacker.getCurrentStrength()+2*100+getDamage();
            int health = enemy.getCurrentHealth()-totalDamage;
            enemy.setCurrentHealth(health);
            System.out.println("Hero do "+totalDamage+" damage to enemy .");
        }
    }
    @Override
    public int getDamage() {
        return 9;
    }
    public String toString(){
        return getName()+" "+getDamage();
    }
}
