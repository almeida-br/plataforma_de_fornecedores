package com.spring_boot.plataforma_de_fornecedores.model.product;

public enum Category {
    FOOD{
        @Override
        public String descricaoDeCategoria(){
            return "Alimentício";
        }
    },
    DESIGN{
        @Override
        public String descricaoDeCategoria(){
            return "Design";
        }
    },
    ELECTRONICS{
        @Override
        public String descricaoDeCategoria(){
            return "Eletrônicos";
        }
    },
    MATERIA_PRIMA{
        @Override
        public String descricaoDeCategoria(){
            return "Matéria-prima";
        }
    };
    public abstract String descricaoDeCategoria();
}
