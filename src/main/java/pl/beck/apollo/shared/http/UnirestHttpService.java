package pl.beck.apollo.shared.http;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.beck.apollo.shared.preprocessor.ContentPreprocessor;

@Component
@AllArgsConstructor
public class UnirestHttpService implements HttpService {

    private final ContentPreprocessor contentPreprocessor;

    public String getContentFromUrl(String url) {
        HttpResponse<String> response = Unirest.get(url).asString();
        return contentPreprocessor.preprocess(response.getBody());
    }

}
