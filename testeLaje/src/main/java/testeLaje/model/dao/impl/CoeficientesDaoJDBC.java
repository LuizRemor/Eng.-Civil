package testeLaje.model.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import testeLaje.model.CoeficientesKeMi;
import testeLaje.model.VariaveisLaje;
import testeLaje.model.db.DB;

public class CoeficientesDaoJDBC extends VariaveisLaje{

	private PreparedStatement st;
	public CoeficientesKeMi obj = new CoeficientesKeMi();

	public void insert(CoeficientesKeMi coeficientes) {
		
		try {
			
		st = DB.getConnection().prepareStatement("INSERT INTO consulta_coeficiente (caso, lambda, mi_x, mi_y, mi_x1, mi_y1, k_x, k_y, k_x1, k_y1)" + 
												 "VALUES " + 
												 "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				Statement.RETURN_GENERATED_KEYS);
		
		st.setDouble(1,  coeficientes.getCaso());
		st.setDouble(2,  coeficientes.getLambda());
		st.setDouble(3,  coeficientes.getMiX());
		st.setDouble(4,  coeficientes.getMiY());
		st.setDouble(5,  coeficientes.getMiX1());
		st.setDouble(6,  coeficientes.getMiY1());
		st.setDouble(7,  coeficientes.getKx());
		st.setDouble(8,  coeficientes.getKy());
		st.setDouble(9,  coeficientes.getKx1());
		st.setDouble(10, coeficientes.getKy1());

		st.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
		}
	}
	
	public CoeficientesKeMi pesquisaCoeficientesKeMi(Double lambda, Double caso) {

		ResultSet rs = null;
		
		try {
			
			st = DB.getConnection().prepareStatement("SELECT * FROM consulta_coeficiente WHERE Lambda = ? AND caso = ?;");
			st.setDouble(1, lambda);
			st.setDouble(2, caso);
			rs = st.executeQuery();
			if (rs.next()) {

				obj.setMiX( rs.getDouble("mi_x"));
				obj.setMiY( rs.getDouble("mi_y"));
				obj.setMiX1(rs.getDouble("mi_x1"));
				obj.setMiY1(rs.getDouble("mi_y1"));
				obj.setKx(  rs.getDouble("k_x"));
				obj.setKy(  rs.getDouble("k_y"));
				obj.setKx1( rs.getDouble("k_x1"));
				obj.setKy1( rs.getDouble("k_y1"));
				return obj;
			}
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		return null;
	}

	public void updateCoeficienteK() {

		CoeficientesKeMi obj = new CoeficientesKeMi();

		try {
			st = DB.getConnection().prepareStatement(
					"UPDATE caso1 SET KX = ?, KY = ?, KX1 = ?, KY1 = ? WHERE Lambda = ?",
					Statement.RETURN_GENERATED_KEYS);
			st.setDouble(1, obj.getKx());
			st.setDouble(2, obj.getKy());
			st.setDouble(3, obj.getKx1());
			st.setDouble(4, obj.getKy1());

			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
		}
	}

}