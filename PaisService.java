package service;
import dao.PaisDAO;
import model.Pais;


public class PaisService {
	
	PaisDAO dao = new PaisDAO();
	
	public void criar(Pais pais){
		dao.criar(pais);
	}
	
	public void Atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public void carregar(int id){
		dao.carregar(id);
	}

	
}