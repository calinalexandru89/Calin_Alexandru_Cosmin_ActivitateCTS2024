package _E_Sportiv_Problema06_Facade;

class VerificareFacade {
    private VerificareBilet verificareBilet;
    private VerificarePolitie verificarePolitie;
    private VerificareAntecedente verificareAntecedente;

    public VerificareFacade() {
        verificareBilet = new VerificareBilet();
        verificarePolitie = new VerificarePolitie();
        verificareAntecedente = new VerificareAntecedente();
    }

    public boolean verificaPersoana(String nume, String codBilet, String cnp) {
        return verificareBilet.verificaBilet(nume, codBilet) &&
                !verificarePolitie.esteCautat(cnp) &&
                !verificareAntecedente.areAntecedente(cnp);
    }
}