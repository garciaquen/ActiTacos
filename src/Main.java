
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.annotations.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.mapping.PersistentClass;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ratierchar on 22/11/16.
 */
public class Main {
	private static final SessionFactory ourSessionFactory;
	private static final ServiceRegistry serviceRegistry;

	static {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addClass(model.TVA.class);
			configuration.addClass(model.Mode_reglement.class);
			configuration.addClass(model.Achat.class);
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() throws HibernateException {
		return ourSessionFactory.openSession();
	}

	public static void main(final String[] args) throws Exception {
		final Session session = getSession();
		try {
			System.out.println("querying all the managed entities...");


			Metamodel model = ourSessionFactory.getMetamodel();
			Set<EntityType<?>> entities = model.getEntities();

			List<?> classes = entities.stream()
					.map(EntityType::getJavaType)
					.filter(Objects::nonNull)
					.collect(Collectors.toList());
			for (Object o :  classes) {
				System.out.println("  " + o);
			}


//			final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
//			for (Object key : metadataMap.keySet()) {
//				final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
//				final String entityName = classMetadata.getEntityName();
//				final Query query = session.createQuery("from " + entityName);
//				System.out.println("executing: " + query.getQueryString());
//				for (Object o : query.list()) {
//					System.out.println("  " + o);
//				}
//			}

		} finally {
			session.close();
		}
	}
}