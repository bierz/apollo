package pl.beck.apollo.services.text;

public class TextConverterImpl implements TextConverter {



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
