package model;

public class ServicoPrestado {
	
	private int idServicoPrestado;
	private Double valorServico;
	private int tempoAproxServico;
	private String informacoesServico;
	Servico servico = new Servico();
	Empresa empresa = new Empresa();
	Funcionario funcionario = new Funcionario();
	
	public int getIdServicoPrestado() {
		return idServicoPrestado;
	}
	public void setIdServicoPrestado(int idServicoPrestado) {
		this.idServicoPrestado = idServicoPrestado;
	}
	public Double getValorServico() {
		return valorServico;
	}
	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}
	public int getTempoAproxServico() {
		return tempoAproxServico;
	}
	public void setTempoAproxServico(int tempoAproxServico) {
		this.tempoAproxServico = tempoAproxServico;
	}
	public String getInformacoesServico() {
		return informacoesServico;
	}
	public void setInformacoesServico(String informacoesServico) {
		this.informacoesServico = informacoesServico;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
