INSERT INTO suusarent."role" (id, name) VALUES (default,  'admin');
INSERT INTO suusarent."role" (id, name) VALUES (default, 'customer');


INSERT INTO suusarent."user" (id, role_id, email, password, status, created_at) VALUES (default,1 ,'admin@admin.ee', '123','A','NOW()');
INSERT INTO suusarent."user" (id, role_id, email, password, status, created_at) VALUES (default,  2,'customer@customer.ee', '123','A','NOW()');
