package exam.quizBankContext.domain.application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBlankQuizCommand {

  private String teacherId;
  private String question;
  private Integer score;
  private String referenceAnswer;

}
