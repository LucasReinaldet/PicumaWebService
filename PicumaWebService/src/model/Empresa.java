package model;

import java.util.Calendar;

public class Empresa {
	
	private int idEmpresa;
	private String nomeFantasia;
	private String cnpjEmpresa;
	private String descricaoEmpresa;
	private Byte logoEmpresa;
	private boolean empresaAtivada;
	private Calendar desativadaEm;
	AreaAtuacao areaAtuacao = new  AreaAtuacao();
	Endereco endereco = new Endereco();
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}
	public String getDescricaoEmpresa() {
		return descricaoEmpresa;
	}
	public void setDescricaoEmpresa(String descricaoEmpresa) {
		this.descricaoEmpresa = descricaoEmpresa;
	}
	public Byte getLogoEmpresa() {
		return logoEmpresa;
	}
	public void setLogoEmpresa(Byte logoEmpresa) {
		this.logoEmpresa = logoEmpresa;
	}
	public boolean isEmpresaAtivada() {
		return empresaAtivada;
	}
	public void setEmpresaAtivada(boolean empresaAtivada) {
		this.empresaAtivada = empresaAtivada;
	}
	public Calendar getDesativadaEm() {
		return desativadaEm;
	}
	public void setDesativadaEm(Calendar desativadaEm) {
		this.desativadaEm = desativadaEm;
	}
	public AreaAtuacao getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	

}
