package v1.steps;

import v1.domain.Bolo;
import v1.domain.Cobertura;
import v1.pipeline.Stage;

public class BoloParaCoberturaStage implements Stage<Bolo, Cobertura> {
    @Override
    public Cobertura process(Bolo input) {
        System.out.println("BoloParaCoberturaStage: "+input);
        return new Cobertura(input);
    }
}
