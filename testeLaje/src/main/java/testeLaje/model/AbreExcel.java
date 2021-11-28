package testeLaje.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import testeLaje.model.dao.impl.CoeficientesKDaoJDBC;

public class AbreExcel {
	private static final String caminhoArquivo = "C:\\Users\\luiz.neto\\Desktop\\ENG. CIVIL\\Concreto armado I\\Programa Laje\\Coeficientes.xls";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException, IOException, SQLException {

		// HSSFWorkbook e HSSFSheet

		List<Coeficientes> listaCoeficientes = new ArrayList<Coeficientes>();

		try {
			FileInputStream arquivo = new FileInputStream(new File(caminhoArquivo));

			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

			HSSFSheet sheetLambda = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetLambda.iterator();

			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();

				Coeficientes coeficientes = new Coeficientes();

				listaCoeficientes.add(coeficientes);

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						coeficientes.setCaso(cell.getNumericCellValue());
						break;
					case 1:
						coeficientes.setLambda(cell.getNumericCellValue());
						break;
					case 2:
						coeficientes.setMiX(cell.getNumericCellValue());
						break;
					case 3:
						coeficientes.setMiY(cell.getNumericCellValue());
						break;
					case 4:
						coeficientes.setMiX1(cell.getNumericCellValue());
						break;
					case 5:
						coeficientes.setMiY1(cell.getNumericCellValue());
						break;
					case 6:
						coeficientes.setKx(cell.getNumericCellValue());
						break;
					case 7:
						coeficientes.setKy(cell.getNumericCellValue());
						break;
					case 8:
						coeficientes.setKx1(cell.getNumericCellValue());
						break;
					case 9:
						coeficientes.setKy1(cell.getNumericCellValue());
						break;
					}

				}

			}

			arquivo.close();

			CoeficientesKDaoJDBC coeficientekDaoJDBC = new CoeficientesKDaoJDBC();

			for (Coeficientes obj : listaCoeficientes) {

				coeficientekDaoJDBC.insert(obj);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo Excel não encontrado!");
		}

		if (listaCoeficientes.size() == 0) {
			System.out.println("Nenhum coeficiente encontrado!");
		}
	}

}