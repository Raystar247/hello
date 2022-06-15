import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random rand = new Random();
            int target = rand.nextInt(90) + 10;
            
            for (int i = 0; i < 5; i++) {
                int num;
                try {
                    while(true) {
                        try {
                            System.out.print("Answer "+ (i+1) + "  => Input the number: ");
                            num = scan.nextInt();
                            break;
                        } catch(InputMismatchException e) {
                            System.out.println("Incorrect Input");
                            scan.next();
                        }
                    }
                    if ( Math.abs(num - target) >= 20 ) {
                        System.out.print("20以上");
                    }
                    if ( num > target ) {
                        System.out.println("大きいです");
                    } else if ( num < target ) {
                        System.out.println("小さいです");
                    } else {
                        System.out.println("正解");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println(e);
                }
                if (i == 4) {
                    String s = "失敗  正解:" + target;
                    System.out.println(s);
                }
             }
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}