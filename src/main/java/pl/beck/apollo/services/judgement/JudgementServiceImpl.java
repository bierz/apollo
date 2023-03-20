package pl.beck.apollo.services.judgement;

import org.springframework.stereotype.Service;
import pl.beck.apollo.services.judgement.persistent.JudgementRepository;

import java.util.List;

@Service
public class JudgementServiceImpl implements JudgementService {

    private final JudgementRepository judgementRepository;

    public JudgementServiceImpl(JudgementRepository judgementRepository) {
        this.judgementRepository = judgementRepository;
    }

    @Override
    public List<Judgement> getAllJudgements() {
        return judgementRepository.getAllJudgements();
    }
}
