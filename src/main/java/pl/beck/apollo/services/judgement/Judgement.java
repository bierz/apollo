package pl.beck.apollo.services.judgement;

import lombok.Value;
import pl.beck.apollo.services.judgement.counrt.Court;

import java.time.LocalDate;
import java.util.List;

@Value
public class Judgement {

    String signature;
    JudgementForm judgementForm;
    LocalDate publishedDate;
    Court court;
    String sentence;
    String justification;
    String concurringOpinions;

}
