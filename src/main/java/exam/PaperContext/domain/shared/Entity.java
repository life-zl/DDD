package exam.PaperContext.domain.shared;

public interface Entity<T> {
    boolean sameIdentityAs(T other);
}
