create sequence if not exists student_seq start 1;

CREATE TABLE if not exists student_entity
(
    student_id  bigint not null default nextval('student_seq' :: regclass),
    firstname VARCHAR(50)  NOT NULL,
    lastname VARCHAR(50)  NOT NULL,
    middlename VARCHAR(50)  NOT NULL,
    specialty VARCHAR(355)  NOT NULL,
    course  int NOT NULL
);

alter table student_entity
    add constraint student_entity_pk primary key (student_id);

insert into student_entity(firstname, lastname, middlename, specialty, course) values
('Ivan', 'Pupkin', 'Petrovich', 'Public Relations', 3),
('Valentin', 'Sergeev', 'Semenovich', 'Public Relations', 2);