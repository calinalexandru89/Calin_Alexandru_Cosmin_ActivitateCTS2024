package _E_Sportiv_Problema05_Adapter;

class BiletAdapter implements eBilet {
    private Bilet bilet;

    public BiletAdapter(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet() {
        bilet.rezerva();
    }
}
