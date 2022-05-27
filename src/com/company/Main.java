package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {


    public static void main(String[] args) {
 /** Создайте класс Car, который можно использовать в Try with Resources.
 Метод close() должен отображать на консоли сообщение «Машина закрывается».
 попытайтесь поймать непроверенные исключения и игнорировать их.
 В основном методе вызовите метод drive() внутри блока try, который должен вывести на консоль «Машина работает».
 Примечание: попробуйте с помощью ресурсов решить проблему. */

        try (Car car = new Car("Авенсер","Бугати","Красный",4.9,
                LocalDate.of(2014, Month.AUGUST,11))) {
            System.out.println(car);
            car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}