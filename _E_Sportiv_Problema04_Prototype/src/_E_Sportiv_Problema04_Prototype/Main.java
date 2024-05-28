package _E_Sportiv_Problema04_Prototype;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ion Popescu", "ion.popescu@example.com");
        Client client2 = client1.clone();

        client2.setNume("Maria Ionescu");

        System.out.println(client1);
        System.out.println(client2);
    }
}