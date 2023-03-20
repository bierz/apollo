package pl.beck.apollo.services.judgement.persistent;

import pl.beck.apollo.services.judgement.Judgement;

import java.util.List;

public interface JudgementRepository {

    List<Judgement> getAllJudgements();

}
