package _E_Sportiv_Problema07_Decorator;

public class Main {
    public static void main(String[] args) {
        Bilet biletSimplu = new BiletSimplu();
        Bilet biletCuMesaj = new BiletMesajSustinere(biletSimplu);

        System.out.println("Bilet simplu:");
        biletSimplu.printeaza();

        System.out.println("\nBilet cu mesaj de susținere:");
        biletCuMesaj.printeaza();
    }
}
