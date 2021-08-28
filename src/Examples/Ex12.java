package Examples;

public class Ex12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        m(null,0.000001);
    }
}
/* Метод main вызывает метод m(null, 0.000001), которая при str равном null
"бросает" исключение (созданный экземпляр IllegalArgumentException) - строка введена неверно.
 */
