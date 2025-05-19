alter table tb_doctors add ativo tinyint;
update tb_doctors set ativo = 1;
alter table tb_doctors modify column ativo tinyint(1) not null;