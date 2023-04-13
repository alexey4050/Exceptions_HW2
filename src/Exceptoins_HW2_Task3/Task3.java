package Exceptoins_HW2_Task3;

import java.util.Scanner;

/*
* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
*  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
public class Task3 {
    public static void main(String[] args){
        System.out.println("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        if(!data.isEmpty()){
            System.out.println("Вы ввели: " + data);
        }else {
            throw  new RuntimeException("Пустые строки вводить нельзя!");
        }

    }
}
