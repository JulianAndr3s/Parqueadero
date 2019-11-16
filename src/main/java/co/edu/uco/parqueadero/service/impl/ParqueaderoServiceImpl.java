package co.edu.uco.parqueadero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.parqueadero.entity.TipoVehiculo;
import co.edu.uco.parqueadero.entity.Vehiculo;
import co.edu.uco.parqueadero.repository.TipoVehiculoRepository;
import co.edu.uco.parqueadero.repository.VehiculoRepository;
import co.edu.uco.parqueadero.service.ParqueaderoService;

@Service
public class ParqueaderoServiceImpl implements ParqueaderoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Autowired
	private TipoVehiculoRepository tipoVehiculoRepository;
	
	@Override
	public List<Vehiculo> listarVehiculos() {
		return vehiculoRepository.findAll();
	}

	@Override
	public List<TipoVehiculo> listarTipoVehiculos() {
		return tipoVehiculoRepository.findAll();
	}

	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		vehiculo.setTipoVehiculo(tipoVehiculoRepository.findById(vehiculo.getTipoVehiculo().getId()).orElse(null));
		vehiculoRepository.save(vehiculo);
	}

	@Override
	public Vehiculo buscarPorId(Long id) {
		return vehiculoRepository.findById(id).orElse(null);
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
	}

	@Override
	public void eliminarVehiculo(Long id) {
		vehiculoRepository.deleteById(id);
	}

}
