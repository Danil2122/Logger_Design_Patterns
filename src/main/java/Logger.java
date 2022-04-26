import java.util.Date;

public class Logger {
    protected int num = 1;
    Date date = new Date();

    public void log(String msg) {
        System.out.println("[" + date + " " + num++ + "] " + msg);
    }

    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям
    private static final Logger logger = new Logger();

    // Запрещаем пользователям пользоваться
    // конструктором нашего класса
    private Logger() {
    }

    // Пользователи которым нужен объект
    // нашего класса получают всегда один
    // и тот же объект, который мы храним
    // в приватном статичном поле, которое
    // мы заполняем в этом методе если оно
    // до того не было заполнено
    // if (logger == null) logger = new Logger();
    public static Logger getInstance() {
        return logger;
    }
}
