

    package ai.privado.test.gcp;

    import com.google.cloud.videointelligence.VideoIntelligence;

    public class VideoIntelligenceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VideoIntelligence videoIntelligence = new VideoIntelligence();
            videoIntelligence.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    