package services;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import listener.LocalEntityManagerFactory;

import javax.ws.rs.core.Response;


import persistence.Users;
import persistence.UsersHome;

@Component

@Path("/classes")

public class ClasseService {

	public ClasseService() {
		System.out.println("Creation de ClasseService :" + this.toString());
	}

	@Autowired
	private UsersHome userdao;

	@GET
	@Path("/user")
	public Response listAll() {
		System.out.println("******************test****************************************");
		
		   EntityManager em = LocalEntityManagerFactory.createEntityManager();
		Users user = new Users();

		
		//user.setEmail(mail);
		user.setFirstName("toto12");
		user.setLastName("loulou1");
		user.setPassword("lolo1");
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		LocalEntityManagerFactory.createEntityManager();
		System.out.println(user);
		
		System.out.println(em.find(Users.class, 12).getFirstName());
		System.out.println("******************test****************************************");
		
		
		return Response.status(200).build();
	}

	
}