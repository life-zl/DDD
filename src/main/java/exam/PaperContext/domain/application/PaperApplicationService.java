package exam.PaperContext.domain.application;

import exam.PaperContext.domain.model.BlankQuiz;
import exam.PaperContext.domain.model.Paper;
import exam.PaperContext.domain.model.PaperId;
import exam.PaperContext.domain.model.PaperRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class PaperApplicationService {
    private final PaperRepository paperRepository;

    public PaperApplicationService(PaperRepository paperRepository) {
        this.paperRepository = paperRepository;
    }

    public void assemble(AssemblePaperCommand command) {
        List<BlankQuiz> blankQuizes = command.getQuizzes().stream().map(blankQuiz -> new BlankQuiz(blankQuiz.getQuizId(), blankQuiz.getScore())).collect(toList());
        final Paper paper = Paper.assemble(PaperId.nextId(), command.getTeacherId(), blankQuizes);
        paperRepository.save(paper);
    }

    public void reassemble(String paperId, ReassemblePaperCommand command) {
        List<BlankQuiz> blankQuizes = command.getQuizzes().stream().map(blankQuiz -> new BlankQuiz(blankQuiz.getQuizId(), blankQuiz.getScore())).collect(toList());
        Paper paper = paperRepository.find(new PaperId(paperId));
        paper.setBlankQuizList(blankQuizes);
        paper.reassemble(command.getTeacherId(), blankQuizes);
        paperRepository.save(paper);
    }
}
