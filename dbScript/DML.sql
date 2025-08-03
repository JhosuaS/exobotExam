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

INSERT INTO PersonaTipo (Tipo)
VALUES                  ('Soldado'),
                        ('Mecatrónico'),
                        ('Experto Inglés'),
                        ('Experto Español');


INSERT INTO IABot (Version)
VALUES            ('1.0');




  UPDATE IABot SET Nombre = 'IA-BOT-petmic' WHERE IdIABot = 1;


INSERT INTO IABot (Version)
VALUES            ('IA-RUSO');

 SELECT * FROM IABot;

t
INSERT INTO ExaBot 
          (IdIABot, Serie)
VALUES    (1, 'exabot1');

INSERT INTO ExaBot 
          (IdIABot,Serie)
VALUES    (2, 'exabot2');


SELECT * FROM ExaBot;

SELECT IdExaBot, IdIABot,Nombre, Serie FROM Exabot;


INSERT INTO PersonaTipo
   
VALUES ('Soldado'),
       ('Mecatrónico'),
       ('Experto Inglés'),
       ('Experto Español');

SELECT* FROM PersonaTipo;

INSERT INTO Persona (IdPersonaTipo, Cedula, Nombre)
VALUES
  (1, '111111', 'pepe'),
  (1, '222222', 'juan'),
  (1, '333333', 'pedro'),
  (1, '444444', 'pablo'),
  (2, '010100', 'mecatro pedro'),
  (2, '020200', 'mecatro juan'),
  (3, '030300', 'experto juan'),
  (4, '040400', 'experto juan');


SELECT * FROM Persona;

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


SELECT * FROM Persona;
SELECT * FROM PersonaTipo;
SELECT * FROM IABot;
SELECT * FROM ExaBot;

