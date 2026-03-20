package builder3;

public class Pacient {
    private boolean areRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String nume;

    // constructorul primește un Builder, nu parametri separați
    private Pacient(builderPacient builder) {
        this.areRabatabil = builder.arePatRabatabil;
        this.areMicDejun = builder.areMicDejun;
        this.arePapuci = builder.arePapuci;
        this.areHalat = builder.areHalat;
        this.nume = builder.nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "areRabatabil=" + areRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuci=" + arePapuci +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }

    // static inner class - fără () după nume, e clasă nu metodă
    public static class builderPacient {
        private boolean arePatRabatabil;
        private boolean areMicDejun;
        private boolean areHalat;
        private boolean arePapuci;
        private String nume;

        public Pacient buildPacient() {
            return new Pacient(this); // trimite builderul însuși
        }

        public builderPacient setArePatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;
            return this;
        }

        public builderPacient setAreMicDejun(boolean areMicDejun) {
            this.areMicDejun = areMicDejun;
            return this;
        }

        public builderPacient setAreHalat(boolean areHalat) {
            this.areHalat = areHalat;
            return this;
        }

        public builderPacient setArePapuci(boolean arePapuci) {
            this.arePapuci = arePapuci;
            return this;
        }

        public builderPacient setNume(String nume) {
            this.nume = nume;
            return this;
        }
    }
}