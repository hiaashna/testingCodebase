
package ai.privado.test.microsoft;

import com.azure.search.documents.Search;

public class SearchTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Search search = new Search();
        search.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
