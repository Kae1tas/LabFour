package Examples;

public class Ex7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");
    }
}
/* Метод main попытался выполнить блок кода, который выводит "0"
и "бросает" исключение (созданный экземпляр NullPointerException).
Затем исключение перехватывается и обрабатывается (выводится "1" и
"бросается" исключение (созданный экземпляр ArithmeticException).
Но ArithmeticException не перехватывается, т.к. catch не принадлежит
этому блоку кода. После выводится трасса стека.
 */