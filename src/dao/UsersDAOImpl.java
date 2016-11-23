package dao;

import model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ratierchar on 23/11/16.
 */
@Repository
public class UsersDAOImpl implements UsersDAO {



	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(Users u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
	}

	@Override
	public void updateUser(Users u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> listUsers() {
		/*Session session = this.sessionFactory.getCurrentSession();
		List<Users> usersList = session.createQuery("from Users").list();
		return usersList;*/
		return null;
	}

	@Override
	public Users getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Users u = (Users) session.load(Users.class, new Integer(id));
		return u;
	}

	@Override
	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Users p = (Users) session.load(Users.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
	}


}
