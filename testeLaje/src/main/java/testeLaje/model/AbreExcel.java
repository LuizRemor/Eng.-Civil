/*package testeLaje.model;

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

import testeLaje.model.dao.impl.EspacamentoBitolaDaoJDBC;

public class AbreExcel {
	private static final String caminhoArquivo = "C:\\Users\\luiz.neto\\Desktop\\ENG. CIVIL\\Concreto armado I\\Programa Laje\\Instalacões eletricas2.xls";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException, IOException, SQLException {

		// HSSFWorkbook e HSSFSheet

		List<EspacamentoBitola> listaEspacamentoBitola = new ArrayList<EspacamentoBitola>();

		try {
			FileInputStream arquivo = new FileInputStream(new File(caminhoArquivo));

			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

			HSSFSheet sheetLambda = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetLambda.iterator();

			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();

				EspacamentoBitola espacamentoBitola = new EspacamentoBitola();

				listaEspacamentoBitola.add(espacamentoBitola);

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						espacamentoBitola.setBitola(cell.getNumericCellValue());
						break;
					case 1:
						espacamentoBitola.setEspacamento(cell.getNumericCellValue());
						break;
					case 2:
						espacamentoBitola.setArea_aco(cell.getNumericCellValue());
						break;
					}

				}
			}

			arquivo.close();

			EspacamentoBitolaDaoJDBC espacamentoBitolaDaoJDBC = new EspacamentoBitolaDaoJDBC();

			for (EspacamentoBitola obj : listaEspacamentoBitola) {

				espacamentoBitolaDaoJDBC.insert(obj);

			}

			System.out.println("Processo terminado");

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo Excel não encontrado!");
		}

		if (listaEspacamentoBitola.size() == 0) {
			System.out.println("Nenhum coeficiente encontrado!");
		}

	}
}*/