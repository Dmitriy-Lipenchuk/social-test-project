INSERT INTO ROLE (id, name)
VALUES (1, 'ROLE_ADMIN'),
       (2, 'ROLE_USER');

INSERT INTO ACTIVE (id, name)
VALUES (1, 'ACTIVE'),
       (2, 'DISABLED');

INSERT INTO USERS (user_id,
                   about_me,
                   image,
                   first_name,
                   last_name,
                   city,
                   date_of_birth,
                   education,
                   email,
                   link_site,
                   password,
                   last_redaction_date,
                   persist_date,
                   profession,
                   status,
                   is_enable,
                   active_id,
                   role_id)
VALUES (1, 'Pep Flow, Москва', 'default.jpg', 'Pep', 'Flow', 'Москва', '1901-07-28', 'Master degree', 'admin@gmail.com',
        'admin@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11',
        '2022-08-30 14:45:11', 'Lirik', 'Chill', 1, 1, 1),
       (2, 'Jon Snow, Pavlovo', 'kata.jpg', 'Jon', 'Snow', 'Pavlovo', '1901-08-05', 'High School', 'eety@gmail.com',
        'eety@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11',
        '2022-08-30 14:45:11', 'Повар', 'relax', 1, 1, 1),
       (3, 'Edd Sand, Gorky', 'vk_1.jpg', 'Edd', 'Sand', 'Gorky', '1901-08-21', 'Ph.D', 'fett@gmail.com',
        'fett@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11',
        '2022-08-30 14:45:11', 'Craftmen', 'Bored', 1, 1, 1),
       (4, 'Cercei Wind, Budapest', 'vk_2.jpg', 'Cercei', 'Wind', 'Budapest', '1901-09-14', 'Highgarden',
        'nbnb@gmail.com', 'nbnb@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Driver', 'Lazy', 1, 1, 1),
       (5, 'Jamie Winter, London', 'default.jpg', 'Jamie', 'Winter', 'London', '1901-10-16', 'Stanford University',
        'd4444@gmail.com', 'd4444@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Teacher', 'breathing', 1, 1, 1),
       (6, 'Karl Kastark, Liverpool', 'kata.jpg', 'Karl', 'Kastark', 'Liverpool', '1901-11-25', 'NNTU, Russia',
        'dsx@gmail.com', 'dsx@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Manager', 'zzzZzz...', 1, 1, 1),
       (7, 'Son Sow, Amsterdam', 'vk_1.jpg', 'Son', 'Sow', 'Amsterdam', '1902-01-12', 'Oxford, United Kingdom',
        'zz5@gmail.com', 'zz5@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Boss', 'O_O', 1, 1, 1),
       (8, 'Smith White, Manchester', 'vk_2.jpg', 'Smith', 'White', 'Manchester', '1902-03-09',
        'Harvard, United States', 'dbvnnd@gmail.com', 'dbvnnd@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Joker', ':)', 1, 1, 1),
       (9, 'Robert Walker, Zurich', 'default.jpg', 'Robert', 'Walker', 'Zurich', '1902-05-12', 'Home, Homeland',
        'cxt@gmail.com', 'cxt@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'SellSword', ')))', 1, 1, 1),
       (10, 'Aegon Anderson, Oslo', 'kata.jpg', 'Aegon', 'Anderson', 'Oslo', '1902-07-23',
        'California IoT, United States', 'ddghkgkgkgk@gmail.com', 'ddghkgkgkgk@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Junior Developer', '??', 1, 1, 1),
       (11, 'Samuel Jackson, St.Petersburg', 'vk_1.jpg', 'Samuel', 'Jackson', 'St.Petersburg', '1902-10-11',
        'UCL, United Kingdom', 'dd2hg@gmail.com', 'dd2hg@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Agent', 'Walking', 1, 1, 1),
       (12, 'Xavi Willie, Vladimir', 'vk_2.jpg', 'Xavi', 'Willie', 'Vladimir', '1903-01-07', 'ETH Zurich, Switzerland',
        'kkkkkyy@gmail.com', 'kkkkkyy@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Talker', 'busy', 1, 1, 1),
       (13, 'Anderson Stones, Perm', 'default.jpg', 'Anderson', 'Stones', 'Perm', '1903-04-13',
        'University of Chicago, United States', 'ddjyj@gmail.com', 'ddjyj@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Speeker', 'InLov3', 1, 1, 1),
       (14, 'Zak Doche, Tokyo', 'kata.jpg', 'Zak', 'Doche', 'Tokyo', '1903-07-26', 'Yale, USA', 'try@gmail.com',
        'try@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11',
        '2022-08-30 14:45:11', 'President', '3321', 1, 1, 1),
       (15, 'Ollie Dickens, Vale', 'vk_1.jpg', 'Ollie', 'Dickens', 'Vale', '1903-11-15', 'MGU, Russia',
        'SOKOL@mail.com', 'SOKOL@mail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Engineer', 'Chill', 1, 1, 1),
       (16, 'Jora Lowe, Milan', 'vk_2.jpg', 'Jora', 'Lowe', 'Milan', '1904-03-14', 'EPFL, Switzerland',
        'dklskdl@rambler.ru', 'dklskdl@rambler.ru', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Master', 'Отдихаю', 1, 1, 1),
       (17, 'Clark Locke, Rome', 'default.jpg', 'Clark', 'Locke', 'Rome', '1904-07-20', 'UM, Malasiya',
        'dd2h888g@gmail.com', 'dd2h888g@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Trainy', 'counting', 1, 1, 1),
       (18, 'Winter Crown, Toronto', 'kata.jpg', 'Winter', 'Crown', 'Toronto', '1904-12-03',
        'Sweet Crown university, noland', 'dd2dsgg@gmail.com', 'dd2dsgg@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Goalkeeper', 'standing', 1, 1, 1),
       (19, 'Sam Lannister, Madrid', 'vk_1.jpg', 'Sam', 'Lannister', 'Madrid', '1905-04-26', 'SNU, Seul',
        'd78794@gmail.com', 'd78794@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Senior Java Developer', 'Дышу', 1, 1, 1),
       (20, 'Oleg Stark, Barcelona', 'vk_2.jpg', 'Oleg', 'Stark', 'Barcelona', '1905-09-25',
        'The University of Tokyo, Japan', 'ddh55hg@gmail.com', 'ddh55hg@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Lirik', 'zzzZzz...', 1, 1, 1),
       (21, 'Frank Baratheon, Vladivostok', 'default.jpg', 'Frank', 'Baratheon', 'Vladivostok', '1906-03-04',
        'The University of Toronto, Canada', 'ddevrr@gmail.com', 'ddevrr@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Повар', 'O_O', 1, 1, 1),
       (22, 'Nadya Mayweather, Kazan', 'kata.jpg', 'Nadya', 'Mayweather', 'Kazan', '1906-08-19', 'NONE',
        'dvzg@mail.com', 'dvzg@mail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Уборщица', ':)', 1, 1, 1),
       (23, 'Freya Zidan, Rostov', 'vk_1.jpg', 'Freya', 'Zidan', 'Rostov', '1907-02-11', 'Duke university, USA',
        'rrr@gmail.com', 'rrr@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Кладовщик', ')))', 1, 1, 1),
       (24, 'Lina Zork, Murmansk', 'vk_2.jpg', 'Lina', 'Zork', 'Murmansk', '1907-08-14', 'KAIST, South Korea',
        'xxxv@gmail.com', 'xxxv@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Teacher', '??', 1, 1, 1),
       (25, 'Maiden Foden, Заполярный', 'default.jpg', 'Maiden', 'Foden', 'Заполярный', '1908-02-22',
        'Sorbonne, France', 'dbnny@gmail.com', 'dbnny@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Manager', 'Walking', 1, 1, 1),
       (26, 'Abba Sad, Чита', 'kata.jpg', 'Abba', 'Sad', 'Чита', '1908-09-09', 'Lomonosov University, Russia',
        'mmzz@gmail.com', 'mmzz@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Начальник склада', 'busy', 1, 1, 1),
       (27, 'Olya Happy, Краснодар', 'vk_1.jpg', 'Olya', 'Happy', 'Краснодар', '1909-04-05', 'KU Leuven, Belgium',
        'd558hg@gmail.com', 'd558hg@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Водитель автобуса', 'InLov3', 1, 1, 1),
       (28, 'Alexander Green, Berlin', 'vk_2.jpg', 'Alexander', 'Green', 'Berlin', '1909-11-07', 'Tohoku, Japan',
        'lplplpl@gmail.com', 'lplplpl@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'SellSword', '3321', 1, 1, 1),
       (29, 'Brad Brown, Borussia', 'default.jpg', 'Brad', 'Brown', 'Borussia', '1910-06-19', 'Brown university, USA',
        'vvvvvv@gmail.com', 'vvvvvv@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Junior Developer', 'Chill', 1, 1, 1),
       (30, 'Hotpie Sweet, Frankfurt', 'kata.jpg', 'Hotpie', 'Sweet', 'Frankfurt', '1911-02-06',
        'Osaka unviersity, Japan', 'zzzzt@gmail.com', 'zzzzt@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Agent', 'skooka', 1, 1, 1),
       (31, 'Kent Peek, Bayern', 'vk_1.jpg', 'Kent', 'Peek', 'Bayern', '1911-10-04', 'Pork University, USA',
        'jkh,@gmail.com', 'jkh,@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Talker', 'coughing', 1, 1, 1),
       (32, 'Axe Pozdnyakov, Koln', 'vk_2.jpg', 'Axe', 'Pozdnyakov', 'Koln', '1912-06-08',
        'The University of Western Australia', 'ddsoad23@gmail.com', 'ddsoad23@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Speeker', 'doing plank', 1, 1, 1),
       (33, 'Riki Loft, Kyoto', 'default.jpg', 'Riki', 'Loft', 'Kyoto', '1913-02-19',
        'KTH Royal Institute of Technology, Sweden', 'lololo@gmail.com', 'lololo@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Начальник столовой', 'FLEXING', 1, 1, 1),
       (34, 'Brew Breek, Samara', 'kata.jpg', 'Brew', 'Breek', 'Samara', '1913-11-10', 'Rice University, USA',
        'ccvx@gmail.com', 'ccvx@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Engineer', 'zzzZzz...', 1, 1, 1),
       (35, 'Swann Shrope, Volgograd', 'vk_1.jpg', 'Swann', 'Shrope', 'Volgograd', '1914-08-09',
        'University of Oslo, Norway', 'vet446g@gmail.com', 'vet446g@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Master', 'SLOZNO', 1, 1, 1),
       (36, 'Crow Zelenskiy, Paris', 'vk_2.jpg', 'Crow', 'Zelenskiy', 'Paris', '1915-05-16',
        'University of Helsinki, Finland', 'o87o7@gmail.com', 'o87o7@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Pilot', ':)', 1, 1, 1),
       (37, 'Rafa Johnson, Riverrun', 'default.jpg', 'Rafa', 'Johnson', 'Riverrun', '1916-02-28', 'Nagoya, Japan',
        'dd4g@gmail.com', 'dd4g@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Goalkeeper', ')))', 1, 1, 1),
       (38, 'David Obama, Magadan', 'kata.jpg', 'David', 'Obama', 'Magadan', '1916-12-20',
        'Bern University, Switzerland', 'lilil@gmail.com', 'lilil@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Garbage Collecotor', '??', 1, 1, 1),
       (39, 'Andrew Beckham, Severodvinsk', 'vk_1.jpg', 'Andrew', 'Beckham', 'Severodvinsk', '1917-10-20',
        'NewCastle University, United Kingdoms', 'rewrv@gmail.com', 'rewrv@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Singer', 'Walking', 1, 1, 1),
       (40, 'Phill River, Kyev', 'vk_2.jpg', 'Phill', 'River', 'Kyev', '1918-08-28',
        'Saint Jaque Frescos University Worldwide', '64363646@gmail.com', '64363646@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Professor', 'KEK', 1, 1, 1),
       (41, 'Peter Warm, Zhytomir', 'default.jpg', 'Peter', 'Warm', 'Zhytomir', '1919-07-14', 'Kyushi, Japan',
        'kjhoo@gmail.com', 'kjhoo@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Electric', 'L0L', 1, 1, 1),
       (42, 'Jaque Worm, Odessa', 'kata.jpg', 'Jaque', 'Worm', 'Odessa', '1920-06-06', 'Politecnico di Milano, Italy',
        'oooooomhg@gmail.com', 'oooooomhg@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Doctor', 'CRINGEEE', 1, 1, 1),
       (43, 'Jaqen Vow, Maryupol', 'vk_1.jpg', 'Jaqen', 'Vow', 'Maryupol', '1921-05-08', 'Crapp, USA',
        'ooiio@gmail.com', 'ooiio@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Money collector', 'EZ', 1, 1, 1),
       (44, 'Lyanna Vien, Dontesk', 'vk_2.jpg', 'Lyanna', 'Vien', 'Dontesk', '1922-04-17',
        'Lancaster University, United Kingdoms', 'user@gmail.com', 'user@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Manager', 'watching', 1, 1, 1),
       (45, 'Ygritte North, Lviv', 'default.jpg', 'Ygritte', 'North', 'Lviv', '1923-04-04', 'TUB, Germany',
        '3255114@gmail.com', '3255114@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Boss', 'feeling', 1, 1, 1),
       (46, 'Robb Bar, Vinnica', 'kata.jpg', 'Robb', 'Bar', 'Vinnica', '1924-03-29', 'NGTU, Russia',
        'bbtbhjk@gmail.com', 'bbtbhjk@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Joker', 'blanked', 1, 1, 1),
       (47, 'Fernando Boi, Cherkasy', 'vk_1.jpg', 'Fernando', 'Boi', 'Cherkasy', '1925-04-01', 'RGGU, Russia',
        'uytre@gmail.com', 'uytre@gmail.com', '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'SellSword', 'thinking', 1, 1, 1),
       (48, 'Lionel Baiden, Holy Heaven', 'vk_2.jpg', 'Lionel', 'Baiden', 'Holy Heaven', '1926-04-12',
        'Church Applied School', 'ertyhgf@gmail.com', 'ertyhgf@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Стюардесса', 'zzzZzz...', 1, 1, 1),
       (49, 'Chris Fresco, Mountain', 'default.jpg', 'Chris', 'Fresco', 'Mountain', '1927-05-01',
        '8 years of high school', 'nbvmnb@gmail.com', 'nbvmnb@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Agent', 'O_O_O', 1, 1, 1),
       (50, 'Joe Halaand, Skyes', 'kata.jpg', 'Joe', 'Halaand', 'Skyes', '1928-05-27',
        'Nyaniang Technology, Singapoore', 'kdwetu@gmail.com', 'kdwetu@gmail.com',
        '$2a$12$A867XENvl1mrVozAvFawuup0Rt.xN5Ny5dmWOSyuJU4h9Syd2DuqW', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Talker', 'woto ez', 1, 1, 1),
       (51, 'Freya Mayweather, Pavlovo', 'vk_1.jpg', 'Freya', 'Mayweather', 'Pavlovo', '1929-07-01',
        'Duke university, USA', 'haddawy@optonline.net', 'haddawy@optonline.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Speeker', '3321', 1, 1, 2),
       (52, 'Lina Zidan, Gorky', 'vk_2.jpg', 'Lina', 'Zidan', 'Gorky', '1930-08-13', 'KAIST, South Korea',
        'geoffr@me.com', 'geoffr@me.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'President', 'Chill', 1, 1, 2),
       (53, 'Maiden Zork, Budapest', 'default.jpg', 'Maiden', 'Zork', 'Budapest', '1931-10-03', 'Sorbonne, France',
        'drewf@icloud.com', 'drewf@icloud.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Engineer', 'Отдихаю', 1, 1, 2),
       (54, 'Abba Foden, London', 'kata.jpg', 'Abba', 'Foden', 'London', '1932-11-30', 'Lomonosov University, Russia',
        'gmcgath@sbcglobal.net', 'gmcgath@sbcglobal.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Master', 'counting', 1, 1, 2),
       (55, 'Olya Sad, Liverpool', 'vk_1.jpg', 'Olya', 'Sad', 'Liverpool', '1934-02-05', 'KU Leuven, Belgium',
        'lahvak@icloud.com', 'lahvak@icloud.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'On a bench', 'standing', 1, 1, 2),
       (56, 'Alexander Happy, Amsterdam', 'vk_2.jpg', 'Alexander', 'Happy', 'Amsterdam', '1935-04-21', 'Tohoku, Japan',
        'cvrcek@hotmail.com', 'cvrcek@hotmail.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Goalkeeper', 'Дышу', 1, 1, 2),
       (57, 'Brad Green, Manchester', 'default.jpg', 'Brad', 'Green', 'Manchester', '1936-07-12',
        'Brown university, USA', 'nicktrig@yahoo.ca', 'nicktrig@yahoo.ca',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Senior Java Developer', 'zzzZzz...', 1, 1, 2),
       (58, 'Hotpie Brown, Zurich', 'kata.jpg', 'Hotpie', 'Brown', 'Zurich', '1937-10-11', 'Osaka unviersity, Japan',
        'dobey@yahoo.com', 'dobey@yahoo.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Уборщица', 'O_O', 1, 1, 2),
       (59, 'Kent Sweet, Oslo', 'vk_1.jpg', 'Kent', 'Sweet', 'Oslo', '1939-01-18', 'Pork University, USA',
        'marioph@yahoo.com', 'marioph@yahoo.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Кладовщик', ':)', 1, 1, 2),
       (60, 'Axe Peek, St.Petersburg', 'vk_2.jpg', 'Axe', 'Peek', 'St.Petersburg', '1940-05-04',
        'The University of Western Australia', 'moxfulder@optonline.net', 'moxfulder@optonline.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Teacher', ')))', 1, 1, 2),
       (61, 'Riki Pozdnyakov, Vladimir', 'default.jpg', 'Riki', 'Pozdnyakov', 'Vladimir', '1941-08-27',
        'KTH Royal Institute of Technology, Sweden', 'tokuhirom@optonline.net', 'tokuhirom@optonline.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Manager', '??', 1, 1, 2),
       (62, 'Brew Loft, Perm', 'kata.jpg', 'Brew', 'Loft', 'Perm', '1942-12-28', 'Rice University, USA',
        'stevelim@msn.com', 'stevelim@msn.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Начальник склада', 'Walking', 1, 1, 2),
       (63, 'Swann Breek, Tokyo', 'vk_1.jpg', 'Swann', 'Breek', 'Tokyo', '1944-05-07', 'University of Oslo, Norway',
        'flavell@msn.com', 'flavell@msn.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Водитель автобуса', 'busy', 1, 1, 2),
       (64, 'Crow Shrope, Vale', 'vk_2.jpg', 'Crow', 'Shrope', 'Vale', '1945-09-23', 'University of Helsinki, Finland',
        'loscar@verizon.net', 'loscar@verizon.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'SellSword', 'InLov3', 1, 1, 2),
       (65, 'Rafa Zelenskiy, Milan', 'default.jpg', 'Rafa', 'Zelenskiy', 'Milan', '1947-02-17', 'Nagoya, Japan',
        'drezet@mac.com', 'drezet@mac.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Junior Developer', '3321', 1, 1, 2),
       (66, 'David Johnson, Rome', 'kata.jpg', 'David', 'Johnson', 'Rome', '1948-07-21', 'Bern University, Switzerland',
        'isorashi@sbcglobal.net', 'isorashi@sbcglobal.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Agent', 'Chill', 1, 1, 2),
       (67, 'Andrew Obama, Toronto', 'vk_1.jpg', 'Andrew', 'Obama', 'Toronto', '1949-12-31', 'Ph.D',
        'violinhi@hotmail.com', 'violinhi@hotmail.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:11', '2022-08-30 14:45:11', 'Talker', 'skooka', 1, 1, 2),
       (68, 'Brew Beckham, Madrid', 'vk_2.jpg', 'Brew', 'Beckham', 'Madrid', '1951-06-20', 'Highgarden',
        'jfmulder@sbcglobal.net', 'jfmulder@sbcglobal.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:11', '2022-08-30 14:45:11',
        'Speeker', 'coughing', 1, 1, 2),
       (69, 'Swann River, Barcelona', 'default.jpg', 'Swann', 'River', 'Barcelona', '1952-12-15', 'Stanford University',
        'whimsy@comcast.net', 'whimsy@comcast.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Начальник столовой', 'doing plank', 1, 1, 2),
       (70, 'Crow Warm, Vladivostok', 'kata.jpg', 'Crow', 'Warm', 'Vladivostok', '1954-06-20', 'NNTU, Russia',
        'gemmell@verizon.net', 'gemmell@verizon.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Engineer', 'FLEXING', 1, 1, 2),
       (71, 'Rafa Worm, Kazan', 'vk_1.jpg', 'Rafa', 'Worm', 'Kazan', '1956-01-01', 'Oxford, United Kingdom',
        'mmccool@hotmail.com', 'mmccool@hotmail.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Master', 'zzzZzz...', 1, 1, 2),
       (72, 'David Vow, Rostov', 'vk_2.jpg', 'David', 'Vow', 'Rostov', '1957-07-22', 'Harvard, United States',
        'dhwon@live.com', 'dhwon@live.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Pilot', 'SLOZNO', 1, 1, 2),
       (73, 'Andrew Vien, Murmansk', 'default.jpg', 'Andrew', 'Vien', 'Murmansk', '1959-02-18', 'Home, Homeland',
        'gmcgath@verizon.net', 'gmcgath@verizon.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Goalkeeper', ':)', 1, 1, 2),
       (74, 'Phill North, Заполярный', 'kata.jpg', 'Phill', 'North', 'Заполярный', '1960-09-24',
        'California IoT, United States', 'keutzer@icloud.com', 'keutzer@icloud.com',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Garbage Collecotor', ')))', 1, 1, 2),
       (75, 'Peter Bar, Чита', 'vk_1.jpg', 'Peter', 'Bar', 'Чита', '1962-05-09', 'Duke university, USA',
        'esbeck@icloud.com', 'esbeck@icloud.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Singer', '??', 1, 1, 2),
       (76, 'Jaque Boi, Краснодар', 'vk_2.jpg', 'Jaque', 'Boi', 'Краснодар', '1963-12-30', 'KAIST, South Korea',
        'ianbuck@outlook.com', 'ianbuck@outlook.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Professor', 'Walking', 1, 1, 2),
       (77, 'Jaqen Baiden, Berlin', 'default.jpg', 'Jaqen', 'Baiden', 'Berlin', '1965-08-29', 'Sorbonne, France',
        'godeke@me.com', 'godeke@me.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Electric', 'KEK', 1, 1, 2),
       (78, 'Lyanna Fresco, Borussia', 'kata.jpg', 'Lyanna', 'Fresco', 'Borussia', '1967-05-07',
        'Lomonosov University, Russia', 'farber@aol.com', 'farber@aol.com',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Doctor', 'L0L', 1, 1, 2),
       (79, 'Ygritte Halaand, Frankfurt', 'vk_1.jpg', 'Ygritte', 'Halaand', 'Frankfurt', '1969-01-20',
        'KU Leuven, Belgium', 'jbuchana@att.net', 'jbuchana@att.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Money collector', 'CRINGEEE', 1, 1, 2),
       (80, 'Robb Flow, Bayern', 'vk_2.jpg', 'Robb', 'Flow', 'Bayern', '1970-10-14', 'Tohoku, Japan', 'noahb@mac.com',
        'noahb@mac.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12',
        '2022-08-30 14:45:11', 'Manager', 'EZ', 1, 1, 2),
       (81, 'Fernando Snow, Koln', 'default.jpg', 'Fernando', 'Snow', 'Koln', '1972-07-15', 'Brown university, USA',
        'skoch@att.net', 'skoch@att.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Boss', 'Отдихаю', 1, 1, 2),
       (82, 'Lionel Sand, Kyoto', 'kata.jpg', 'Lionel', 'Sand', 'Kyoto', '1974-04-24', 'Osaka unviersity, Japan',
        'aibrahim@yahoo.com', 'aibrahim@yahoo.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Joker', 'counting', 1, 1, 2),
       (83, 'Chris Shrope, Samara', 'vk_1.jpg', 'Chris', 'Shrope', 'Samara', '1976-02-09', 'Pork University, USA',
        'sherzodr@mac.com', 'sherzodr@mac.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'SellSword', 'standing', 1, 1, 2),
       (84, 'Joe Zelenskiy, Volgograd', 'vk_2.jpg', 'Joe', 'Zelenskiy', 'Volgograd', '1977-12-04',
        'The University of Western Australia', 'thaljef@verizon.net', 'thaljef@verizon.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Стюардесса', 'Дышу', 1, 1, 2),
       (85, 'Freya Johnson, Paris', 'default.jpg', 'Freya', 'Johnson', 'Paris', '1979-10-07',
        'KTH Royal Institute of Technology, Sweden', 'msloan@sbcglobal.net', 'msloan@sbcglobal.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Agent', 'zzzZzz...', 1, 1, 2),
       (86, 'Cercei Obama, Riverrun', 'kata.jpg', 'Cercei', 'Obama', 'Riverrun', '1981-08-17', 'Rice University, USA',
        'atmarks@outlook.com', 'atmarks@outlook.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Talker', 'O_O', 1, 1, 2),
       (87, 'Jamie Beckham, Magadan', 'vk_1.jpg', 'Jamie', 'Beckham', 'Magadan', '1983-07-06',
        'University of Oslo, Norway', 'rogerspl@optonline.net', 'rogerspl@optonline.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Speeker', ':)', 1, 1, 2),
       (88, 'Karl River, Madrid', 'vk_2.jpg', 'Karl', 'River', 'Madrid', '1985-06-01',
        'University of Helsinki, Finland', 'kildjean@sbcglobal.net', 'kildjean@sbcglobal.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'President', ')))', 1, 1, 2),
       (89, 'Son Warm, Barcelona', 'default.jpg', 'Son', 'Warm', 'Barcelona', '1987-05-06', 'Nagoya, Japan',
        'yamla@verizon.net', 'yamla@verizon.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Engineer', '??', 1, 1, 2),
       (90, 'Smith Worm, Vladivostok', 'kata.jpg', 'Smith', 'Worm', 'Vladivostok', '1989-04-17',
        'Bern University, Switzerland', 'overbom@outlook.com', 'overbom@outlook.com',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Master', 'FLEXING', 1, 1, 2),
       (91, 'Robert Vow, Kazan', 'vk_1.jpg', 'Robert', 'Vow', 'Kazan', '1991-04-07', 'Yale, USA', 'devphil@live.com',
        'devphil@live.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12',
        '2022-08-30 14:45:11', 'SellSword', 'zzzZzz...', 1, 1, 2),
       (92, 'Aegon Vien, Rostov', 'vk_2.jpg', 'Aegon', 'Vien', 'Rostov', '1993-04-04', 'MGU, Russia',
        'granboul@live.com', 'granboul@live.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Junior Developer', 'SLOZNO', 1, 1, 2),
       (93, 'Samuel North, Murmansk', 'default.jpg', 'Samuel', 'North', 'Murmansk', '1995-04-10', 'EPFL, Switzerland',
        'lahvak@comcast.net', 'lahvak@comcast.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Agent', ':)', 1, 1, 2),
       (94, 'Xavi Bar, Заполярный', 'kata.jpg', 'Xavi', 'Bar', 'Заполярный', '1997-04-23', 'UM, Malasiya',
        'british@yahoo.ca', 'british@yahoo.ca', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Talker', ')))', 1, 1, 2),
       (95, 'Anderson Boi, Чита', 'vk_1.jpg', 'Anderson', 'Boi', 'Чита', '1999-05-15', 'Sweet Crown university, noland',
        'smpeters@hotmail.com', 'smpeters@hotmail.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Начальник столовой', '??', 1, 1, 2),
       (96, 'Zak Baiden, Краснодар', 'vk_2.jpg', 'Zak', 'Baiden', 'Краснодар', '2001-06-13', 'SNU, Seul',
        'rbarreira@att.net', 'rbarreira@att.net', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Engineer', 'Walking', 1, 1, 2),
       (97, 'Ollie Fresco, Berlin', 'default.jpg', 'Ollie', 'Fresco', 'Berlin', '2003-07-21',
        'The University of Tokyo, Japan', 'ngedmond@optonline.net', 'ngedmond@optonline.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Master', 'KEK', 1, 1, 2),
       (98, 'Jora Halaand, Borussia', 'kata.jpg', 'Jora', 'Halaand', 'Borussia', '2005-09-04',
        'The University of Toronto, Canada', 'ajlitt@optonline.net', 'ajlitt@optonline.net',
        '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.', '2022-08-30 14:45:12', '2022-08-30 14:45:11',
        'Pilot', 'L0L', 1, 1, 2),
       (99, 'Clark Mayweather, Frankfurt', 'vk_1.jpg', 'Clark', 'Mayweather', 'Frankfurt', '2007-10-28', 'NONE',
        'pfitza@yahoo.ca', 'pfitza@yahoo.ca', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Goalkeeper', 'CRINGEEE', 1, 1, 2),
       (100, 'Winter Zidan, Bayern', 'vk_2.jpg', 'Winter', 'Zidan', 'Bayern', '2009-12-28', 'Duke university, USA',
        'kodeman@gmail.com', 'kodeman@gmail.com', '$2a$12$.LNZWaMp891irkJw6V7AZehdVOVWzJrXm4qfnDMstawpAgXULV8n.',
        '2022-08-30 14:45:12', '2022-08-30 14:45:11', 'Garbage Collecotor', 'EZ', 1, 1, 2);
