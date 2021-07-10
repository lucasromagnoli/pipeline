package v2;

public class Pipeline {
    private Stage stageAtual;

    private Pipeline(Stage stage) {
        this.stageAtual = stage;
    }

    public Pipeline addStage(Stage novoStage) {
        return new Pipeline(valorAntigo -> {
            System.out.println("lambda");
            return novoStage.executar(stageAtual.executar(valorAntigo));
        }
        );
    }

    public String iniciar(String valorInicial) {
        return this.stageAtual.executar(valorInicial);
    }

    public static void main(String[] args) {
        var x = new Pipeline(new StageImpl())
                .addStage(new StageImpl())
                .addStage(new StageImpl())
                .addStage(new StageImpl());

        System.out.println(x.iniciar("B"));
    }
}
