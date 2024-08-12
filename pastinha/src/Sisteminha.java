public class Sisteminha {
    public static void main(String[] args) {
        Usuario usuario = new Usuario ();
        usuario.nomeCompleto = "Ed";
        System.out.println(usuario.nomeCompleto);
        usuario.devendo();
        usuario.contadorAtual();
        usuario.pagando();
        System.out.println(usuario.isDevedor());
    }
    Usuario usuario = new 
