package controller;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Alunos;

public class HibernateUtil {
	private static final SessionFactory factory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		Configuration configuration = new Configuration();
		
		configuration.addAnnotatedClass(Alunos.class);
		
		configuration.configure();
		
		return configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}