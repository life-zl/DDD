package exam.PaperContext.domain.shared;

public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
