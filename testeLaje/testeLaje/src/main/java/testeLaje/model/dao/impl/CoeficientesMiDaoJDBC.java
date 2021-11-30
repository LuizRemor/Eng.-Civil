/*package testeLaje.model.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import testeLaje.model.CoeficientesMi;
import testeLaje.model.dao.DB;

public class CoeficientesMiDaoJDBC {

	private PreparedStatement st;

	public void insert(CoeficientesMi obj) throws SQLException {

		st = DB.getConnection().prepareStatement(
				"INSERT INTO caso9 (Lambda, MI_X, MI_Y, MI_X1, MI_Y1)" + "VALUES " + "(?, ?, ?, ?, ?)",
				Statement.RETURN_GENERATED_KEYS);
		st.setDouble(1, obj.getLambda());
		st.setDouble(2, obj.getMiX());
		st.setDouble(3, obj.getMiY());
		st.setDouble(4, obj.getMiX1());
		st.setDouble(5, obj.getMiY1());

		st.executeUpdate();
	}

	public void pesquisaCoeficienteAB(CoeficientesMi obj) throws SQLException {

		st = DB.getConnection().prepareStatement(
				"INSERT INTO caso9 (Lambda, MI_X, MI_Y, MI_X1, MI_Y1)" + "VALUES " + "(?, ?, ?, ?, ?)",
				Statement.RETURN_GENERATED_KEYS);
		st.setDouble(1, obj.getLambda());


		st.executeUpdate();
	}
}*/