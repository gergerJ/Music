CREATE TABLE music(
    seq          bigint         PRIMARY KEY AUTO_INCREMENT,
    music_name   varchar(80)    NOT NULL,
    lyrics       longvarchar              DEFAULT NULL ,
    artist       varchar(100)   NOT NULL,
    release_date date           NOT NULL    DEFAULT CURRENT_DATE,
    genre        varchar(50)    NOT NULL    DEFAULT 'music'
);
INSERT INTO music(music_name, lyrics, artist, release_date, genre)
VALUES('루시퍼',
       '숨 을 곳도 찾지 못해 나는 피하려고 애써봐도
        거부조차 할 수 없는 네개 갇혀버린 나
        사랑이었다면 정말 사랑했던 거라면 내개 이러지는 말아
        Her whisper is the Lucifer-fer-fer
        The Lucifer 나를 묶고 가둔다면 사랑도 묶인 채
        미래도 묶인 채 커질 수 없는데
        자유롭게 비워놓고 바라봐
        오직 너만 채울게 너만 가득 채울게
        거부 할 수 없는 너의 마력은 Lucifer
        거 거부 할 수 없는 너의 마법은 Lucifer
        다가서면 너는 마치 천사 같은 얼굴로
        나를 사는 이유라 말하고, 말하고 너를 처음 봤을 때 짧은 순간 멈춰버렸지
        누가 마치 내 심장을 꽉 쥔 채 놓지 않는 것처럼 (아직까지도)
        너는 그렇게 내 맘을 다, 다, 다, 다, 다, 다 가져놓고
        니가 없으면 내 맘이 다 타버리게 만든다
        나를 묶고 가둔다면 사랑도 묶인 채
        미래도 묶인 채 커질 수 없는데
        자유롭게 비워놓고 바라봐
        오직 너만 채울게 너만 가득 채울게
        Loverholic, robotronic, loverholic, robotronic
        너와 같이 나눈 사랑예기들 나랑 같은 곳을 바라보는 너
        우리 더 이상은 완벽해질 수 없다고 느꼈을 때
        나만 쳐다봐, 너는 더, 더, 더, 더, 더, 더 나를 원해
        나만 바라봐, 모든 게, 게, 게, 게, 게, 게 니가 중심
        언제부턴가 조금씩 잘못된 것 같아 이상한 너
        날 알던 사랑들 모두 하나 둘씩 겯을 떠나 난 가진 게 너뿐이고
        나를 묶고 가둔다면 사랑도 묶인 채
        미래도 묶인 채 커질 수 없는데
        자유롭게 비워놓고 바라봐
        오직 너만 채울게 너만 가득 채울게
        마치 유리성에 갇혀버린 삐에로만 된 것 같아
        절대 만족 없는 너를 위해 춤을 추는 나
        훤히 들여다보고 뇌를 만져 바보 된 것 같아
        난 점점 네게 끌려가는 것만 같은데
        Loverholic, robotronic, loverholic, robotronic
        니가 미운 건 아냐 싫단 것도 아냐
        단지 그런 눈빛이 부담일 뿐
        어디 안가 이렇게 난 너만 바라보고 기다려 왔잖아 wow
        너의 눈빛이 날 사로잡다
        날이 갈 수록 날카로워졌다
        너의 집착에 지쳤다 만이 베었다 맘에 피가 난다
        나 쓰러질 쯤 되면 다가와서 천사같이 "사랑해"란 말
        누가 진짜 너였는지 알다가도 헷갈리게 만든다
        나를 묶고 가둔다면 사랑도 묶인 채
        미래도 묶인 채 커질 수 없는데
        자유롭게 비워놓고 바라봐
        오직 너만 채울게 너만 가득 채울게
        마치 유리성에 갇혀버린 삐에로만 된 것 같아
        나를 냅둬 자유로워 질 때 너를 진짜 사랑할 수 있고
        훤히 들여다보고 뇌를 만져 바보 된 것 같아
        나를 냅둬 질리게도 말고 너를 진짜 바라볼 수 있게
        나를 묶고 가둔다면 사랑도 묶인 채
        미래도 묶인 채 커질 수 없는데
        Loverholic, robotronic, loverholic, robotronic
        거부 할 수 없는 너의 마력은 Lucifer'
       ,'샤이니','2010-07-19','가요');
INSERT INTO music(music_name, lyrics, artist, release_date, genre)
VALUES('붐바야',
       ''
       ,'블랙핑크','2016-11-01','가요');
INSERT INTO music(music_name, lyrics, artist, release_date, genre) VALUES('곰세마리',NULL ,'동요','2008-11-11','동요');
INSERT INTO music(music_name, lyrics, artist, release_date, genre) VALUES('joker',NULL ,'달샤벳','2015-04-15','가요');