package _E_Sportiv_Problema010_Flyweight;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = PersoanaFactory.getPersoana("180cm", "75kg", "albastru");
        Persoana persoana2 = PersoanaFactory.getPersoana("170cm", "65kg", "verde");
        Persoana persoana3 = PersoanaFactory.getPersoana("180cm", "75kg", "albastru");

        persoana1.deseneaza(10, 20);
        persoana2.deseneaza(30, 40);
        persoana3.deseneaza(50, 60);

        System.out.println("Numar total de obiecte Persoana create: " + PersoanaFactory.persoaneMap.size());
    }
}
