package v1.steps;

import v1.domain.Bolo;
import v1.domain.Laranja;
import v1.pipeline.Stage;

public class LaranjaParaBoloStage implements Stage<Laranja, Bolo> {
    @Override
    public Bolo process(Laranja input) {
        System.out.println("LaranjaParaBoloStage: "+input);
        return new Bolo(input);
    }
}
