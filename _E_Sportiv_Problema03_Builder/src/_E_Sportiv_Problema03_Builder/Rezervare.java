package _E_Sportiv_Problema03_Builder;

class Rezervare {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    private Rezervare(Builder builder) {
        this.mancareInclusa = builder.mancareInclusa;
        this.scaunErgonomic = builder.scaunErgonomic;
        this.bauturaRacoritoareInclusa = builder.bauturaRacoritoareInclusa;
        this.muzicaAmbientalaPersonalizata = builder.muzicaAmbientalaPersonalizata;
        this.genMuzica = builder.genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoareInclusa=" + bauturaRacoritoareInclusa +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }

    // Builder pentru clasa Rezervare
    public static class Builder {
        private boolean mancareInclusa = false;
        private boolean scaunErgonomic = false;
        private boolean bauturaRacoritoareInclusa = false;
        private boolean muzicaAmbientalaPersonalizata = false;
        private String genMuzica = "none";

        public Builder mancareInclusa(boolean mancareInclusa) {
            this.mancareInclusa = mancareInclusa;
            return this;
        }

        public Builder scaunErgonomic(boolean scaunErgonomic) {
            this.scaunErgonomic = scaunErgonomic;
            return this;
        }

        public Builder bauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
            this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
            return this;
        }

        public Builder muzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        public Builder genMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}