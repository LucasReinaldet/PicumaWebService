package servicos;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import control.ClienteControl;
import control.EmpresaControl;
import control.LoginControl;
import model.Login;
import util.Constantes;

@Path(Constantes.PATH_SERVICOS_OFERTADOS)
public class ServicosOfertados {

	private boolean resultado = false;

	@POST
	@Path(Constantes.PATH_CADASTRO_CLIENTE)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public boolean cadastroCliente(String dados) {
		
		ClienteControl clienteControl = new ClienteControl();
		
		if (dados != null) {

			resultado = clienteControl.cadastrarCliente(dados);
		}

		return resultado;
	}

	@POST
	@Path(Constantes.PATH_CADASTRO_EMPRESA)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public boolean cadastroEmpresa(String dados) {
		
		EmpresaControl empresaControl = new EmpresaControl();
		
		if (dados != null) {

			resultado = empresaControl.cadastrarEmpresa(dados);
		}

		return resultado;
	}

	@POST
	@Path(Constantes.PATH_REALIZAR_LOGIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Login realizarLogin(String dados) {
		
		LoginControl loginControl = new LoginControl();
		Login resultado = new Login();

		if (dados != null) {
			
			resultado = loginControl.realizarLogin(dados);

		}
		return resultado;

	}
}
