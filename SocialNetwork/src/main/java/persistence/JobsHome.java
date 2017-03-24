package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Jobs.
 * @see .Jobs
 * @author Hibernate Tools
 */
@Stateless
public class JobsHome {

	private static final Log log = LogFactory.getLog(JobsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Jobs transientInstance) {
		log.debug("persisting Jobs instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Jobs persistentInstance) {
		log.debug("removing Jobs instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Jobs merge(Jobs detachedInstance) {
		log.debug("merging Jobs instance");
		try {
			Jobs result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Jobs findById(Integer id) {
		log.debug("getting Jobs instance with id: " + id);
		try {
			Jobs instance = entityManager.find(Jobs.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
