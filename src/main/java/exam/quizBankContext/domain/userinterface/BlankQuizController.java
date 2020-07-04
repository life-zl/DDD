package exam.quizBankContext.domain.userinterface;

import exam.quizBankContext.domain.application.BlankQuizApplicationService;
import exam.quizBankContext.domain.application.CreateBlankQuizCommand;
import exam.quizBankContext.domain.application.DeleteBlankQuizCommand;
import exam.quizBankContext.domain.application.ReviseBlankQuizCommand;
import exam.quizBankContext.domain.model.BlankQuiz;
import exam.quizBankContext.domain.model.BlankQuizId;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quizzes")
public class BlankQuizController {
    private final BlankQuizApplicationService blankQuizApplicationService;

    public BlankQuizController(BlankQuizApplicationService blankQuizApplicationService) {
        this.blankQuizApplicationService = blankQuizApplicationService;
    }

    @DeleteMapping("/{quizId}")
    public String delete(@PathVariable String quizId) {
        blankQuizApplicationService.delete(new DeleteBlankQuizCommand(quizId));
        return "Success";
    }

    @PostMapping
    public BlankQuiz create(@RequestBody CreateBlankQuizCommand command) {
        return blankQuizApplicationService.create(command);
    }

    @PutMapping("/{quizId}")
    public BlankQuiz update(@PathVariable String quizId,
                            @RequestBody ReviseBlankQuizCommand command) {
        return blankQuizApplicationService.revise(quizId, command);
    }
}
