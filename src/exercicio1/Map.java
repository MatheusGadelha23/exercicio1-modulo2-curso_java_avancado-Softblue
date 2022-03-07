package exercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que possibilita o mapeamento de chaves a valores.
 * @author Matheus Gadelha
 *
 * @param <K> Representa um Tipo Parametrizado para o Valor da chave que será passado no momento da criação do objeto
 * @param <V> Representa um Tipo Parametrizado para o Valor valor que será passado no momento da criação do objeto
 */
public class Map<K, V> {
	
	/**
	 * Lista que irá receber e armazenar os valores das chaves e valores respectivamente
	 */
	private List<K> chaves = new ArrayList<>();
	/**
	 * Lista que irá receber e armazenar os Valores dos valores respectivamente
	 */
	private List<V> valores = new ArrayList<>();

	/**
	 * Método que tem como função receber um valor de chave e outro valor para adicionar às listas
	 * criadas anteriormente
	 * @param chave Valor da chave que será inserido no ArrayList Chaves
	 * @param valor Valor que será inserido no ArrayList Valor
	 * @return Retorna false se o Valor chave passada no parâmetro já existir na Lista chaves ou false se o Valor não existir
	 */
	public boolean put(K chave, V valor) {
		int indice;
		if (chaves.contains(chave)) {
			indice = chaves.indexOf(chave);
			chaves.add(indice, chave);
			valores.add(indice, valor);
			return false;
		}
		chaves.add(chave);
		valores.add(valor);
		return true;
	}

	/**
	 * Método que tem como função receber uma chave e retornar o valor associado a essa chave
	 * @param chave Parâmetro que será utilizado para encontrar o valor associado
	 * @return Retorna o valor associado a chave passada no Parâmetro
	 */
	public V get(K chave) {
		int indice;
		if (chaves.contains(chave)) {
			indice = chaves.indexOf(chave);
			return valores.get(indice);
		}
		return null;
	}

	/**
	 * Método que remove todos os elementos das Listas chaves e valores
	 */
	public void clear() {
		chaves.clear();
		valores.clear();
	}
}
