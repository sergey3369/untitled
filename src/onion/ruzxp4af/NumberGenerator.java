package onion.ruzxp4af;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
