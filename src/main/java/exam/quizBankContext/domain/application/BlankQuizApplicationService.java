package exam.quizBankContext.domain.application;

import exam.quizBankContext.domain.model.BlankQuiz;
import exam.quizBankContext.domain.model.BlankQuizId;
import exam.quizBankContext.domain.model.BlankQuizRepository;
import org.springframework.stereotype.Service;

@Service
public class BlankQuizApplicationService {
    private final BlankQuizRepository blankQuizRepository;


    public BlankQuizApplicationService(BlankQuizRepository blankQuizRepository) {
        this.blankQuizRepository = blankQuizRepository;
    }

    public BlankQuiz create(CreateBlankQuizCommand command) {
        BlankQuizId blankQuizId = BlankQuizId.nextBlankQuizId();
        BlankQuiz blankQuiz = BlankQuiz.create(blankQuizId, command.getTeacherId(), command.getQuestion(), command.getReferenceAnswer(), command.getScore());
        blankQuizRepository.save(blankQuiz);
        return blankQuiz;
    }

    public BlankQuiz revise(String quizId, ReviseBlankQuizCommand command) {
        BlankQuizId blankQuizId = new BlankQuizId(quizId);
        BlankQuiz blankQuiz = BlankQuiz.revise(blankQuizId, command.getTeacherId(), command.getQuestion(), command.getReferenceAnswer(), command.getScore());
        blankQuizRepository.save(blankQuiz);
        return blankQuiz;
    }

    public void delete(DeleteBlankQuizCommand command) {
        blankQuizRepository.delete(new BlankQuizId(command.getBlankQuizId()));
    }

}
