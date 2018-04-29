package model;

import java.util.Calendar;

public class HorarioMarcado {
	
	private int idhorarioMarcado;
	private Calendar horarioInicio;
	private Calendar horarioFim;
	private Calendar dataMarcada;
	private boolean corfirmado;
	Cliente cliente = new Cliente();
	Empresa empresa = new Empresa();
	
	public int getIdhorarioMarcado() {
		return idhorarioMarcado;
	}
	public void setIdhorarioMarcado(int idhorarioMarcado) {
		this.idhorarioMarcado = idhorarioMarcado;
	}
	public Calendar getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(Calendar horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public Calendar getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(Calendar horarioFim) {
		this.horarioFim = horarioFim;
	}
	public Calendar getDataMarcada() {
		return dataMarcada;
	}
	public void setDataMarcada(Calendar dataMarcada) {
		this.dataMarcada = dataMarcada;
	}
	public boolean isCorfirmado() {
		return corfirmado;
	}
	public void setCorfirmado(boolean corfirmado) {
		this.corfirmado = corfirmado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	

}
