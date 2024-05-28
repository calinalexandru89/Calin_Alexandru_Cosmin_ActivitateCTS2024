package _E_Sportiv_Problema01_Factory;

public class Main {
    public static void main(String[] args) {
        Jucator portar = JucatorFactory.creazaJucator(TipJucator.PORTAR);
        Jucator fundas = JucatorFactory.creazaJucator(TipJucator.FUNDAS);
        Jucator atacant = JucatorFactory.creazaJucator(TipJucator.ATACANT);

        portar.joaca();
        fundas.joaca();
        atacant.joaca();
    }
}