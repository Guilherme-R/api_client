INSERT INTO TB_STATE(name, abbreviation) values 
('São Paulo', 'SP');

INSERT INTO TB_CITY(name, state_id) values 
('São Paulo', 1);

INSERT INTO TB_ADRESS(street, district, number, city_id) values 
('Av. Paulista', 'Bela Vista', '1000', 1),
('Av. Vital Brasil', 'Butantã', '1500', 1),
('Avenida Aricanduva', 'Aricanduva', '5555', 1);

INSERT INTO TB_CLIENT(name, last_name, email, phone, date_create, adress_id) values 
('Pamela', 'Leite', 'pamela@email.com', '11987654321', '2021-07-11 22:15:25.500821',1),
('Guilherme', 'Sobrinho', 'guilherme@email.com', '11911223344', '2021-04-19 00:40:02.8006',2),
('Bob', 'Brown','bob@email.com', '11912345678','2020-02-01 13:00:25.20', 3);