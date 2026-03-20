package builder2;

public interface IBuilderPacient {
    Pacient buildPacient();
    IBuilderPacient setArePatRabatabil(boolean arePatRabatabil);
    IBuilderPacient setAreMicDejun(boolean areMicDejun);
    IBuilderPacient setAreHalat(boolean areHalat);
    IBuilderPacient setarePapuci(boolean arePapuci);
    IBuilderPacient setNume(String nume);

}
