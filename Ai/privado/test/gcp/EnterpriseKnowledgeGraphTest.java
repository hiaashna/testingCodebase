

    package ai.privado.test.gcp;

    import com.google.cloud.enterpriseknowledgegraph.EnterpriseKnowledgeGraph;

    public class EnterpriseKnowledgeGraphTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            EnterpriseKnowledgeGraph enterpriseKnowledgeGraph = new EnterpriseKnowledgeGraph();
            enterpriseKnowledgeGraph.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    