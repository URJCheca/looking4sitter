package com.dad;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.dad.Usuario;


@Repository
public interface UserRepository extends JpaRepository<Usuario,Long>{

	Usuario findByLogin(String login);
	Usuario findByEmail (String email);
	Page<Usuario> findByRol(String rol,Pageable page);
	Page<Usuario> findByProvincia(String provincia,Pageable page);
	Page<Usuario> findByProvinciaIsLike(String provincia,Pageable page);
	Usuario findById(Long id);
	
	/*@Query(
			value="select * from usuario where tarifa <= ?1 and rol = ?2",
			nativeQuery = true)
	List<Usuario> findByTarifaAndRol(int tarifa,String rol);
	*/
	Page<Usuario> findByRolAndTarifaLessThan (String rol,int tarifa, Pageable page);
	/*@Query(
			value="select * from usuario where provincia like ?1 and tarifa <= ?2 and rol = ?3",
			nativeQuery = true)
	List<Usuario> findByProvinciaAndTarifaAndRol(String provincia,int tarifa,String rol);
	*/
	Page<Usuario> findByProvinciaAndRolAndTarifaLessThan (String provincia,String rol,int tarifa, Pageable page);
	/* búsqueda específica de sitters */
	
	// todos los sitters
	
//	@Query(
//			value="select * from usuario where roles = ROLE_sitter",
//			nativeQuery = true)
//	List<Usuario> findByRoles(List<String> roles);
}


