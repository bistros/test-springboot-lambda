package bistros.com.handler;

import bistros.com.TestBootLambdaApplication;
import bistros.com.component.LambdaBean;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Created by bistros on 2017. 1. 14..
 */
public class BootHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        TestBootLambdaApplication app = new TestBootLambdaApplication();

        LambdaBean bean = app.getApplicationContext().getBean(LambdaBean.class);
        return bean.getVal();

    }
}

