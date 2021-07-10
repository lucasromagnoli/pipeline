package v1.pipeline;

public interface Stage<I, O> {
    O process(I input);
}
