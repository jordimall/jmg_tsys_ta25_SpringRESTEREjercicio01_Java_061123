/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

/**
 * 
 */
public class ArticuloServiceImpl {

	@Autowired
	IArticuloDAO daoArticulo;

	/**
	 * Deveuelve todos los articulos
	 * 
	 * @return List<Articulo>
	 */
	public List<Articulo> getAllArticulo() {
		return daoArticulo.findAll();
	}

	/**
	 * Devuelve un articulo en especifico
	 * 
	 * @param id
	 * @return Articulo
	 */
	public Articulo getIdArticulo(int id) {
		return daoArticulo.findById(id).get();
	}

	/**
	 * Añade un articulo a la base de datos
	 * 
	 * @param articulo
	 * @return Articulo
	 */
	public Articulo addArticulo(Articulo articulo) {
		return daoArticulo.save(articulo);
	}

	/**
	 * Actualiza un articulo
	 * 
	 * @param articulo
	 * @return Articulos
	 */
	public Articulo updateArticulo(Articulo articulo) {
		return daoArticulo.save(articulo);
	}

	/**
	 * Elimina un articulo
	 * 
	 * @param id
	 */
	public void deleteArticulo(int id) {
		daoArticulo.deleteById(id);
	}
}
