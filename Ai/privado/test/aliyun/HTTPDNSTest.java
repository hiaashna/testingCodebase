

    package ai.privado.test.aliyun;

    import com.aliyun.httpdns.HTTPDNS;

    public class HTTPDNSTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            HTTPDNS hTTPDNS = new HTTPDNS();
            hTTPDNS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    