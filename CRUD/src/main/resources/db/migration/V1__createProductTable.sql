CREATE TABLE product{
    id INT NOT NULL PRIMARY KEY;
    descricao VARCHAR(100) NOT NULL;
    preco_em_centavos INT NOT NULL;
    data_cadastro DATE NOT NULL;
}