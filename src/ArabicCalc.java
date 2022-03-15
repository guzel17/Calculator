public class ArabicCalc {
    public static String count (int a, int b, char act) throws Exception {
        if(a<0 || a>=10) throw new Exception("Числа не должны быть меньше 1 или больше 10");
        if (b<0 || b>=10) throw new Exception("Числа не должны быть меньше 1 или больше 10");
        int result = switch (act) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new Exception("Неправильный символ операции");
        };
        return String.valueOf(result);
    }
}
