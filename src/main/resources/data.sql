INSERT INTO STATE(name, abbreviation) values 
('São Paulo', 'SP');

INSERT INTO CITY(name, state_id) values 
('São Paulo', 1);

INSERT INTO ADRESS(street, district, number, city_id) values 
('Av. Paulista', 'Bela Vista', '1000', 1),
('Av. Vital Brasil', 'Butantã', '1500', 1),
('Avenida Aricanduva', 'Aricanduva', '5555', 1);

INSERT INTO CLIENT(name, last_name, email, phone, adress_id) values 
('Pamela', 'Leite', 'pamela@email.com', '11987654321', 1),
('Guilherme', 'Sobrinho', 'guilherme@email.com', '11911223344', 2),
('Bob', 'Brown','bob@email.com', '11912345678', 3);