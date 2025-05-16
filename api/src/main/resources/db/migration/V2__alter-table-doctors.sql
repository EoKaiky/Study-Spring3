ALTER TABLE tb_doctors
  RENAME COLUMN nome TO name,
  ADD telefone VARCHAR(20) NOT NULL;