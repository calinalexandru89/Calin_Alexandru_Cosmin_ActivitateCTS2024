package _E_Sportiv_Problema09_Composite;

public class Main {
    public static void main(String[] args) {
        Sectiune tribuna = new Sectiune("Tribuna");
        Sectiune peluza = new Sectiune("Peluza");

        Sectiune tribunaNord = new Sectiune("Tribuna Nord");
        Sectiune tribunaSud = new Sectiune("Tribuna Sud");

        Loc loc1 = new Loc("Loc 1");
        Loc loc2 = new Loc("Loc 2");
        Loc loc3 = new Loc("Loc 3");

        tribunaNord.adaugaComponenta(loc1);
        tribunaNord.adaugaComponenta(loc2);
        tribunaSud.adaugaComponenta(loc3);

        tribuna.adaugaComponenta(tribunaNord);
        tribuna.adaugaComponenta(tribunaSud);

        peluza.adaugaComponenta(new Loc("Loc 4"));

        Sectiune stadion = new Sectiune("Stadion");
        stadion.adaugaComponenta(tribuna);
        stadion.adaugaComponenta(peluza);

        stadion.print();
    }
}
