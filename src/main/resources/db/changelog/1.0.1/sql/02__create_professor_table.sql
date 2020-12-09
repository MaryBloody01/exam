create sequence if not exists professor_seq start 1;

CREATE TABLE if not exists professor_entity
(
    professor_id bigint not null default nextval('professor_seq' :: regclass),
    firstname VARCHAR(50)  NOT NULL,
    lastname VARCHAR(50)  NOT NULL,
    middlename VARCHAR(50)  NOT NULL,
    department VARCHAR(355)  NOT NULL
);

alter table professor_entity
    add constraint professor_entity_pk primary key (professor_id);

insert into professor_entity(firstname, lastname, middlename, department) values
('Igor', 'Korovin', 'Vasilievich', 'Public Relations'),
('Evgeniy', 'Tolstoy', 'Lvovich', 'Public Relations');