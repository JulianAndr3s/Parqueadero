package co.edu.uco.parqueadero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.uco.parqueadero.entity.TipoVehiculo;
import co.edu.uco.parqueadero.entity.Vehiculo;
import co.edu.uco.parqueadero.service.ParqueaderoService;

@RestController
@RequestMapping("/parqueadero")
public class ParqueaderoController {

	@Autowired
	private ParqueaderoService parqueaderoService;
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> listarVehiculos(){
		return parqueaderoService.listarVehiculos();
	}
	
	@GetMapping("/tipovehiculos")
	public List<TipoVehiculo> listarTipoVehiculos(){
		return parqueaderoService.listarTipoVehiculos();
	}
	
	@PostMapping("/insertar")
	public void insertarVehiculo(@RequestBody Vehiculo vehiculo) {
		parqueaderoService.insertarVehiculo(vehiculo);
	}
	
	@GetMapping("/{id}/buscar")
	public Vehiculo buscarPorId(@PathVariable Long id) {
		return parqueaderoService.buscarPorId(id);
	}
	
	@PutMapping("/{id}/actualizar")
	public void actualizarVehiculo(@RequestBody Vehiculo vehiculo, @PathVariable Long id) {
		vehiculo.setId(id);
		parqueaderoService.actualizarVehiculo(vehiculo);
	}
	
	@DeleteMapping("/{id}/eliminar")
	public void eliminarVehiculo(@PathVariable Long id) {
		parqueaderoService.eliminarVehiculo(id);
	}
	
	
}
