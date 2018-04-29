package model;

public class Funcionario {
	
	private int idFuncionario;
	private String nomeFuncionario;
	private  Byte fotoFuncionario;
	Empresa empresa = new Empresa();
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public Byte getFotoFuncionario() {
		return fotoFuncionario;
	}
	public void setFotoFuncionario(Byte fotoFuncionario) {
		this.fotoFuncionario = fotoFuncionario;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
