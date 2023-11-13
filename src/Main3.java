import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main3 {
    public static void main(String[] args) {


        try {  //// внутри конструкции описываем то что потоционально может привести к выбросу исключению
            FileReader fr1 = new FileReader("1.txt");
            ///  new FiLeNotFoundException()

//// при возникновении первойже исключительной ситуации выполнение блока tru- трайвел и начнется выполнение
            ///блока catch в котором мы можем описать дейсвие исключительной ситуации
            //// по ссылке exp будем иметь доступ к объетоку исключения


        } catch (FileNotFoundException e) {
            System.out.println("нет токого файла");
        }
    }
}
