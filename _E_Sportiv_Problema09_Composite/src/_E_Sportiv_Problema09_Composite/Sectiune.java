package _E_Sportiv_Problema09_Composite;

import java.util.ArrayList;
import java.util.List;

class Sectiune implements Componenta {
    private String nume;
    private List<Componenta> componente = new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;
    }

    public void adaugaComponenta(Componenta componenta) {
        componente.add(componenta);
    }

    public void stergeComponenta(Componenta componenta) {
        componente.remove(componenta);
    }

    @Override
    public void print() {
        System.out.println("Secțiune: " + nume);
        for (Componenta componenta : componente) {
            componenta.print();
        }
    }
}
