

    package ai.privado.test.gcp;

    import com.google.cloud.networkmanagement.NetworkManagement;

    public class NetworkManagementTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            NetworkManagement networkManagement = new NetworkManagement();
            networkManagement.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    