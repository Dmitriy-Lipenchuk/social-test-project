CREATE SEQUENCE active_seq START 1 INCREMENT 1;

CREATE SEQUENCE albums_seq START 1 INCREMENT 1;

CREATE SEQUENCE comments_seq START 1 INCREMENT 1;

CREATE SEQUENCE followers_seq START 1 INCREMENT 1;

CREATE SEQUENCE friends_seq START 1 INCREMENT 1;

CREATE SEQUENCE group_category_seq START 1 INCREMENT 1;

CREATE SEQUENCE group_has_user_seq START 1 INCREMENT 1;

CREATE SEQUENCE groups_seq START 1 INCREMENT 1;

CREATE SEQUENCE like_seq START 1 INCREMENT 1;

CREATE SEQUENCE media_seq START 1 INCREMENT 1;

CREATE SEQUENCE playlists_seq START 1 INCREMENT 1;

CREATE SEQUENCE reposts_seq START 1 INCREMENT 1;

CREATE SEQUENCE role_seq START 1 INCREMENT 1;

CREATE SEQUENCE user_has_album_seq START 1 INCREMENT 1;

CREATE SEQUENCE users_seq START 1 INCREMENT 1;

CREATE TABLE active (id int8 not null, name varchar(255), primary key (id));

CREATE TABLE album_audios (album_id int8 not null, primary key (album_id));

CREATE TABLE album_has_audio (album_id int8 not null, audios_id int8 not null, primary key (album_id, audios_id));

CREATE TABLE album_has_image (album_id int8 not null, image_id int8 not null, primary key (album_id, image_id));

CREATE TABLE album_has_video (album_id int8 not null, videos_id int8 not null, primary key (album_id, videos_id));

CREATE TABLE album_image (album_id int8 not null, primary key (album_id));

CREATE TABLE album_video (album_id int8 not null, primary key (album_id));

CREATE TABLE albums (id int8 not null, icon varchar(255), update_date timestamp, media_type int4 not null, name varchar(255), persist_date timestamp not null, user_owner_id int8, primary key (id));

CREATE TABLE audios (album varchar(255), author varchar(255), icon varchar(255), length int4, listening int4, name varchar(255), media_id int8 not null, primary key (media_id));

CREATE TABLE chat (id  bigserial not null, chat_type int2, title varchar(255), primary key (id));

CREATE TABLE comment_like ("like_id" int8 not null, comment_id int8 not null, primary key ("like_id"));

CREATE TABLE comments (id int8 not null, comment varchar(255), comment_type int4 not null, persist_date timestamp, last_redaction_date timestamp not null, user_id int8 not null, primary key (id));

CREATE TABLE followers (id int8 not null, follower_id int8 not null, user_id int8 not null, primary key (id));

CREATE TABLE friends (id int8 not null, friend_id int8 not null, user_id int8 not null, primary key (id));

CREATE TABLE group_category (id int8 not null, category varchar(255), primary key (id));

CREATE TABLE group_chat (chat_id int8 not null, primary key (chat_id));

CREATE TABLE group_chat_users (group_chat_chat_id int8 not null, users_user_id int8 not null);

CREATE TABLE group_has_user (id int8 not null, persist_date timestamp not null, group_id int8 not null, user_id int8 not null, primary key (id));

CREATE TABLE group_wall (group_id int8 not null, post_id int8 not null, primary key (group_id, post_id));

CREATE TABLE groups (id int8 not null, address_image_group varchar(255), description varchar(255), last_redaction_date timestamp not null, link_site varchar(255), name varchar(255), persist_date timestamp not null, group_category_id int8, owner_id int8 not null, primary key (id));

CREATE TABLE images (description varchar(255), media_id int8 not null, primary key (media_id));

CREATE TABLE "like" (id int8 not null, like_type int4 not null, user_id int8 not null, primary key (id));

CREATE TABLE media (id int8 not null, media_type int4 not null, persist_date timestamp not null, url varchar(255) not null, album_id int8, user_id int8 not null, primary key (id));

CREATE TABLE media_comment (comment_id int8 not null, media_id int8 not null, primary key (comment_id));

CREATE TABLE media_like ("like_id" int8 not null, media_id int8 not null, primary key ("like_id"));

CREATE TABLE message (id  bigserial not null, message varchar(255), persist_date timestamp, chat_id int8 not null, user_sender_user_id int8, primary key (id));

CREATE TABLE message_like ("like_id" int8 not null, message_id int8 not null, primary key ("like_id"));

CREATE TABLE playlist_has_audios (playlist_id int8 not null, audios_id int8 not null, primary key (playlist_id, audios_id));

CREATE TABLE playlists (playlist_id int8 not null, image varchar(255), name varchar(255), persist_date timestamp not null, user_id int8 not null, primary key (playlist_id));

CREATE TABLE post_comment (comment_id int8 not null, post_id int8 not null, primary key (comment_id));

