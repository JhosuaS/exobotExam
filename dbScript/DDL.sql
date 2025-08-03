-- database: ../db/Exobot.sqlite

-- DDL:Lennguajes de Definición de Datos: Crea y roba tablas  
-- Base de datos: ./database/EXOBOT.sqlite
-- Copyright:
-- Autor:
-- Fecha:

DROP TABLE IF EXISTS ExaBot;
DROP TABLE IF EXISTS IABot;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS PersonaTipo;

CREATE TABLE IABot (
    IdIABot          INTEGER PRIMARY KEY AUTOINCREMENT,
    Version          TEXT NOT NULL UNIQUE,
    Estado           VARCHAR(1) NOT NULL DEFAULT ('A'),
    FechaCrea        DATETIME DEFAULT current_timestamp
);

CREATE TABLE ExaBot (
    IdExaBot         INTEGER PRIMARY KEY AUTOINCREMENT,
    IdIABot          INTEGER NOT NULL,
    Serie            TEXT NOT NULL,
    Estado           VACHAR(1) NOT NULL DEFAULT ('A'),    
    FechaCrea        DATETIME DEFAULT current_timestamp,
    CONSTRAINT       fk_IABot FOREIGN KEY (IdIABot)
    REFERENCES       IABot(IdIABot)
);

CREATE TABLE PersonaTipo (
    IdPersonaTipo    INTEGER PRIMARY KEY AUTOINCREMENT,
    Tipo             VARCHAR(15) NOT NULL UNIQUE,
    Estado           VARCHAR(1) NOT NULL DEFAULT ('A'),
    FechaCreacion    DATETIME NOT NULL DEFAULT (datetime('now', 'localtime')),
    FechaModifica    DATETIME
);

CREATE TABLE Persona (
    IdPersona        INTEGER PRIMARY KEY AUTOINCREMENT,
    IdPersonaTipo    INTEGER NOT NULL REFERENCES PersonaTipo(IdPersonaTipo),
    Cedula           TEXT NOT NULL UNIQUE,
    Nombre           TEXT NOT NULL,
    FechaCrea        DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO PersonaTipo (Tipo)
VALUES ('Soldado'),
       ('Mecatrónico'),
       ('Experto Inglés'),
       ('Experto Español');
SELECT IdPersonaTipo,
       Nombre,
       Estado,
       FechaCreacion,
       FechaModifica
FROM PersonaTipo
WHERE Estado = 'A' AND IdPersonaTipo = 2


-- Contar cuántos tipos de persona existen
SELECT COUNT(*) AS TotalTipoPersona FROM PersonaTipo;

-- Consultar tipos específicos por ID
SELECT * FROM PersonaTipo WHERE IdPersonaTipo = 2;
SELECT * FROM PersonaTipo WHERE IdPersonaTipo < 4;

-- Buscar por coincidencias parciales en el campo Tipo
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%s';
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%o';
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%os';
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%ico';
