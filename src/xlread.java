import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlread {

	public static void main(String[] args)
			throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {

		
		for(int i=1;i<=4;i++)
		{
		String path = "/home/tyss/input.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		int cou = wb.getSheet("s").getLastRowNum();
		String un = wb.getSheet("s").getRow(i).getCell(0).toString();
		//String d = wb.getSheet("s").getRow(i).getCell(1).toString();
		
		System.out.println(un);
		System.out.println(cou);
		}

	}

}
