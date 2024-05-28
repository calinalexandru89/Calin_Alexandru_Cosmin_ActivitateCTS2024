package _E_Sportiv_Problema08_Proxy;

class Client {
    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
