
package ai.privado.test.microsoft;

import com.microsoft.azure.android.Android;

public class AndroidTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Android android = new Android();
        android.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
