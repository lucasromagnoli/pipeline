package domain;

public class Bolo {
    private final Fruta fruta;

    public Bolo(Fruta fruta) {
        this.fruta = fruta;
    }

    @Override
    public String toString() {
        return "Bolo de "+fruta;
    }
}
