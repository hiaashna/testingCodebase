

    package ai.privado.test.aliyun;

    import com.aliyun.robotstudios.RobotStudios;

    public class RobotStudiosTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RobotStudios robotStudios = new RobotStudios();
            robotStudios.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    