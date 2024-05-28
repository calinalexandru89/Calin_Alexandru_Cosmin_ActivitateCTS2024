package _E_Sportiv_Problema02_Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        JucatorFactory portarFactory = new PortarFactory();
        JucatorFactory fundasFactory = new FundasFactory();
        JucatorFactory atacantFactory = new AtacantFactory();

        Jucator portar = portarFactory.creazaJucator();
        Jucator fundas = fundasFactory.creazaJucator();
        Jucator atacant = atacantFactory.creazaJucator();

        portar.joaca();
        fundas.joaca();
        atacant.joaca();
    }
}