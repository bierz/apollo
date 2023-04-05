package pl.beck.apollo.services.text;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextConverterImplTest {

    private final TextConverter converter = new TextConverterImpl();


    @Test
    public void should_bla() {  // TODO  change this stupid name !!!
        // given
        String text = "   aaaa    ";

        // when
        String result = converter.trimText(text);

        // then
        String expected = "aaa";
        Assertions.assertThat(result).isEqualTo(expected);
    }


}
