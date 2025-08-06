-- database: ../db/Exobot.sqlite
------------------------------------------------------------------
-- DDL.sql: Script de creacoón de tabalas de modelo Exabot  
-- Copyright (c) 2025 EPN-FIS. All rights reserved
-- #Tu_Correo                  #Tu usario

DROP TABLE IF EXISTS ExaBot;
DROP TABLE IF EXISTS IABot;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS PersonaTipo;
DROP TABLE IF EXISTS Sexo;

CREATE TABLE Sexo (
    IdSexo           INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre           VARCHAR(15) NOT NULL UNIQUE,
    Estado           VARCHAR(1) NOT NULL DEFAULT ('A'),
    FechaCreacion    DATETIME NOT NULL DEFAULT (datetime('now', 'localtime')),
    FechaModifica    DATETIME Not NULL DEFAULT (datetime('now', 'localtime'))
);

CREATE TABLE IABot (
    IdIABot          INTEGER PRIMARY KEY AUTOINCREMENT,
    Version          TEXT NOT NULL UNIQUE,
    Estado           VARCHAR(1) NOT NULL DEFAULT ('A'),
    FechaCrea        DATETIME DEFAULT (datetime('now'. 'localtime')),
    FechaModifica    DATETIME DEFAULT (datetime('now', 'localtime'))
);

CREATE TABLE ExaBot (
    IdExaBot         INTEGER PRIMARY KEY AUTOINCREMENT,
    IdIABot          INTEGER NOT NULL,
    Serie            TEXT NOT NULL,
    Estado           VACHAR(1) NOT NULL DEFAULT ('A'),    
    FechaCrea        DATETIME DEFAULT current_timestamp,
    FechaModifica    DATETIME DEFAULT (datetime('now', 'localtime')),
    CONSTRAINT       fk_IABot FOREIGN KEY (IdIABot)
    REFERENCES       IABot(IdIABot)
);

CREATE TABLE PersonaTipo (
    IdPersonaTipo    INTEGER PRIMARY KEY AUTOINCREMENT,
    Tipo             VARCHAR(15) NOT NULL UNIQUE,
    Estado           VARCHAR(1) NOT NULL DEFAULT ('A'),
    FechaCreacion    DATETIME NOT NULL DEFAULT (datetime('now', 'localtime')),
    FechaModifica    DATETIME NOT NULL DEFAULT (datetime('now', 'localtime'))
);

CREATE TABLE Persona (
    IdPersona        INTEGER PRIMARY KEY AUTOINCREMENT,
    IdPersonaTipo    INTEGER NOT NULL REFERENCES PersonaTipo(IdPersonaTipo),
    IsSexo           INTEGER NOT NULL REFERENCES PersonaTipo(IdSexo),
    Cedula           TEXT NOT NULL UNIQUE,
    Nombre           TEXT NOT NULL,
    Idioma           TEXT NOT NULL,
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
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%s';
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%o';
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%os';
SELECT Tipo FROM PersonaTipo WHERE Tipo LIKE '%ico';
