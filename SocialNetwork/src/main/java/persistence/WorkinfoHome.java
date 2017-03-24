package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Workinfo.
 * @see .Workinfo
 * @author Hibernate Tools
 */
@Stateless
public class WorkinfoHome {

	private static final Log log = LogFactory.getLog(WorkinfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Workinfo transientInstance) {
		log.debug("persisting Workinfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Workinfo persistentInstance) {
		log.debug("removing Workinfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Workinfo merge(Workinfo detachedInstance) {
		log.debug("merging Workinfo instance");
		try {
			Workinfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workinfo findById(WorkinfoId id) {
		log.debug("getting Workinfo instance with id: " + id);
		try {
			Workinfo instance = entityManager.find(Workinfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
