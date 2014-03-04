


create table article (
  id                        bigint not null,
  name                      varchar(255),
  producer                  varchar(255),
  header                    varchar(255),
  teaser                    varchar(255),
  body                      varchar(255),
  published                 boolean,
  image_url                 varchar(255),
  owner_id                  bigint,
  borrower_id               bigint,
  created                   timestamp,
  modified                  timestamp,
  constraint pk_article primary key (id))
;

create table user (
  username                  varchar(255),
  firstname                 varchar(255),
  lastname                  varchar(255),
  email                     varchar(255),
  mobile                    varchar(255),
  apartment_number          varchar(255))
;

create sequence article_seq;





SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists article;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists article_seq;

