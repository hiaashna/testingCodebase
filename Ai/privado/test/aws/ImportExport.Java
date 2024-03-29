package Ai.privado.test.aws;

import com.amazonaws.services.importexport.ImportExportClient;
import com.amazonaws.services.importexport.model.ImportExportException;
import com.amazonaws.services.importexport.model.ProcessDataRequest;
import com.amazonaws.services.importexport.model.ProcessDataResult;

public class ImportExport {
  private ImportExportClient importExportClient;
  
  public ImportExport() {
    this.importExportClient = ImportExportClient.builder().build();
  }
  
  public void processData(String personalData) {
    try {
      // Create a request to process the personal data
      ProcessDataRequest processDataRequest = new ProcessDataRequest()
        .withData(personalData);
      
      // Call the processData method of the Import/Export client to process the data
      ProcessDataResult processDataResult = importExportClient.processData(processDataRequest);
      
      System.out.println("Personal data processing successful");
    } catch (ImportExportException e) {
      System.err.println("Error processing personal data: " + e.getMessage());
    }
  }
  
  public static void main(String[] args) {
    SecurityToken processor = new SecurityToken();
    String personalData = "John Doe, 123 Main St, Anytown USA 12345, john.doe@email.com";
    processor.processData(personalData);
  }
}

