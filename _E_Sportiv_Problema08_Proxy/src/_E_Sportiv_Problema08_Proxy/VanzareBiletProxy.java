package _E_Sportiv_Problema08_Proxy;

class VanzareBiletProxy implements VanzareBilet {
    private VanzareBiletImpl vanzareBilet;

    public VanzareBiletProxy() {
        vanzareBilet = new VanzareBiletImpl();
    }

    @Override
    public void vindeBilet(Client client) {
        if (client.getVarsta() >= 14) {
            vanzareBilet.vindeBilet(client);
        } else {
            System.out.println("Clientul " + client.getNume() + " nu are vârsta minimă necesară.");
        }
    }
}
