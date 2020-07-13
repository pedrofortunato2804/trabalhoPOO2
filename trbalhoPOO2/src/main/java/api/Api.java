package api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

public class Api {
    private  HttpTransport TRANSPORT;
    private  HttpRequestFactory REQ_FACTORY;
    
    private GenericUrl url;
    
    public Api(String url) {
    	this.url = new GenericUrl(url);
    }
    public Api(GenericUrl genericUrl) {
    	this.url = genericUrl;
    }
    /**
     * Executa a requisição com a URL informada
     * @return Retorna uma resposta HTTP
     * @throws IOException
     */
    public HttpResponse executar() throws IOException {
    	return executar(new HashMap<String,String>());
    }
    /**
     * Executa a requisição com a URL informada sendo necessário informar os parametros do cabeçalho
     * @param cabecalhos Lista mapeada contendo os parametros do cabeçalho
     * @return Resposta da requisição em HTTP
     * @throws IOException
     */
    public HttpResponse executar(Map<String,String> cabecalhos) throws IOException {
    	HttpRequest requisicao = reqFactory().buildGetRequest(url);
    	HttpHeaders cabecalho = new HttpHeaders();
    	for(String chave : cabecalhos.keySet()) {
    		cabecalho.set(chave, cabecalhos.get(chave));
    	}
    	requisicao.setHeaders(cabecalho);
		HttpResponse resposta = requisicao.execute();
		return resposta;
    }
    private  HttpTransport transport() {
        if (null == TRANSPORT) {
            TRANSPORT = new NetHttpTransport();
        }
        return TRANSPORT;
    }
    private  HttpRequestFactory reqFactory() {
        if (null == REQ_FACTORY) {
            REQ_FACTORY = transport().createRequestFactory();
        }
        return REQ_FACTORY;
    }
}
