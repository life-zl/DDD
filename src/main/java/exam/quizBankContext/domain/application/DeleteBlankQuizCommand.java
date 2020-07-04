package exam.quizBankContext.domain.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeleteBlankQuizCommand {

  private String blankQuizId;

}
