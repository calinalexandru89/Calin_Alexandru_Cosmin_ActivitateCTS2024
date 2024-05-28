package _E_Sportiv_Problema06_Facade;

public class Main {
    public static void main(String[] args) {
        VerificareFacade verificareFacade = new VerificareFacade();

        boolean esteValid = verificareFacade.verificaPersoana("Ion Popescu", "B123", "1234567890123");

        if (esteValid) {
            System.out.println("Persoana este validă pentru acces.");
        } else {
            System.out.println("Persoana nu este validă pentru acces.");
        }
    }
}
