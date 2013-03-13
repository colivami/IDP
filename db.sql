CREATE TABLE DEFAULT_SCHEMA.Inmueble (
       ID_Inmueble INTEGER NOT NULL
     , Escalera VARCHAR(30)
     , Piso VARCHAR(30)
     , Puerta VARCHAR(30)
     , Porcentaje FLOAT
     , PRIMARY KEY (ID_Inmueble)
);

CREATE TABLE DEFAULT_SCHEMA.Comunidad (
       ID_Comunidad INTEGER NOT NULL
     , Calle VARCHAR(30)
     , MaxRecibosPendientes INTEGER
     , Estado VARCHAR(30)
     , ID_Inmueble INTEGER NOT NULL
     , ID_Inmueble_Presidente INTEGER NOT NULL
     , PRIMARY KEY (ID_Comunidad)
     , CONSTRAINT FK_Comunidad_1 FOREIGN KEY (ID_Inmueble)
                  REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble) ON DELETE CASCADE
     , CONSTRAINT FK_Comunidad_2 FOREIGN KEY (ID_Inmueble_Presidente)
                  REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble)
);

CREATE TABLE DEFAULT_SCHEMA.Factura (
       NumFactura INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ID_Comunidad INTEGER NOT NULL
     , FechaFactura VARCHAR(30)
     , CONSTRAINT FK_Factura_1 FOREIGN KEY (ID_Comunidad)
                  REFERENCES DEFAULT_SCHEMA.Comunidad (ID_Comunidad)
);

CREATE TABLE DEFAULT_SCHEMA.NotaInformativa (
       ID_NotaInformativa INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaCalculo VARCHAR(30)
     , ImporteNota FLOAT
     , Num_Factura INTEGER NOT NULL
     , CONSTRAINT FK_NotaInformativa_1 FOREIGN KEY (Num_Factura)
                  REFERENCES DEFAULT_SCHEMA.Factura (NumFactura)
);

CREATE TABLE DEFAULT_SCHEMA.ReciboInmueble (
       ID_ReciboInmueble INTEGER NOT NULL IDENTITY PRIMARY KEY
     , FechaPago VARCHAR(30)
     , Importe FLOAT
     , ID_Inmueble INTEGER
     , ID_NotaInformativa INTEGER
     , CONSTRAINT FK_ReciboInmueble_1 FOREIGN KEY (ID_NotaInformativa)
                  REFERENCES DEFAULT_SCHEMA.NotaInformativa (ID_NotaInformativa) ON DELETE CASCADE
     , CONSTRAINT FK_ReciboInmueble_2 FOREIGN KEY (ID_Inmueble)
                  REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble)
);

CREATE TABLE DEFAULT_SCHEMA.LineaFactura (
       ID_LineaFactura INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ImporteLinea FLOAT
     , Observacion VARCHAR(30)
     , NumFactura INTEGER NOT NULL
     , CONSTRAINT FK_LineaFactura_1 FOREIGN KEY (NumFactura)
                  REFERENCES DEFAULT_SCHEMA.Factura (NumFactura) ON DELETE CASCADE
);

CREATE TABLE DEFAULT_SCHEMA.Propietario (
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
                  REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble)
);

CREATE TABLE DEFAULT_SCHEMA.Concepto (
       ID_Concepto INTEGER NOT NULL IDENTITY PRIMARY KEY
     , ClaveConcepto VARCHAR(30)
     , Descripcion VARCHAR(30)
     , ID_LineaFactura INTEGER NOT NULL
     , CONSTRAINT FK_Concepto_1 FOREIGN KEY (ID_LineaFactura)
                  REFERENCES DEFAULT_SCHEMA.LineaFactura (ID_LineaFactura)
);

CREATE TABLE DEFAULT_SCHEMA.Carta (
       ID INTEGER NOT NULL
     , Fecha VARCHAR(30)
     , ID_ReciboInmueble INTEGER
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_Carta_1 FOREIGN KEY (ID_ReciboInmueble)
                  REFERENCES DEFAULT_SCHEMA.ReciboInmueble (ID_ReciboInmueble)
);

CREATE TABLE DEFAULT_SCHEMA.DatosBancarios (
       ID INTEGER NOT NULL
     , Entidad VARCHAR(30)
     , NumeroCuenta VARCHAR(30)
     , ID_Inmueble INTEGER NOT NULL
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_DatosBancarios_1 FOREIGN KEY (ID_Inmueble)
                  REFERENCES DEFAULT_SCHEMA.Inmueble (ID_Inmueble)
);

