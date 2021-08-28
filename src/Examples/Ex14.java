package Examples;

public class Ex14 {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива=" + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль" );
        }
    }
}
/* Метод main попытался выполнить блок кода, который вызвал метод m()
в котором было порождено исключение Exception - деление на ноль,
в результате чего был создан, перехвачен и обработан экземпляр класса
исключений ArithmeticException пакета java.lang
 */