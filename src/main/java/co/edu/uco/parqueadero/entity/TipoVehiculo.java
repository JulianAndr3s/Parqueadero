package co.edu.uco.parqueadero.entity;


import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "tipo_vehiculo")
public class TipoVehiculo {
	
	@Id
	@Column(name="id")
	private Long id;	
	@Column(name="tipo")
	private String tipo;	
	@Column(name="cilindraje")
	private String cilindraje;

}
