package br.com.dio.model;

public class Space {

    private Integer actual;
    private final int expeted;
    private final boolean fixed;

    public Space(final int expeted, final boolean fixed) {
        this.expeted = expeted;
        this.fixed = fixed;
        if (fixed) {
            actual = expeted;
        }
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(final Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    public void clearSpace() {
        setActual(null);
    }

    public int getExpeted() {
        return expeted;
    }

    public boolean isFixed() {
        return fixed;
    }
}