package com.company.hometask.fifth;

import com.company.hometask.fifth.objects.City;
import com.company.hometask.fifth.objects.Home;
import com.company.hometask.fifth.objects.Park;
import com.company.hometask.fifth.objects.Street;

public class Main {
    public static void main(String[] args) {
        Home home1 = new Home(2, 3);
        Home home2 = new Home(8, 8);
        Home home3 = new Home(8, 8);

        Street street1 = new Street(500, 10);
        Street street2 = new Street(500, 10);
        // Street[] streets = {street1, street2};
        City city = new City();

        //Добавляю объекты класса Home в LinkedList
        street1.setHomes(home1);
        street1.setHomes(home2);
        street2.setHomes(home3);

        // Делаю проверку, существуют ли объекты класса Home
        street1.printHomes();

        // Добавляю улицы в объект класса City
        city.setStreets(street1);
        city.setStreets(street2);

        // Вызываю метод для получения количества всех домов
        System.out.println("Count of all homes is :" + city.getHomesCount());

        // Вызываю метод для получения площади улиц с учетом их размеров
        System.out.println("Street square : " + city.getSquaresFromAllStreets());

        // Вызываю метод для получения площади домов с определенной улицы
        System.out.println("Homes square from one street :" + street1.getHomesSquaresFromOneStreet());

        //Создаю объекты класса Park
        Park park1 = new Park("Park1",23,32);
        Park park2 = new Park("Park2",23,32);

        //Метод для получения имени парка
        park1.getName();

        //Метод для получения площади одного парка
        System.out.println("Square of one park : " + park1.getSquareOfOnePark());

    }
}
