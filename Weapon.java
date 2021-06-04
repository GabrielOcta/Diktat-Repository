/**
 * @author Gabriel Octa Mahardika 1972037
 */
public interface Weapon {
    void attack(GameCharacter attacker,GameCharacter enemy);
    int getDamage();
}
