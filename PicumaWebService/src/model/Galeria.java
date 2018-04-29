package model;

public class Galeria {
	
	private int idGaleria;
	Empresa empresa = new Empresa();
	GrupoServico grupoServico = new GrupoServico();
	
	public int getIdGaleria() {
		return idGaleria;
	}
	public void setIdGaleria(int idGaleria) {
		this.idGaleria = idGaleria;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public GrupoServico getGrupoServico() {
		return grupoServico;
	}
	public void setGrupoServico(GrupoServico grupoServico) {
		this.grupoServico = grupoServico;
	}
	

}
