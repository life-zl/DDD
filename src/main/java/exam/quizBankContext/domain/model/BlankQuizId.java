package exam.quizBankContext.domain.model;

import exam.quizBankContext.domain.shared.ValueObject;

public class BlankQuizId implements ValueObject<BlankQuizId> {
    private String id;

    @Override
    public boolean sameValueAs(BlankQuizId other) {
        return other.id.equals(id);
    }
}
