package v1.pipeline;

public class Pipeline<I, O> {
    private final Stage<I, O> currentStage;

    public Pipeline(Stage<I, O> currentStage) {
        this.currentStage = currentStage;
    }

    public <K> Pipeline<I, K> addStage(Stage<O, K> newStage) {
        System.out.println("addStage");
        return new Pipeline<>(input -> newStage.process(currentStage.process(input)));
    }

    public O execute(I input) {
        System.out.println("Execute");
        return currentStage.process(input);
    }
}
