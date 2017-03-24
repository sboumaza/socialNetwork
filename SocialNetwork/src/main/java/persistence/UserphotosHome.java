package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Userphotos.
 * @see .Userphotos
 * @author Hibernate Tools
 */
@Stateless
public class UserphotosHome {

	private static final Log log = LogFactory.getLog(UserphotosHome.class);

	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void persist(Userphotos transientInstance) {
		log.debug("persisting Userphotos instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Userphotos persistentInstance) {
		log.debug("removing Userphotos instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Userphotos merge(Userphotos detachedInstance) {
		log.debug("merging Userphotos instance");
		try {
			Userphotos result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Userphotos findById(UserphotosId id) {
		log.debug("getting Userphotos instance with id: " + id);
		try {
			Userphotos instance = entityManager.find(Userphotos.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
