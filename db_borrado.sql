-- Tables are not sorted because: 
-- Circular reference between DEFAULT_SCHEMA.Inmueble and DEFAULT_SCHEMA.Comunidad
-- Try generating Foreign Keys with ALTER TABLE statements.
DROP TABLE Carta IF EXISTS;
DROP TABLE Concepto IF EXISTS;
DROP TABLE LineaFactura IF EXISTS;
DROP TABLE ReciboInmueble IF EXISTS;
DROP TABLE Propietario IF EXISTS;
DROP TABLE DatosBancarios IF EXISTS;
DROP TABLE Inmueble IF EXISTS;
DROP TABLE NotaInformativa IF EXISTS;
DROP TABLE Factura IF EXISTS;
DROP TABLE Comunidad IF EXISTS;











ALTER TABLE Comunidad
  ADD CONSTRAINT FK_Comunidad_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES Comunidad (ID_Comunidad);

ALTER TABLE Comunidad
  ADD CONSTRAINT FK_Comunidad_2
      FOREIGN KEY (ID_Inmueble_Presidente)
      REFERENCES Inmueble (ID_Inmueble);

ALTER TABLE Factura
  ADD CONSTRAINT FK_Factura_1
      FOREIGN KEY (ID_Comunidad)
      REFERENCES Comunidad (ID_Comunidad);

ALTER TABLE Factura
  ADD CONSTRAINT FK_Factura_2
      FOREIGN KEY (ID_NotaInformativa)
      REFERENCES NotaInformativa (ID_NotaInformativa);

ALTER TABLE NotaInformativa
  ADD CONSTRAINT FK_NotaInformativa_2
      FOREIGN KEY (ID_Comunidad)
      REFERENCES Comunidad (ID_Comunidad);

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

