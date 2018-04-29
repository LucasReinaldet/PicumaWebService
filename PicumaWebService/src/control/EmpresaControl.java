package control;

import java.sql.Array;
import java.util.List;

import dao.EmpresaDao;
import model.Contato;
import model.Empresa;
import model.Genero;
import model.HorarioEmpresa;
import util.MetodosUteis;

public class EmpresaControl extends MetodosUteis {

	private EmpresaDao empresaDao;
	private Empresa empresa;
	private boolean resultado;
	Array arrayContatos = null;
	Array arrayGenero = null;
	Array arrayHorarioEmpresa = null;
	
	public boolean cadastrarEmpresa(String dados) {
		
	
			
//			arrayContatos = this.transformaVetorStringToArray(transformaListContatoToVetorString(listContato));
//			arrayGenero = this.transformaVetorIntToArray(transformaListGeneroToVetorInt(listGenero));
//			
//
//		
		return resultado;
	}


}
