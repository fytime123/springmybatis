
use testDataBase;

drop table if exists tb_user;

CREATE TABLE if not exists `tb_user`(
                                 `id` varchar(36) NOT NULL primary key,
                                 `username` varchar(45) DEFAULT NULL,
                                 `password` varchar(36) DEFAULT NULL,
                                 `age` integer(11) DEFAULT NULL															
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

show columns from tb_user;

insert into tb_user (id, username, password, age) values ('12345678','haha','123',12);

select * from tb_user;