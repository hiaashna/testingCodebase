

    package ai.privado.test.oracle;

    import com.adobe.dc.DocumentCloud;

    public class DocumentCloudTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DocumentCloud documentCloud = new DocumentCloud();
            documentCloud.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    