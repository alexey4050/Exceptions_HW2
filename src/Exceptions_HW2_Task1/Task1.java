package Exceptions_HW2_Task1;

import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean user = true;

        while (user == true){
            System.out.println("Введите дробное число: ");
            String num = sc.nextLine();
            try{
                float floatNum = Float.parseFloat(num);
                user = false;
                System.out.println("Ваше число: " + floatNum);
            }catch (NumberFormatException e){
                System.out.println("Введите число не дробное! \n Повторите ввод!");
            }
        }

    }
}