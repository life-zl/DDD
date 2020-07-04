package exam.quizBankContext.domain.model;

public interface BlankQuizRepository {

    BlankQuiz find(BlankQuizId blankQuizId);

    void save(BlankQuiz blankQuiz);

    void delete(BlankQuizId blankQuizId);
}
