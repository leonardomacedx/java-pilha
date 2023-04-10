public class TesteConexao {

    public static void main(String[] args) {


        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException exception) {
            System.out.println("Deu erro na conexão!");
        }

        //------------------------

        try (Conexao con = new Conexao()) {
            con.leDados();
        } catch (IllegalStateException exception) {
            System.out.println("Deu erro na conexão!");
        }
    }
}
