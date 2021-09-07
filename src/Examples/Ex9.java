package Examples;

public class Ex9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}

/* Метод main вызывал метод m(), который попытался
выполнить блок кода, кой выводит "0" и возвращает значение 55.
Затем финальный блок, выполняемый всегда выводит "1". После
выводится возвращаемое значение.
 */

