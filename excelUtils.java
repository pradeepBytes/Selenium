package utility;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


    public class excelUtils {
    	
                private static XSSFSheet ExcelWSheet;
                private static XSSFWorkbook ExcelWBook;
                private static XSSFCell Cell;
                private static XSSFRow Row;
          
                public static void setExcelFile(String Path,String SheetName) throws Exception {
                   try {
                    FileInputStream ExcelFile = new FileInputStream(Path);
                    
                    ExcelWBook = new XSSFWorkbook(ExcelFile);
                    ExcelWSheet = ExcelWBook.getSheet(SheetName);
                    Log.info("Excel sheet opened");
                    } catch (Exception e){
                        throw (e);
                    }
            }
            //This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
            public static String getCellData(int RowNum, int ColNum) throws Exception{
                   try{
                	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
                      String CellData = Cell.getStringCellValue();
                      return CellData;
                      }catch (Exception e){
                        return"";
                      }
            }
            //This method is to write in the Excel cell, Row num and Col num are the parameters
            @SuppressWarnings({ "static-access", "deprecation" })
			public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception    {
                   try{
                      Row  = ExcelWSheet.getRow(RowNum);
                    Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
                    if (Cell == null) {
                        Cell = Row.createCell(ColNum);
                        Cell.setCellValue(Result);
                        } else {
                            Cell.setCellValue(Result);
                        }
          // Constant variables Test Data path and Test Data file name
                          FileOutputStream fileOut = new FileOutputStream(constants.MasterXL_Path);
                          ExcelWBook.write(fileOut);
                          fileOut.flush();
                        fileOut.close();
                        }catch(Exception e){
                            throw (e);
                    }
                }
            
        	public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
        		int i;
        		try {
        			int rowCount = excelUtils.getRowUsed();
        			for ( i=0 ; i<rowCount; i++){
        				if  (excelUtils.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){
        					break;
        				}
        			}
        			return i;
        				}catch (Exception e){
        			Log.error("Class ExcelUtil | Method getRowContains | Exception desc : " + e.getMessage());
        			throw(e);
        			}
        		}
        	
        	public static int getRowUsed() throws Exception {
        		try{
        			int RowCount = ExcelWSheet.getLastRowNum();
        			Log.info("Total number of Row used return as < " + RowCount + " >.");		
        			return RowCount;
        		}catch (Exception e){
        			Log.error("Class ExcelUtil | Method getRowUsed | Exception desc : "+e.getMessage());
        			System.out.println(e.getMessage());
        			throw (e);
        		}

        	}
    }