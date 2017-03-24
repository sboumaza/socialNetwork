package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Personalinfo.
 * @see .Personalinfo
 * @author Hibernate Tools
 */
@Stateless
public class PersonalinfoHome {

	private static final Log log = LogFactory.getLog(PersonalinfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Personalinfo transientInstance) {
		log.debug("persisting Personalinfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Personalinfo persistentInstance) {
		log.debug("removing Personalinfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Personalinfo merge(Personalinfo detachedInstance) {
		log.debug("merging Personalinfo instance");
		try {
			Personalinfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Personalinfo findById(PersonalinfoId id) {
		log.debug("getting Personalinfo instance with id: " + id);
		try {
			Personalinfo instance = entityManager.find(Personalinfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
