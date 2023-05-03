CREATE TABLE IF NOT EXISTS employee (
    id                  BIGSERIAL PRIMARY KEY,
    first_name          VARCHAR(255) NOT NULL,
    last_name           VARCHAR(255) NOT NULL,
    company             VARCHAR(255) NOT NULL

);