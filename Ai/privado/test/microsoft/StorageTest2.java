
package ai.privado.test.microsoft;

import com.microsoft.windowsazure.storage.microsoft-windowsazure-storage-sdk.Storage;

public class StorageTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Storage storage = new Storage();
        storage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
