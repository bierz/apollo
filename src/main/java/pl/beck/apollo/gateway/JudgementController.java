package pl.beck.apollo.gateway;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.beck.apollo.services.judgement.Judgement;
import pl.beck.apollo.services.judgement.JudgementService;

import java.util.List;

@RestController
@AllArgsConstructor
public class JudgementController {

    private final JudgementService judgementService;

    @GetMapping("/judgements")
    public List<Judgement> getAllJudgements() {
        return judgementService.getAllJudgements();
    }

}
