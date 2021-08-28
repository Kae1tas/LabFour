package Examples;

public class Ex11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
/* Метод main попытался выполнить блок кода, который выводит "0" и "бросает"
исключение (созданный экземпляр NullPointException). Затем исключение
перехватывается и обрабатывается. После финальный блок, выполняемый всегда выводит "2".
В конце выводится "3".
 */