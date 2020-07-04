package exam.PaperContext.domain.infrastructure;

import exam.PaperContext.domain.model.Paper;
import exam.PaperContext.domain.model.PaperId;
import exam.PaperContext.domain.model.PaperRepository;
import exam.quizBankContext.domain.model.BlankQuiz;
import exam.quizBankContext.domain.model.BlankQuizId;
import exam.quizBankContext.domain.model.BlankQuizRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MemoryPaperRepository implements PaperRepository {
    private Set<Paper> papers = new HashSet<>();

    @Override
    public Paper find(PaperId paperId) {
        return papers.stream().filter(paper -> paper.getPaperId().sameValueAs(paperId))
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public void save(Paper paper) {
        papers.add(paper);
    }

    @Override
    public void delete(PaperId paperId) {
        papers.removeIf(e -> e.getPaperId().sameValueAs(paperId));
    }


}
