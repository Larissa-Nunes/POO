package AulaIntegradora06;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        DogAdocao cachorro = new DogAdocao("Catioro", "Caramelo", 3.0, LocalDate.of(2021, 8, 20));
        DogAdocao cachorro1 = new DogAdocao(false, true);
        System.out.println(cachorro.aptoAdocao());
        System.out.println(cachorro.temChip());
    }
}