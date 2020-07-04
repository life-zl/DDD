package exam.quizBankContext.domain.infrastructure;

import exam.quizBankContext.domain.model.BlankQuiz;
import exam.quizBankContext.domain.model.BlankQuizId;
import exam.quizBankContext.domain.model.BlankQuizRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MemoryBlankQuizRepository implements BlankQuizRepository {
    private Set<BlankQuiz> blankQuizzes = new HashSet<>();

    @Override
    public BlankQuiz find(BlankQuizId blankQuizId) {
        return blankQuizzes.stream().filter(blankQuiz -> blankQuiz.getBlankQuizId()
                .equals(blankQuizId))
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public void save(BlankQuiz blankQuiz) {
        blankQuizzes.add(blankQuiz);
    }

    @Override
    public void delete(BlankQuizId blankQuizId) {
        blankQuizzes.removeIf(e -> e.getBlankQuizId().equals(blankQuizId));
    }


}
