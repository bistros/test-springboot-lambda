package bistros.com.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by bistros on 2017. 1. 14..
 */
@Component
@PropertySource("classpath:application.properties")
public class PropertyBean {

    @Value("${value.test}")
    String val;

    public String getVal() {
        return val;
    }
}
