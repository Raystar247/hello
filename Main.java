import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random rand = new Random();
            int target = rand.nextInt(100);
            for (int i = 0; i < 5; i++) {
                System.out.print("入力してください:  ");
                int num = scan.nextInt();
                if ( Math.abs(num - target) >= 20 ) {
                    System.out.print("20以上");
                }
                if ( num > target ) {
                    System.out.println("多いです");
                } else if ( num < target ) {
                    System.out.println("少ないです");
                } else {
                    System.out.println("正解");
                    break;
                }
                if (i == 4) {
                    System.out.println("失敗");
                }
             }
            scan.close();
        }
    }
}