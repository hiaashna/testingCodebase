

    package ai.privado.test.gcp;

    import com.google.cloud.grpc.GRPC;

    public class GRPCTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            GRPC gRPC = new GRPC();
            gRPC.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    