package com.company.hometask.sixth;

import com.company.hometask.sixth.objects.City;
import com.company.hometask.sixth.objects.Home;
import com.company.hometask.sixth.objects.Street;

public class Main {
    public static void main(String[] args) {

        Parent[] parents = new Parent[4];
        City city = new City();
        Home home = new Home();
        Street street = new Street();

        parents[0] = city;
        parents[1] = home;
        parents[2] = street;

        for (Parent parent : parents) {
            System.out.println(parent);
        }

    }
}
