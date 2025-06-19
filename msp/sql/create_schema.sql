--TABLA CATEGORÁ
create table if not exists categoria(
    id serial primary key,
    nombre varchar(64) not null unique
);

--TABLA CLIENTE
create table if not exists cliente(
    idC serial primary key,
    nombres varchar(128) not null,
    email varchar(128) not null unique,
    password varchar(255) not null,
    celular bigint,
    direccion text
);

--TABLA PRODUCTO
create table if not exists producto(
    idPro serial primary key,
    nombre varchar(128) not null,
    descripcion text,
    imagen varchar(255),
    cantidad bigint not null,
    precio bigint not null
);

--TABLA PEDIDO
create table if not exists pedido(
    idP serial primary key, 
    cliente_id integer references cliente(idC), 
    fecha_pedido date not null default current_date,
    estado varchar(20) not null
);

--TABLA DET PEDIDO
create table if not exists detalle_pedido(
    id serial primary key,
    pedido_id integer references pedido(idP),  
    producto_id integer references producto(idPro),
    cantidad integer not null,
    precio_total bigint not null
);


create index idx_producto_nombre on producto(nombre);
create index idx_pedido_cliente on pedido(cliente_id);  -- Relación con la tabla cliente
