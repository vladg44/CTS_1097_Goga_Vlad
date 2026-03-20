package builder2;

public class BuilderPacient implements IBuilderPacient {

    // câmpurile sunt pe Builder, nu pe Pacient
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean areHalat;
    private boolean arePapuci;
    private String nume;

    @Override
    public Pacient buildPacient() {

        return new Pacient(arePatRabatabil, areMicDejun, areHalat, arePapuci, nume);
    }

    @Override
    public IBuilderPacient setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public IBuilderPacient setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    @Override
    public IBuilderPacient setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public IBuilderPacient setarePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.nume = nume;
        return this;
    }
}