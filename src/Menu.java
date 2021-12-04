import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    int gameMode;

    public void startMenu() {


        System.out.println("Введите один из режимов игры:1.(Игрок против Игрока), 2.(Игрок против Компьютера), 3.(Компьютер против Компьютера) ");
        System.out.println("Если вы хотите выйти, выберите 4");
        int gameMode = sc.nextInt();
        switch (gameMode) {
            case 1:
                System.out.println("Вы выбрали режим игры Игрок против Игрока ");
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


    public static int choiceOfExitMethod( int gameMode) {
        if (gameMode == 4) {
            System.out.println("Да! (нажмите 1), Нет!(Нажмите 2)");
            int choiceOfExit;
            choiceOfExit = sc.nextInt();
            if (choiceOfExit == 1) {
                System.out.println("Выходим!");
                return 0;
            }
            if (choiceOfExit == 2) {
                System.out.println("Спасибо, что вы с нами!");
            }
        }
        return gameMode;
    }
}
