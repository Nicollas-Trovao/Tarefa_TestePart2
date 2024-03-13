package Teste;

import Teste.IContratoDAO;
import Teste.ContratoDAOMock;
import Teste.ContratoService;
import Teste.IContratoService;

import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTeste {

	@Test
	public void salvarTeste() {
		IContratoDAO SDAO = new ContratoDAOMock();
		IContratoService Sserv = new ContratoService(SDAO);
		String retorno = Sserv.salvar();
        Assert.assertEquals("salvo", retorno);
    }
	
	@Test
	public void buscarTeste() {
		IContratoDAO BDAO = new ContratoDAOMock();
		IContratoService Bserv = new ContratoService(BDAO);
		String retorno = BDAO.buscar();
		Assert.assertEquals("buscando", retorno);
	}
	
	@Test
	public void excluirTeste() {
		IContratoDAO EDAO = new ContratoDAOMock();
		IContratoService Eserv = new ContratoService(EDAO);
		String retorno = EDAO.buscar();
		Assert.assertEquals("apagado", retorno);
	}
	
	@Test 
	public void atualizarTeste() {
		IContratoDAO EDAO = new ContratoDAOMock();
		IContratoService Bserv = new ContratoService(EDAO);
		String retorno = EDAO.buscar();
		Assert.assertEquals("atualizado", retorno);
	}
		
}

