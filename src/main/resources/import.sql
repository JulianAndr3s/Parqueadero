INSERT INTO public.tipo_vehiculo(id, tipo, cilindraje) VALUES (1, 'Carro', 'Cualquiera');
INSERT INTO public.tipo_vehiculo(id, tipo, cilindraje) VALUES (2, 'Moto Alto Cilindraje', 'Alto');
INSERT INTO public.tipo_vehiculo(id, tipo, cilindraje) VALUES (3, 'Moto Bajo Cilindraje', 'Bajo');


/*Datos de la tabla ROL*/

INSERT INTO rol( id, nombre)  VALUES (1, 'administrador');
INSERT INTO rol( id, nombre)  VALUES (2, 'transaccional');

/*Datos de la tabla USUARIO*/
INSERT INTO usuario( id, enabled, password, username )  VALUES (1, true, '$2a$10$sQMeBn25tCfmTrQ5dIo0BuZUyK0YNS.6IfbEwJ31teTx/gQ56pFny', 'julian');
INSERT INTO usuario( id, enabled, password, username )  VALUES (2, true, '$2a$10$aVqhjdxObIAnR2LMusPPX.DXvHLBsXUaZfQwcHX2a8bhURfdcHZg6', 'visitante');

/*Datos de la tabla USUARIO_ROL*/
INSERT INTO usuario_rol( user_id, rol_id)  VALUES (1, 1);
INSERT INTO usuario_rol( user_id, rol_id)  VALUES (2, 2);