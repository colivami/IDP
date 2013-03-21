-- Tables are not sorted because: 
-- Circular reference between DEFAULT_SCHEMA.Inmueble and DEFAULT_SCHEMA.Comunidad
-- Try generating Foreign Keys with ALTER TABLE statements.
CREATE TABLE DEFAULT_SCHEMA.Comunidad (
       ID_Comunidad INTEGER NOT NULL
     , Calle VARCHAR(30)
     , MaxRecibosPendientes INTEGER
     , Estado VARCHAR(30)
     , ID_Inmueble_Presidente INTEGER
     , PRIMARY KEY (ID_Comunidad)
);

CREATE TABLE DEFAULT_SCHEMA.Factura (
       NumFactura INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ID_Comunidad INTEGER
     , FechaFactura VARCHAR(30)
     , ID_NotaInformativa INTEGER
);

CREATE TABLE DEFAULT_SCHEMA.NotaInformativa (
       ID_NotaInformativa INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaCalculo VARCHAR(30)
     , ImporteNota FLOAT
     , ID_Comunidad INTEGER
);

CREATE TABLE DEFAULT_SCHEMA.Inmueble (
       ID_Inmueble INTEGER NOT NULL
     , Escalera VARCHAR(30)
     , Piso VARCHAR(30)
     , Puerta VARCHAR(30)
     , Porcentaje FLOAT
     , ID_Comunidad INTEGER
     , ID_Propietario INTEGER
     , ID_DatosBancarios INTEGER
     , PRIMARY KEY (ID_Inmueble)
);

CREATE TABLE DEFAULT_SCHEMA.DatosBancarios (
       ID_DatosBancarios INTEGER NOT NULL
     , Entidad VARCHAR(30)
     , NumeroCuenta VARCHAR(30)
     , PRIMARY KEY (ID_DatosBancarios)
);

CREATE TABLE DEFAULT_SCHEMA.Propietario (
       ID_Propietario INTEGER NOT NULL
     , NIF VARCHAR(30)
     , Nombre VARCHAR(30)
     , Direccion VARCHAR(30)
     , Poblacion VARCHAR(30)
     , Telefono VARCHAR(30)
     , Observaciones VARCHAR(100)
     , FechaAlta VARCHAR(30)
     , PRIMARY KEY (ID_Propietario)
);

CREATE TABLE DEFAULT_SCHEMA.ReciboInmueble (
       ID_ReciboInmueble INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaPago VARCHAR(30)
     , Importe FLOAT
     , ID_Inmueble INTEGER
     , ID_NotaInformativa INTEGER
     , ID_Carta INTEGER
);

CREATE TABLE DEFAULT_SCHEMA.LineaFactura (
       ID_LineaFactura INTEGER IDENTITY PRIMARY KEY
     , ImporteLinea FLOAT
     , Observacion VARCHAR(30)
     , NumFactura INTEGER
     , ID_Concepto INTEGER
);

CREATE TABLE DEFAULT_SCHEMA.Concepto (
       ID_Concepto INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ClaveConcepto VARCHAR(30)
     , Descripcion VARCHAR(30)
);

CREATE TABLE DEFAULT_SCHEMA.Carta (
       ID_Carta INTEGER NOT NULL
     , Fecha VARCHAR(30)
     , PRIMARY KEY (ID_Carta)
);

ALTER TABLE DEFAULT_SCHEMA.Comunidad
  ADD CONSTRAINT FK_Comunidad_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.Comunidad
  ADD CONSTRAINT FK_Comunidad_2
      FOREIGN KEY (ID_Inmueble_Presidente)
      REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble);

ALTER TABLE DEFAULT_SCHEMA.Factura
  ADD CONSTRAINT FK_Factura_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.Factura
  ADD CONSTRAINT FK_Factura_2
      FOREIGN KEY (ID_NotaInformativa)
      REFERENCES DEFAULT_SCHEMA.NotaInformativa (ID_NotaInformativa);

ALTER TABLE DEFAULT_SCHEMA.NotaInformativa
  ADD CONSTRAINT FK_NotaInformativa_2
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.Inmueble
  ADD CONSTRAINT FK_Inmueble_2
      FOREIGN KEY (ID_DatosBancarios)
      REFERENCES DEFAULT_SCHEMA.DatosBancarios (ID_DatosBancarios);

ALTER TABLE DEFAULT_SCHEMA.Inmueble
  ADD CONSTRAINT FK_Inmueble_3
      FOREIGN KEY (ID_Propietario)
      REFERENCES DEFAULT_SCHEMA.Propietario (ID_Propietario);

ALTER TABLE DEFAULT_SCHEMA.Inmueble
  ADD CONSTRAINT FK_Inmueble_4
      FOREIGN KEY (ID_Comunidad)
      REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad);

ALTER TABLE DEFAULT_SCHEMA.ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_1
      FOREIGN KEY (ID_NotaInformativa)
      REFERENCES DEFAULT_SCHEMA.NotaInformativa (ID_NotaInformativa)
   ON DELETE CASCADE;

ALTER TABLE DEFAULT_SCHEMA.ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_2
      FOREIGN KEY (ID_Inmueble)
      REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble);

ALTER TABLE DEFAULT_SCHEMA.ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_3
      FOREIGN KEY (ID_Carta)
      REFERENCES DEFAULT_SCHEMA.Carta (ID_Carta);

ALTER TABLE DEFAULT_SCHEMA.LineaFactura
  ADD CONSTRAINT FK_LineaFactura_1
      FOREIGN KEY (NumFactura)
      REFERENCES DEFAULT_SCHEMA.Factura (NumFactura)
   ON DELETE CASCADE;

ALTER TABLE DEFAULT_SCHEMA.LineaFactura
  ADD CONSTRAINT FK_LineaFactura_2
      FOREIGN KEY (ID_Concepto)
      REFERENCES DEFAULT_SCHEMA.Concepto (ID_Concepto);

