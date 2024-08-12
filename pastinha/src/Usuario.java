public class Usuario {

    // atributos
    public String username;
    public String nomeCompleto;
    public String email;
    public int telefone;
    public String dataNascimento;
    public boolean devedor = false;
    public int contador = 5;

    // metodos
    public boolean isDevedor() {
        return devedor;
    }

    // construtor
    public Usuario(String username, String nomeCompleto, String email; int telefone, String dataNascimento){
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public Usuario(){
        username = "userAleatorio";
        nomeCompleto = "nomeAleatorio";
        email = "emailAleatorio@gmail.com";
        telefone = 899999999;
        dataNascimento = "nascimentoAleatorio";
    }

    // metodos
    public void devendo() {
        System.out.println("Usuario devedor.");
        devedor = true;
    }
    public void pagando() {
        System.out.println("Não constam debitos");
        devedor = false;
    }
    public void contadorAtual() {
        contador++;
        System.out.println("A idade do usuario é" + contador);
    }



}
