/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Fabricante;

/**
 * 
 */
public interface IFabricanteService {

	/**
	 * Deveuelve todos los fabricantes
	 * 
	 * @return List<Fabricante>
	 */
	public List<Fabricante> getAllFabricante();

	/**
	 * Devuelve un fabricante en especifico
	 * 
	 * @param id
	 * @return Fabricante
	 */
	public Fabricante getIdFabricante(int id);

	/**
	 * Añade un fabricante a la base de datos
	 * 
	 * @param fabricante
	 * @return Fabricante
	 */
	public Fabricante addFabricante(Fabricante fabricante);

	/**
	 * Actualiza un fabricante
	 * 
	 * @param fabricante
	 * @return Fabricante
	 */
	public Fabricante updateFabricante(Fabricante fabricante);

	/**
	 * Elimina un fabricante
	 * 
	 * @param id
	 */
	public void deleteFabricante(int id);
}
