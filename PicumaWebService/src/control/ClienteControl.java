package control;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import dao.ClienteDao;
import model.Login;
import util.MetodosUteis;

public class ClienteControl extends MetodosUteis {

	private ClienteDao clienteDao;
	private boolean resultado = false;

	public boolean cadastrarCliente(String dados) {
		Login login = new Login();
		Gson gson = new Gson();

		clienteDao = new ClienteDao();
		try {

			login = gson.fromJson(dados.replace("\"", "'"), Login.class);

			resultado = clienteDao.cadastrar(transformaVetorStringToArray(
					MetodosUteis.transformaListContatoToVetorString(login.getCliente().getContato())), login);

		} catch (IllegalStateException | JsonSyntaxException exception) {
			System.out.println("Erro na Classe ClienteControl, ao passar objeto Json para Cliente. " + exception);
		}
		return resultado;
	}

}