package testeLaje.model.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import testeLaje.model.EspacamentoBitola;
import testeLaje.model.VariaveisLaje;
import testeLaje.model.db.DB;

public class EspacamentoBitolaDaoJDBC extends VariaveisLaje {

	public EspacamentoBitolaDaoJDBC() {

	}

	private PreparedStatement st;
	public EspacamentoBitola obj = new EspacamentoBitola();

	public void insert(EspacamentoBitola coeficientes) {

		try {

			st = DB.getConnection().prepareStatement(
					"INSERT INTO espacamento_bitola (bitola, espacamento, area_aco)" + "VALUES " + "(?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setDouble(1, coeficientes.getBitola());
			st.setDouble(2, coeficientes.getEspacamento());
			st.setDouble(3, coeficientes.getArea_aco());

			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
		}
	}

	public void pesquisaEspacamento(Double areaAco) {

		ResultSet rs = null;

		EspacamentoBitola espacamentoBitola = new EspacamentoBitola();

		List<EspacamentoBitola> listaEspacamentoBitola = new ArrayList<>();

		try {

			st = DB.getConnection().prepareStatement(
					"SELECT * FROM eng_civil.espacamento_bitola " + " WHERE area_aco" + " BETWEEN ? AND ?+0.3 ORDER BY area_aco");
			st.setDouble(1, areaAco);
			st.setDouble(2, areaAco);

			rs = st.executeQuery();

			while (rs.next()) {

				espacamentoBitola.setBitola(rs.getDouble("bitola"));
				espacamentoBitola.setEspacamento(rs.getDouble("espacamento"));
				espacamentoBitola.setArea_aco(rs.getDouble("area_aco"));

				listaEspacamentoBitola.add(espacamentoBitola);
				
				System.out.println(espacamentoBitola);
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

	/*
	 * public void updateCoeficienteK() {
	 * 
	 * CoeficientesKeMi obj = new CoeficientesKeMi(); _ try { st =
	 * DB.getConnection().prepareStatement(
	 * "UPDATE caso1 SET KX = ?, KY = ?, KX1 = ?, KY1 = ? WHERE Lambda = ?",
	 * Statement.RETURN_GENERATED_KEYS); st.setDouble(1, obj.getKx());
	 * st.setDouble(2, obj.getKy()); st.setDouble(3, obj.getKx1()); st.setDouble(4,
	 * obj.getKy1());
	 * 
	 * st.executeUpdate(); } catch (SQLException e) { e.printStackTrace(); } finally
	 * { DB.closeStatement(st); } }
	 */

}