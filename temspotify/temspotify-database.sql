create database temspotify;
use temspotify;
create user 'temspotify'@'localhost' identified by 'T3m@ulA!';
grant all privileges on temspotify.* to 'temspotify'@'localhost';

use temspotify;

create table tb_Musica (
    idMusica int not null auto_increment,
    artista varchar(100),
    album varchar(100),
    estilo int, 
    linkMP3 text,

    constraint pk_musica primary key(idMusica)
);

create table tb_Usuario (
    idUsuario int not null auto_increment,
    nome varchar(100),
    email varchar(100),
    senha varchar(20),

    constraint pk_usuario primary key (idUsuario)
);

create table tb_Playlist(
    idPlaylist int not null auto_increment,
    titulo varchar(150),
    idUsuario int not null,

    constraint pk_playlist primary key (idPlaylist),
    constraint fk_usuario foreign key (idUsuario) references tb_Usuario(idUsuario)
);

create table tb_MusicaPlaylist (
    idPlaylist int not null,
    idMusica int not null,

    constraint pk_mp primary key (idPlaylist, idMusica),
    constraint fk_pl foreign key (idPlaylist) references tb_Playlist(idPlaylist),
    constraint fk_mu foreign key (idMusica) references tb_Musica(idMusica)
);

insert into tb_Usuario values (null, 'Jean Jean', 'jean@jean.ca', '1234');
insert into tb_Usuario values (null, 'Marie Marie', 'marie@marie.ca', '1234');
insert into tb_Usuario values (null, 'Carole Carole', 'carole@carole.ca', '1234');
insert into tb_Usuario values (null, 'Paul Paul', 'paul@paul.ca', '1234');

