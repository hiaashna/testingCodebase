

    package ai.privado.test.gcp;

    import com.google.cloud.aiplatform.AIPlatform;

    public class AIPlatformTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AIPlatform aIPlatform = new AIPlatform();
            aIPlatform.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    