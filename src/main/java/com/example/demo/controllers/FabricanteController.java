/**
 * 
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Fabricante;
import com.example.demo.services.FabricanteServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;

	/**
	 * Deveuelve todos los fabricantes
	 * 
	 * @return List<Fabricante>
	 */
	@GetMapping("/fabricantes")
	public List<Fabricante> allFabricantes() {
		return fabricanteServiceImpl.getAllFabricante();
	}

	/**
	 * Devuelve un fabricante en especifico
	 * 
	 * @param id
	 * @return Fabricante
	 */
	@GetMapping("/fabricantes/{id}")
	public Fabricante showFabricante(@PathVariable(name = "id") int id) {

		Fabricante fabricante_xid = new Fabricante();

		fabricante_xid = fabricanteServiceImpl.getIdFabricante(id);

		return fabricante_xid;
	}

	/**
	 * Añade un fabricante a la base de datos
	 * 
	 * @param fabricante
	 * @return Fabricante
	 */
	@PostMapping("/fabricantes")
	public Fabricante newFabricante(@RequestBody Fabricante fabricante) {

		return fabricanteServiceImpl.addFabricante(fabricante);
	}

	/**
	 * Actualiza un fabricante
	 * 
	 * @param fabricante
	 * @return Fabricante
	 */
	@PutMapping("/fabricantes/{id}")
	public Fabricante editFabricante(@PathVariable(name = "id") int id, @RequestBody Fabricante fabricante) {

		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();

		fabricante_seleccionado = fabricanteServiceImpl.getIdFabricante(id);

		fabricante_seleccionado.setNombre(fabricante.getNombre());

		fabricante_actualizado = fabricanteServiceImpl.updateFabricante(fabricante_seleccionado);

		return fabricante_actualizado;
	}

	/**
	 * Elimina un fabricante
	 * 
	 * @param id
	 */
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminarFabricante(@PathVariable(name = "id") int id) {
		fabricanteServiceImpl.deleteFabricante(id);
	}

}
