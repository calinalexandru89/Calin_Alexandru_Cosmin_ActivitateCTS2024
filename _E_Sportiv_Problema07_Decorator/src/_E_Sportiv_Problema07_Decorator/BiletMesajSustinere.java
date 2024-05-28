package _E_Sportiv_Problema07_Decorator;

class BiletMesajSustinere extends BiletDecorator {
    public BiletMesajSustinere(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
        printeazaMesajSustinere();
    }

    private void printeazaMesajSustinere() {
        System.out.println("Mesaj: Susține echipa gazdă!");
    }
}
