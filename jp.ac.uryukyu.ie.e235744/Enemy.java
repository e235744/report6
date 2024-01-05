public class Enemy {
    String name;
    int hp = 100;

    public Enemy() {
        this.name = "イカ大王";
        this.hp = 100;
    }

    public void attack(Hero h) {
        System.out.println(this.name + "の攻撃");
        h.hp -= 30;
        System.out.println("勇者のHP : " + h.hp);
    }
}
