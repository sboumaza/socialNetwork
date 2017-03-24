package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Schoolprograms.
 * @see .Schoolprograms
 * @author Hibernate Tools
 */
@Stateless
public class SchoolprogramsHome {

	private static final Log log = LogFactory.getLog(SchoolprogramsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Schoolprograms transientInstance) {
		log.debug("persisting Schoolprograms instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Schoolprograms persistentInstance) {
		log.debug("removing Schoolprograms instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Schoolprograms merge(Schoolprograms detachedInstance) {
		log.debug("merging Schoolprograms instance");
		try {
			Schoolprograms result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Schoolprograms findById(Integer id) {
		log.debug("getting Schoolprograms instance with id: " + id);
		try {
			Schoolprograms instance = entityManager.find(Schoolprograms.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
