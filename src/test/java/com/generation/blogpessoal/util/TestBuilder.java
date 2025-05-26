package com.generation.blogpessoal.util;

import com.generation.blogpessoal.model.Usuario;
import com.generation.blogpessoal.model.UsuarioLogin;

public class TestBuilder {

	public static Usuario criarUsuario(Long id, String nome, String usuario, String senha) {
		Usuario objUsuario = new Usuario();
		objUsuario.setId(id);
		objUsuario.setNome(nome);
		objUsuario.setUsuario(usuario);
		objUsuario.setSenha(senha);
		
		return objUsuario;
	}
	
	public static Usuario criarUsuarioRoot() {
		return criarUsuario(null, "Root", "root@email.com", "rootroot");
	}
	
	public static UsuarioLogin criarUsuarioLogin(String usuario, String senha) {
		UsuarioLogin objUsuarioLogin = new UsuarioLogin();
		
		objUsuarioLogin.setUsuario(usuario);
		objUsuarioLogin.setSenha(senha);
		
		return objUsuarioLogin;
	}
}
