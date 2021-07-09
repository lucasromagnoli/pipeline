package domain;

public class Cobertura {
    private final Bolo bolo;

    public Cobertura(Bolo bolo) {
        this.bolo = bolo;
    }

    @Override
    public String toString() {
        return "Cobertura no bolo "+bolo;
    }
}
