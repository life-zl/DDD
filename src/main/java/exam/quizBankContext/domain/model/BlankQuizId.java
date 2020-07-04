package exam.quizBankContext.domain.model;

import exam.quizBankContext.domain.shared.ValueObject;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class BlankQuizId implements ValueObject<BlankQuizId> {
    private String id;

    public static BlankQuizId nextBlankQuizId() {
        return new BlankQuizId(UUID.randomUUID().toString());
    }

    @Override
    public boolean sameValueAs(BlankQuizId other) {
        return other.id.equals(id);
    }
}
