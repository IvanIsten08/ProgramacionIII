  DROP TABLE IF EXISTS campanias, plataformas, registro_conversiones CASCADE;

CREATE TABLE campanias (
"id_campania" SERIAL NOT NULL,
"nombre_campania" VARCHAR(100) NOT NULL,
"presupuesto" NUMERIC(10,2) NOT NULL,
"fecha_inicio" DATE NOT NULL,
PRIMARY KEY("id_campania")
);

CREATE TABLE plataformas (
"id_plataforma" SERIAL NOT NULL,
"nombre_plataforma" VARCHAR(50) NOT NULL,
"url_plataforma" VARCHAR(255) NOT NULL,
PRIMARY KEY("id_plataforma")
);

CREATE TABLE registro_conversiones (
"id_conversion" SERIAL NOT NULL,
"tipo_conversion" VARCHAR(50) NOT NULL,
"valor" NUMERIC(10,2),
"fecha_conversion" TIMESTAMP NOT NULL,
"id_campania" INT NOT NULL,
"id_plataforma" INT NOT NULL,
PRIMARY KEY("id_conversion")
);

ALTER TABLE "registro_conversiones"
ADD FOREIGN KEY("id_plataforma") REFERENCES "plataformas"("id_plataforma")
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE "registro_conversiones"
ADD FOREIGN KEY("id_campania") REFERENCES "campanias"("id_campania")
ON UPDATE NO ACTION ON DELETE NO ACTION;

INSERT INTO campanias (nombre_campania, presupuesto, fecha_inicio) VALUES ('Campania CiberFest', '8000.00', '2025-02-07'), ('Campania Navidad', '9500.00', '2025-12-01');
INSERT INTO plataformas (nombre_plataforma, url_plataforma) VALUES ('Google Ads', 'https://ads.google.com'), ('Meta Ads', 'https://www.facebook.com/ads');
INSERT INTO registro_conversiones (tipo_conversion, valor, fecha_conversion, id_campania, id_plataforma) VALUES ('Compra', '150.00', '2025-02-10 14:30:00', 1, 1), ('Registro', '0.00', '2025-12-05 09:15:00', 2, 2);

