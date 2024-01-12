public class Hero {
    String name;
    int hp;
    int heal;
    int damage;

    public Hero() {
        /*勇者の初期設定
         * 名前の入力
         */
        this.hp = 100;
        this.heal = 50;
        this.damage = 20;
        System.out.println("名前を入力して下さい");
        String n = new java.util.Scanner(System.in).nextLine();  //名前を決めてもらう
        System.out.println("こんにちは 勇者" + n + " さん");
        this.name = n;
    }

    public void attack(Enemy e) {
        /*相手に攻撃する*/
        if (e.hp > 0 && hp >= 0) {
            System.out.println(this.name + "の攻撃 " + damage + "ダメージ与えた");
            e.hp -= damage;
            System.out.println(e.name + "のHP : " + e.hp);
        }
    }

    public void heal() {
        /*HPを回復する */
        int m = Math.min(100 - hp, heal);
        System.out.println(name + "は" + m + "回復した");
        this.hp += m;
        System.out.println(name + "のHP : " + hp);
    }
}
