

    package ai.privado.test.oracle;

    import com.oracle.bmc.core.Core;

    public class CoreTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Core core = new Core();
            core.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    