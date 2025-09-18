INSERT INTO suusarent."role" (id, name) VALUES (default,  'admin');
INSERT INTO suusarent."role" (id, name) VALUES (default, 'customer');


INSERT INTO suusarent."user" (id, role_id, email, password, status, created_at) VALUES (default,1 ,'admin@admin.ee', '123','A','1970-01-01 00:00:01');
INSERT INTO suusarent."user" (id, role_id, email, password, status, created_at) VALUES (default,  2,'customer@customer.ee', '123','A','1970-01-01 00:00:01');
