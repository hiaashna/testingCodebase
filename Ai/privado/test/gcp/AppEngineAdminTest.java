

    package ai.privado.test.gcp;

    import com.google.appengine.AppEngineAdmin;

    public class AppEngineAdminTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AppEngineAdmin appEngineAdmin = new AppEngineAdmin();
            appEngineAdmin.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    