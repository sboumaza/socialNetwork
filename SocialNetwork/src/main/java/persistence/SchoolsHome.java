package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Schools.
 * @see .Schools
 * @author Hibernate Tools
 */
@Stateless
public class SchoolsHome {

	private static final Log log = LogFactory.getLog(SchoolsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Schools transientInstance) {
		log.debug("persisting Schools instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Schools persistentInstance) {
		log.debug("removing Schools instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Schools merge(Schools detachedInstance) {
		log.debug("merging Schools instance");
		try {
			Schools result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Schools findById(Integer id) {
		log.debug("getting Schools instance with id: " + id);
		try {
			Schools instance = entityManager.find(Schools.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
