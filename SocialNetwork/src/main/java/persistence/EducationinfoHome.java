package persistence;

// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Educationinfo.
 * @see .Educationinfo
 * @author Hibernate Tools
 */
@Stateless
public class EducationinfoHome {

	private static final Log log = LogFactory.getLog(EducationinfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Educationinfo transientInstance) {
		log.debug("persisting Educationinfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Educationinfo persistentInstance) {
		log.debug("removing Educationinfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Educationinfo merge(Educationinfo detachedInstance) {
		log.debug("merging Educationinfo instance");
		try {
			Educationinfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Educationinfo findById(EducationinfoId id) {
		log.debug("getting Educationinfo instance with id: " + id);
		try {
			Educationinfo instance = entityManager.find(Educationinfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
