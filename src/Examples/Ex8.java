package Examples;

// Генерация исключения в методе

public class Ex8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
/* Метод main вызывал метод m(), который попытался выполнить блок кода,
кой выводит "0" и "бросает" исключение (созданный экземпляр RuntimeException).
Затем финальный блок, выполняемый всегда, выводит "1".
 */