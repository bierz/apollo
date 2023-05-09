package pl.beck.apollo.services.text;

import pl.beck.apollo.services.judgement.SignatureException;

public class TextConverterImpl implements TextConverter {

    private static boolean isValid(String text) {
        if (text == null) throw new TextException("text var is null");
        if (text.isBlank()) throw new TextException("text var is empty");
        return true;
    }

    @Override
    public String trimText(String text) {
        return text.trim();
    }

    @Override
    public String removeHtmlTags(String text) {
        return null;
    }

    @Override
    public String toUpperCase(String text) {
        return null;
    }

    @Override
    public String revertText(String text) {
        return null;
    }


}
