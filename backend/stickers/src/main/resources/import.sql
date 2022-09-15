INSERT INTO tb_countries(name,thophies_numbers) VALUES('Alemanha',4);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Arábia Saudita',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Argentina',2);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Austrália',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Bélgica',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Brasil',5);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Camarões',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Canadá',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Catar',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Coreia do Sul',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Costa Rica',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Croácia',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Dinamarca',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Equador',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Espanha',1);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Estados Unidos',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('França',1);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Gana',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Holanda',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Inglaterra',1);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Irã',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Japão',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Marrocos',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('México',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('País de Gales',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Polônia',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Portugal',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Senegal',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Sérvia',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Suíça',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Tunísia',0);
INSERT INTO tb_countries(name,thophies_numbers) VALUES('Uruguai',2);

INSERT INTO tb_stickers(code, player_name, player_heigth, player_weight, player_birth_date, countries_id) VALUES('C1', 'Neymar Jr', 1.76, 74.0, '01/01/1994', 6);
INSERT INTO tb_stickers(code, player_name, player_heigth, player_weight, player_birth_date, countries_id) VALUES('A1', 'Lionel Messi', 1.70, 72.0, '24/06/1987', 3);
INSERT INTO tb_stickers(code, player_name, player_heigth, player_weight, player_birth_date, countries_id) VALUES('F1', 'Kylian Mbappé', 1.78, 73.0, '20/12/1988', 17);

-- Inserir nova coleção
INSERT INTO tb_collections(name) VALUES('Frank');
INSERT INTO tb_collections(name) VALUES('Thiago');

-- Inserir figurinhas na coleção
INSERT INTO tb_itens_collections(collections_id,stickers_id) VALUES(1,1);
INSERT INTO tb_itens_collections(collections_id,stickers_id) VALUES(1,2);
INSERT INTO tb_itens_collections(collections_id,stickers_id) VALUES(1,2);
INSERT INTO tb_itens_collections(collections_id,stickers_id) VALUES(1,3);

INSERT INTO tb_itens_collections(collections_id,stickers_id) VALUES(2,1);


-- Consulta para ver lista de figurinhas de um colecionador
-- SELECT st.CODE, st.PLAYER_BIRTH_DATE, st.PLAYER_HEIGTH, st.PLAYER_NAME, st.PLAYER_WEIGHT, ct.name
-- FROM tb_collections cl
-- LEFT JOIN tb_itens_collections it ON it.collections_id = cl.id
-- LEFT JOIN tb_stickers st ON st.id = it.stickers_id
-- LEFT JOIN tb_countries ct ON ct.id = st.countries_id
-- WHERE UPPER(cl.name) LIKE '%FRANK%'
