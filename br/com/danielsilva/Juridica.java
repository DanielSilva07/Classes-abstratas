package br.com.danielsilva;

public class Juridica extends  Pessoa {

    private String cnpj ;
    private String irpj ;

    public String getIrpj() {
        return irpj;
    }

    public void setIrpj(String irpj) {
        this.irpj = irpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String sonegacaoDeImposto() {
        return irpj ;
    }
}







