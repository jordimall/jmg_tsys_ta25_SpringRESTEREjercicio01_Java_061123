/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Articulo;

/**
 * 
 */
public interface IArticuloService {

	/**
	 * Deveuelve todos los articulos
	 * 
	 * @return List<Articulo>
	 */
	public List<Articulo> getAllArticulo();

	/**
	 * Devuelve un articulo en especifico
	 * 
	 * @param id
	 * @return Articulo
	 */
	public Articulo getIdArticulo(int id);

	/**
	 * Añade un articulo a la base de datos
	 * 
	 * @param articulo
	 * @return Articulo
	 */
	public Articulo addArticulo(Articulo articulo);

	/**
	 * Actualiza un articulo
	 * 
	 * @param articulo
	 * @return Articulos
	 */
	public Articulo updateArticulo(Articulo articulo);

	/**
	 * Elimina un articulo
	 * 
	 * @param id
	 */
	public void deleteArticulo(int id);
}
