package com.spring_boot.CRUD.model.user;

public enum Category {


    CLIENT{
        @Override
        public String categoriaDaEmpresa(){
            return "Empresa cliente";
        }
    },
    PARTNER{
        @Override
        public String categoriaDaEmpresa(){
            return "Empresa parceira";
        }
    };
    public abstract String categoriaDaEmpresa();

}
