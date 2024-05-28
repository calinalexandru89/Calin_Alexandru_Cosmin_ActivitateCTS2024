package _E_Sportiv_Problema08_Proxy;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ion Popescu", 16);
        Client client2 = new Client("Maria Ionescu", 12);

        VanzareBilet proxy = new VanzareBiletProxy();

        proxy.vindeBilet(client1);
        proxy.vindeBilet(client2);
    }
}
