package com.dad;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Relusuariosperfiles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long idperfil;
	private Long idusuario;
	
	
	
	public Relusuariosperfiles() {}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getIdperfil() {
		return idperfil;
	}


	public void setIdperfil(Long idperfil) {
		this.idperfil = idperfil;
	}


	public Long getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}


	@Override
	public String toString() {
		return "Relación [Perfil="+this.idperfil.toString()+",Usuarios="+this.idusuario.toString()+"]";
	}
	
	
	
}
