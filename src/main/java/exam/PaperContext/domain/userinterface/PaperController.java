package exam.PaperContext.domain.userinterface;

import exam.PaperContext.domain.application.AssemblePaperCommand;
import exam.PaperContext.domain.application.PaperApplicationService;
import exam.PaperContext.domain.application.ReassemblePaperCommand;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paper")
public class PaperController {
    private final PaperApplicationService paperApplicationService;

    public PaperController(PaperApplicationService paperApplicationService) {
        this.paperApplicationService = paperApplicationService;
    }


    @PostMapping
    public String create(@RequestBody AssemblePaperCommand command) {
        paperApplicationService.assemble(command);
        return "Success";
    }

    @PutMapping("/{paperId}")
    public String update(@PathVariable String paperId, @RequestBody ReassemblePaperCommand command) {
        paperApplicationService.reassemble(paperId, command);
        return "Success";
    }
}
