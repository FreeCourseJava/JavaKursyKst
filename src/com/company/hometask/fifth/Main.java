package com.company.hometask.fifth;

import com.company.hometask.fifth.objects.City;
import com.company.hometask.fifth.objects.Home;
import com.company.hometask.fifth.objects.Street;

public class Main {
    public static void main(String[] args) {
        Home home1 = new Home(1, 2, 3);
        Home home2 = new Home(2, 8, 8);
        Home home3 = new Home(2, 8, 8);

        // Park park1 = new Park("Победы", 10, 10);
        Street street1 = new Street("Tarana", true, 500, 10);
        Street street2 = new Street("Abaya", true, 500, 10);
        // Street[] streets = {street1, street2};
        City city = new City(5000, 5000);
        street1.setHomes(home1);
        street1.setHomes(home2);
        street1.printHomes();

        street2.setHomes(home3);

        city.setStreets(street1);
        city.setStreets(street2);
        System.out.println(city.getHomesCount());
    }
}
