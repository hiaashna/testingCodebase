

    package ai.privado.test.aliyun;

    import com.aliyun.appstreamcenter.AppStreamCenter;

    public class AppStreamCenterTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AppStreamCenter appStreamCenter = new AppStreamCenter();
            appStreamCenter.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    