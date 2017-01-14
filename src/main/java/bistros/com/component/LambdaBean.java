package bistros.com.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bistros on 2017. 1. 14..
 */
@Component
public class LambdaBean {

    @Autowired
    PropertyBean bean;

    public String getVal(){
        return "val is " + bean.getVal();
    }
}
