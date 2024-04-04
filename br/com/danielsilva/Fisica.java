package br.com.danielsilva;

public class Fisica extends Pessoa {

    private String cpf ;
    private String irpf ;

    public String getIrpf() {
        return irpf;
    }

    public void setIrpf(String irpf) {
        this.irpf = irpf;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String sonegacaoDeImposto() {
        return irpf ;
    }
}
