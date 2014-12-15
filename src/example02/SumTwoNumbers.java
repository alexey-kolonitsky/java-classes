package example02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTwoNumbers
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(inStream);

        System.out.print("Введите первое число: ");
        String str = input.readLine();
        int a = Integer.parseInt(str);

        System.out.print("Введите второе число : ");
        str = input.readLine();
        int b = Integer.parseInt(str);

        int s = a + b;

        System.out.println("Сумма равна " + s);

        System.exit(0);
    }
}
