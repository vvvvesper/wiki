drop table if exists `test`;
create table test(
    `id` int not null,
    `username` varchar (50),
    `password` varchar (250),
    primary key (`id`)
)engine=innodb default charset=utf8mb4 comment='测试';

insert into test(`id`,`username`,`password`) values(1,"zhangsan","1234567890");