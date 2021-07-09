package steps;

import domain.Bolo;
import domain.Laranja;
import pipeline.Stage;

public class LaranjaParaBoloStage implements Stage<Laranja, Bolo> {
    @Override
    public Bolo process(Laranja input) {
        System.out.println("LaranjaParaBoloStage: "+input);
        return new Bolo(input);
    }
}
