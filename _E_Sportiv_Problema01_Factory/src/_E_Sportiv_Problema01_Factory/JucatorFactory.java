package _E_Sportiv_Problema01_Factory;

class JucatorFactory {
    public static Jucator creazaJucator(TipJucator tip) {
        switch (tip) {
            case PORTAR:
                return new Portar();
            case FUNDAS:
                return new Fundas();
            case ATACANT:
                return new Atacant();
            default:
                throw new IllegalArgumentException("Tip de jucător necunoscut.");
        }
    }
}
