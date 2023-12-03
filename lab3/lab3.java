package lab3;

public class lab3 {
    public static void main(String[] args) {

        // Логические операции && || !
        boolean a = true;
        boolean b = false;

        // && - конъюнкция, логическое умножение
        System.out.printf("Для a = %s и и b = %s: a && b = %s", a, b, a && b);

        // || - дизъюнкция, логическое сложение
        System.out.printf("\nДля a = %s и и b = %s: a || b = %s", a, b, a || b);

        // ! - инверсия, отрицание
        System.out.printf("\nДля a = %s: !a = %s \n", a, !a);

        // Тернарная операция x < y ? x : y
        int x = 4;
        int y = 6;
        int result = (x < y) ? x : y;

        System.out.println("Результат: " + result);

        // Поразрядные логические операции & | ^ ~

        int num1 = 12; // 1100 в двоичной системе
        int num2 = 10; // 1010 в двоичной системе

        // & - поразрядное И
        int c = num1 & num2; // 1000 в двоичной системе
        System.out.printf("\nПри num1 = %d и num2 = %d: num1 & num2 = %d", num1, num2, c);

        // | - поразрядное ИЛИ
        int d = num1 | num2; // 1110 в двоичной системе
        System.out.printf("\nПри num1 = %d и num2 = %d: num1 | num2 = %d", num1, num2, d);

        // ^ - Поразрядное исключающее ИЛИ
        int e = num1 ^ num2; // 0110 в двоичной системе
        System.out.printf("\nПри num1 = %d и num2 = %d: num1 ^ num2 = %d", num1, num2, e);

        // ~ - Поразрядное отрицание
        int f = ~num1; // 11111111111111111111111111110011 в двоичной системе
        System.out.printf("\nПри num1 = %d: ~num1 = %d\n", num1, f);
        int num3 = 8; // 00000000000000000000000000001000 в двоичной системе
        // >> - сдвиг вправо
        int numr = num3 >> 1; // 00000000000000000000000000000100 в двоичной системе
        System.out.printf("\nПри num3 = %d: num1 >> 1 = %d", num3, numr);

        // << - сдвиг влево
        int numl = num3 << 1; // 00000000000000000000000000010000 в двоичной системе
        System.out.printf("\nПри num3 = %d: num1 << 1 = %d", num3, numr);

        // >>> - сдвиг вправо с заполнением нулями
        int numrr = num3 >>> 1; // 00000000000000000000000000000100 в двоичной системе
        System.out.printf("\nПри num3 = %d: num1 >>> 1 = %d", num3, numrr);

    }
}
