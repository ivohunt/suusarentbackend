INSERT INTO suusarent."role" (id, name) VALUES (default,  'admin');
INSERT INTO suusarent."role" (id, name) VALUES (default, 'customer');


INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, email, password, status, created_at) VALUES (default,1 ,'Hea','Admin','123456','admin', '123','A','NOW()');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, email, password, status, created_at) VALUES (default,  2,'Veel Üks','Hea Klient','123456','customer', '123','A','NOW()');
