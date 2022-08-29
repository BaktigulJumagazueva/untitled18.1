package com.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adina", "Lomonosov 12");
        Person person1 = new Person("Kani", "Kirova 256");
        Person person2 = new Person("Adel", "Lomonosov 76");
        Person person3 = new Person("Macha", "Lermantova 99");
        Person person4 = new Person("Aibek", "Lomonosov 12");
        Person person5 = new Person("Aktan", "Kirova 65");
        Person person6 = new Person("Samat", "Aitmatova 87");
        Person person7 = new Person("Suimuk", "Aitiev 45");
        Person person8 = new Person("Samara", "Lomonosov 12");
        Person person9 = new Person("Damir", "Aitiev 98");
        Person person10 = new Person("Murat", "Lomonosov 12");
        Person person11 = new Person("Meri", "Guseva 112");

        Person[] uiBuloo1 = {person, person1, person2, person3};
        Person[] uiBuloo2 = {person4, person5, person6, person7, person11};
        Person[] uiBuloo3 = {person8, person9, person10};
Obchejitie obchejitie= new Obchejitie(uiBuloo1);
Kvartira kvartira=new Kvartira(uiBuloo2);
Gostinisa gostinisa= new Gostinisa(uiBuloo3);
        System.out.println("____OBSHEJITIE_____");
        obchejitie.tolom();
        obchejitie.getUiBuloo();
        System.out.println("____KVARTIRA_____");
        kvartira.tolom();
        kvartira.getUiBuloo();
        System.out.println("____GOSTINISA_____");
        gostinisa.tolom();
        gostinisa.getUiBuloo();

    }
}