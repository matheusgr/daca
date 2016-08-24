//package bootwildfly;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		 http
//		 .httpBasic().and()
//		 .authorizeRequests()
//		 .antMatchers(HttpMethod.GET, "/securitysave").hasRole("ADMIN").and()
//		 .csrf().disable();
//		 http
//		 .csrf().disable();
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("greg").password("turnquist").roles("USER").and().withUser("ollie")
//				.password("gierke").roles("USER", "ADMIN");
//	}
//
//	// @Autowired
//	public void REALconfigureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService());
//	}
//
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		return new UserDetailsService() {
//
//			@Autowired
//			AccountRepository accountrepository;
//			
//			@Override
//			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//				// Account account = accountRepository.findByUsername(username);
//				if ("teste" != null) {
//					return new User(accountrepository.findByUsername(username), "enter", true, true, true, true,
//							AuthorityUtils.createAuthorityList("USER"));
//				} else {
//					throw new UsernameNotFoundException("could not find the user '" + username + "'");
//				}
//			}
//
//		};
//	}
//}