package homework1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Array {

    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        Integer[] array = new Integer[arrayLength];

        System.out.println("Введите поочереди элементы массива (размер массива равен " + arrayLength + "):");

        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        int sum = calcSum(array);

        System.out.println("--------------");
        
        System.out.println("Сумма: " + sum);

        System.out.println("Среднее значение: " + calcAvg(array, sum));

        Integer[] tmpArray = new Integer[arrayLength]; // массив для сортировки, чтобы не трогать первоначальный


        System.arraycopy(array, 0, tmpArray, 0, array.length); // копирование массива

        System.out.print("Сортировка по возрастанию: ");

        Arrays.sort(tmpArray);
        printArray(tmpArray);
        System.out.println();


        System.out.print("Сортировка по убыванию: ");

        Arrays.sort(tmpArray, Collections.reverseOrder());
        printArray(tmpArray);
        System.out.println();

        System.out.print("Четные:");
        showEven(array);
        System.out.println();

        System.out.print("Нечетные:");
        showOdd(array);
        
        System.out.println();
        
        System.out.println("--------------");
    }

    // печать массива
    private static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // посчитать сумму
    private static int calcSum(Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // посчитать среднее значение
    private static double calcAvg(Integer[] arr, int sum) {
        return sum / arr.length;
    }


    //показать четные элементы
    private static void showEven(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //показать нечетные элементы
    private static void showOdd(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }    
    
}
