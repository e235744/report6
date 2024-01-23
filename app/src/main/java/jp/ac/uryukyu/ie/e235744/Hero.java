package jp.ac.uryukyu.ie.e235744;

public class Hero {
    /*名前
     * HP
     * 回復量
     * 与えるダメージ量*/
    private String name;
    private int hp;
    private int heal;
    private int damage;

    public Hero() {
        /*勇者の初期設定*/
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
        if (hp > 0) {
            System.out.println(this.name + "の攻撃 " + damage + "ダメージ与えた");
            e.damaged(damage);
            System.out.println(e.getName() + "のHP : " + e.getHp());
        }
    }

    public void heal() {
        /*HPを回復する*/
        int m = Math.min(100 - hp, heal);
        System.out.println(name + "は" + m + "回復した");
        this.hp += m;
        System.out.println(name + "のHP : " + hp);
    }
    
     /*プライベートにしたフィールドを返す 
     * 名前
     * HP
     * 与えるダメージ量
     * ダメージを受けるための関数
    */
    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getDamage() {
        return this.damage;
    }

    public void damaged(int damage) {
        hp -= damage;
    }
}