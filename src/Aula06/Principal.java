package Aula06;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Impressora impressora1 = new Impressora("Epson", "wifi", LocalDate.of(2020,8,20));
        System.out.println(impressora1.getDataFabricacao());

    }
}