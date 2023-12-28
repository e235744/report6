public class Main {
    public static void main(String[] args) {
        //勇者の初期設定
        System.out.println("名前を入力して下さい");
        String n = new java.util.Scanner(System.in).nextLine();
        System.out.println("こんにちは 勇者" + n + " さん");
        Hero h = new Hero(n);

        
    }
}