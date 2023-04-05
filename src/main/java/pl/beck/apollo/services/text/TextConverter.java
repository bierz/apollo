package pl.beck.apollo.services.text;

public interface TextConverter {

    String trimText(String text);

    String removeHtmlTags(String text);

    String toUpperCase(String text);

    String revertText(String text);




}
