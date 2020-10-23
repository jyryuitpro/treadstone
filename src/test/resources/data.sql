insert into person(`id`, `name`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`, `job`) values (1, 'martin', 'A', 1991, 8, 15, 'programmer');
insert into person(`id`, `name`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (2, 'david', 'B', 1992, 7, 21);
insert into person(`id`, `name`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (3, 'dennis', 'O', 1993, 10, 15);
insert into person(`id`, `name`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (4, 'sophia', 'AB', 1994, 8, 31);
insert into person(`id`, `name`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (5, 'benny', 'A', 1995, 12, 23);

insert into block(`id`, `name`) values (1, 'dennis');
insert into block(`id`, `name`) values (2, 'sophia');

update person set block_id = 1 where id = 3;
update person set block_id = 2 where id = 4;

-- insert into person(`id`, `name`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (1, 'martin', 1991, 8, 15);
-- insert into person(`id`, `name`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (2, 'david', 1992, 7, 21);
-- insert into person(`id`, `name`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (3, 'dennis', 1993, 10, 15);
-- insert into person(`id`, `name`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (4, 'sophia', 1994, 8, 31);
-- insert into person(`id`, `name`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values (5, 'benny', 1995, 12, 23);
-- insert into person(`id`, `name`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`, `job`, `hobby`, `phone_number`, `address`)
--     values (6, 'tony', 1991, 7, 10, 'officer', 'reading', '010-2222-5555', '서울');
-- insert into person(`id`, `name`, `deleted`) values (7, 'andrew', true);