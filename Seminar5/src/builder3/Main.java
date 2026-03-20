// builder2.BuilderPacient;
//import builder2.IBuilderPacient;
import builder3.Pacient;

void main() {

    Pacient pacient = new Pacient.builderPacient()
            .setNume("Matei")
            .setAreHalat(true)
            .buildPacient();
    System.out.println(pacient);

    Pacient pacient1 = new Pacient.builderPacient()
            .setNume("David")
            .setArePapuci(true)
            .setAreHalat(true)
            .setAreMicDejun(true)
            .setArePatRabatabil(true)
            .buildPacient();
    System.out.println(pacient1);

    //IBuilderPacient builderPacient=new BuilderPacient();
   // Pacient pacient= builderPacient.setNume("Matei").setAreHalat(true).buildPacient();
    //System.out.println(pacient);
   // Pacient pacient1=builderPacient.setNume("David").setarePapuci(true).setAreHalat(true).setAreMicDejun(true).setArePatRabatabil(true).buildPacient();
   // System.out.println(pacient1);

}