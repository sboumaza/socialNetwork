package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Uservideos.
 * @see .Uservideos
 * @author Hibernate Tools
 */
@Stateless
public class UservideosHome {

	private static final Log log = LogFactory.getLog(UservideosHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Uservideos transientInstance) {
		log.debug("persisting Uservideos instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Uservideos persistentInstance) {
		log.debug("removing Uservideos instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Uservideos merge(Uservideos detachedInstance) {
		log.debug("merging Uservideos instance");
		try {
			Uservideos result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Uservideos findById(UservideosId id) {
		log.debug("getting Uservideos instance with id: " + id);
		try {
			Uservideos instance = entityManager.find(Uservideos.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
