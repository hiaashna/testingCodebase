

    package ai.privado.test.aliyun;

    import com.aliyun.vs.VideoSurveillance;

    public class VideoSurveillanceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VideoSurveillance videoSurveillance = new VideoSurveillance();
            videoSurveillance.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    