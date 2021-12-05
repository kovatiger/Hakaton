import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Player {

    static Scanner scanner = new Scanner(System.in);

    public static void printField(char field[][]) {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("   A " + " B " + " C " + " D " + " E " + " F " + " G " + " H " + " I " + " J ");
            }
            if (i == 9) {
                System.out.print("10");
            } else
                System.out.print(i + 1 + " ");

            for (int j = 0; j < 10; j++) {
                System.out.print("|");
                if (field[i][j] == 'X') {
                    System.out.print(field[i][j]);
                } else if (field[i][j] == '#') {
                    System.out.print(field[i][j]);
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");

            }
            System.out.println();
        }
    }

    public void field(char[][] field) {
        int x = 0;
        for (int i = 4; i > 0; i--) {
            for (int k = i; k < 5; k++) {
                printField(field);
                System.out.println("расставьте " + i + " палубный корабль");
                System.out.println("По вертикали - 1, по горизонтали - 2");
                int choose3 = scanner.nextInt();
                if (choose3 == 1) {
                    System.out.println("Введите координаты начала корабля");
                    String coordY = scanner.next();
                    int coordX = scanner.nextInt() - 1;
                    for (int j = 0; j < i; j++) {
                        if (coordY.equals("A")) {
                            x = 0;
                        }
                        if (coordY.equals("B")) {
                            x = 1;
                        }
                        if (coordY.equals("C")) {
                            x = 2;
                        }
                        if (coordY.equals("D")) {
                            x = 3;
                        }
                        if (coordY.equals("E")) {
                            x = 4;
                        }
                        if (coordY.equals("F")) {
                            x = 5;
                        }
                        if (coordY.equals("G")) {
                            x = 6;
                        }
                        if (coordY.equals("H")) {
                            x = 7;
                        }
                        if (coordY.equals("I")) {
                            x = 8;
                        }
                        if (coordY.equals("J")) {
                            x = 9;
                        }

                        field[coordX + j][x] = 'X';

                    }

                }
                if (choose3 == 2) {
                    System.out.println("Введите координаты");
                    String coordY = scanner.next();
                    int coordX = scanner.nextInt() - 1;
                    for (int j = 0; j < i; j++) {
                        if (coordY.equals("A")) {
                            x = 0;
                        }
                        if (coordY.equals("B")) {
                            x = 1;
                        }
                        if (coordY.equals("C")) {
                            x = 2;
                        }
                        if (coordY.equals("D")) {
                            x = 3;
                        }
                        if (coordY.equals("E")) {
                            x = 4;
                        }
                        if (coordY.equals("F")) {
                            x = 5;
                        }
                        if (coordY.equals("G")) {
                            x = 6;
                        }
                        if (coordY.equals("H")) {
                            x = 7;
                        }
                        if (coordY.equals("I")) {
                            x = 8;
                        }
                        if (coordY.equals("J")) {
                            x = 9;
                        }
                        field[coordX][x + j] = 'X';
                    }
                }
            }
        }
    }


    public void play(char[][] field1, char[][] field2, String name1, String name2) {
        //Random random = new Random();
        int x = 0;
        String bufferName = name1;
        char[][] battleField1 = new char[10][10];
        char[][] battleField2 = new char[10][10];
        char[][] bufferArray = new char[10][10];
        bufferArray = battleField1;
        while (alive(field1) || alive(field2)) {
            System.out.println(bufferName + " ваш ход");
            System.out.println("Введите координаты");
            String coordY = scanner.next();
            int coordX = scanner.nextInt() - 1;
            if (coordY.equals("A")) {
                x = 0;
            }
            if (coordY.equals("B")) {
                x = 1;
            }
            if (coordY.equals("C")) {
                x = 2;
            }
            if (coordY.equals("D")) {
                x = 3;
            }
            if (coordY.equals("E")) {
                x = 4;
            }
            if (coordY.equals("F")) {
                x = 5;
            }
            if (coordY.equals("G")) {
                x = 6;
            }
            if (coordY.equals("H")) {
                x = 7;
            }
            if (coordY.equals("I")) {
                x = 8;
            }
            if (coordY.equals("J")) {
                x = 9;
            }
            bufferArray[coordX][x] = '*';
            if (bufferName.equals(name1)) {
                if (battleField1[coordX][x] == '*' && field2[coordX][x] == 'X') {
                    System.out.println("Вы попали");
                    battleField1[coordX][x] = '#';
                    printField(battleField1);
                } else {
                    bufferName = name2;
                    name2 = name1;
                    name1 = bufferName;
                    bufferArray = battleField2;
                    battleField2 = battleField1;
                    battleField1 = bufferArray;
                    continue;
                }
            }
            if (bufferName.equals(name2)) {
                if (battleField1[coordX][x] == '*' && field2[coordX][x] == 'X') {
                    System.out.println("Вы попали");
                    battleField1[coordX][x] = '#';
                    printField(battleField1);
                } else {
                    bufferName = name1;
                    name1 = name2;
                    name2 = bufferName;
                    bufferArray = battleField1;
                    battleField1 = battleField2;
                    battleField2 = bufferArray;
                continue;
                }
            }
        }
    }

    public static boolean alive(char[][] field) {
        for (char[] a : field) {
            for (char element : a) {
                if (element == 'X') {
                    return true;
                }
            }
        }
        System.out.println("Вы проиграли");
        return false;
    }
}
