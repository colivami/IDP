CREATE TABLE Comunidad (
       ID_Comunidad INTEGER NOT NULL
     , Calle VARCHAR(30)
     , MaxRecibosPendientes INTEGER
     , Estado VARCHAR(30)
     , ID_Inmueble_Presidente INTEGER
     , PRIMARY KEY (ID_Comunidad)
);

CREATE TABLE Factura (
       NumFactura INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ID_Comunidad INTEGER NOT NULL
     , FechaFactura VARCHAR(30)
     , CONSTRAINT FK_Factura_1 FOREIGN KEY (ID_Comunidad)
                  REFERENCES Comunidad (ID_Comunidad)
);

CREATE TABLE NotaInformativa (
       ID_NotaInformativa INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaCalculo VARCHAR(30)
     , ImporteNota FLOAT
     , Num_Factura INTEGER NOT NULL
     , ID_Comunidad INTEGER NOT NULL
     , CONSTRAINT FK_NotaInformativa_1 FOREIGN KEY (Num_Factura)
                  REFERENCES Factura (NumFactura)
     , CONSTRAINT FK_NotaInformativa_2 FOREIGN KEY (ID_Comunidad)
                  REFERENCES Comunidad (ID_Comunidad)
);

CREATE TABLE Inmueble (
       ID_Inmueble INTEGER NOT NULL
     , Escalera VARCHAR(30)
     , Piso VARCHAR(30)
     , Puerta VARCHAR(30)
     , Porcentaje FLOAT
     , ID_Comunidad INTEGER NOT NULL
     , PRIMARY KEY (ID_Inmueble)
     , CONSTRAINT FK_Inmueble_1 FOREIGN KEY (ID_Comunidad)
                  REFERENCES Comunidad (ID_Comunidad)
);

CREATE TABLE ReciboInmueble (
       ID_ReciboInmueble INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaPago VARCHAR(30)
     , Importe FLOAT
     , ID_Inmueble INTEGER
     , ID_NotaInformativa INTEGER
     , CONSTRAINT FK_ReciboInmueble_1 FOREIGN KEY (ID_NotaInformativa)
                  REFERENCES NotaInformativa (ID_NotaInformativa) ON DELETE CASCADE
     , CONSTRAINT FK_ReciboInmueble_2 FOREIGN KEY (ID_Inmueble)
                  REFERENCES Inmueble (ID_Inmueble)
);

CREATE TABLE LineaFactura (
       ID_LineaFactura INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ImporteLinea FLOAT
     , Observacion VARCHAR(30)
     , NumFactura INTEGER NOT NULL
     , CONSTRAINT FK_LineaFactura_1 FOREIGN KEY (NumFactura)
                  REFERENCES Factura (NumFactura) ON DELETE CASCADE
);

CREATE TABLE Propietario (
       ID INTEGER NOT NULL
     , NIF VARCHAR(30)
     , Nombre VARCHAR(30)
     , Direccion VARCHAR(30)
     , Poblacion VARCHAR(30)
     , Telefono VARCHAR(30)
     , Observaciones VARCHAR(100)
     , FechaAlta VARCHAR(30)
     , ID_Inmueble INTEGER NOT NULL
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_Propietario_1 FOREIGN KEY (ID_Inmueble)
                  REFERENCES Inmueble (ID_Inmueble)
);

CREATE TABLE Concepto (
       ID_Concepto INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ClaveConcepto VARCHAR(30)
     , Descripcion VARCHAR(30)
     , ID_LineaFactura INTEGER NOT NULL
     , CONSTRAINT FK_Concepto_1 FOREIGN KEY (ID_LineaFactura)
                  REFERENCES LineaFactura (ID_LineaFactura)
);

CREATE TABLE Carta (
       ID INTEGER NOT NULL
     , Fecha VARCHAR(30)
     , ID_ReciboInmueble INTEGER
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_Carta_1 FOREIGN KEY (ID_ReciboInmueble)
                  REFERENCES ReciboInmueble (ID_ReciboInmueble)
);

CREATE TABLE DatosBancarios (
       ID INTEGER NOT NULL
     , Entidad VARCHAR(30)
     , NumeroCuenta VARCHAR(30)
     , ID_Inmueble INTEGER NOT NULL
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_DatosBancarios_1 FOREIGN KEY (ID_Inmueble)
                  REFERENCES Inmueble (ID_Inmueble)
);

