

    package ai.privado.test.oracle;

    import com.oracle.bmc.objectstorage.ObjectStorage;

    public class ObjectStorageTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ObjectStorage objectStorage = new ObjectStorage();
            objectStorage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    