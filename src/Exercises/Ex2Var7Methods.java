package Exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

//Лабораторная работа 4, Вариант 7

public class Ex2Var7Methods {
    static Scanner sc = new Scanner(System.in);

    public static byte[] masLengthInput() {
        System.out.println("Введите длину массива от 0 до 127:");
        try {
            return new byte[sc.nextByte()];
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива");
            return new byte[0];
        } catch (InputMismatchException e) {
            System.out.println("Несоответствие типу byte (выход за пределы от -128 до 127" + "\nили ввод неверных знаков (требуется ввод целых чисел)");
            return new byte[0];
        }
    }


    public static byte[] enter(byte[] mas) {
        if (mas.length == 0) {
            System.exit(1);
        }
        try {
            for (byte i = 0; i < mas.length; i++) {
                mas[i] = sc.nextByte();
            }
        } catch (InputMismatchException e) {
            System.out.println("Выход за пределы от -128 до 127 или несоответствие типу byte");
            //System.exit(1);
        }
        return mas;
    }

    public static byte findMax(byte[] mas) {
        byte max = -128;
        byte maxIndex = 0;
        for (byte i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                maxIndex = i;
            }
        }
        maxIndex++;
        System.out.println("Наибольшее число:" + max);
        return maxIndex;
    }

    public static void main(String[] args) {
        byte[] mas = enter(masLengthInput());
        System.out.println("Номер этого числа:" + findMax(mas));
    }
}
