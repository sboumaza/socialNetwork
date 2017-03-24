package persistence;// default package
// Generated 17 mars 2017 11:03:09 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Relationships.
 * @see .Relationships
 * @author Hibernate Tools
 */
@Stateless
public class RelationshipsHome {

	private static final Log log = LogFactory.getLog(RelationshipsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Relationships transientInstance) {
		log.debug("persisting Relationships instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Relationships persistentInstance) {
		log.debug("removing Relationships instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Relationships merge(Relationships detachedInstance) {
		log.debug("merging Relationships instance");
		try {
			Relationships result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Relationships findById(RelationshipsId id) {
		log.debug("getting Relationships instance with id: " + id);
		try {
			Relationships instance = entityManager.find(Relationships.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
