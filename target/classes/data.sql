CREATE TABLE task (
                      id bigint primary key auto_increment,
                      title varchar(200),
                      description varchar(200),
                      points int
);


INSERT INTO task (title, description, points) VALUES(
                                                        'Criar banco de dados',
                                                        'Criar bd oracle na nuvem',
                                                        300
                                                    );

INSERT INTO task (title, description, points) VALUES(
                                                        'Protótipo',
                                                        'Criar protótipo de alta fidelidade',
                                                        150
                                                    );

INSERT INTO task (title, description, points) VALUES(
                                                        'Modelagem de dados',
                                                        'Criar modelo lógico dos dados',
                                                        200
                                                    );
CREATE TABLE login (
                       name varchar(200),
                       email varchar(200),
                       password varchar(200)
);

-- Teste de insert de usuário no oracle
INSERT INTO login (name, email, password) VALUES
    ('Allan Reis', 'rm85619@fiap.com.br', '123456789');