package selenium_basic;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws Exception {
		  
		File fii = new File("D:\\interview\\Test_Interview\\src\\main\\java\\testData\\tp.xlsx");
		
		FileInputStream fis = new FileInputStream(fii);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		         //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
		         //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		     //   System.out.println(cell);
		/*System.out.println(sheet.getRow(0).getCell(0));
		String cellval = cell.getStringCellValue();
		System.out.println(cellval);*/
		
		for(int i =0;i<=row.getLastCellNum();i++) {
			for(int j=i;j<=cell.getColumnIndex();j++) {
				
				System.out.println(cell.getStringCellValue());
				
			}
		}
	}
}
