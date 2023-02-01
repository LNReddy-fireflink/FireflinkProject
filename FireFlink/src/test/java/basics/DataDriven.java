package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
test("Login");
	}
	public static String[][] test(String sheetname) throws EncryptedDocumentException, IOException {
		File file=new File("./testdata/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
	Workbook wb=WorkbookFactory.create(fis);
	int row = wb.getSheet(sheetname).getPhysicalNumberOfRows();
	int col = wb.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
	String[][] arr=new String[row-1][col];
for(int i=1;i<row;i++) {
	for(int j=0;j<col;j++) {
		arr[i-1][j] = wb.getSheet(sheetname).getRow(i).getCell(j).toString();
		
	}
}
/*for(int i=0;i<row-1;i++) {
	for(int j=0;j<col;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}*/
	return arr;
	}

}
