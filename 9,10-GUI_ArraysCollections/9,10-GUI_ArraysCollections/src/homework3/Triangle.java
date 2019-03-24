package homework3;

import java.util.Scanner;


public class Triangle {

    private static String symbol;
    private static int number;
    private static String[][] triangle;

    // заполняет весь массив символом 
    private static void fillTriangleBySymbol(String symbol) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                triangle[i][j] = symbol;
            }
        }
    }

    public static void createPatternA() {
        fillTriangleBySymbol(symbol);// заполняем весь массив символом
        // потом заполняем необходимые ячейки пробелами
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < i; j++) {// j < i - условие для построения треугольника
                triangle[j][i] = " ";
            }
        }
    }

    public static void createPatternB() {
        fillTriangleBySymbol(" ");// заполняем весь массив пробелами
        // потом заполняем необходимые ячейки символом
        for (int j = 0; j < triangle.length; j++) {
            for (int i = 0; i < triangle.length - j; i++) {
                triangle[i][j] = symbol;
            }
        }
    }

    public static void createPatternC() {
        fillTriangleBySymbol(symbol);// заполняем весь массив символом
        // потом заполняем необходимые ячейки пробелами
        for (int j = 0; j < triangle.length; j++) {
            for (int i = 0; i < triangle.length - j - 1; i++) {
                triangle[j][i] = " ";
            }
        }
    }

    public static void createPatternD() {
        fillTriangleBySymbol(symbol);// заполняем весь массив символами
        // потом заполняем необходимые ячейки пробелами
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < i; j++) {// j < i - условие для построения треугольника
                triangle[i][j] = " ";// как в паттерне А только i j поменялись местами
            }
        }
    }

    public static String getTriangle() {
        System.out.println();// печатаем пустую строку чтобы был отступ от слова Pattern
        String output = "";
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                output += triangle[i][j];
            }
            output += "\n";
        }
        return output; // конечный треугольник записывается в эту переменную
    }

    public static void main(String[] args) {

        // считываем количество элементов
        System.out.print("Введите количество элементов: ");
        Scanner s = new Scanner(System.in);
        int arrayLength = s.nextInt();

        System.out.println();

        // считываем символ
        System.out.print("Введите символ для отображения: ");
        String arraySymbol = s.next();
        
        symbol = arraySymbol;
        number = arrayLength;
        
        triangle = new String[arrayLength][arrayLength];
        
        System.out.println();

        createPatternA();
        System.out.println("Pattern A");
        System.out.println(getTriangle());

        createPatternB();
        System.out.println("Pattern B");
        System.out.println(getTriangle());

        createPatternC();
        System.out.println("Pattern C");
        System.out.println(getTriangle());

        createPatternD();
        System.out.println("Pattern D");
        System.out.println(getTriangle());
    }
}
