package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Status.
 * @see .Status
 * @author Hibernate Tools
 */
@Stateless
public class StatusHome {

	private static final Log log = LogFactory.getLog(StatusHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Status transientInstance) {
		log.debug("persisting Status instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Status persistentInstance) {
		log.debug("removing Status instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Status merge(Status detachedInstance) {
		log.debug("merging Status instance");
		try {
			Status result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Status findById(StatusId id) {
		log.debug("getting Status instance with id: " + id);
		try {
			Status instance = entityManager.find(Status.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
