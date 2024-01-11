public class Enemy {
    String name;
    int hp = 100;
    int damage;

    public Enemy() {
        this.name = "イカ大王";
        this.hp = 100;
        this.damage = 30;
    }

    //攻撃動作
    public void attack(Hero h) {
        System.out.println(this.name + "の攻撃 " + damage + "ダメージ与えた");
        h.hp -= damage;
        System.out.println(h.name + "のHP : " + h.hp);
    }
}
