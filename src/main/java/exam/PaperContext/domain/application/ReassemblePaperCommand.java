package exam.PaperContext.domain.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.util.List;

@Data
@AllArgsConstructor
public class ReassemblePaperCommand {
    private String teacherId;
    private List<BlankQuiz> quizzes;

    @Value
    public static class BlankQuiz {
        private String quizId;
        private int score;
    }
}