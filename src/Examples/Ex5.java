package Examples;

public class Ex5 {
     public static void main(String[] args) {
         try {
             System.out.println("0");
             throw new RuntimeException("ошибка");
         } catch (NullPointerException e) {
             System.out.println("1");
         }
         System.out.println("2");
     }
}

/* Метод main "попытался выполнить" блок кода, который выводит "0" и "бросает"
исключение (созданный экземпляр RuntimeException) с сообщением. Но исключение не перехватывается, т.к.
класс не подходит. В результате выходит трасса стека, и "2" не выводится.
 */
