# Users schema

# --- !Ups

create table user (
  id                        bigserial not null,
  email                     varchar(255) not null unique,
  password                  varchar(255) not null,
  firstname                 varchar(255) not null,
  lastname                  varchar(255) not null,
  mobile                    varchar(255) not null,
  isAdmin                   bit not null,
  modified timestamp default current_timestamp,
  created timestamp default current_timestamp,
  constraint pk_user primary key (id))
;

create table article (
  id                        bigserial not null,
  name                      varchar(255),
  producer                  varchar(255),
  header                    varchar(255),
  teaser                    varchar,
  body                      varchar,
  published                 boolean,
  image_url                 varchar,
  owner_id                  bigint,
  borrower_id               bigint,
  created                   timestamp,
  modified                  timestamp,
  constraint pk_article primary key (id))
;

create sequence user_seq;
create sequence article_seq;

SET REFERENTIAL_INTEGRITY FALSE;

# --- !Downs

drop table if exists article;
drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists user_seq;
drop sequence if exists article_seq;