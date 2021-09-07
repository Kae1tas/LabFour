package Examples;

/* Предок не должен перехватывать исключения раньше потомков
*/

public class Ex6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {      //потомок
            System.out.println("2");
        } catch (Exception e) {      //предок
            System.out.println("3");
        }
        System.out.println("3");
    }
}



