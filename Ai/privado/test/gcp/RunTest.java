

    package ai.privado.test.gcp;

    import com.google.cloud.run.Run;

    public class RunTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Run run = new Run();
            run.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    