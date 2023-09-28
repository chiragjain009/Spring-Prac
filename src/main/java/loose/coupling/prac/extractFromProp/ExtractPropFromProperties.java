package loose.coupling.prac.extractFromProp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ExtractPropFromProperties {

    @Value("${app.external.url}")
    private String url;

    public String returnUrl(){
        return url;
    }
}
