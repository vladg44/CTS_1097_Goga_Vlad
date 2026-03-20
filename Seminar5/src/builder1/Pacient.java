package builder1;

public class Pacient {
    private boolean areRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String nume;

    public Pacient() {
        this.areHalat=false;
        this.areMicDejun=false;
        this.arePapuci=false;
        this.areRabatabil=false;
        this.nume="anon";
    }

    public void setAreRabatabil(boolean areRabatabil) {
        this.areRabatabil = areRabatabil;
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    public void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public void setNume(String nume) {
        this.nume = nume;
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
}
