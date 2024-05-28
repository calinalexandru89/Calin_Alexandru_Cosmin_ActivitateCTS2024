package _E_Sportiv_Problema09_Composite;

class Loc implements Componenta {
    private String nume;

    public Loc(String nume) {
        this.nume = nume;
    }

    @Override
    public void print() {
        System.out.println("Loc: " + nume);
    }
}
