INSERT INTO suusarent."role" (id, name) VALUES (default,  'admin');
INSERT INTO suusarent."role" (id, name) VALUES (default, 'customer');


INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, email, password, status, created_at) VALUES (default,1 ,'Hea','Admin','123456','admin', '123','A','2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'customer', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient1', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient2', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient3', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient4', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient5', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient6', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient7', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient8', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient9', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient10', 'A', '2025-10-01 08:36:15.174480');
INSERT INTO suusarent."user" (id, role_id, first_name, last_name, phone, password, email, status, created_at) VALUES (default, 2, 'Veel Üks', 'Hea Klient', '123456', '123', 'klient11', 'A', '2025-10-01 08:36:15.174480');




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

INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 1, 1, 'Aktiivne', 'Uued punased Rossignolid (väikesed)', '2025-10-02 13:11:09.000000', '2025-10-02 13:11:09.000000', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 1, 2, 'Aktiivne', 'Uued punased Rossignolid (keskmised)', '2025-10-02 13:11:09.000000', '2025-10-02 13:11:09.000000', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 1, 1, 'Aktiivne', '', '2025-10-02 13:55:59.915920', '2025-10-02 13:55:59.915920', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 1, 2, 'Aktiivne', '', '2025-10-02 13:56:05.496232', '2025-10-02 13:56:05.496232', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 1, 3, 'Aktiivne', '', '2025-10-02 13:56:09.286525', '2025-10-02 13:56:09.286525', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 2, 4, 'Aktiivne', '', '2025-10-02 13:56:36.533007', '2025-10-02 13:56:36.533007', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 2, 5, 'Aktiivne', '', '2025-10-02 13:56:41.658126', '2025-10-02 13:56:41.658126', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 2, 6, 'Aktiivne', '', '2025-10-02 13:56:45.964747', '2025-10-02 13:56:45.964747', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 2, 7, 'Aktiivne', '', '2025-10-02 13:56:49.656573', '2025-10-02 13:56:49.656573', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 2, 8, 'Aktiivne', '', '2025-10-02 13:56:52.957382', '2025-10-02 13:56:52.957382', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 2, 9, 'Aktiivne', '', '2025-10-02 13:56:59.463331', '2025-10-02 13:56:59.463331', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 2, 10, 'Aktiivne', '', '2025-10-02 13:57:03.297609', '2025-10-02 13:57:03.297609', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 3, 19, 'Aktiivne', '', '2025-10-02 13:57:07.715229', '2025-10-02 13:57:07.715229', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 3, 20, 'Aktiivne', '', '2025-10-02 13:57:11.659896', '2025-10-02 13:57:11.659896', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 3, 21, 'Aktiivne', '', '2025-10-02 13:57:15.478573', '2025-10-02 13:57:15.478573', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 4, 4, 'Aktiivne', '', '2025-10-02 13:57:18.994351', '2025-10-02 13:57:18.994351', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 4, 5, 'Aktiivne', '', '2025-10-02 13:57:22.584533', '2025-10-02 13:57:22.584533', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 4, 6, 'Aktiivne', '', '2025-10-02 13:57:26.114241', '2025-10-02 13:57:26.114241', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 4, 7, 'Aktiivne', '', '2025-10-02 13:57:30.511327', '2025-10-02 13:57:30.511327', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 4, 8, 'Aktiivne', '', '2025-10-02 13:57:34.400572', '2025-10-02 13:57:34.400572', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 4, 9, 'Aktiivne', '', '2025-10-02 13:57:39.624539', '2025-10-02 13:57:39.624539', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 5, 22, 'Aktiivne', '', '2025-10-02 13:57:42.415649', '2025-10-02 13:57:42.415649', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 5, 23, 'Aktiivne', '', '2025-10-02 13:57:45.767881', '2025-10-02 13:57:45.767881', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 5, 24, 'Aktiivne', '', '2025-10-02 13:57:49.392090', '2025-10-02 13:57:49.392090', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 5, 25, 'Aktiivne', '', '2025-10-02 13:57:53.068967', '2025-10-02 13:57:53.068967', true);
INSERT INTO suusarent.item (id, category_id, equipment_size_id, status, notes, created_at, updated_at, is_available) VALUES (default, 5, 26, 'Aktiivne', '', '2025-10-02 13:57:56.492875', '2025-10-02 13:57:56.492875', true);


INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000023','21/09/2025','25/09/2025','Ostukorv',40,2,now(),now());
INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000045','23/09/2025','27/09/2025','Kinnitatud',120,2,now(),now());

INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 1, 1, '2025-10-02 13:14:24.000000', 20.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 1, 2, '2025-10-02 13:14:24.000000', 20.00);

INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000023', '2025-09-21', '2025-09-25', 'Ostukorv', 40.00, 2, '2025-10-02 14:08:50.700551', '2025-10-02 14:08:50.700551');
INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000045', '2025-09-23', '2025-09-27', 'Kinnitatud', 120.00, 7, '2025-10-02 14:08:50.700551', '2025-10-02 14:08:50.700551');
INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000003', '2025-10-06', '2025-10-17', 'Kinnitamata', 60.00, 6, '2025-10-02 14:10:33.500604', '2025-10-02 14:10:33.500604');
INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000058', '2025-09-21', '2025-09-25', 'Aktiivne', 40.00, 3, '2025-10-02 14:08:50.700551', '2025-10-02 14:08:50.700551');
INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000032', '2025-09-23', '2025-09-27', 'Kinnitatud', 120.00, 4, '2025-10-02 14:08:50.700551', '2025-10-02 14:08:50.700551');
INSERT INTO suusarent."order" (id, order_number, start, "end", status, total_price, user_id, created_at, updated_at) VALUES (default, 'SR000013', '2025-10-06', '2025-10-17', 'Lõpetatud', 90.00, 8, '2025-10-02 14:10:33.500604', '2025-10-02 14:10:33.500604');


INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 1, 1, '2025-10-02 13:14:24.000000', 20.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 1, 2, '2025-10-02 13:14:24.000000', 20.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 2, 3, '2025-10-02 17:44:08.000000', 20.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 2, 4, '2025-10-02 17:44:25.000000', 20.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 3, 5, '2025-10-02 17:44:42.000000', 15.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 3, 18, '2025-10-02 17:44:52.000000', 25.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 3, 14, '2025-10-02 17:45:04.000000', 10.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 4, 11, '2025-10-02 17:45:21.000000', 15.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 4, 9, '2025-10-02 17:45:58.000000', 25.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 4, 12, '2025-10-02 17:45:59.000000', 15.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 5, 17, '2025-10-02 17:46:01.000000', 25.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 5, 8, '2025-10-02 17:46:02.000000', 14.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 6, 7, '2025-10-02 17:46:02.000000', 14.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 6, 10, '2025-10-02 17:46:02.000000', 14.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 6, 13, '2025-10-02 17:46:02.000000', 14.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 7, 15, '2025-10-02 17:46:02.000000', 14.00);
INSERT INTO suusarent.order_item (id, order_id, item_id, timestamps, price) VALUES (default, 7, 21, '2025-10-02 17:46:02.000000', 14.00);
