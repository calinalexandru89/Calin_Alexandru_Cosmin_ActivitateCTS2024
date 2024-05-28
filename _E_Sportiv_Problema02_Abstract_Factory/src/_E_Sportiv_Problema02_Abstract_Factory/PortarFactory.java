package _E_Sportiv_Problema02_Abstract_Factory;

class PortarFactory implements JucatorFactory {
    @Override
    public Jucator creazaJucator() {
        return new Portar();
    }
}
