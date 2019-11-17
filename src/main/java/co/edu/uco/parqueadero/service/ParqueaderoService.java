package co.edu.uco.parqueadero.service;

import java.util.List;

import co.edu.uco.parqueadero.entity.TipoVehiculo;
import co.edu.uco.parqueadero.entity.Vehiculo;

public interface ParqueaderoService {
	
	List<Vehiculo> listarVehiculos();
	List<TipoVehiculo> listarTipoVehiculos();
	void insertarVehiculo(Vehiculo vehiculo);
	Vehiculo buscarPorId(Long id);
	Vehiculo buscarPorPlaca(String placa);
	void actualizarVehiculo(Vehiculo vehiculo);
	void eliminarVehiculo(Long id);

}
