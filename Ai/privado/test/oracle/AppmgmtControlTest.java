

    package ai.privado.test.oracle;

    import com.oracle.bmc.appmgmtcontrol.AppmgmtControl;

    public class AppmgmtControlTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AppmgmtControl appmgmtControl = new AppmgmtControl();
            appmgmtControl.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    