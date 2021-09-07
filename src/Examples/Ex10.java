package Examples;

public class Ex10 {
    public static int m() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
/* Метод main вызывал метод m(), который попытался
выполнить блок кода, который выводит "0" и возвращает значение 15.
Затем финальный блок, выполняемый всегда выводит "1" и
возвращает значение 20. После выводится возвращаемое значение 20.
 */