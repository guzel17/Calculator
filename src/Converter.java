public class Converter {
    public static String convert (int arab){
        String[] arrayRome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        StringBuilder rome = new StringBuilder("");
        if (arab == 100) {
            rome.append("C");}
        else
        if (arab==50) {rome.append("L");
        } else if (arab>=90) {
            rome.append("XC");
            int x2 = arab % 10;
            if (x2>0) {
                rome.append(arrayRome[x2 - 1]);}}
        else if (arab>=40 && arab<50) {
            rome.append("XL");
            int x2 = arab % 10;
            if (x2>0) {
                rome.append(arrayRome[x2 - 1]);}}
        else  if (arab>50){     //числа от 51 до 89
            rome.append("L");
            int l = arab % 50; //остаток
            int x = l / 10; //выделяем десятки
            {rome.append(("X").repeat(x));}
            int x2 = l % 10;
            rome.append(arrayRome[x2 - 1]);
        }
        else  {              // числа от 11 до 39
            int x = arab / 10;
            rome.append(("X").repeat(x));
            int x2 = arab % 10;
            rome.append(arrayRome[x2 - 1]);}

        return rome.toString();
    }
}
