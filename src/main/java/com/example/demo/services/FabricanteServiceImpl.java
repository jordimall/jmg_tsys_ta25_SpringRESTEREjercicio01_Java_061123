/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

/**
 * 
 */
@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	@Autowired
	IFabricanteDAO daoFabricante;
	
	/**
	 * Deveuelve todos los fabricantes
	 * 
	 * @return List<Fabricante>
	 */
	public List<Fabricante> getAllFabricante(){
		return daoFabricante.findAll();
	}

	/**
	 * Devuelve un fabricante en especifico
	 * 
	 * @param id
	 * @return Fabricante
	 */
	public Fabricante getIdFabricante(int id) {
		return daoFabricante.findById(id).get();
	};

	/**
	 * Añade un fabricante a la base de datos
	 * 
	 * @param fabricante
	 * @return Fabricante
	 */
	public Fabricante addFabricante(Fabricante fabricante) {
		return daoFabricante.save(fabricante);
	}

	/**
	 * Actualiza un fabricante
	 * 
	 * @param fabricante
	 * @return Fabricante
	 */
	public Fabricante updateFabricante(Fabricante fabricante) {
		return daoFabricante.save(fabricante);
	};

	/**
	 * Elimina un fabricante
	 * 
	 * @param id
	 */
	public void deleteFabricante(int id) {
		daoFabricante.deleteById(id);
	}

}
