package exercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que possibilita o mapeamento de chaves a valores.
 * @author Matheus Gadelha
 *
 * @param <K> Representa um Tipo Parametrizado para o Valor da chave que ser� passado no momento da cria��o do objeto
 * @param <V> Representa um Tipo Parametrizado para o Valor valor que ser� passado no momento da cria��o do objeto
 */
public class Map<K, V> {
	
	/**
	 * Lista que ir� receber e armazenar os valores das chaves e valores respectivamente
	 */
	private List<K> chaves = new ArrayList<>();
	/**
	 * Lista que ir� receber e armazenar os Valores dos valores respectivamente
	 */
	private List<V> valores = new ArrayList<>();

	/**
	 * M�todo que tem como fun��o receber um valor de chave e outro valor para adicionar �s listas
	 * criadas anteriormente
	 * @param chave Valor da chave que ser� inserido no ArrayList Chaves
	 * @param valor Valor que ser� inserido no ArrayList Valor
	 * @return Retorna false se o Valor chave passada no par�metro j� existir na Lista chaves ou false se o Valor n�o existir
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
	 * M�todo que tem como fun��o receber uma chave e retornar o valor associado a essa chave
	 * @param chave Par�metro que ser� utilizado para encontrar o valor associado
	 * @return Retorna o valor associado a chave passada no Par�metro
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
	 * M�todo que remove todos os elementos das Listas chaves e valores
	 */
	public void clear() {
		chaves.clear();
		valores.clear();
	}
}
