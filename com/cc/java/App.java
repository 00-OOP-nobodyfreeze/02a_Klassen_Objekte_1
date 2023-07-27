package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();

        // Wertzuweisung
        cat1.firstName = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;

        // Ausgabe
        output(cat1.firstName);
        output(cat1.furColor);

        // Typkonvertierung
        output(Integer.toString(cat1.age));
     
        output("----------------");

        Cat cat2 = new Cat();

        cat2.firstName = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 31;

        output(cat2.firstName);
        output(cat2.furColor);

        output(String.valueOf(cat2.age));

    }

        public static void output(String outputData) {
            System.out.println(outputData);
        }
     


}

