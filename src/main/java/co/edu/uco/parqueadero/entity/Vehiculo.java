package co.edu.uco.parqueadero.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="propietario")
	private String propietario;
	@Column(name="placa")
	private String placa;
	@Column(name="telefono")
	private String telefono;
	@Column(name="estado")
	private String estado;
	@ManyToOne
    @JoinColumn(name="id_tipo_vehiculo")
	private TipoVehiculo tipoVehiculo;
	
	public TipoVehiculo getTipoVehiculo() {
		if (tipoVehiculo == null) {
			tipoVehiculo = new TipoVehiculo();
		}
		return tipoVehiculo;
	}

}
