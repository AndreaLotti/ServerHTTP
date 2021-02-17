DROP DATABASE IF EXISTS EsTPSIT;
CREATE DATABASE EsTPSIT;
USE EsTPSIT;

CREATE TABLE IF NOT EXISTS Alunni (
	Nome VARCHAR(45),
    Cognome VARCHAR(45)
);

INSERT INTO Alunni(nome, cognome)
VALUES 
	('Andrea', 'Lotti'),
	('Edoardo', 'Croci'),
    ('Niccolo', 'Fappani'),
    ('Lorenzo', 'Cibecchini'),
    ('Francesco', 'Lazzarelli'),
    ('Francesco', 'Filippini'),
    ('Daniele', 'Flocco'),
    ('Leonardo', 'Mazzoni'),
    ('Lorenzo', 'Camigliano'),
    ('Samuele', 'Marrani');