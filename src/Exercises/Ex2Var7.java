package Exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2Var7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            byte l = sc.nextByte();
            byte mas[] = new byte[l];
            byte max = -128;
            byte maxIndex = 0;
            for (byte i = 0; i < l; i++) {
                mas[i] = sc.nextByte();
                if (mas[i] > max) {
                    max = mas[i];
                }
                maxIndex++;
            }
            System.out.println("Наибольшее число:" + max + "\nНомер числа:" + maxIndex);
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива");
        } catch (InputMismatchException e) {
            System.out.println("Выход за пределы от -128 до 127 или несоответствие типу byte");
        }
    }
}


/* xception in thread "main" java.util.InputMismatchException: For input string: "12341234213412424312423423423412342134234123412341234123412341243213412424213412342134123412341234123412"
	at java.base/java.util.Scanner.nextInt(Scanner.java:2264)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Exercises.Ex2Var7.main(Ex2Var7.java:7)

	Exception in thread "main" java.util.InputMismatchException: For input string: "1231242134123412342"
	at java.base/java.util.Scanner.nextByte(Scanner.java:2008)
	at java.base/java.util.Scanner.nextByte(Scanner.java:1956)
	at Exercises.Ex2Var7.main(Ex2Var7.java:10)

    Exception in thread "main" java.lang.NegativeArraySizeException: -3
	at Exercises.Ex2Var7.main(Ex2Var7.java:8)
 */