CREATE TABLE post_like ("like_id" int8 not null, post_id int8, primary key ("like_id"));
CREATE TABLE posts (id  bigserial not null, content TEXT, last_redaction_date timestamp not null, persist_date timestamp not null, publish_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, title varchar(255), user_id int8, primary key (id));

CREATE TABLE reposts (id int8 not null, post_id int8 not null, user_id int8 not null, primary key (id));

CREATE TABLE role (id int8 not null, name varchar(255), primary key (id));

CREATE TABLE single_chat (chat_id int8 not null, primary key (chat_id));

CREATE TABLE user_has_album (id int8 not null, persist_date timestamp not null, album_id int8 not null, user_id int8 not null, primary key (id));

CREATE TABLE users (user_id int8 not null, about_me varchar(255), image varchar(255), city varchar(255), date_of_birth date, education varchar(255), email varchar(255), first_name varchar(255) not null, is_enable int4, last_name varchar(255) not null, last_redaction_date timestamp not null, link_site varchar(255), password varchar(255), persist_date timestamp not null, profession varchar(255), status varchar(255), active_id int8 not null, role_id int8 not null, primary key (user_id));

CREATE TABLE users_audios_collections (user_id int8 not null, audio_id int8 not null, primary key (user_id, audio_id));

CREATE TABLE users_group_chats (user_id int8 not null, group_chat_id int8 not null, primary key (user_id, group_chat_id));

CREATE TABLE users_videos_collections (user_id int8 not null, video_id int8 not null, primary key (user_id, video_id));

CREATE TABLE videos (author varchar(255), icon varchar(255), name varchar(255), view int8, media_id int8 not null, primary key (media_id));

ALTER TABLE album_has_video add constraint UK_a5rhnqpxtg6ghuopt3857jsa1 unique (videos_id);

ALTER TABLE group_wall add constraint UK_k0mxoo8evldcjcq1iva6o7bvq unique (post_id);

ALTER TABLE users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email);

ALTER TABLE album_audios add constraint FKn8fkl5522npp79gun310v08gc foreign key (album_id) references albums;

ALTER TABLE album_has_audio add constraint FK4wutmsbgisseb2mxxe8nutnqe foreign key (audios_id) references audios;

ALTER TABLE album_has_audio add constraint FK8v9jpoytyn00yhy2wd4vvjg1y foreign key (album_id) references album_audios;

ALTER TABLE album_has_image add constraint FKcdy622l6cw7ls5chlfa0admtk foreign key (image_id) references images;

ALTER TABLE album_has_image add constraint FKtq22d73bviic6fhl3sk3w7x4s foreign key (album_id) references album_image;

ALTER TABLE album_has_video add constraint FKh3snslp51d756ghktmpxn7vo4 foreign key (videos_id) references videos;

ALTER TABLE album_has_video add constraint FKk4bl9yx13be7tq4r8d069m6hu foreign key (album_id) references album_video;

ALTER TABLE album_image add constraint FKktle04uj7x3exwin0gfq0xdtd foreign key (album_id) references albums;

ALTER TABLE album_video add constraint FKe8ngx5ckfomc1jq7q7x0c3jlx foreign key (album_id) references albums;

ALTER TABLE albums add constraint FKcgps0vjsdhsbhqrjnh3th4b0u foreign key (user_owner_id) references users;

ALTER TABLE audios add constraint FKmbwry03s0jccvgqefrlv3ln1j foreign key (media_id) references media;

ALTER TABLE comment_like add constraint FKl1mu2ryf4k4ps93b5b52q2m8i foreign key (comment_id) references comments;

ALTER TABLE comment_like add constraint FKkldgc9u7sbqv0djmeeusvisue foreign key ("like_id") references "like";

ALTER TABLE comments add constraint FK8omq0tc18jd43bu5tjh6jvraq foreign key (user_id) references users;

ALTER TABLE followers add constraint FK9w6mv39vle9f9yacvvkfieai7 foreign key (follower_id) references users;

ALTER TABLE followers add constraint FKndvqwh40g1qt4xirl6vp2d6m6 foreign key (user_id) references users;

ALTER TABLE friends add constraint FKc42eihjtiryeriy8axlkpejo7 foreign key (friend_id) references users;

ALTER TABLE friends add constraint FKlh21lfp7th1y1tn9g63ihkda9 foreign key (user_id) references users;

ALTER TABLE group_chat add constraint FKhwhjdn057057sx83g73m0iag5 foreign key (chat_id) references chat;

ALTER TABLE group_chat_users add constraint FKmgdf8x3qs5tql3tn0mpoiifrf foreign key (users_user_id) references users;

ALTER TABLE group_chat_users add constraint FKpy5qylqqi2pk7m3a450e6iiv3 foreign key (group_chat_chat_id) references group_chat;

ALTER TABLE group_has_user add constraint FKhcr1kxm4l7myig424250g8i63 foreign key (group_id) references groups;

ALTER TABLE group_has_user add constraint FKhr5ypg2t7gd3huwgl4tijtx4l foreign key (user_id) references users;

