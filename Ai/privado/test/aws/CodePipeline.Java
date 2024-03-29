package Ai.privado.test.aws;

import com.amazonaws.services.codepipeline.AWSCodePipeline;
import com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest;
import com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult;

public class CodePipeline {
    private final AWSCodePipeline client;

    public CodePipeline(AWSCodePipeline client) {
        this.client = client;
    }

    public void AWSCodePipelineFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
        PutJobSuccessResultRequest request = new PutJobSuccessResultRequest()
            .withJobId(firstName)
            .withContinuationToken("optional_token")
            .addOutputVariablesEntry("lastName", lastName)
            .addOutputVariablesEntry("phoneNumber", phoneNumber)
            .addOutputVariablesEntry("dob", dob);

        PutJobSuccessResultResult result = client.putJobSuccessResult(request);
        System.out.println("Successfully sent personal data to CodePipeline: " + result);
    }
}

