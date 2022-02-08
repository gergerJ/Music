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
'        숨 을 곳도 찾지 못해 나는 피하려고 애써봐도
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
'        BLACKPINK in your area
        (Hot) BLACKPINK in your area
        Been a bad girl, I know I am
        And I''m so hot I need a fan
        I don''t want a boy, I need a man
        Click-clack botta bing, botta boom
        문을 박차면 모두 날 바라봄
        굳이 애써 노력 안 해도
        모든 남자들은 코피가 팡팡팡
        (팡팡 파라파라 팡팡팡)
        지금 날 위한 축배를 짠짠짠
        (Hands up) 내 손엔 bottle full o'' Henny
        네가 말로만 듣던 걔가 나야 Jennie
        춤추는 불빛은 날 감싸고 도네
        Black to the Pink 어디서든 특별해 (Oh yes)
        쳐다 보든 말든 I wanna dance
        Like 따라다라단딴 따라다라단딴 뚜루룹바우
        좋아, 이 분위기가 좋아
        좋아, 난 지금 네가 좋아
        정말 반했어
        오늘 밤 너와 춤추고 싶어
        붐바야
        Yah yah yah 붐바야
        Yah yah yah 붐바야 yah yah yah yah
        붐붐바 붐붐바 (오빠!)
        Yeah, yeah (오빠!)
        Yeah, yeah 붐붐바 붐바야
        (Hot) BLACKPINK in your area
        Oh, 이제 달려야지 뭘 어떡해
        난 철 없어 겁 없어 man
        Middle finger up, F-U pay me
        ''90s baby, I pump up the jam
        달려봐 달려봐 오빠야 Lambo
        오늘은 너와 나 젊음을 gamble
        감히 날 막지마 혹시나 누가 날 막아도 I''m gonna go brrrr
        Rambo
        네 손이 내 허리를 감싸고 도네
        Front to my back 내 몸매는 특별해 (oh, yes)
        네 눈빛은 I know you wanna touch
        Like touch, touch, touch 뚜루룹바우
        좋아, 이 분위기가 좋아
        좋아, 난 지금 네가 좋아
        정말 멋있어
        오늘 밤 너와 춤추고 싶어
        붐바야
        Yah yah yah 붐바야
        Yah yah yah 붐바야 yah yah yah yah
        붐붐바 붐붐바 (오빠!)
        Yeah, yeah (오빠!)
        Yeah, yeah 붐붐바 붐바야
        오늘은 맨 정신 따윈 버리고
        하늘을 넘어서 올라 갈 거야
        끝을 모르게 빨리 달리고 싶어
        Let''s go, let''s go
        오늘은 맨 정신 따윈 버리고
        하늘을 넘어서 올라 갈 거야
        끝을 모르게 빨리 달리고 싶어
        Let''s go, let''s go'
       ,'블랙핑크','2016-11-01','가요');
INSERT INTO music(music_name, lyrics, artist, release_date, genre)
VALUES('곰세마리',
'        곰 세 마리가 한 집에 있어

        아빠 곰 엄마 곰 애기 곰

        아빠 곰은 뚱뚱해

        엄마 곰은 날씬해

        애기 곰은 너무 귀여워

        으쓱 으쓱 잘한다'
       ,'동요','2008-11-11','동요');
INSERT INTO music(music_name, lyrics, artist, release_date, genre)
VALUES('joker',
'        Joker, joker
        Joker, joker
        Joker, joker
        내 앞에선 네가 젤 예쁘대 놓고
        왜 자꾸 여기저기 눈 돌리는데
        하나둘씩 더
        커져가는 내 맘 몰라
        너어어언
        너 자꾸 튕기지 마
        I wanna love tonight
        또 흔적만 남기고 떠나는 거
        이젠 싫어 (No)
        밤이 깊어갈수록
        알고 싶어지는 너
        더 이상 멈출 수가 없어
        I wanna stop it
        Hey Mr. Joker 왜 날 흔들어
        애매한 네 눈빛이 더 끌려
        Hey Mr. 날 가지고 놀지 마
        내 맘 가득 채워줘요
        Gimme wanna babe
        Gimme wanna babe
        Joker, joker
        (I wanna)
        Show me wanna babe
        Show me wanna babe
        Joker, joker
        내가 네 것인 듯 날 다루는 touch
        빨개진 내 얼굴 왜 나를 놀려
        Hey boy Ma joker
        I want it
        Woo woo woo woo woo woo woo
        밤이 깊어와 Baby Tonight
        숨이 가빠와 Baby Good night
        Woah oh oh oh oh yeah
        커피가 식으면 우린 더 뜨거워져
        지울 수가 없는 너의 흔적 boy
        (Show me your love now)
        Hey Mr. Joker 왜 날 흔들어
        애매한 네 눈빛이 더 끌려
        Hey Mr. 날 가지고 놀지 마
        내 맘 가득 채워줘요
        Gimme wanna babe
        Gimme wanna babe
        Joker, joker
        (I wanna)
        Show me wanna babe
        Show me wanna babe
        Joker, joker
        때론 네 품에서
        아무 말 없이 안겨있고 싶어
        내 옷깃에 베인 네 향기
        네 눈 속에 갇힌 my 실루엣
        지워지지도 지우고 싶지도 않아
        이젠 네 가면을 벗어
        나나나나나나 오오
        나나나나나나 오오
        나나나나나나 오오
        Come to me babe
        나나나나나나 오오
        나나나나나나 오오
        나나나나나나 오오 바래
        Hey Mr. Joker 왜 날 흔들어
        애매한 네 눈빛이 더 끌려
        Gimme wanna babe
        Gimme wanna babe
        Joker, joker
        (I wanna)
        Show me wanna babe
        Show me wanna babe
        I wanna love tonight'
       ,'달샤벳','2015-04-15','가요');