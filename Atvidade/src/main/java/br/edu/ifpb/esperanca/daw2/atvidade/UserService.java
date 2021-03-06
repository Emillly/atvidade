package br.edu.ifpb.esperanca.daw2.atvidade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.atvidade.ProfessorDAO;
import br.edu.ifpb.esperanca.daw2.atvidade.Professor;
import br.edu.ifpb.esperanca.daw2.atvidade.TransacionalCdi;

public class UserService implements Serializable, Service<Professor>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private ProfessorDAO userDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Professor user) {
		userDAO.save(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Professor user)  {
			userDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Professor user) {
		userDAO.remove(user);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Professor getByID(long userId)  {
			return userDAO.getByID(userId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Professor> getAll() {
			return userDAO.getAll();
	}
}
