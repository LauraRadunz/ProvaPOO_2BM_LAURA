package Model;
public class Cliente extends Pessoa {
    String cpf;

    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }

    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone);
        if (cpf.length() != 11) {
            System.out.println("Não é possível inserir um CPF com dígitos diferentes de 11");
        } else {
            this.cpf = cpf;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            System.out.println("Não é possível inserir um CPF com dígitos diferentes de 11");
        } else {
        this.cpf = cpf;
        }
    }


}
