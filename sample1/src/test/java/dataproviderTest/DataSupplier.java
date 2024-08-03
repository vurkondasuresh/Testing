package dataproviderTest;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;

public class DataSupplier {
    @DataProvider(name = "logindata")
    public  Object[][] getData() throws Exception {
        File file = new File("C:\\Users\\sures\\IdeaProjects\\sample1\\src\\test\\resources\\d4.xlsx");
        System.out.println(file.exists());
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        System.out.println(sheet.getPhysicalNumberOfRows());
        //System.out.println(sheet.getLastRowNum());
        int rowNo = sheet.getPhysicalNumberOfRows();
        int columnNo = sheet.getRow(0).getLastCellNum();
         Object[][] objects = new Object[rowNo-1][columnNo];
        for (int i = 0; i < rowNo-1; i++) {
            for (int j = 0; j < columnNo; j++) {
                DataFormatter df = new DataFormatter();
                objects[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
                //System.out.println(sheet.getRow(i).getCell(j));
                //System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
            //System.out.println();
        }

        workbook.close();
        fileInputStream.close();
        return objects;
    }
}
