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

import com.example.demo.dto.Articulo;
import com.example.demo.dto.Fabricante;
import com.example.demo.services.ArticuloServiceImpl;
import com.example.demo.services.FabricanteServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;

	/**
	 * Deveuelve todos los articulos
	 * 
	 * @return List<Articulo>
	 */
	@GetMapping("/articulos")
	public List<Articulo> allArticulo() {
		return articuloServiceImpl.getAllArticulo();
	}

	/**
	 * Devuelve un articulo en especifico
	 * 
	 * @param id
	 * @return Articulo
	 */
	@GetMapping("/articulos/{id}")
	public Articulo showArticulo(@PathVariable(name = "id") int id) {

		Articulo articulo_xid = new Articulo();

		articulo_xid = articuloServiceImpl.getIdArticulo(id);

		return articulo_xid;
	}

	/**
	 * Añade un articulo a la base de datos
	 * 
	 * @param articulo
	 * @return Articulo
	 */
	@PostMapping("/articulos")
	public Articulo newArticulo(@RequestBody Articulo articulo) {

		return articuloServiceImpl.addArticulo(articulo);
		
	}

	/**
	 * Actualiza un articulo
	 * 
	 * @param articulo
	 * @return Articulos
	 */
	@PutMapping("/articulos/{id}")
	public Articulo editArticulo(@PathVariable(name = "id") int id, @RequestBody Articulo articulo) {

		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();

		articulo_seleccionado = articuloServiceImpl.getIdArticulo(id);

		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());

		articulo_actualizado = articuloServiceImpl.updateArticulo(articulo_seleccionado);

		return articulo_actualizado;
	}

	/**
	 * Elimina un articulo
	 * 
	 * @param id
	 */
	@DeleteMapping("/articulos/{id}")
	public void eleiminarArticulo(@PathVariable(name = "id") int id) {
		articuloServiceImpl.deleteArticulo(id);
	}
}
