import br.com.danielsilva.Fisica;
import br.com.danielsilva.Juridica;
import br.com.danielsilva.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Juridica pessoa = new Juridica();
        pessoa.setNome("Alvaro dias");
        pessoa.setCnpj("200.344");
        pessoa.setIrpj(" Regular ");
        pessoa.setEndereco("Avenida Rio Branco");


        System.out.println("Seu CNPJ é : " + pessoa.getCnpj() + " "  + pessoa.sonegacaoDeImposto());

        Fisica Fisica = new Fisica();
        Fisica.setIrpf(" Irregular ");
        Fisica.setCpf(" 255.66 ");
        Fisica.setEndereco("Abelardo bueno");

        System.out.println("Seu CPF é : " + Fisica.getCpf()  + Fisica.sonegacaoDeImposto());

        System.out.println(pessoa.getEndereco());
        System.out.println(Fisica.getEndereco());










    }
}