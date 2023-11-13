import Model.B;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // int x1 = 5, x2 = 0;
        ///  int res = x1 / x2;

        /// выбрасу исключительной ситуации   ArithmeticException: /  деление на 0
        ///// int[] arr1 = new int[-5];  ///// исключительная ошибка .NegativeArraySizeException: -5


        ///  Object[] arr2 = new String[10];
        ///  arr2[0] = new Character('+');  /////.ArrayStoreException я попытался запихнуть элемент
        //// массива не правильного контента
        /////// ======== это было неворное содержание массива


        ////   int[] arr3 = new int[5];
        //// arr3[5] = 100;  ////исключительная ошибка ситуациия thow new  ---- выход за пределы масива


        ///// String str1 = "Igor";
        /////System.out.println(str1.charAt(8));  /////charAt обратится к символу по индексу
        /////.StringIndexOutOfBoundsException  -выход за пределы строки


        /////String str2 = null;
        ////str2.toUpperCase();  //// приводит строку к верхнему регистру  ---исключительная ошибка
        ////// .NullPointerException   попытка вызвать метод или обратится к объету по ссыклке , каторая
        ////не указывает на объект
  ////  B b1 = (B) new A();  донкаст без проверки и вызывает исключительную ситуацию


        /////Scanner scanner1 = new Scanner(System.in);
       ////// System.out.println("ВВЕДИТЕ ЧИСЛО");
       /////// int y1 = scanner1.nextInt(); //// исключительная ситуация ввод строки вместо ожидаемого int

   ////// Scanner scanner2 = new Scanner(System.in);
      /////  System.out.println("введите число");
      /////  String str3 = scanner2.nextLine();

        ////ошибка бреоброзования str3
      /////  int y2 = Integer.parseInt(str3);



    }
}
