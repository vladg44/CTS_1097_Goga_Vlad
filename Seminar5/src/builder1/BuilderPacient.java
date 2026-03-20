package builder1;

public class BuilderPacient implements IBuilderPacient {

    Pacient pacient;

    public BuilderPacient() {
        this.pacient = new Pacient();
    }

    @Override
    public Pacient buildPacient() {
        return this.pacient;
    }

    @Override
    public IBuilderPacient setArePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setAreRabatabil(arePatRabatabil); // ✅
        return this;
    }

    @Override
    public IBuilderPacient setAreMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun); // ✅
        return this;
    }

    @Override
    public IBuilderPacient setAreHalat(boolean areHalat) {
        this.pacient.setAreHalat(areHalat); // ✅
        return this;
    }

    @Override
    public IBuilderPacient setarePapuci(boolean arePapuci) {
        this.pacient.setArePapuci(arePapuci); // ✅
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.pacient.setNume(nume); // ✅ asta era deja corectă
        return this;
    }
}