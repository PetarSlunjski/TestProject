--CREATE DATABASE vjezbaDogadaji OWNER = "postgres" TEMPLATE = "template0" ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';
--CREATE USER pslunjski WITH PASSWORD 'pslunjski';
--GRANT ALL PRIVILEGES ON SCHEMA planerdogadaja TO pslunjski;
--GRANT SELECT, INSERT, UPDATE, DELETE, TRUNCATE ON ALL TABLES IN SCHEMA planerdogadaja TO pslunjski;
--GRANT USAGE ON ALL SEQUENCES IN SCHEMA planerdogadaja TO pslunjski;

CREATE TABLE
    tip_organizacijske_jedinice
    (
        sifra SERIAL NOT NULL,
        nazv CHARACTER VARYING(255) NOT NULL,
        aktivan BOOLEAN NOT NULL,
        PRIMARY KEY (sifra)
    );

CREATE TABLE
    organizacijska_jedinica
    (
        sifra SERIAL NOT NULL,
        nazv CHARACTER VARYING(255) NOT NULL,
        opis CHARACTER VARYING(255),
        tip_org_jed INTEGER NOT NULL,
        org_jed INTEGER NOT NULL,
        PRIMARY KEY (sifra),
        CONSTRAINT organizacija_jedinica_tip_org_jed_fkey FOREIGN KEY (tip_org_jed) REFERENCES "tip_organizacijske_jedinice" ("sifra"),
        CONSTRAINT organizacijska_jedinica_org_jed_fkey FOREIGN KEY (org_jed) REFERENCES "organizacijska_jedinica" ("sifra")
    );

CREATE TABLE
    velicina_grada
    (
        sifra SERIAL NOT NULL,
        nazv CHARACTER VARYING(255) NOT NULL,
        aktivan BOOLEAN NOT NULL,
        PRIMARY KEY (sifra)
    );

CREATE TABLE
    grad
    (
        sifra SERIAL NOT NULL,
        nazv CHARACTER VARYING(255) NOT NULL,
        PRIMARY KEY (sifra),
        velicina_grada INTEGER NOT NULL,
        org_jed INTEGER NOT NULL,
        CONSTRAINT grad_velicina_grada_fkey FOREIGN KEY (velicina_grada) REFERENCES "velicina_grada" ("sifra"),
        CONSTRAINT grad_org_jed_fkey FOREIGN KEY (org_jed) REFERENCES "organizacijska_jedinica" ("sifra")
    );

CREATE TABLE
    dogadaj
    (
        sifra SERIAL NOT NULL,
        naziv CHARACTER VARYING(255),
        vrijemeOd TIMESTAMP(6) WITHOUT TIME ZONE NOT NULL,
        vrijemeDo TIMESTAMP(6) WITHOUT TIME ZONE,
        slobodan_ulaz INTEGER NOT NULL,
        grad INTEGER NOT NULL,
        PRIMARY KEY (sifra),
        CONSTRAINT dogadaj_grad_pkey FOREIGN KEY (grad) REFERENCES "grad" ("sifra")
    );