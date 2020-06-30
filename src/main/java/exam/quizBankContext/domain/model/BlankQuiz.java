package exam.quizBankContext.domain.model;

import exam.quizBankContext.domain.shared.Entity;

import java.time.LocalDateTime;

public class BlankQuiz implements Entity<BlankQuiz> {
    private BlankQuizId blankQuizId;
    private String teacherId;
    private String context;
    private String referenceAnswer;
    private int score;
    private boolean isDelete;
    private boolean isRevise;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    private BlankQuiz(BlankQuizId blankQuizId, String teacherId, String context, String referenceAnswer, int score) {
        this.blankQuizId = blankQuizId;
        this.teacherId = teacherId;
        this.context = context;
        this.referenceAnswer = referenceAnswer;
        this.score = score;
    }

    public void revise(String teacherId) {
        this.teacherId = teacherId;
        this.isRevise = true;
        this.updatedTime = LocalDateTime.now();
    }

    public void delete(String teacherId) {
        this.teacherId = teacherId;
        this.isDelete = true;
        this.updatedTime = LocalDateTime.now();
    }

    public void update(String teacherId) {
        this.teacherId = teacherId;
        this.updatedTime = LocalDateTime.now();
    }

    @Override
    public boolean sameIdentityAs(BlankQuiz other) {
        return blankQuizId.sameValueAs(other.blankQuizId);
    }
}
