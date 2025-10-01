INSERT INTO suusarent."role" (id, name) VALUES (default,  'admin');
INSERT INTO suusarent."role" (id, name) VALUES (default, 'customer');


INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, email, password, status, created_at) VALUES (default,1 ,'Hea','Admin','123456','admin', '123','A','NOW()');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, email, password, status, created_at) VALUES (default,  2,'Veel Üks','Hea Klient','123456','customer', '123','A','NOW()');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'no order', 'A', '2025-10-01 08:36:15.174480');


INSERT INTO suusarent.size_type (id, name) VALUES (default, 'Suusa suurused');
INSERT INTO suusarent.size_type (id, name) VALUES (default, 'Saapa suurused');
INSERT INTO suusarent.size_type (id, name) VALUES (default, 'Laua suurused');
INSERT INTO suusarent.size_type (id, name) VALUES (default, 'Kiivri suurused');


INSERT INTO suusarent.category (id, size_type_id, name, price) VALUES (default, 1, 'Mäesuusad', 20.00);
INSERT INTO suusarent.category (id, size_type_id, name, price) VALUES (default, 2, 'Mäesuusasaapad', 10.00);
INSERT INTO suusarent.category (id, size_type_id, name, price) VALUES (default, 3, 'Lumelauad', 10.00);
INSERT INTO suusarent.category (id, size_type_id, name, price) VALUES (default, 2, 'Lumelauasaapad', 10.00);
INSERT INTO suusarent.category (id, size_type_id, name, price) VALUES (default, 4, 'Kiivrid', 10.00);


INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'130-150cm',1,100);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'151-170cm',1,200);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'171-200cm',1,300);

INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'35',2,100);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'36',2,200);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'37',2,300);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'38',2,400);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'39',2,500);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'41',2,600);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'42',2,700);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'43',2,800);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'44',2,900);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'45',2,1000);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'46',2,1100);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'47',2,1200);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'48',2,1300);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'49',2,1400);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'50',2,1500);

INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'130-150cm',3,100);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'151-170cm',3,200);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'171-200cm',3,300);

INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'S',4,100);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'M',4,200);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'L',4,300);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'XL',4,400);
INSERT INTO suusarent.equipment_size (id, name, size_type_id, sequence) VALUES (default,'XXL',4,500);

INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000023','21/09/2025','25/09/2025','UNC_RENT',120,2,now(),now());
INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000045','23/09/2025','27/09/2025','CON',120,2,now(),now());






