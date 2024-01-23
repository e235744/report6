package jp.ac.uryukyu.ie.e235744;

public class Enemy {
    /*名前 
     * HP
     * 与えるダメージ量 */
    private String name;
    private int hp = 100;
    private int damage;

    public Enemy() {
        /*敵の初期設定 */
        this.name = "イカ大王";
        this.hp = 100;
        this.damage = 30;
    }

    public void attack(Hero h) {
        /*敵に攻撃する 
         * 自分のHPが０以上なら攻撃できる*/
        if (hp > 0) {
            System.out.println(this.name + "の攻撃 " + damage + "ダメージ与えた");
            h.damaged(damage);
            System.out.println(h.getName() + "のHP : " + h.getHp());
        }
    }
    
    /*プライベートにしたフィールドを返す 
     * 名前
     * HP
     * 与えるダメージ量
     * ダメージを受けるための関数*/
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