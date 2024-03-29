package Ai.privado.test.aws;

import com.amazonaws.services.amplifyuibuilder.AmplifyUIBuilder;
import com.amazonaws.services.amplifyuibuilder.model.CreateUserRequest;

public class AmplifyUIBuilder {

    public void AWSAmplifyUIBuilderFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
        AmplifyUIBuilder amplifyUIBuilder = new AmplifyUIBuilder();

        CreateUserRequest createUserRequest = new CreateUserRequest()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withPhoneNumber(phoneNumber)
                .withDOB(DOB);

        amplifyUIBuilder.createUser(createUserRequest);
    }
}

