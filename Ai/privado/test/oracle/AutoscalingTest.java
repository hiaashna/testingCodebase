

    package ai.privado.test.oracle;

    import com.oracle.bmc.autoscaling.Autoscaling;

    public class AutoscalingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Autoscaling autoscaling = new Autoscaling();
            autoscaling.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    