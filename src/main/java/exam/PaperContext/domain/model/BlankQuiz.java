package exam.PaperContext.domain.model;

import exam.PaperContext.domain.shared.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BlankQuiz implements ValueObject<BlankQuiz> {
    private String quizId;
    private int score;

    @Override
    public boolean sameValueAs(BlankQuiz other) {
        return false;
    }
}