# Users schema

# --- !Ups

CREATE TABLE Article (
  id bigserial PRIMARY KEY,
  name varchar(255) NOT NULL,
  producer varchar(255),
  header varchar NOT NULL,
  teaser varchar NOT NULL,
  body varchar NOT NULL,
  published bit NOT NULL,
  image_url varchar,
  owner_id bigint REFERENCES USER(id),
  borrower_id bigint REFERENCES USER(id),
  modified timestamp default current_timestamp,
  created timestamp default current_timestamp
)


# --- !Downs
DROP TABLE article;