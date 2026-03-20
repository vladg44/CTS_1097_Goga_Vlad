package prototype;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament implements RetetaCloneable {
    private String nume;
    private Map<String,Double> solutii;

    public RetetaMedicament(String nume, Map<String, Double> solutii) {
        this.nume = nume;
        this.solutii =new HashMap<>(solutii);
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                '}';
    }

    public RetetaMedicament(RetetaMedicament retetaMedicament){
        this.nume=retetaMedicament.nume;
        this.solutii=new HashMap<>(retetaMedicament.solutii);
    }

    @Override
    public RetetaCloneable cloneaza() {
        return new RetetaMedicament(this);
    }

    public String getNume() {
        return nume;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }
}
