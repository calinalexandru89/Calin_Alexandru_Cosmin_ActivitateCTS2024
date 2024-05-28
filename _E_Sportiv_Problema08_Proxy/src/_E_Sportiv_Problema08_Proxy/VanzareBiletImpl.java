package _E_Sportiv_Problema08_Proxy;

class VanzareBiletImpl implements VanzareBilet {
    @Override
    public void vindeBilet(Client client) {
        System.out.println("Bilet vândut clientului " + client.getNume());
    }
}
