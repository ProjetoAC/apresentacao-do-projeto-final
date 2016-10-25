
-- Table: avicultores


CREATE TABLE avicultores
(
  codigo_avicultor integer primary key NOT NULL,
  nome_avicultor character varying(80),
  email_avicultor character varying(100),
  telefone_avicultor character varying(15),
  celular_avicultor character varying(15),
  senha_avicultor character varying(15),
  observacao_avicultor character varying(500),
  cidade character varying(80),
  nome_cidade character varying(80),
  estado character varying(80),
  login_usuario_avicultor character varying(50),
  codigo_historico_avicultor integer,
  codigo_cidade integer,
  nome_eletricista character varying(50))

------------------------------------------------------------------------
  
ALTER TABLE avicultores
  ADD CONSTRAINT fk_cidades FOREIGN KEY (codigo_cidade)
      REFERENCES cidades (codigo_cidade)
------------------------------------------------------------------------

 ALTER TABLE avicultores
  ADD CONSTRAINT fk_historicos_avicultores FOREIGN KEY (codigo_historico_avicultor)
      REFERENCES historicos_avicultores (codigo_historico_avicultor)


-- Table: eletricistas



CREATE TABLE eletricistas
(
  codigo_eletricista integer primary key NOT NULL,
  nome_eletricista character varying(80),
  email_eletricista character varying(100),
  telefone_eletricista character varying(15),
  celular_eletricista character varying(15),
  senha_eletricista character varying(15),
  observacao_eletricista character varying(500),
  cidade character varying(80),
  nome_cidade character varying(80),
  estado character varying(80),
  login_usuario_eletricista character varying(50),
  codigo_historico_eletricista integer,
  codigo_cidade integer,
  nome_avicultor character varying (80))

  ALTER TABLE eletricistas
  ADD CONSTRAINT fk_cidades FOREIGN KEY (codigo_cidade)
      REFERENCES cidades (codigo_cidade)

 ALTER TABLE eletricistas
  ADD CONSTRAINT fk_historicos_eletricistas FOREIGN KEY (codigo_historico_eletricista)
      REFERENCES historicos_eletricistas (codigo_historico_eletricista)

-- Table: historicos_avicultores


CREATE TABLE historicos_avicultores
(
  codigo_historico_avicultor integer primary key NOT NULL,
  pendente_avicultor character varying(100),
  tb_concluido character varying(50),
  observacao_avicultor character varying(500),
  data_inicio date,
  data_termino date,
  nome_eletricista character varying(80)
)

-- Table: historicos_eletricistas


CREATE TABLE historicos_eletricistas
(
  codigo_historico_eletricista integer primary key NOT NULL,
  pendente_eletricista character varying(100),
  tb_concluido character varying(50),
  observacao_eletricista character varying(500),
  data_inicio date,
  data_termino date,
  nome_avicultor character varying(80)
)


			CREATE TABLE cidades
			(
			  codigo_cidade integer NOT NULL,
			  nome_cidade character varying(100),
			  cidade character varying(100),
			  estado character varying(100),
			  CONSTRAINT cidades_pkey PRIMARY KEY (codigo_cidade)
			)

