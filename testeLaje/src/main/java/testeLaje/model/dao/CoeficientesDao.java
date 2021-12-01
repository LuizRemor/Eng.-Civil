package testeLaje.model.dao;

import java.sql.SQLException;
import java.util.List;

import testeLaje.model.CoeficientesKeMi;

public interface CoeficientesDao {
	
	void insert(CoeficientesKeMi obj);
	void updateCoeficienteK() throws SQLException;
	CoeficientesKeMi pesquisaCoeficientes(Double caso, Double Lambda);
	List <CoeficientesKeMi> findAll();

}