ALTER TABLE group_wall add constraint FKqkll3lqcxuse5558nxawjgmp4 foreign key (post_id) references posts;

ALTER TABLE group_wall add constraint FKhde1qpuipv4ouvqw02gxruc2h foreign key (group_id) references groups;

ALTER TABLE groups add constraint FKb9i5f3jw8rrurcge9anwl1o9t foreign key (group_category_id) references group_category;

ALTER TABLE groups add constraint FKke9gpecgx7u1oef8lsd9tax3c foreign key (owner_id) references users;

ALTER TABLE images add constraint FKd1n6j98c6ebkpm1qmlfjrg4jf foreign key (media_id) references media;

ALTER TABLE "like" add constraint FKn6yllf2sb7ttvbrwya4lxkx60 foreign key (user_id) references users;

ALTER TABLE media add constraint FKkqrdr00pw2v5k3q4tqv76cy6i foreign key (album_id) references albums;

ALTER TABLE media add constraint FKnd8hh0yn7qvv4pqyk8mg7l1ox foreign key (user_id) references users;

ALTER TABLE media_comment add constraint FKqddyww0crb9h5943ecanke9p2 foreign key (comment_id) references comments;

ALTER TABLE media_comment add constraint FKc4g13ic2kajrl02anuikf5bao foreign key (media_id) references media;

ALTER TABLE media_like add constraint FK2p0b7gpbngslllwcnlovjrhwu foreign key ("like_id") references "like";

ALTER TABLE media_like add constraint FKdq31g0obh9yexo3jy1lx4jvs6 foreign key (media_id) references media;

ALTER TABLE message add constraint FKmejd0ykokrbuekwwgd5a5xt8a foreign key (chat_id) references chat;

ALTER TABLE message add constraint FKgqvw3ustg9m9m8gkc7bnh88yb foreign key (user_sender_user_id) references users;

ALTER TABLE message_like add constraint FKo77h7ssfcsg4u2d3p4xyxj6w2 foreign key ("like_id") references "like";

ALTER TABLE message_like add constraint FK850ba0yc8jqw6xu9eixugnpmc foreign key (message_id) references message;

ALTER TABLE playlist_has_audios add constraint FKifxgpubnspdey7x7876eb5j2o foreign key (audios_id) references audios;

ALTER TABLE playlist_has_audios add constraint FKf94m5c5nwywjn4brktc6f5k2s foreign key (playlist_id) references playlists;

ALTER TABLE playlists add constraint FKtgjwvfg23v990xk7k0idmqbrj foreign key (user_id) references users;

ALTER TABLE post_comment add constraint FKb5nt73rr3r7qun4cihgwpyh9s foreign key (comment_id) references comments;

ALTER TABLE post_comment add constraint FKl6wxpohlclbjykgpkjdqphmfg foreign key (post_id) references posts;

ALTER TABLE post_like add constraint FK41sp7f5q4lce3olirjrdwkn8g foreign key ("like_id") references "like";

ALTER TABLE post_like add constraint FKcf8kqsucxsmplv3xw9gubrql0 foreign key (post_id) references posts;

ALTER TABLE posts add constraint FK5lidm6cqbc7u4xhqpxm898qme foreign key (user_id) references users;

ALTER TABLE reposts add constraint FKersix1dfhot0h5xp4umnh2mgr foreign key (post_id) references posts;

ALTER TABLE reposts add constraint FKdtkd7swbi33b8w536k29yjbom foreign key (user_id) references users;

ALTER TABLE single_chat add constraint FKent72vkye8jx5pivbn0fk0h2m foreign key (chat_id) references chat;

ALTER TABLE user_has_album add constraint FKr45vx07d7vjayb6xr2x4ekirf foreign key (album_id) references albums;

ALTER TABLE user_has_album add constraint FKt6cgvp46b63xrabjx0i9ox3fo foreign key (user_id) references users;

ALTER TABLE users add constraint FKl7ve5em3l5axquvrlf5e39dpl foreign key (active_id) references active;

ALTER TABLE users add constraint FK4qu1gr772nnf6ve5af002rwya foreign key (role_id) references role;

ALTER TABLE users_audios_collections add constraint FK53yqrthjucjf6vqvm26s2il4k foreign key (audio_id) references audios;

ALTER TABLE users_audios_collections add constraint FK94u8ir5f3j7wfwbhyddx826jj foreign key (user_id) references users;

ALTER TABLE users_group_chats add constraint FK27lobqxnhonv6kwn9svndkp3d foreign key (group_chat_id) references group_chat;

ALTER TABLE users_group_chats add constraint FKnkf7ei1oneo72n53x8rw6ht23 foreign key (user_id) references users;

ALTER TABLE users_videos_collections add constraint FKjic2imsrvl3jumk8fcbcafydo foreign key (video_id) references videos;

ALTER TABLE users_videos_collections add constraint FK1ijcokiwo0s5wsl2jidbv071v foreign key (user_id) references users;

ALTER TABLE videos add constraint FKap12qkmsguts1paap4tvqv57k foreign key (media_id) references media;