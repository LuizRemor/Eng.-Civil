package testeLaje.model.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import testeLaje.model.Coeficientes;
import testeLaje.model.dao.DB;

public class CoeficientesKDaoJDBC {

	private PreparedStatement st;

	public void insert(Coeficientes coeficientes) throws SQLException {

		st = DB.getConnection().prepareStatement("INSERT INTO consulta_coeficiente (caso, lambda, mi_x, mi_y, mi_x1, mi_y1, k_x, k_y, k_x1, k_y1)" + 
												 "VALUES " + 
												 "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				Statement.RETURN_GENERATED_KEYS);
		st.setDouble(1, coeficientes.getCaso());
		st.setDouble(2, coeficientes.getLambda());
		st.setDouble(3, coeficientes.getMiX());
		st.setDouble(4, coeficientes.getMiY());
		st.setDouble(5, coeficientes.getMiX1());
		st.setDouble(6, coeficientes.getMiY1());
		st.setDouble(7, coeficientes.getKx());
		st.setDouble(8, coeficientes.getKy());
		st.setDouble(9, coeficientes.getKx1());
		st.setDouble(10, coeficientes.getKy1());

		st.executeUpdate();
	}

	public void pesquisaCoeficienteAB(Coeficientes coeficientes) throws SQLException {

		st = DB.getConnection().prepareStatement("INSERT INTO caso1 (KX, KY, KX1, KY1)" + "VALUES " + "(?, ?, ?, ?)",
				Statement.RETURN_GENERATED_KEYS);

		st.executeUpdate();
	}

	public void updateCoeficienteK(Coeficientes coeficientes) throws SQLException {

		st = DB.getConnection().prepareStatement("UPDATE caso1 SET KX = ?, KY = ?, KX1 = ?, KY1 = ? WHERE Lambda = ?",
				Statement.RETURN_GENERATED_KEYS);
		st.setDouble(1, coeficientes.getKx());
		st.setDouble(2, coeficientes.getKy());
		st.setDouble(3, coeficientes.getKx1());
		st.setDouble(4, coeficientes.getKy1());

		st.executeUpdate();
	}
}