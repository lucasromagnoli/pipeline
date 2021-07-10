package v1;

import v1.domain.Laranja;
import v1.pipeline.Pipeline;
import v1.steps.BoloParaCoberturaStage;
import v1.steps.CoberturaParaLixoStage;
import v1.steps.LaranjaParaBoloStage;

public class Orquestrator {
    public static void main(String[] args) {
        var pipeline = new Pipeline<>(new LaranjaParaBoloStage())
                .addStage(new BoloParaCoberturaStage())
                .addStage(new CoberturaParaLixoStage());
        System.out.println(pipeline.execute(new Laranja()));
    }
}
