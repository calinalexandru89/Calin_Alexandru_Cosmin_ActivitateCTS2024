package _E_Sportiv_Problema07_Decorator;

abstract class BiletDecorator implements Bilet {
    protected Bilet bilet;

    public BiletDecorator(Bilet bilet) {
        this.bilet = bilet;
    }

    public void printeaza() {
        bilet.printeaza();
    }
}