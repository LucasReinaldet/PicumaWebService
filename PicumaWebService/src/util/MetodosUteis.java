package util;

import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.List;

import model.Contato;
import model.Genero;

public class MetodosUteis {
	
	public static String[] transformaListContatoToVetorString(List<Contato> dados) {
		int cont = 0;
		String[] dadosAlterados = new String[dados.size() * 2];
		
		for(Contato contato : dados) {
		
		dadosAlterados[cont] = contato.getContato();
		dadosAlterados[cont + 1] = String.valueOf(contato.getTipoContato().getIdTipoContato());
		
		cont+=2;
		}
		return dadosAlterados;

	}
	
	public Array transformaVetorStringToArray(String[] dados) {

		Connection obj = new Conexao().getConexao();

		Array dadosProntos = null;
		

		try {
			dadosProntos = obj.createArrayOf("VARCHAR", dados);
			obj.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dadosProntos;
	}
	
	public static String formatarDinheiro(Double valor) {

		NumberFormat valorFormatado = NumberFormat.getCurrencyInstance();

		return valorFormatado.format(valor);

	}
	
	public String[] transformaListGeneroToVetorInt(List <Genero> listGenero) {
		
		
		return null;
	}

	public static Array transformaVetorIntToArray(String[] dados) {
		// TODO Auto-generated method stub
		return null;
	}

}
