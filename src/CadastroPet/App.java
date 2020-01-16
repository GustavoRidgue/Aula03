package CadastroPet;

//classe principal
public class App {
    public App() {
    }

    //Metodo q executa o programa. so tem 1 Main
    public static void main (String[] args) {
        //Meu app:
//Instancia/cria um objeto do tipo responsavel
//NAo tem construtor, nao tem nada em parenteses
        Responsavel pessoa1 = new Responsavel(
                "Gustavo",
                "Ridgue",
                "34646-743",
                "570",
                14,
                "guferrari007@gmail.com",
                "979759508"
        );

        System.out.println(pessoa1.getEmail());

        Pet cachorro = new Pet (

                "Bob",
                "Animal",
                "Schitsu",
                2,
                "Castanho claro e escuro e branco",
                pessoa1,
                Pet.TiposCuidados.Fisioterapia.toString()

        );

        System.out.println(pessoa1.retornarTodosDados());

    }
}



