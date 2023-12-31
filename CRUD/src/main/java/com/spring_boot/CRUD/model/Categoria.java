package com.spring_boot.CRUD.model;

public enum ItemCategory {
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
