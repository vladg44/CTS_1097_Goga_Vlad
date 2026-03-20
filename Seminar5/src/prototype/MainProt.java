import prototype.RetetaMedicament;

void main(){
    RetetaMedicament retetaMedicament=new RetetaMedicament("ajutor",Map.of("nurofen",1500.0,"Creatina",150.0));
    RetetaMedicament copie=(RetetaMedicament)retetaMedicament.cloneaza();

    System.out.println(retetaMedicament==copie);
    System.out.println(retetaMedicament);
    System.out.println(copie);

    
}
