import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int sizeList = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int bound = scanner.nextInt();
        Random run = new Random();

        List<Integer> source = new ArrayList<>(sizeList);
        for (int i = 0; i < sizeList; i++) {
            int j = run.nextInt(bound);
            source.add(j);
        }
        logger.log("Создаём и наполняем список");
        System.out.print("Вот случайный список: ");
        for (int i : source) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int fil = scanner.nextInt();
        Filter filter = new Filter(fil);
        List<Integer> newList = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int i : newList) {
            System.out.print(i + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");
    }

}
