import java.util.*;

public class Filter {
    protected int treshold;//число для фильтрации

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {//лист рандомных чисел
        int count = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию: ");
        for (int i : source) {
            if (i < treshold) {
                logger.log("Элемент " + '"' + i + '"' + " не проходит");
            } else {
                logger.log("Элемент " + '"' + i + '"' + " проходит");
                result.add(i);
                count++;
            }
        }
        logger.log("Прошло фильтрацию: " + count + " из " + source.size());
        return result;
    }
}
