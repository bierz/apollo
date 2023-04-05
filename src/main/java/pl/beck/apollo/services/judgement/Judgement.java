package pl.beck.apollo.services.judgement;

import lombok.Value;
import pl.beck.apollo.services.judgement.counrt.Court;

import java.time.LocalDate;

@Value
public class Judgement {

    Signature signature;
    JudgementForm judgementForm;
    LocalDate publishedDate;
    Court court;
    String sentence;
    String justification;
    String concurringOpinions;

    boolean isValid() {
        if (signature == null) return false;
        if (sentence == null || sentence.isBlank()) return false;
        if (court == null) return false;
        if (publishedDate == null || publishedDate.isAfter(LocalDate.now())) return false;

        return true;
    }



}
