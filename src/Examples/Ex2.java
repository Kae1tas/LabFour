package Examples;

public class Ex2 {
    public static void main(String[] args){
        try {
            System.out.println("0");
            System.out.println("1");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 "+ e);
        }
        System.out.println("3");
    }
}
/* Метод main попытался выполнить блок кода, который выводит  "0", "1", и "бросает"
исключение (созданный экземпляр RuntimeException) с сообщением. Затем экземпляр класса
искючений RuntimeException пакета java.lang перехватывается и обрабатывается.
После выводится "3".
 */
