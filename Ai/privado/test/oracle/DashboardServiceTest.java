

    package ai.privado.test.oracle;

    import com.oracle.bmc.dashboardservice.DashboardService;

    public class DashboardServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DashboardService dashboardService = new DashboardService();
            dashboardService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    