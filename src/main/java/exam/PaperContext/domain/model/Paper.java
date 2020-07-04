package exam.PaperContext.domain.model;

import exam.PaperContext.domain.shared.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Paper implements Entity<Paper> {
    private PaperId paperId;
    private String teacherId;
    private List<BlankQuiz> blankQuizList;
    private LocalDateTime createTime;

    private Paper(PaperId paperId, String teacherId, List<BlankQuiz> blankQuizList) {
        this.paperId = paperId;
        this.blankQuizList = blankQuizList;
        this.teacherId = teacherId;
        createTime = LocalDateTime.now();
    }

    @Override
    public boolean sameIdentityAs(Paper other) {
        return this.paperId.sameValueAs(other.paperId);
    }

    public static Paper assemble(PaperId paperId, String teacherId, List<BlankQuiz> blankQuizList) {
        return new Paper(paperId, teacherId, blankQuizList);
    }

    public void reassemble(String teacherId, List<BlankQuiz> blankQuizList) {
        this.teacherId = teacherId;
        this.blankQuizList = blankQuizList;
    }

}
