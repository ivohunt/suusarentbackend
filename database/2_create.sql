-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2025-09-18 06:20:52.254

-- tables
-- Table: category
CREATE TABLE category
(
    id           serial        NOT NULL,
    size_type_id int           NOT NULL,
    name         varchar(255)  NOT NULL,
    price        decimal(5, 2) NOT NULL,
    CONSTRAINT category_pk PRIMARY KEY (id)
);

-- Table: item
CREATE TABLE item
(
    id                serial       NOT NULL,
    category_id       int          NOT NULL,
    status            varchar(10)   NOT NULL,
    notes             varchar(500) NULL,
    equipment_size_id int          NOT NULL,
    created_at        timestamp    NOT NULL,
    updated_at        timestamp    NOT NULL,
    is_available      boolean      NOT NULL,
    CONSTRAINT item_pk PRIMARY KEY (id)
);

-- Table: item_image
CREATE TABLE item_image
(
    id      serial NOT NULL,
    item_id int    NOT NULL,
    data    bytea  NOT NULL,
    CONSTRAINT item_image_pk PRIMARY KEY (id)
);

-- Table: order
CREATE TABLE "order"
(
    id           serial        NOT NULL,
    order_number varchar(10)   NULL,
    start        date          NULL,
    "end"        date          NULL,
    status       varchar(10)    NOT NULL,
    total_price  decimal(7, 2) NOT NULL,
    user_id      int           NOT NULL,
    created_at   timestamp     NOT NULL,
    updated_at   timestamp     NOT NULL,
    CONSTRAINT order_pk PRIMARY KEY (id)
);

-- Table: order_item
CREATE TABLE order_item
(
    id         serial        NOT NULL,
    order_id   int           NOT NULL,
    item_id    int           NOT NULL,
    timestamps timestamp     NOT NULL,
    price      decimal(5, 2) NOT NULL,
    CONSTRAINT order_item_pk PRIMARY KEY (id)
);

-- Table: profile
CREATE TABLE profile
(
    id         serial       NOT NULL,
    user_id    int          NOT NULL,
    first_name varchar(255) NOT NULL,
    last_name  varchar(255) NOT NULL,
    telephone  varchar(20)  NOT NULL,
    CONSTRAINT profile_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role
(
    id   serial      NOT NULL,
    name varchar(20) NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: equipmentSize
CREATE TABLE size_type
(
    id   serial      NOT NULL,
    name varchar(16) NOT NULL,
    CONSTRAINT size_type_pk PRIMARY KEY (id)
);

-- Table: equipmentSize
CREATE TABLE equipment_size
(
    id           serial      NOT NULL,
    size_type_id int         NOT NULL,
    name         varchar(16) NOT NULL,
    sequence     int         NOT NULL,
    CONSTRAINT size_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user"
(
    id         serial       NOT NULL,
    role_id    int          NOT NULL,
    first_name varchar(255) NOT NULL,
    last_name  varchar(255) NOT NULL,
    phone      varchar(16)  NOT NULL,
    password   varchar(16)  NOT NULL,
    email      varchar(255) NOT NULL,
    status     varchar(1)   NOT NULL,
    created_at timestamp    NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: item_category (table: item)
ALTER TABLE item
    ADD CONSTRAINT item_category
        FOREIGN KEY (category_id)
            REFERENCES category (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- foreign keys
-- Reference: item_category (table: item)
ALTER TABLE category
    ADD CONSTRAINT category_size_type
        FOREIGN KEY (size_type_id)
            REFERENCES size_type (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: item_image_item (table: item_image)
ALTER TABLE item_image
    ADD CONSTRAINT item_image_item
        FOREIGN KEY (item_id)
            REFERENCES item (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: item_size (table: item)
ALTER TABLE item
    ADD CONSTRAINT item_equipment_size
        FOREIGN KEY (equipment_size_id)
            REFERENCES equipment_size (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: order_item_item (table: order_item)
ALTER TABLE order_item
    ADD CONSTRAINT order_item_item
        FOREIGN KEY (item_id)
            REFERENCES item (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: order_item_order (table: order_item)
ALTER TABLE order_item
    ADD CONSTRAINT order_item_order
        FOREIGN KEY (order_id)
            REFERENCES "order" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: order_user (table: order)
ALTER TABLE "order"
    ADD CONSTRAINT order_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: profile_user (table: profile)
ALTER TABLE profile
    ADD CONSTRAINT profile_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user"
    ADD CONSTRAINT user_role
        FOREIGN KEY (role_id)
            REFERENCES role (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;
-- Reference: user_role (table: user)
ALTER TABLE equipment_size
    ADD CONSTRAINT equipment_size_size_type
        FOREIGN KEY (size_type_id)
            REFERENCES size_type (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- End of file.

