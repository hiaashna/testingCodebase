

    package ai.privado.test.gcp;

    import com.google.cloud.webrisk.WebRisk;

    public class WebRiskTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            WebRisk webRisk = new WebRisk();
            webRisk.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    