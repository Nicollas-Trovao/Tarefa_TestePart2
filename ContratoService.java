package Teste;
public class ContratoService implements IContratoService{
	private IContratoDAO contratoDAO;
	
	public ContratoService(IContratoDAO DAO) {
        this.contratoDAO = DAO;
    }

	@Override
	public String salvar() {
		contratoDAO.salvar();
		return "salvo";
	}

	@Override
	public String buscar() {
	    contratoDAO.buscar();
		return "buscando";
	}

	@Override
	public String excluir() {
		contratoDAO.excluir();
		return "apagado";
	}

	@Override
	public String atualizar() {
		contratoDAO.atualizar();
		return "atualizado";
	}

}
