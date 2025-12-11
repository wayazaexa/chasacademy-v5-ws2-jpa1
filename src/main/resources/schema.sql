DROP TABLE IF EXISTS post_comments CASCADE;
DROP TABLE IF EXISTS comments CASCADE;
DROP TABLE IF EXISTS posts CASCADE;

create table posts (
    post_id serial primary key,
    title varchar(128) not null,
    posttext text not null,
    author varchar(32) not null,
    publish_date timestamp default now(),
    create_date timestamp default now()
);

create table comments (
    comment_id serial primary key,
    title varchar(64) not null,
    comment text not null,
    comment_date timestamp default now()
);


create table post_comments (
    comment_id int not null references comments(comment_id) ON DELETE CASCADE,
    post_id int not null references posts(post_id) ON DELETE CASCADE,
    primary key(comment_id, post_id)
);

insert into posts(title, posttext, author, publish_date, create_date) values('Första inlägget', 'I en enkel bloggdatabas.','Admin', now() - INTERVAL '7 days', now() - INTERVAL '7 days 2 hours');
insert into posts(title, posttext, author, publish_date, create_date) values('Andra inlägget', 'I en enkel bloggdatabas.','Admin', now() - INTERVAL '6 days', now() - INTERVAL '6 days 1 hours');
insert into posts(title, posttext, author, publish_date, create_date) values('Mitt första inlägg', 'I en enkel bloggdatabas.','User1', now() - INTERVAL '5 days 23 hours', now() - INTERVAL '6 days');
insert into posts(title, posttext, author, publish_date, create_date) values('Tredje inlägget', 'I en enkel bloggdatabas.','Admin', now() - INTERVAL '3 days', now() - INTERVAL '3 days 3 hours');
insert into posts(title, posttext, author, publish_date, create_date) values('Mitt andra inlägg', 'I en enkel bloggdatabas.','User1', now() - INTERVAL '1 days', now() - INTERVAL '1 days 3 hours');
insert into posts(title, posttext, author, publish_date, create_date) values('Fjärde inlägget', 'I en enkel bloggdatabas.','Admin', now() - INTERVAL '22 hours', now() - INTERVAL '2 days');

INSERT INTO comments(title, comment, comment_date) VALUES('First1', 'First post', now() - INTERVAL '6 days 23 hours');
INSERT INTO comments(title, comment, comment_date) VALUES('First2', 'F-ing ***', now() - INTERVAL '6 days 22 hours');
INSERT INTO comments(title, comment, comment_date) VALUES('First3', 'Second post', now() - INTERVAL '6 days 21 hours');
INSERT INTO comments(title, comment, comment_date) VALUES('First4', 'Go away', now() - INTERVAL '6 days 20 hours');
INSERT INTO post_comments VALUES(1, 1);
INSERT INTO post_comments VALUES(2, 1);
INSERT INTO post_comments VALUES(3, 1);
INSERT INTO post_comments VALUES(4, 1);

INSERT INTO comments(title, comment, comment_date) VALUES('Second1', '2 1', now() - INTERVAL '5 days 23 hours');
INSERT INTO comments(title, comment, comment_date) VALUES('Second2', '2 2', now() - INTERVAL '5 days 22 hours');
INSERT INTO post_comments VALUES(5, 2);
INSERT INTO post_comments VALUES(6, 2);

INSERT INTO comments(title, comment, comment_date) VALUES('Third1', '3 1', now() - INTERVAL '5 days 22 hours');
INSERT INTO post_comments VALUES(7, 3);

INSERT INTO comments(title, comment, comment_date) VALUES('Sixth1', '6 1', now() - INTERVAL '20 hours');
INSERT INTO comments(title, comment, comment_date) VALUES('Sixth2', '6 2', now() - INTERVAL '5 hours');
INSERT INTO comments(title, comment, comment_date) VALUES('Sixth3', '6 3', now() - INTERVAL '4 hours 30 minutes');
INSERT INTO comments(title, comment, comment_date) VALUES('Sixth4', '6 4', now() - INTERVAL '4 hours');
INSERT INTO post_comments VALUES(8, 6);
INSERT INTO post_comments VALUES(9, 6);
INSERT INTO post_comments VALUES(10, 6);
INSERT INTO post_comments VALUES(11, 6);

