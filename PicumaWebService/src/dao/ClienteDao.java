package dao;

import java.sql.Array;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Login;
import util.Conexao;

public class ClienteDao {

	public boolean cadastrar(Array dados, Login login) {

		Conexao conexao = new Conexao();
		boolean cadastrado = false;
		PreparedStatement stm = null;
		ResultSet result = null;

		String sql = "SELECT * FROM cadastro_dados_cliente(?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {

			stm = conexao.getConexao().prepareStatement(sql);
			stm.setString(1, login.getCliente().getNomeCliente());
			stm.setDate(2, new Date(login.getCliente().getNascimentoCliente().getTimeInMillis()));
			stm.setString(3, login.getCliente().getCpf());
			stm.setBytes(4, login.getCliente().getFotoCliente());
			stm.setInt(5, login.getCliente().getGenero().getIdGereno());
			stm.setArray(6, dados);
			stm.setString(7, login.getUsuario());
			stm.setString(8, login.getSenha());
			stm.setString(9, login.getLoginGoogle());

			cadastrado = stm.execute();
			stm.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conexao.desconectar();
		}

		return cadastrado;
	}

	public List<Cliente> consultaGeral() {

		List<Cliente> clientes = new ArrayList<>();

		String sql = "";

		return clientes;
	}

}
