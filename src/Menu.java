import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    int gameMode;

    public void startMenu() {


        System.out.println("Введите один из режимов игры:\n1.(Игрок против Игрока)\n2.(Игрок против Компьютера)\n3.(Компьютер против Компьютера) ");
        System.out.println("Если вы хотите выйти, выберите 4");
        int gameMode = sc.nextInt();
        switch (gameMode) {
            case 1:
                System.out.println("Вы выбрали режим игры Игрок против Игрока ");
                System.out.println("Введите имя игрока 1");
                String name1 = sc.next();
                System.out.println("Введите имя игрока 2");
                String name2 = sc.next();
                char[][] fieldOf1Player = new char[10][10];
                char[][] fieldOf2Player = new char[10][10];
                Player player = new Player();
                player.field(fieldOf1Player);
                player.field(fieldOf2Player);
                player.play(fieldOf1Player,fieldOf2Player,name1,name2);
                break;
            case 2:
                System.out.println("Вы выбрали режим игры Игрок против Компьютера");
                break;
            case 3:
                System.out.println("Вы выбрали режим игры Компьютер против Компьютера");
                break;
            case 4:
                System.out.println("Вы действительно хотите выйти?");
                choiceOfExitMethod(gameMode);
            default:
                System.out.println("Вы выбрали неверное действие, попробуйте еще раз!");
        }
    }


    public static int choiceOfExitMethod(int gameMode) {
        if (gameMode == 4) {
            System.out.println("Да! (нажмите 1), Нет!(Нажмите 2)");
            int choiceOfExit;
            choiceOfExit = sc.nextInt();
            if (choiceOfExit == 1) {
                System.out.println("Выходим!");
                System.exit(0);
            }
            if (choiceOfExit == 2) {
                System.out.println("Спасибо, что вы с нами!");
                Menu menu = new Menu();
                menu.startMenu();
            }
        }
        return gameMode;
    }
}
