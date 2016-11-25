
CREATE TABLE category (
    id bigint NOT NULL,
    name character varying(255)
);
ALTER TABLE public.category OWNER TO postgres;

CREATE TABLE cv (
    id bigint NOT NULL,
    education character varying(255),
    experience character varying(255),
    text character varying(1000),
    title character varying(255),
    user_id bigint
);
ALTER TABLE public.cv OWNER TO postgres;


CREATE TABLE cv_category (
    cv_id bigint NOT NULL,
    category_id bigint NOT NULL
);
ALTER TABLE public.cv_category OWNER TO postgres;


CREATE TABLE users (
    id bigint NOT NULL,
    city character varying(255),
    email character varying(255),
    full_name character varying(255),
    password character varying(255),
    phone character varying(255),
    salt character varying(255)
);
ALTER TABLE public.users OWNER TO postgres;

INSERT INTO category (id, name) VALUES (1, 'Работа с персоналом');
INSERT INTO category (id, name) VALUES (2, 'IT');
INSERT INTO category (id, name) VALUES (3, 'Логистика');

INSERT INTO cv (id, education, experience, text, title, user_id) VALUES (1, 'высшее', 3, '
Сентябрь 2012 — по настоящее время (1 год 7 месяцев)
Казанский (Приволжский) федеральный университет (Казань) — Образовательные учреждения
Системный администратор
Сопровождение Linux/POSIX совместимых систем, bash/perl/python скриптинг
Июнь 2011 — август 2012 (1 год 3 месяца)
Казанский (Приволжский) федеральный университет (Казань, kpfu.ru) — Образовательные учреждения
Техник
поддержка и сопровождение пользователей ПК', 'Программист-разработчик', 1);
INSERT INTO cv (id, education, experience, text, title, user_id) VALUES (2, 'среднее', 1, 'Обо мне: Имею опыт работы водитель-экспедитор. Хорошо знаю город. Имею л/с транспорт. Езжу аккуратно. Права кат в C. Имею опыт управления грузовым а/м газель. Экспедиторские работы знаю. Полная занятость. Разрешение на работу: Россия', 'Водитель', 1);

INSERT INTO cv_category (cv_id, category_id) VALUES (2, 3);
INSERT INTO cv_category (cv_id, category_id) VALUES (1, 2);
INSERT INTO cv_category (cv_id, category_id) VALUES (1, 1);

INSERT INTO users (id, city, email, full_name, password, phone, salt) VALUES (1, 'Казань', 'alex@gmail.com', 'Александр Семенов', 'alex', '2121212', 'alex');
--
-- TOC entry 1816 (class 2606 OID 157663)
-- Dependencies: 162 162 1941
-- Name: category_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY category
    ADD CONSTRAINT category_pkey PRIMARY KEY (id);


--
-- TOC entry 1814 (class 2606 OID 157658)
-- Dependencies: 161 161 1941
-- Name: cv_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY cv
    ADD CONSTRAINT cv_pkey PRIMARY KEY (id);

--
-- TOC entry 1824 (class 2606 OID 157695)
-- Dependencies: 167 167 1941
-- Name: users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace:
--

ALTER TABLE ONLY users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 1831 (class 2606 OID 157726)
-- Dependencies: 166 161 1813 1941
-- Name: fk_657k0el30mfwv4qe8u0kli22i; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cv_category
    ADD CONSTRAINT fk_657k0el30mfwv4qe8u0kli22i FOREIGN KEY (cv_id) REFERENCES cv(id);


--
-- TOC entry 1830 (class 2606 OID 157721)
-- Dependencies: 1815 166 162 1941
-- Name: fk_bw417f4jltlg654wqk337ytmd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cv_category
    ADD CONSTRAINT fk_bw417f4jltlg654wqk337ytmd FOREIGN KEY (category_id) REFERENCES category(id);


--
-- TOC entry 1825 (class 2606 OID 157696)
-- Dependencies: 167 1823 161 1941
-- Name: fk_n6x3soua7g9nuhkfud47meis5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cv
    ADD CONSTRAINT fk_n6x3soua7g9nuhkfud47meis5 FOREIGN KEY (user_id) REFERENCES users(id);

--
-- TOC entry 1946 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2014-03-29 06:26:46 MSK

--
-- PostgreSQL database dump complete
--
