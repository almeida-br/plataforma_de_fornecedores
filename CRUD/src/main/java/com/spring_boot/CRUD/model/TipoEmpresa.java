package com.spring_boot.CRUD.model;

public enum CompanyCategory {


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
