package br.com.danielsilva;

public abstract class Pessoa {

  private   String nome;
  private String endereco;

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public abstract String sonegacaoDeImposto ();




  }






