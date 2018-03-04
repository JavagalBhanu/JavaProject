package excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read {
	public static void main(String[] args) throws Exception{
		String path="./data/input.xlsx";
		String sheet="ValidLogin";

		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String v = wb.getSheet(sheet).getRow(1).getCell(0).toString();
		
		System.out.println(v);
	} 
	
}
