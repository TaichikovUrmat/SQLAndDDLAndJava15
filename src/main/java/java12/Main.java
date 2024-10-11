package java12;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        create database java15;
//
//        ----------------------------------------------------------------------------------------------------------------------
//                ---   DDL
//                        -----------------------------------------------------------------------------------------------------------------
//        ---- для создание таблицу
//        create table users
//                (
//                        id         serial primary key,
//                        first_name VARCHAR(50) not null,
//                last_name  VARCHAR(50),
//                email      VARCHAR(50) unique,
//                gender     VARCHAR(50),
//                age        VARCHAR(50),
//                language   VARCHAR(50)
//);
//
//        ----- для  добавление данный на таблицу
//        insert into users(first_name, last_name, email, gender, age, language)
//        values ('Urmat', 'Taichikov', 'urmat@gmail.com', 'male', '21', 'java15'),
//                ('samat', 'Taichikov', 'urmat@gmail.com', 'male', '21', 'java15'),
//        ('Muxammed', 'Taichikov', 'urmat@gmail.com', 'male', '21', 'java15'),
//        ('Aziat', 'Taichikov', 'urmat@gmail.com', 'male', '21', 'java15');
//
//        ----Для добавление нового поле/столбца в таблицу
//        alter table users
//        add column_name date;
//
//        ----Для добавление нового поле/столбца в таблицу
//        ALTER TABLE users
//        ADD address VARCHAR(100);
//
//        -- Удаление столбца из таблица:
//        alter table users
//        drop column address;
//
//        ---для удаление таблицу по имени
//        drop table users;
//
//        -- TRUNCATE TABLE — очистка данных таблицы users, но сохранение структуры:
//        truncate table users;
//
//
//
//        ----------------------------------------------------------------------------------------------------------------------
//                --  DLM
//                        ----------------------------------------------------------------------------------------------------------------------
//        INSERT INTO users (first_name, last_name, email, gender, age, language)
//        VALUES ('Urmat', 'Taichikov', 'urmat@gmail.com', 'male', 21, 'Java'),
//                ('Samat', 'Bekov', 'samat@gmail.com', 'male', 22, 'Python'),
//        ('Aizat', 'Taichikova', 'aizat@gmail.com', 'female', 20, 'JavaScript');
//
//
//        -- UPDATE — обновление данных в таблице users:
//        UPDATE users
//        SET age   = 25,
//                email = 'newemail@gmail.com'
//        WHERE first_name = 'Urmat'
//        AND last_name = 'Taichikov';
//
//        -- DELETE — удаление данных из таблицы users:
//        DELETE
//        FROM users
//        WHERE first_name = 'Samat'
//        AND last_name = 'Bekov';
//
//        -- SELECT — выборка данных из таблицы users:
//        select *
//        from users;
//
//        -- Выбор данных по условию:
//        SELECT *
//        FROM users
//        WHERE age < 26;
//
//        -- 2  вариант
//        SELECT *
//        FROM users
//        WHERE age::integer < 25;
//
//        --- Выбор с сортировкой. asc and desc:
//        SELECT *
//        FROM users
//        ORDER BY age DESC;
//
//        --- Выбор уникальных значений:
//        SELECT DISTINCT language
//        FROM users;
//
//        -- JOIN — соединение данных с другой таблицей:
//        -- SELECT u.first_name, u.last_name, c.course_name
//                -- FROM users u
//                --          JOIN courses c ON u.id = c.user_id;
//
//        -- Группировка данных (GROUP BY) — для создания агрегированных отчетов:
//        SELECT gender, COUNT(*)
//        FROM users
//        GROUP BY gender;
//
//        -- Агрегационные функции — такие как SUM(), AVG(), MIN(), MAX():
//        -- SELECT MAX(age) AS average_age
//        -- FROM users;
//
//        SELECT first_name, last_name
//        FROM users
//        WHERE age = (SELECT MAX(age) FROM users);
//
//
//
//
//


    }
}