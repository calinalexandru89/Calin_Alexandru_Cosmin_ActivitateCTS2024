package _E_Sportiv_Problema010_Flyweight;

class Persoana {
    private String inaltime;
    private String latime;
    private String culoareTricou;

    public Persoana(String inaltime, String latime, String culoareTricou) {
        this.inaltime = inaltime;
        this.latime = latime;
        this.culoareTricou = culoareTricou;
    }

    public void deseneaza(int x, int y) {
        System.out.println("Desenam persoana la pozitia (" + x + ", " + y + ") cu dimensiunile " +
                "inaltime: " + inaltime + ", latime: " + latime + ", culoare tricou: " + culoareTricou);
    }
}
