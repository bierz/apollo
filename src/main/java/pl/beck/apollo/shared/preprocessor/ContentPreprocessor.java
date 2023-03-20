package pl.beck.apollo.shared.preprocessor;


import org.springframework.stereotype.Component;

/**
 * Cleans mess from web
 */
@Component
public class ContentPreprocessor {

    private final static char SPACE = ' ';
    private final static String EMPTY = "";
    private final static char DASH = '-';

    public String preprocess(String rawContent) {
        rawContent = removeForbiddenCharacters(rawContent);
        rawContent = fixDifferentSpaceCharacters(rawContent);
        rawContent = fixDifferentDashCharacters(rawContent);

        return rawContent.trim();
    }


    private String fixDifferentSpaceCharacters(String content) {
        return content
                .replace('\u00A0', SPACE)  // no braking space
                .replace('\u1680',SPACE)  // 	OGHAM SPACE MARK
                .replace('\u180E', SPACE) // MONGOLIAN VOWEL SEPARATOR
                .replace('\u2000', SPACE) // EN QUAD
                .replace('\u2001', SPACE) // EN QUAD
                .replace('\u2002', SPACE) // EN SPACE (nut)
                .replace('\u2003', SPACE) // EM SPACE (mutton)
                .replace('\u2004', SPACE) // THREE-PER-EM SPACE (thick space)
                .replace('\u2005', SPACE) // FOUR-PER-EM SPACE (mid space)
                .replace('\u2006', SPACE) // 	SIX-PER-EM SPACE
                .replace('\u2007', SPACE) // FIGURE SPACE
                .replace('\u2008', SPACE) // PUNCTUATION SPACE
                .replace('\u2009', SPACE) // THIN SPACE
                .replace('\u200A', SPACE) // chair space
                .replace('\u200B', SPACE) // zero width space
                .replace('\u202F', SPACE) // narrow no brak space
                .replace('\u205F', SPACE) // MEDIUM MATHEMATICAL SPACE
                .replace('\u3000', SPACE) // IDEOGRAPHIC SPACE
                .replace('\uFEFF', SPACE); // ZERO WIDTH NO-BREAK SPACE
    }

    private String removeForbiddenCharacters(String rawContent) {
        return rawContent
                .replace("\u001A", EMPTY)  // kwadracik
                .replace("&#x200e;", EMPTY) // Left-To-Right Mark
                .replace("#x200e;", EMPTY); //Left-To-Right Mark
    }

    private String fixDifferentDashCharacters(String rawContent) {
        return rawContent
                .replace('\u2014', DASH)
                .replace('\u2013',DASH)
                .replace('\u2015',DASH);
    }

}
