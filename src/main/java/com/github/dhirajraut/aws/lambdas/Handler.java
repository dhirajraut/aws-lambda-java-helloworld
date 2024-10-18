package com.github.dhirajraut.aws.lambdas;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        String PREFIX = this.getClass().getName() + " " + context.getAwsRequestId() + " : ";
        context.getLogger().log(PREFIX + "Hello World");
        return "SUCCESS";
    }
}
