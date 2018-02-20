package com.dad;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.dad.Usuarios;

/*
@Repository
public interface UserRepository extends JpaRepository<Usuarios,Long>{

	List<Usuarios> findByLogin(String login,Pageable page);
	List<Usuarios> findByEmail (String email,Pageable page);
	List<Usuarios> findByProvincia(String provincia);
	List<Usuarios> findByProvinciaIsLike(String provincia);
	List<Usuarios> findById(Long id);
	
	@Query(
			value="select * from usuarios where Tarifa <= ?1",
			nativeQuery = true)
	Page<Usuarios> findByTarifa(int tarifa,Pageable page);
	
	@Query(
			value="select * from usuarios where Provincia like ?1 and Tarifa <= ?2",
			nativeQuery = true)
	List<Usuarios> findByProvinciaAndTarifa(String provincia,int tarifa);

}
*/


@Repository
public interface UserRepository extends CrudRepository<Usuarios,Long>{
List<Usuarios> findByLogin(String login);
	List<Usuarios> findByEmail (String email);
	List<Usuarios> findByProvincia(String provincia);
	List<Usuarios> findByProvinciaIsLike(String provincia);
	List<Usuarios> findById(Long id);
	
	@Query(
			value="select * from usuarios where Tarifa <= ?1",
			nativeQuery = true)
	List<Usuarios> findByTarifa(int tarifa);
	
	
	//@Query(
	//		value="select * from usuarios where 1=1 ?1 ?2",
	//		nativeQuery = true)
	//List<Usuarios> findByProvinciaAndTarifa(String provincia,String tarifa);
	
	@Query(
			value="select * from usuarios where Provincia like ?1 and Tarifa <= ?2",
			nativeQuery = true)
	List<Usuarios> findByProvinciaAndTarifa(String provincia,int tarifa);
	
}

