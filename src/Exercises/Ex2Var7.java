package Exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2Var7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите длину массива");
            byte l = sc.nextByte();
            byte[] mas = new byte[l];
            byte max = -128;
            byte maxIndex = 0;
            for (byte i = 0; i < l; i++) {
                mas[i] = sc.nextByte();
                if (mas[i] > max) {
                    max = mas[i];
                    maxIndex = i;
                }
            }
            if (max < 0)
                throw new ArithmeticException("Ошибка");
            maxIndex++;
            System.out.println("Наибольшее число:" + max + "\nНомер числа:" + maxIndex);
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива");
        } catch (InputMismatchException e) {
            System.out.println("Несоответствие типу byte (выход за пределы от -128 до 127" + "\nили ввод неверных знаков (требуется ввод целых чисел)");
        } catch (ArithmeticException e) {
            System.out.println("Положительных чисел нет");
        }
    }
}