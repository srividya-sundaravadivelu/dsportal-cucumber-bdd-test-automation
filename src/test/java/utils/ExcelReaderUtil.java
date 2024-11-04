package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReaderUtil {
	private Workbook workbook;

	public ExcelReaderUtil(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		this.workbook = new XSSFWorkbook(fis);
	}

	public String getCellDataByTitle(String sheetName, String questionTitle, String columnName) {
		Sheet sheet = workbook.getSheet(sheetName);
		Row headerRow = sheet.getRow(0);
		int colIndex = -1;

		// Locate the column index based on the column name
		for (Cell cell : headerRow) {
			if (cell.getStringCellValue().equalsIgnoreCase(columnName)) {
				colIndex = cell.getColumnIndex();
				break;
			}
		}

		// Return data for the row where question title matches
		for (Row row : sheet) {
			Cell titleCell = row.getCell(0);
			if (titleCell != null && titleCell.getStringCellValue().equalsIgnoreCase(questionTitle)) {
				Cell targetCell = row.getCell(colIndex);
				return targetCell != null ? targetCell.getStringCellValue() : "";
			}
		}
		return null;
	}
	// Get cell data based on sheet name, row number, and column name

	public String getCellData(String sheetName, int rowNum, String colName) {
		Sheet sheet = workbook.getSheet(sheetName);
		if (sheet == null) {
			return null;
		}

		// Get the header row and find the column index of the specified column name
		Row headerRow = sheet.getRow(0);
		if (headerRow == null) {
			return null;
		}
		Map<String, Integer> columnMap = new HashMap<>();
		for (Cell cell : headerRow) {
			columnMap.put(cell.getStringCellValue(), cell.getColumnIndex());
		}
		Integer colIndex = columnMap.get(colName);
		if (colIndex == null) {
			return null; // Column name not found
		}

		// Get the data from the specified row and column index
		Row row = sheet.getRow(rowNum);
		if (row == null) {
			return null;
		}
		Cell cell = row.getCell(colIndex);
		if (cell == null) {
			return null;
		}

		return cell.toString();
	}

	public void close() throws IOException {
		workbook.close();
	}

}
