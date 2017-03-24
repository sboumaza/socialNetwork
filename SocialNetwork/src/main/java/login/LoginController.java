package login;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.ldap.userdetails.InetOrgPerson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		// Message d'erreur de login et validation logout
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}

	@RequestMapping("/welcom")
	public String geUserPage(ModelMap model) {
		// Recuperer les Credential du user
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(auth);
		InetOrgPerson userDetails = (InetOrgPerson) (SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal());

		String mail = userDetails.getMail();
		String[] userCn = userDetails.getCn();
		String userSn = userDetails.getSn();
		String[] userName = userCn[0].split(" ", 2);

		model.addAttribute("userSn", userSn);
		model.addAttribute("userCn", userName[0]);
		model.addAttribute("mail", mail);

		return "/welcom";
	}

	@RequestMapping("/admin")
	// Gestion de la page admin
	public String geAdminPage(ModelMap model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();

		@SuppressWarnings("unchecked")
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) auth.getAuthorities();

		model.addAttribute("username", username);
		return "/admin";
	}

	@RequestMapping("/403page")
	// Gestion acces non authorisé
	public String ge403denied() {
		return "/unauthorized";
	}
}