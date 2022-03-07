package exercicio1;

/**
 * Classe utilizada para testar a aplicação
 * @author Matheus Gadelha
 *
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		//Cria um Objeto do tipo Map utilizando Generics
		Map<Integer, String> map = new Map<>();

		//Utiliza o método "put" do objeto "map" para inserir valores nas listas e mostra na tela o retorno do método que deverá ser true ou false
		//Insere os valores nas listas e retorna true pois a chave "1" não existe na lista
		System.out.println(map.put(1, "a"));
		//Insere os valores nas listas e retorna true pois a chave "2" não existe na lista
		System.out.println(map.put(2, "b"));
		//Insere os valores nas listas e retorna false pois a chave "2" já existia na lista
		System.out.println(map.put(2, "c"));

		//Utiliza o método "get" do objeto "map" para mostrar no console o valor associado a chave "2"
		System.out.println(map.get(2));

		//Remove todos os elementos das Listas chaves e valores
		map.clear();

		//Retorna null pois todos os elementos das listas foram removidos anteriormente
		System.out.println(map.get(2));
	}
}
