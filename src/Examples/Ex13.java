package Examples;

public class Ex13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива=" + l);
            int h = 10/1;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
/* Метод main попытался выполнить блок кода, в котором
произошла исключительная ситуация Exception - выход за пределы массива,
в результате чего был создан, перехвачен и обработан экземпляр класса исключений
ArrayIndexOutOfBoundsException пакета java.lang
 */