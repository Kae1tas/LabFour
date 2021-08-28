package Exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

//Лабораторная работа 4, Вариант 7

final class Result {
    private final byte max;
    private final byte maxIndex;

    public Result(byte max, byte maxIndex) {
        this.max = max;
        this.maxIndex = maxIndex;
    }

    public byte getMax() {
        return max;
    }

    public byte getMaxIndex() {
        return maxIndex;
    }
}

public class Ex2Var7Methods {
    static Scanner sc = new Scanner(System.in);

    public static byte[] enter() {
        byte l = sc.nextByte();
        byte mas[] = new byte[l];
        for (byte i = 0; i < l; i++) {
            mas[i] = sc.nextByte();
        }
        return mas;
    }

    public static byte findMax(byte[] mas) {
        byte max = -128;
        byte maxIndex = 0;
        for (byte i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            maxIndex++;
        }
        System.out.println("Наибольшее число:" + max);
        return maxIndex;
    }

    public static void main(String[] args) {
        try {
            byte[] mas = enter();
            System.out.println("Номер этого числа:" + findMax(mas));
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива");
        } catch (InputMismatchException e) {
            System.out.println("Выход за пределы от -128 до 127 или несоответствие типу byte");
        }
    }
}
