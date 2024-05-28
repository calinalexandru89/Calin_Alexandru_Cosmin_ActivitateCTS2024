package _E_Sportiv_Problema03_Builder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare.Builder()
                .mancareInclusa(true)
                .scaunErgonomic(true)
                .build();

        Rezervare rezervare2 = new Rezervare.Builder()
                .bauturaRacoritoareInclusa(true)
                .muzicaAmbientalaPersonalizata(true)
                .genMuzica("Jazz")
                .build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
