# Users schema

# --- !Ups

CREATE TABLE User (
    id bigserial PRIMARY KEY,
    email varchar(100) NOT NULL UNIQUE,
    password varchar(255) NOT NULL,
    firstname varchar(255) NOT NULL,
    lastname varchar(255) NOT NULL,
    isAdmin BIT NOT NULL,
    modified timestamp default current_timestamp,
    created timestamp default current_timestamp
);

# --- !Downs

DROP TABLE User;