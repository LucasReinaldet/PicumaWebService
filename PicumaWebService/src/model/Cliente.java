package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cliente {

	private int id;
	private String nomeCliente;
	private Calendar nascimentoCliente;
	private String cpf;
	private byte[] fotoCliente;;
	private boolean clienteAtivo;
	private Calendar desativadoEm;
	Genero genero = new Genero();
	List<Contato> contato = new ArrayList();

	private String contatosJson;

	public String getContatoJson() {
		return contatosJson;
	}

	public void setContatoJson(String contatoJson) {
		this.contatosJson = contatoJson;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Calendar getNascimentoCliente() {
		return nascimentoCliente;
	}

	public void setNascimentoCliente(Calendar nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public byte[] getFotoCliente() {
		return fotoCliente;
	}

	public void setFotoCliente(byte[] fotoCliente) {
		this.fotoCliente = fotoCliente;
	}

	public String getContatosJson() {
		return contatosJson;
	}

	public void setContatosJson(String contatosJson) {
		this.contatosJson = contatosJson;
	}

	public boolean isClienteAtivo() {
		return clienteAtivo;
	}

	public void setClienteAtivo(boolean clienteAtivo) {
		this.clienteAtivo = clienteAtivo;
	}

	public Calendar getDesativadoEm() {
		return desativadoEm;
	}

	public void setDesativadoEm(Calendar desativadoEm) {
		this.desativadoEm = desativadoEm;
	}

}
