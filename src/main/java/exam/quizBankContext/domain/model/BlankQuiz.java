package exam.quizBankContext.domain.model;

import exam.quizBankContext.domain.shared.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class BlankQuiz implements Entity<BlankQuiz> {
    private BlankQuizId blankQuizId;
    private String teacherId;
    private String content;
    private String referenceAnswer;
    private int score;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    private BlankQuiz(BlankQuizId blankQuizId, String teacherId, String content, String referenceAnswer, int score) {
        this.blankQuizId = blankQuizId;
        this.teacherId = teacherId;
        this.content = content;
        this.referenceAnswer = referenceAnswer;
        this.score = score;
    }

    public static BlankQuiz revise(BlankQuizId blankQuizId, String teacherId, String content, String referenceAnswer, int score) {
        BlankQuiz blankQuiz = new BlankQuiz(blankQuizId, teacherId, content, referenceAnswer, score);
        blankQuiz.setUpdatedTime(LocalDateTime.now());
        return blankQuiz;
    }

    public static BlankQuiz create(BlankQuizId blankQuizId, String teacherId, String content, String referenceAnswer, int score) {
        BlankQuiz blankQuiz = new BlankQuiz(blankQuizId, teacherId, content, referenceAnswer, score);
        blankQuiz.setCreatedTime(LocalDateTime.now());
        return blankQuiz;
    }

    @Override
    public boolean sameIdentityAs(BlankQuiz other) {
        return blankQuizId.sameValueAs(other.blankQuizId);
    }
}
