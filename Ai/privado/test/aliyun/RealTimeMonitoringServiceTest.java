

    package ai.privado.test.aliyun;

    import com.aliyun.arms.RealTimeMonitoringService;

    public class RealTimeMonitoringServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RealTimeMonitoringService realTimeMonitoringService = new RealTimeMonitoringService();
            realTimeMonitoringService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    