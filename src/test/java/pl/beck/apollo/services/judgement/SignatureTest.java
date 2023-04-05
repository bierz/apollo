package pl.beck.apollo.services.judgement;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class SignatureTest {

    // SHORTCUT ctrl + shift + t tworzy nowy test

    @Test
    public void should_validate_create_signature() {
        // given
        String number = "123";

        // when
        Signature signature = Signature.create(number);

        // then
        Assertions.assertThat(signature.getNumber()).isEqualTo(number);
    }

    @Test(expected = RuntimeException.class)
    public void should_not_validate_create_signature_when_number_is_empty() {
        // given
        String number = "                ";

        // when
        Signature signature = Signature.create(number);

        // then ...

    }

}
