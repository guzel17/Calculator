public class RomeCalc {
    public static String count (String a, String b, char act) throws Exception {
        String[] arrayRome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < arrayRome.length; i++) {
            if (a.equals(arrayRome[i])) {
                number1=i+1;
            }}
        for (int i = 0; i < arrayRome.length; i++) {
            if (b.equals(arrayRome[i])) {
                number2=i+1;
            }
        }
        int result = switch (act) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number1 / number2;
            default -> throw new Exception("Неправильный символ операции");
        };
        if (result<=0) throw new Exception("Результат не должен быть меньше или равен 0");

        return Converter.convert(result);
    }
}
