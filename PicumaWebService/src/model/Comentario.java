package model;

import java.util.Calendar;

public class Comentario {
	
	private int idComentario;
	private Calendar dataComentario;
	private String comentario;
	private boolean comentarioAtivado;
	Cliente cliente = new Cliente();
	Empresa empresa = new Empresa();
	
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public Calendar getDataComentario() {
		return dataComentario;
	}
	public void setDataComentario(Calendar dataComentario) {
		this.dataComentario = dataComentario;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public boolean isComentarioAtivado() {
		return comentarioAtivado;
	}
	public void setComentarioAtivado(boolean comentarioAtivado) {
		this.comentarioAtivado = comentarioAtivado;
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
