package exam.quizBankContext.domain.model;

import exam.quizBankContext.domain.shared.Entity;

import java.time.LocalDateTime;
import java.util.List;

public class QuizBank implements Entity<QuizBank> {
    private QuizBankId quizBankId;
    private List<BlankQuiz> blankQuizzes;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    private QuizBank(QuizBankId quizBankId, List<BlankQuiz> blankQuizzes) {
        this.quizBankId = quizBankId;
        this.blankQuizzes = blankQuizzes;
    }

    public boolean sameIdentityAs(QuizBank other) {
        return quizBankId.sameValueAs(other.quizBankId);
    }

    public QuizBank create(QuizBankId quizBankId, List<BlankQuiz> blankQuizzes) {
        QuizBank quizBank = new QuizBank(quizBankId, blankQuizzes);
        quizBank.createdTime = LocalDateTime.now();
        return quizBank;
    }

    public void delete() {
    }

    public void update() {
    }


}
