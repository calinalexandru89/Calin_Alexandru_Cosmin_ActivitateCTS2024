package _E_Sportiv_Problema02_Abstract_Factory;

class AtacantFactory implements JucatorFactory {
    @Override
    public Jucator creazaJucator() {
        return new Atacant();
    }
}
