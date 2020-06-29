package exam.quizBankContext.domain.shared;

public interface Entity<T> {
    boolean sameIdentityAs(T other);
}
