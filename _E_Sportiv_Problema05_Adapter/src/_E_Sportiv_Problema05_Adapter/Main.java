package _E_Sportiv_Problema05_Adapter;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet();
        eBilet ebilet = new BiletAdapter(bilet);

        ebilet.rezervaBilet();
    }
}