/*create table dishes (
    dishes_id bigint not null,
    dishes_categories_id bigint,
    carbohydrates varchar(255),
    complexity varchar(255),
    description text,
    dishes_image varchar(255),
    dishes_name varchar(255),
    duration varchar(255),
    energy_value varchar(255),
    fats varchar(255),
    proteins varchar(255),
    primary key (dishes_id));

create table dishes_categories (
    dishes_categories_id bigint not null,
    dishes_categories_name varchar(255),
    primary key (dishes_categories_id));

create table ingredients (
    ingredients_id bigint not null,
    ingredients_measure varchar(255),
    ingredients_name varchar(255),
    primary key (ingredients_id));

create table meals (
    meals_id bigint not null,
    meals_name varchar(255),
    primary key (meals_id));

create table orders (
    id bigint not null,
    dishes_date timestamp(6),
    order_date timestamp(6),
    dishes_id bigint,
    meals_id bigint,
    users_id bigint,
    primary key (id));

create table recipes (
    id bigint not null,
    ingredients_quantity bigint,
    ingredients_id bigint, 
    dishes_id bigint,
    primary key (id));

create table users (
    users_id bigint not null,
    creation_date timestamp(6),
    date_of_birth timestamp(6),
    email varchar(255),
    sex varchar(255),
    password varchar(255),
    first_name varchar(255),
    primary key (users_id));

ALTER TABLE if exists dishes ADD CONSTRAINT dishes_dish_cat_fk FOREIGN KEY (dishes_categories_id) REFERENCES dishes_categories(dishes_categories_id);
ALTER TABLE if exists orders ADD CONSTRAINT orders_meals_fk FOREIGN KEY (meals_id) REFERENCES meals(meals_id);
ALTER TABLE if exists orders ADD CONSTRAINT orders_users_fk FOREIGN KEY (users_id) REFERENCES users(users_id);
ALTER TABLE if exists orders ADD CONSTRAINT orders_dishes_fk FOREIGN KEY (dishes_id) REFERENCES dishes(dishes_id);
ALTER TABLE if exists recipes ADD CONSTRAINT recipes_dishes_fk FOREIGN KEY (dishes_id) REFERENCES dishes(dishes_id);
ALTER TABLE if exists recipes ADD CONSTRAINT recipes_ingredients_fk FOREIGN KEY (ingredients_id) REFERENCES ingredients(ingredients_id);*/