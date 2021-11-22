package Lecture_2_oo.TwoFighters;

public class Fighter {
    public String name;
    public int health; //ori public ori le faceam getter-e si setter-e
    public int damagePerAttack;

    public Fighter(String name,int health,int damagePerAttack){
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        this.name = name;
    }
    public void attack(Fighter opponent){
        opponent.health -= damagePerAttack;
    }

}
