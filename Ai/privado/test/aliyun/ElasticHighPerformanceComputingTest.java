

    package ai.privado.test.aliyun;

    import com.aliyun.ehpc.ElasticHighPerformanceComputing;

    public class ElasticHighPerformanceComputingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ElasticHighPerformanceComputing elasticHighPerformanceComputing = new ElasticHighPerformanceComputing();
            elasticHighPerformanceComputing.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    