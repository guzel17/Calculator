import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();
        System.out.println(calc(console));
    }
    public static String calc(String inputString) throws Exception {
        String[] array = inputString.split(" ");
        String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        if (array.length != 3) throw new Exception("Неправильный ввод");
        String result;
        boolean isRome1 = false;
        boolean isRome2 = false;

        for (int i = 0; i < rome.length; i++) {
            if (array[0].equals(rome[i])) {
                isRome1 = true;
            }
        }
        for (int i = 0; i < rome.length ; i++) {
            if (array[2].equals(rome[i])) {
            isRome2 = true;
           }
        }
        if (isRome1 && isRome2) {
            result = RomeCalc.count(array[0], array[2], (array[1]).charAt(0));
        }
        else if ((isRome1 && !isRome2) || (!isRome1 && isRome2) ) throw  new Exception("Введены числа из разных систем счисления");
        else {
            int arabic1 = parseInt(array[0]);
            int arabic2 = parseInt(array[2]);
            char action = (array[1]).charAt(0);
            result = ArabicCalc.count(arabic1, arabic2, action);
        }
        return result;
    }
}

