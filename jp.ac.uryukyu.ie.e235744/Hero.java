public class Hero {
    String name;
    int hp;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public void attack(Enemy e) {
        System.out.println(this.name + "の攻撃");
        e.hp -= 20;
        System.out.println("敵のHP : " + e.hp);
    }

    public void heal() {
        System.out.println("勇者は回復した");
        this.hp += 50;
        System.out.println("勇者のHP :" + this.hp);
    }

    
}