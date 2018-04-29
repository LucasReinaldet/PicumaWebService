package control;

import com.google.gson.Gson;

import dao.LoginDao;
import model.Login;

public class LoginControl {

	public Login realizarLogin(String dados) {
		
		LoginDao loginDao = new LoginDao();
		Login login = new Login();
		Gson gson = new Gson();		
		Login resultado = new Login();
		
		login = gson.fromJson(dados.replace("\"", "'"), Login.class);
		try {
			
			resultado = loginDao.realizarLogin(login);

		} catch (Exception e) {
			
			System.out.println("Erro ao realizar Login, LoginControl" + e);
		}		
		
		return resultado;
	}

}
