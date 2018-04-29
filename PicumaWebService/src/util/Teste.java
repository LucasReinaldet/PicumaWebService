package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.google.gson.Gson;

import control.ClienteControl;
import dao.ClienteDao;
import model.Cliente;
import model.Contato;
import model.Genero;
import model.Login;
import model.TipoContato;

public class Teste {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Genero genero = new Genero();
		Login login = new Login();
		List<Contato> contatos = new ArrayList<Contato>();
		Contato contato = new Contato();
		TipoContato tipoContato = new TipoContato();
		ClienteDao dao = new ClienteDao();
 		ClienteControl control = new ClienteControl();
		MetodosUteis mu = new MetodosUteis();
		boolean resultado = false;

		Calendar calender = Calendar.getInstance();

		calender.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);

		tipoContato.setIdTipoContato(1);

		contato.setContato("sdasd");
		contato.setTipoContato(tipoContato);
		contatos.add(contato);
		
		contato.setContato("fgdfgdfgdf");
		contato.setTipoContato(tipoContato);
		contatos.add(contato);

		genero.setIdGereno(1);

		cliente.setNomeCliente("junior");
		cliente.setNascimentoCliente(calender);
		cliente.setGenero(genero);
		cliente.setContato(contatos);
		cliente.setCpf("15646768231231");

		File file = new File("beyonce.jpg");
		int tam = (int) file.length();
		byte[] fileArray = new byte[tam];
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			fis.read(fileArray, 0, tam);
		} catch (Exception e) {
			System.out.println(e);
		}
		cliente.setFotoCliente(fileArray);
		
		login.setLoginGoogle("idGooge");
		login.setUsuario("christiafoz9332");
		login.setSenha("christianfoz55226 ");
		login.setCliente(cliente);

		Gson gson = new Gson();
		String aux = gson.toJson(login).toString();
		System.out.println(aux);

//		 resultado = dao.cadastrar(mu.transformaVetorStringToArray(MetodosUteis.transformaListContatoToVetorString(contatos)), login);
//		 System.out.println(resultado);
	}
}
