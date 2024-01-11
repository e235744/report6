public class Hero {
    String name;
    int hp;
    int heal;
    int damage;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
        this.heal = 50;
        this.damage = 20;
    }

    //攻撃動作
    public void attack(Enemy e) {
        System.out.println(this.name + "の攻撃 " + damage + "ダメージ与えた");
        e.hp -= damage;
        System.out.println(e.name + "のHP : " + e.hp);
    }

    //回復動作
    public void heal() {
        int m = Math.min(100 - hp, heal);
        System.out.println(name + "は" + m + "回復した");
        this.hp += m;
        System.out.println(name + "のHP : " + hp);
    }
}