package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Photos.
 * @see .Photos
 * @author Hibernate Tools
 */
@Stateless
public class PhotosHome {

	private static final Log log = LogFactory.getLog(PhotosHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Photos transientInstance) {
		log.debug("persisting Photos instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Photos persistentInstance) {
		log.debug("removing Photos instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Photos merge(Photos detachedInstance) {
		log.debug("merging Photos instance");
		try {
			Photos result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Photos findById(Integer id) {
		log.debug("getting Photos instance with id: " + id);
		try {
			Photos instance = entityManager.find(Photos.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
