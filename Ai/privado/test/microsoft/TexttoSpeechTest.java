
package ai.privado.test.microsoft;

import com.azure.ai.texttospeech.TexttoSpeech;

public class TexttoSpeechTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        TexttoSpeech texttoSpeech = new TexttoSpeech();
        texttoSpeech.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
