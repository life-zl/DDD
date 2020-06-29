package exam.quizBankContext.domain.shared;

public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
