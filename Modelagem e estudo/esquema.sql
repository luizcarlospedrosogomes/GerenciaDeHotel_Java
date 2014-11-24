
create table hospede(
             codigo serial  primary key,
             nome vachar(100),
			 cpf  varchar(20));

create table quarto(
       codigo serial primary key,
       numero integer);

create table status(
codigo serial primary key,
cod_cliente   integer,
cod_quarto    integer);

create table servico(

codigo serial primary key,
descricao     varchar(60),
valor         numeric(9,2));


create table consumo_servico(
codigo serial primary key,
cod_servico   integer,
cod_cliente   integer);

create table reserva(
codigo serial primary key,
cod_cliente   integer,
data_inicio   date,
data_fim      date,
confirmado    integer
);

create table checkout(
codigo serial primary key,
cod_cliente  integer,
data_checkout  date);

create table checkin(
codigo serial primary key,
cod_cliente  integer,
data_checkin  date);

alter table status add foreign key (cod_cliente) references hospede(codigo);
alter table status add foreign key (cod_quarto) references quarto(codigo);
alter table consumo_servico add foreign key (cod_servico) references servico(codigo);
alter table consumo_servico add foreign key (cod_cliente) references hospede(codigo);
alter table checkout add foreign key (cod_cliente) references hospede(codigo);
alter table checkin add foreign key (cod_cliente) references hospede(codigo);
alter table reserva add foreign key (cod_cliente) references hospede(codigo);

alter table hospede add constraint cpf_unico unique(cpf);

alter table quarto add column tipo integer;
alter table quarto add constraint quarto_numero unique(numero);