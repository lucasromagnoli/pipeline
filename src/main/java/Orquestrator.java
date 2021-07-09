import domain.Laranja;
import pipeline.Pipeline;
import steps.BoloParaCoberturaStage;
import steps.CoberturaParaLixoStage;
import steps.LaranjaParaBoloStage;

public class Orquestrator {
    public static void main(String[] args) {
        var pipeline = new Pipeline<>(new LaranjaParaBoloStage())
                .addStage(new BoloParaCoberturaStage())
                .addStage(new CoberturaParaLixoStage());
        System.out.println(pipeline.execute(new Laranja()));
    }
}
