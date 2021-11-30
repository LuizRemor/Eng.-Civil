package testeLaje.model.dao;

import java.sql.SQLException;
import java.util.List;

import testeLaje.model.Coeficientes;

public interface CoeficientesDao {
	
	void insert(Coeficientes obj);
	void updateCoeficienteK() throws SQLException;
	Coeficientes pesquisaCoeficientes(Double caso, Double Lambda);
	List <Coeficientes> findAll();

}