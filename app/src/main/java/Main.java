import jp.ac.uryukyu.ie.e235744.*;

public class Main {
    public static void main(String[] args) {
        /* 勇者と敵のインスタンス作成*/
        Hero h = new Hero();
        Enemy e = new Enemy();

        /*敵と遭遇
         * 勇者と敵のHPを表示する
         * そのあとの行動を選んでもらう
         * 1を入力したら攻撃,2を入力したら回復
         * 勇者か敵のHPが無くなったらループから抜ける
         */
        System.out.println("野生の" + e.getName() + "が現れた");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            System.out.println(h.getName() + "のHP : " + h.getHp());   /*勇者のHPを表示する */
            System.out.println(e.getName() + "のHP : " + e.getHp());   /*敵のHPを表示する */
            System.out.println("どうする？");
            System.out.println("1:攻撃する 2:回復する");
            int m = new java.util.Scanner(System.in).nextInt();  /*行動を選んでもらう */

            /*1を入力したら攻撃、2を入力したら回復 */
            switch (m) {
                case 1:
                h.attack(e);
                e.attack(h);
                break;

                case 2:
                h.heal();
                e.attack(h);
                break;
            }
            
            /*どちらかのHPが0以下になったら戦闘終了する*/
            if (h.getHp() <= 0 || e.getHp() <= 0) { 
                System.out.println("戦闘終了");
                break;
            }
        }
        /*HPを比較して勝敗を出力する */
        if (h.getHp() > e.getHp()) {
            System.out.println(h.getName() + "の勝利！");
        }else {
            System.out.println(e.getName() + "の勝利！");
        }
    }
}