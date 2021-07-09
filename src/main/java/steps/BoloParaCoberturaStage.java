package steps;

import domain.Bolo;
import domain.Cobertura;
import pipeline.Stage;

public class BoloParaCoberturaStage implements Stage<Bolo, Cobertura> {
    @Override
    public Cobertura process(Bolo input) {
        System.out.println("BoloParaCoberturaStage: "+input);
        return new Cobertura(input);
    }
}
