package DataDriven;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


public class OpenCsv {
	@DataProvider(name = "CSVData")
	public Object [][] readCSVData() throws IOException, CsvException{
		System.out.println("Reading CSV Data");
		CSVReader reader = new CSVReader(new FileReader("TestData/CSVRead.csv"));
		List<String[]> allData = reader.readAll();
		
		Object[][] data = new Object[allData.size()-1][2];
		
		for(int i = 1; i < allData.size(); i++) {
			String[] row = allData.get(i);
			System.out.println("Row" + i + ": " + String.join(", ", row));
			
			data[i -1][0] = row.length > 0 ? row[0] : "";
			data[i -1][1] = row.length > 1 ? row[1] : "";
		}
		reader.close();
		return data;
		
	}
	@Test(dataProvider = "CSVData")
	public void loginTestCSV(String username, String password) {
		System.out.println("CSV ->  " + username +" | " + password);
	}
}
