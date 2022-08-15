package com.company.hometask.sixth;

import com.company.hometask.sixth.objects.City;
import com.company.hometask.sixth.objects.Home;
import com.company.hometask.sixth.objects.Street;

public class Main {
    public static void main(String[] args) {

        //Создаю экземпляры своего списка
        ObjectList objectList = new ObjectList();
        objectList.add(1);
        objectList.add(2);
        objectList.add(2);

        //Проверка методов листа
        objectList.getObjectList();
        System.out.println(objectList.get(2));

        //Создаю объекты класса
        Home home1 = new Home(1,2);
        Street street1 = new Street(1,34);
        City city1 = new City(434);

        home1.setArray(street1);
        city1.setArray(street1);
        street1.setArray(home1);

    }
}
