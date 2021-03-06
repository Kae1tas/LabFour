package Exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

//Лабораторная работа 4, Вариант 7

public class Ex2Var7Method {
    static Scanner sc = new Scanner(System.in);

    public static byte[] masLengthInput() throws NegativeArraySizeException, InputMismatchException{
        System.out.println("Введите длину массива от 0 до 127:");
        return new byte[sc.nextByte()];
    }


    public static byte[] enter(byte[] mas) throws InputMismatchException {
        if (mas.length == 0) {
            System.exit(1);
        }
        for (byte i = 0; i < mas.length; i++) {
            mas[i] = sc.nextByte();
        }

        return mas;
    }

    public static byte findMax(byte[] mas) throws ArithmeticException {
        byte maxIndex = 0;
        byte max = -128;
        for (byte i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                maxIndex = i;
            }
        }
        if (max < 0)
            throw new ArithmeticException("Ошибка");
        maxIndex++;
        System.out.println("Наибольшее число:" + max);

        return maxIndex;
    }


    public static void main(String[] args) {
        try {
            byte[] mas = enter(masLengthInput());
            System.out.println("Номер этого числа:" + findMax(mas));
        } catch (InputMismatchException e) {
            System.out.println("Несоответствие типу byte (выход за пределы от -128 до 127" +
                    "\nили ввод неверных знаков (требуется ввод целых чисел)");
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива");
        } catch (ArithmeticException e){
            System.out.println("Нет положительных чисел");
        }

    }
}