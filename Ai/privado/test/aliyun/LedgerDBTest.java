

    package ai.privado.test.aliyun;

    import com.aliyun.ledgerdb.LedgerDB;

    public class LedgerDBTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            LedgerDB ledgerDB = new LedgerDB();
            ledgerDB.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    