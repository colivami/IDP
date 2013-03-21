CREATE TABLE Propietario (
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

CREATE TABLE Concepto (
       ID_Concepto INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ClaveConcepto VARCHAR(30)
     , Descripcion VARCHAR(30)
);

CREATE TABLE Carta (
       ID_Carta INTEGER NOT NULL
     , Fecha VARCHAR(30)
     , PRIMARY KEY (ID_Carta)
);

CREATE TABLE DatosBancarios (
       ID_DatosBancarios INTEGER NOT NULL
     , Entidad VARCHAR(30)
     , NumeroCuenta VARCHAR(30)
     , PRIMARY KEY (ID_DatosBancarios)
);

CREATE TABLE Comunidad (
       ID_Comunidad INTEGER NOT NULL
     , Calle VARCHAR(30)
     , MaxRecibosPendientes INTEGER
     , Estado VARCHAR(30)
     , ID_Inmueble_Presidente INTEGER
     , PRIMARY KEY (ID_Comunidad)
);

CREATE TABLE NotaInformativa (
       ID_NotaInformativa INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaCalculo VARCHAR(30)
     , ImporteNota FLOAT
     , ID_Comunidad INTEGER
);

CREATE TABLE Factura (
       NumFactura INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ID_Comunidad INTEGER
     , FechaFactura VARCHAR(30)
     , ID_NotaInformativa INTEGER
);

CREATE TABLE Inmueble (
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

CREATE TABLE ReciboInmueble (
       ID_ReciboInmueble INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaPago VARCHAR(30)
     , Importe FLOAT
     , ID_Inmueble INTEGER
     , ID_NotaInformativa INTEGER
     , ID_Carta INTEGER
);

CREATE TABLE LineaFactura (
       ID_LineaFactura INTEGER IDENTITY PRIMARY KEY
     , ImporteLinea FLOAT
     , Observacion VARCHAR(30)
     , NumFactura INTEGER
     , ID_Concepto INTEGER
);

ALTER TABLE Comunidad
  ADD CONSTRAINT FK_Comunidad_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES Comunidad (ID_Comunidad);

ALTER TABLE NotaInformativa
  ADD CONSTRAINT FK_NotaInformativa_2
      FOREIGN KEY (ID_Comunidad)
      REFERENCES Comunidad (ID_Comunidad);

ALTER TABLE Factura
  ADD CONSTRAINT FK_Factura_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES Comunidad (ID_Comunidad);

ALTER TABLE Factura
  ADD CONSTRAINT FK_Factura_2
      FOREIGN KEY (ID_NotaInformativa)
      REFERENCES NotaInformativa (ID_NotaInformativa);

ALTER TABLE Inmueble
  ADD CONSTRAINT FK_Inmueble_2
      FOREIGN KEY (ID_DatosBancarios)
      REFERENCES DatosBancarios (ID_DatosBancarios);

ALTER TABLE Inmueble
  ADD CONSTRAINT FK_Inmueble_3
      FOREIGN KEY (ID_Propietario)
      REFERENCES Propietario (ID_Propietario);

ALTER TABLE Inmueble
  ADD CONSTRAINT FK_Inmueble_4
      FOREIGN KEY (ID_Comunidad)
      REFERENCES Comunidad (ID_Comunidad);

ALTER TABLE ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_1
      FOREIGN KEY (ID_NotaInformativa)
      REFERENCES NotaInformativa (ID_NotaInformativa)
   ON DELETE CASCADE;

ALTER TABLE ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_2
      FOREIGN KEY (ID_Inmueble)
      REFERENCES Inmueble (ID_Inmueble);

ALTER TABLE ReciboInmueble
  ADD CONSTRAINT FK_ReciboInmueble_3
      FOREIGN KEY (ID_Carta)
      REFERENCES Carta (ID_Carta);

ALTER TABLE LineaFactura
  ADD CONSTRAINT FK_LineaFactura_1
      FOREIGN KEY (NumFactura)
      REFERENCES Factura (NumFactura)
   ON DELETE CASCADE;

ALTER TABLE LineaFactura
  ADD CONSTRAINT FK_LineaFactura_2
      FOREIGN KEY (ID_Concepto)
      REFERENCES Concepto (ID_Concepto);

