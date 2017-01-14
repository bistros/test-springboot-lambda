package bistros.com.handler;

import bistros.com.TestBootLambdaApplication;
import bistros.com.component.LambdaBean;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.context.ApplicationContext;

/**
 * Created by bistros on 2017. 1. 14..
 */
public class BootHandler implements RequestHandler<String, String> {

    ApplicationContext ac;

    public BootHandler() {
        ac = new TestBootLambdaApplication().getApplicationContext();
    }

    @Override
    public String handleRequest(String input, Context context) {
        LambdaBean bean = ac.getBean(LambdaBean.class);
        return bean.getVal();
    }
}

