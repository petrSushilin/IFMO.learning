package SecondLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static int calculator(int a, int b, String operator) {
        if ("add".equals(operator)) return (a + b);
        else if ("subtract".equals(operator))  return (a - b);
        else if ("multiply".equals(operator))  return (a * b);
        else if ("divide".equals(operator))  return (a / b);
        else throw new IllegalStateException("Operator does not exist");
    }

    public static long calculator(long a, long b, String operator) {
        if ("add".equals(operator)) return (a + b);
        else if ("subtract".equals(operator))  return (a - b);
        else if ("multiply".equals(operator))  return (a * b);
        else if ("divide".equals(operator))  return (a / b);
        else throw new IllegalStateException("Operator does not exist");
    }

    public static double calculator(double a, double b, String operator) {
        if ("add".equals(operator)) return (a + b);
        else if ("subtract".equals(operator))  return (a - b);
        else if ("multiply".equals(operator))  return (a * b);
        else if ("divide".equals(operator))  return (a / b);
        else throw new IllegalStateException("Operator does not exist");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumberInt, secondNumberInt;
        double firstNumberDouble, secondNumberDouble;
        long firstNumberLong, secondNumberLong;

        String bufOperator = bufferedReader.readLine();     // сканируем с клавиатуры вид воздействия на числа
        String operator = bufOperator.toLowerCase();        // переводим текст в нижний регистр

        String bufFirstNumber = bufferedReader.readLine();                           // сканируем с клавиатуры первое число
        String bufSecondNumber = bufferedReader.readLine();                       // сканируем с клавиатуры второе число

        // выделяем из текста число необходимого типа

        if (bufFirstNumber.contains(".") || bufSecondNumber.contains(".")) { // проверяем наличие точки в числах
            firstNumberDouble = Double.parseDouble(bufFirstNumber);
            secondNumberDouble = Double.parseDouble(bufSecondNumber);
            System.out.println(calculator(firstNumberDouble, secondNumberDouble, operator));
        } else {
            firstNumberLong = Long.parseLong(bufFirstNumber);
            secondNumberLong = Long.parseLong(bufSecondNumber);
            if ((firstNumberLong >= Integer.MIN_VALUE && firstNumberLong < Integer.MAX_VALUE) ||               // проверяем выход за пределы типа int
                    (secondNumberLong >= Integer.MIN_VALUE && secondNumberLong < Integer.MAX_VALUE)) { // проверяем выход за пределы типа int
                firstNumberInt = (int) firstNumberLong;
                secondNumberInt = (int) secondNumberLong;
                System.out.println(calculator(firstNumberInt, secondNumberInt, operator));
            } else {
                System.out.println(calculator(firstNumberLong, secondNumberLong, operator));
            }
        }
    }
}
