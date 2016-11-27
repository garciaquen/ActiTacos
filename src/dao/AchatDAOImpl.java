package dao;

import model.Achat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AchatDAOImpl implements AchatDAO {



    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addAchat(Achat a) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(a);
    }

    @Override
    public void modifierAchat(Achat a) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(a);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Achat> listAchat() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Achat> achatList = session.createQuery("from Achat").list();
        return achatList;
    }

    @Override
    public Achat getAchatById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Achat a = (Achat) session.load(Achat.class, new Integer(id));
        return a;
    }

    @Override
    public void removeAchat(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Achat a = (Achat) session.load(Achat.class, new Integer(id));
        if(null != a){
            session.delete(a);
        }
    }


}
