create table music(
    seq bigint auto_increment primary key,
    music_name varchar(80) not null,
    lyrics varchar(255) default null ,
    artist varchar(100) not null,
    release_date date  not null default current_date ,
    genre varchar(50) not null default 'music'
);
INSERT INTO MUSIC(MUSIC_NAME, LYRICS, ARTIST, RELEASE_DATE, GENRE) VALUES('루시퍼',NULL,'샤이니','2010-07-19','가요');
INSERT INTO MUSIC(MUSIC_NAME, LYRICS, ARTIST, RELEASE_DATE, GENRE) VALUES('붐바야',NULL,'블랙핑크','2016-11-01','가요');
INSERT INTO MUSIC(MUSIC_NAME, LYRICS, ARTIST, RELEASE_DATE, GENRE) VALUES('곰세마리',NULL,'동요','2008-11-11','동요');
INSERT INTO MUSIC(MUSIC_NAME, LYRICS, ARTIST, RELEASE_DATE, GENRE) VALUES('joker',NULL,'달샤벳','2015-04-15','가요');