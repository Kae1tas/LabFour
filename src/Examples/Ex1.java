package Examples;

public class Ex1 {
    public static void main(String[] args){
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch(RuntimeException e){
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }
}
/* Метод main "попытался выполнить" блок кода, который выводит "0" и "бросает"
созданный экземпляр RuntimeException с сообщением.
Затем экземпляр класса исключений RuntimeException пакета java.lang перехватывается и обрабатывается.
После выводится "2".
 */
