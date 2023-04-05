package pl.beck.apollo.services.judgement;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.beck.apollo.services.judgement.counrt.Court;

import java.time.LocalDate;


public class JudgementTest {


    @Test
    public void should_not_validate_judgement_where_court_is_null() {
        // given
        Judgement judgement = new Judgement(Signature.create("sygn 12"), JudgementForm.UCHWAŁA, LocalDate.of(2021, 12, 1),
                null, "to jest sentencja", "to jest uzasadnienie", "to jest dodatkowa opinia");

        // when
        boolean result = judgement.isValid();

        // then
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void should_not_validate_judgement_with_future_date() {
        // given
        Judgement judgement = new Judgement(Signature.create("sygn 12"), JudgementForm.UCHWAŁA, LocalDate.now().plusMonths(1),
                Court.SN, "to jest sentencja", "to jest uzasadnienie", "to jest dodatkowa opinia");

        // when
        boolean result = judgement.isValid();

        // then
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void should_validate_if_judgement_is_fully_correct() {
        // given
        Judgement judgement = new Judgement(Signature.create("sygn 12"), JudgementForm.UCHWAŁA, LocalDate.now().minusMonths(1),
                Court.SN, "to jest sentencja", "to jest uzasadnienie", "to jest dodatkowa opinia");

        // when
        boolean result = judgement.isValid();

        // then
        Assertions.assertThat(result).isTrue();
    }

}
