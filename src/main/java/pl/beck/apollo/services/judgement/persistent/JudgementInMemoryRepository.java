package pl.beck.apollo.services.judgement.persistent;

import org.springframework.stereotype.Repository;
import pl.beck.apollo.services.judgement.Judgement;
import pl.beck.apollo.services.judgement.JudgementForm;
import pl.beck.apollo.services.judgement.Signature;
import pl.beck.apollo.services.judgement.counrt.Court;

import java.time.LocalDate;
import java.util.List;

@Repository
public class JudgementInMemoryRepository implements JudgementRepository {

    @Override
    public List<Judgement> getAllJudgements() {
        return List.of(
                new Judgement(Signature.create("123/2022"), JudgementForm.WYROK, LocalDate.now(), Court.SN, "sentencja",
                        "uzasadnienie", "zdania odrębne"),
                new Judgement(Signature.create("456/2022"), JudgementForm.UCHWAŁA, LocalDate.of(2020, 5, 12),
                        Court.WSA, "sentencja", "uzasadnienie", "zdania odrębne")
        );
    }
}
