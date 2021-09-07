package Examples;

public class Ex4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1 " + e);
        } catch (Exception e) {
            System.out.println("2 " + e);
        } catch (Error e) {
            System.out.println("3 " + e);
        }
        System.out.println("4");
    }
}

/* Метод main попытался выполнить блок кода, который выводит "0" и "бросает"
исключение (созданный экземпляр RuntimeException) с сообщением. Затем исключение
перехватывается подходящим классом Exception (предок RuntimeException). После выводится "4".
 */