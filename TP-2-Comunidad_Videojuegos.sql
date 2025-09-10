-- DROP IF EXISTS 

CREATE TABLE usuarios (
    "id_usuario" SERIAL NOT NULL,
    "nombre_usuario" VARCHAR(50),
    "fecha_registro" DATE,
    PRIMARY KEY("id_usuario")
)

CREATE TABLE publicaciones (
    "id_publicacion" SERIAL,
    "contenido" TEXT,
    "fecha_publicacion" TIMESTAMP,
    "autor_de_post" INT NOT NULL,
    FOREIGN KEY("autor_de_post") REFERENCES usuarios("id_usuario"),
    PRIMARY KEY("id_publicacion")
)

CREATE TABLE tabla_de_reacciones (
    "id_reaccion" SERIAL,
    "tipo_reaccion" VARCHAR(20),
    "fecha_reaccion" TIMESTAMP,
    "id_usuario" INT NOT NULL,
    "id_publicacion" INT NOT NULL,
    FOREIGN KEY("id_usuario") REFERENCES usuarios("id_usuario"),
    FOREIGN KEY("id_publicacion") REFERENCES publicaciones("id_publicacion"),
    PRIMARY KEY("id_reaccion")
)
CREATE TABLE comentarios (
    "id_comentario" SERIAL,
    "contenido_comentario" TEXT,
    "fecha_comentario" TIMESTAMP,
    "id_usuario" INT NOT NULL,
    "id_publicacion" INT NOT NULL,
    FOREIGN KEY("id_usuario") REFERENCES usuarios("id_usuario"),
    FOREIGN KEY("id_publicacion") REFERENCES publicaciones("id_publicacion"),
    PRIMARY KEY("id_comentario")
)

INSERT INTO usuarios (nombre_usuario, fecha_registro) VALUES
('GamerPro', '2023-01-15'),
('PixelMaster', '2023-02-20'),
('ArcadeQueen', '2023-03-05');
INSERT INTO publicaciones (contenido, fecha_publicacion, autor_de_post) VALUES
('¡Acabo de terminar mi juego favorito!', '2023-04-01 10:00:00', 1),
('¿Alguien ha probado el nuevo juego de aventuras?', '2023-04-02 14:30:00', 2),
('Me encanta la música de los videojuegos retro.', '2023-04-03 09:15:00', 3);
INSERT INTO tabla_de_reacciones (tipo_reaccion, fecha_reaccion, id_usuario, id_publicacion) VALUES
('Me gusta', '2023-04-01 11:00:00', 2, 1),
('Me encanta', '2023-04-02 15:00:00', 3, 2),
('Me gusta', '2023-04-03 10:00:00', 1, 3);
INSERT INTO comentarios (contenido_comentario, fecha_comentario, id_usuario, id_publicacion) VALUES
('¡Felicidades! ¿Cuál es tu juego favorito?', '2023-04-01 12:00:00', 2, 1),
('Sí, lo probé y es increíble.', '2023-04-02 16:00:00', 3, 2),
('La música retro es la mejor.', '2023-04-03 11:00:00', 1, 3);