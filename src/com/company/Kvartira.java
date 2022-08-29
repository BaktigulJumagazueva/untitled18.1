package com.company;

public class Kvartira implements UiBuloolor{
    private Person[] uiBuloo;

    public Kvartira(Person[] uiBuloo) {
        this.uiBuloo = uiBuloo;
    }

    public void getUiBuloo() {
        System.out.println(" Kvartirada jachagandar");
        for (Person i : uiBuloo) {
            System.out.println(i.getName());
        }
    }
    @Override
    public void tolom(){
        System.out.println(" kom usluga toloshot ");
    }
}
