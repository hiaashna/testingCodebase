

    package ai.privado.test.aliyun;

    import com.aliyun.rtc.RealTimeCommunication;

    public class RealTimeCommunicationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RealTimeCommunication realTimeCommunication = new RealTimeCommunication();
            realTimeCommunication.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    