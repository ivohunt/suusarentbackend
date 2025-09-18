-- Kustutab public schema (mis põhimõtteliselt kustutab kõik tabelid)
DROP SCHEMA IF EXISTS suusarent CASCADE;
-- Loob uue public schema vajalikud õigused
CREATE SCHEMA suusarent;
-- taastab vajalikud andmebaasi õigused
    GRANT ALL ON SCHEMA suusarent TO postgres;
GRANT ALL ON SCHEMA suusarent TO PUBLIC;