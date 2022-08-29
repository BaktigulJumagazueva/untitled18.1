package com.company;

public class Gostinisa implements UiBuloolor{
    private Person[] uiBuloo;

    public Gostinisa(Person[] uiBuloo) {
        this.uiBuloo = uiBuloo;
    }

    public void getUiBuloo() {
        System.out.println(" Gostinisada jachagandar");
        for (Person i : uiBuloo) {
            System.out.println(i.getName());
        }
    }

    @Override
    public void tolom(){
        System.out.println("arenda toloshot");
    }
}
