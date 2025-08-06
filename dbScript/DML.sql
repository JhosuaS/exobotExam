--  database: ../db/Exobot.sqlite
/* DML:Lennguajes de Manipulacion de Datos --> CRUD (create, read, update, delete)
-- Base de datos: ./database/EXOBOT.sqlite

   -Create: INSERT INTO
   -Read: SELECT    
    -Update: UPDATE
    -Delete: DELETE FROM
    
DML.sql 
Script de insercion de daros de prueba para la base de datos Exobot
Este script es parte del proyecto Exobot


Copyright:
Autor:  [Tu Nombre]
Fecha:  [Fecha de creación]
*/


SELECT * FROM IABot;

SELECT * FROM ExaBot;

SELECT * FROM Persona;

SELECT * FROM PersonaTipo;

INSERT INTO Sexo(Tipo) 
VALUES          ('Masculino'),
                ('Femenino'),
                ('Otro');
                ('Asexual'),
                ('Hibrido');


INSERT INTO PersonaTipo (Tipo)
VALUES                  ('Soldado'),
                        ('Mecatrónico'),
                        ('Experto Inglés'),
                        ('Experto Español');


INSERT INTO IABot (Version)
VALUES            ('IA 1.0');
                  ('IA-RUSO');




UPDATE IABot SET Nombre = 'IA-BOT-petmic' WHERE IdIABot = 1;

INSERT INTO ExaBot 
          (IdIABot, Serie)
VALUES    (1, 'exabot1'),
          (2, 'exabot1');



SELECT * FROM ExaBot;

SELECT IdExaBot, IdIABot,Nombre, Serie FROM Exabot;


INSERT INTO PersonaTipo(Tipo)
VALUES ('Soldado'),
       ('Mecatrónico'),
       ('Experto Inglés'),
       ('Experto Español');

SELECT* FROM PersonaTipo;
-- Tablas de detalle
INSERT INTO Persona 
(IdPersonaTipo, IdSexo    , Cedula  , Nombre          ,   idioma)
VALUES
(1,             1,         '111111', 'pepe'          , 'Ruso'  ),
(1,             1,         '222222', 'juan'          , 'Ruso'  ),
(1,             1,         '333333', 'pedro'         , 'Ruso'  ),
(1,             1,         '444444', 'pablo'         , 'Ruso'  ),
(2,             1,         '010100', 'mecatro pedro' , 'Ruso'  ),
(2,             1,         '020200', 'mecatro juan'  , 'Ruso'  ),
(3,             1,         '030300', 'experto juan'  , 'Ingles'  ),
(4,             1,         '040400', 'experto juan'  , 'Español'  );


SELECT * FROM Sexo;
SELECT * FROM Persona;
SELECT * FROM PersonaTipo;
SELECT * FROM IABot;
SELECT * FROM Exabot;

SELECT IdPersonaTipo
FROM PersonaTipo
WHERE Estado = 'A' AND IdPersonaTipo = 2;

SELECT COUNT(*) AS TotalTipoPersona FROM PersonaTipo;

SELECT * FROM PersonaTipo WHERE IdPersonaTipo = 2;
SELECT * FROM PersonaTipo WHERE IdPersonaTipo < 4;


SELECT * FROM PersonaTipo WHERE Tipo LIKE '%s';
SELECT * FROM PersonaTipo WHERE Tipo LIKE '%o';
SELECT * FROM PersonaTipo WHERE Tipo LIKE '%os';
SELECT * FROM PersonaTipo WHERE Tipo LIKE '%ico';
SELECT * FROM PersonaTipo WHERE Tipo LIKE '%á%';



