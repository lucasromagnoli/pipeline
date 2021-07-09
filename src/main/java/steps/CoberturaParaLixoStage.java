package steps;

import domain.Cobertura;
import pipeline.Stage;

public class CoberturaParaLixoStage implements Stage<Cobertura, String> {
    @Override
    public String process(Cobertura input) {
        System.out.println("CoberturaParaLixoStage: "+input);
        return input+" foi jogado no lixo.";
    }
}
