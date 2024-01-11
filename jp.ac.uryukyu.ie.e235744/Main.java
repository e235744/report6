public class Main {
    public static void main(String[] args) {
        //勇者の初期設定
        System.out.println("名前を入力して下さい");
        String n = new java.util.Scanner(System.in).nextLine();
        System.out.println("こんにちは 勇者" + n + " さん");
        Hero h = new Hero(n);

        //敵のインスタンス作成
        Enemy e = new Enemy();

        //敵と遭遇
        System.out.println("野生の" + e.name + "が現れた");
        for (int i = 0; i < 10; i++) {
            System.out.println(h.name + "のHP : " + h.hp);
            System.out.println(e.name + "のHP : " + e.hp);
            System.out.println("どうする？");
            System.out.println("1:攻撃する 2:回復する");
            int m = new java.util.Scanner(System.in).nextInt();

            //1を入力したら攻撃,2を入力したら回復
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
        }
    }
}