package co.edu.uco.parqueadero.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uco.parqueadero.entity.security.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findByUsername(String username);

}
