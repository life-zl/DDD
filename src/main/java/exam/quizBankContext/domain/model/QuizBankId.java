package exam.quizBankContext.domain.model;

import exam.quizBankContext.domain.shared.ValueObject;

public class QuizBankId implements ValueObject<QuizBankId> {
    private String id;

    @Override
    public boolean sameValueAs(QuizBankId other) {
        return other.id.equals(id);
    }
}
