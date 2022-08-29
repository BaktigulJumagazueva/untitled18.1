package com.company;

public class Obchejitie implements UiBuloolor {
    private Person[] uiBuloo;

    public Obchejitie(Person[] uiBuloo) {
        this.uiBuloo = uiBuloo;
    }

    public void getUiBuloo() {
        System.out.println(" Obchejitiede jachagandar");
        for (Person i : uiBuloo) {
            System.out.println(i.getName());
        }
    }

    @Override
    public void tolom(){
        System.out.println("arenda toloshot");
    }

}
