

    package ai.privado.test.oracle;

    import com.oracle.bmc.common.Common;

    public class CommonTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Common common = new Common();
            common.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    