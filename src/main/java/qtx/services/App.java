package qtx.services;

 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import qtx.entitys.Department;
import qtx.entitys.Address;
import qtx.entitys.Employee;
import qtx.entitys.Nationality;
import qtx.entitys.NombreCompleto;
import qtx.entitys.Person;
import qtx.entitys.Project;

public class App {

	public static void main(String[] args) throws ParseException {	
		Services serv = new Services();
		PersonService pserv = new PersonService();
		
		List<Project> projectList = new ArrayList<>();
		Project project1 = new Project("Sistema de Automatizacion de Creditos");
		Project project2 = new Project("Sistema de Automatizacion de Transacciones");
		Project project3 = new Project("Sistema de Aprobacion de Creditos");
		
		List<Project> projectList2 = new ArrayList<>();
		Project project4 = new Project("Plataforma Automatizacion de Creditos");
		Project project5 = new Project("Plataforma Automatizacion de Transacciones");
		Project project6 = new Project("Plataforma de Aprobacion de Creditos");
		
		
		projectList.add(project1);
		projectList.add(project2);
		projectList.add(project3);
		
		projectList2.add(project4);
		projectList2.add(project5);
		projectList2.add(project6);
		
 
		Department depIT = new Department();
		depIT.setName("IT");
		depIT.setProjectlist(projectList);
		serv.createDeparmentList(depIT);
 
		Department depMarketing = new Department();
		depMarketing.setName("MARKETING");
		depMarketing.setProjectlist(projectList2);
		serv.createDeparmentList(depMarketing);
		
	     //Create Clas Set2
	      Set<Department> deps = new HashSet();
	      deps.add(depMarketing);
	      deps.add(depIT);
		
		/**
		 * Person elements
		 */
		
		Address add = new Address();
		add.setCalle("Bermudez");
		add.setCiudad("San Juan de los Morros");
		add.setNumero("8");
		
		pserv.createAddrees(add);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date fechanacimiento = sf.parse("1981-10-06");
		
		Nationality nationality = new Nationality();
		nationality.setName("Venezolano");
		serv.createNationality(nationality);
		
		Person person = new Person();
		person.setNombre("Manuelon");
		person.setClave("999");
		person.setDni(98765433);
		person.setFechanacimiento(fechanacimiento);
//		person.getDepartments().add(depIT);
//		person.getDepartments().add(depMarketing);
//		person.setDepartments(deps);
		NombreCompleto ncm = new NombreCompleto();
		ncm.setPrimernombre("Manuel");
		ncm.setSegundonombre("Orlando");
		ncm.setPrimerapellido("Martinez");
		ncm.setSegundoapellido("Gutierrez");
		person.setNombreCompleto(ncm);
		person.setDireccion(add);
		person.setNationality(nationality);
		
		pserv.createPerson(person);
		
		
		//--------Person 2
		Address add2 = new Address();
		add2.setCalle("Anchorena");
		add2.setCiudad("Puerto Madri");
		add2.setNumero("28");
		
		pserv.createAddrees(add2);
		
		Nationality nationality2 = new Nationality();
		nationality2.setName("Argentino");
		serv.createNationality(nationality2);
		
		Person person2 = new Person();
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date fechanacimiento2 = sf2.parse("1995-11-29");
		person2.setNombre("Chango");
		person2.setClave("23");
		person2.setDni(3866544);
		person2.setFechanacimiento(fechanacimiento2);
		person2.setNationality(nationality);
//		person2.getDepartments().add(depIT);
//		person2.getDepartments().add(depMarketing);
//		person2.setDepartments(deps);
		NombreCompleto nc = new NombreCompleto();
		nc.setPrimernombre("Jorge");
		nc.setSegundonombre("Chango");
		nc.setPrimerapellido("Andrade");
		nc.setSegundoapellido("Garcia");
		person2.setNombreCompleto(nc);
		person2.setDireccion(add2);
		
		pserv.createPerson(person2);
		
		//person 3
		
		Address add3 = new Address();
		add3.setCalle("Mata redonda");
		add3.setCiudad("Maracay");
		add3.setNumero("18");
		
		pserv.createAddrees(add3);
		
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date fechanacimiento3 = sf3.parse("2008-08-09");
		
		Nationality nationality3 = new Nationality();
		nationality3.setName("Venezolano");
		serv.createNationality(nationality3);
		
		Person person3 = new Person();
		person3.setNombre("manuelito");
		person3.setClave("444");
		person3.setDni(99765433);
		person3.setFechanacimiento(fechanacimiento3);
		
		NombreCompleto nc3 = new NombreCompleto();
		nc3.setPrimernombre("Manuel");
		nc3.setSegundonombre("Alejandro");
		nc3.setPrimerapellido("Martinez");
		nc3.setSegundoapellido("Fuguett");
		person3.setNombreCompleto(nc3);
		person3.setDireccion(add3);
		person3.setNationality(nationality3);
//		person3.getDepartments().add(depIT);
//		person3.getDepartments().add(depMarketing);
//		person3.setDepartments(deps);
		
		pserv.createPerson(person3);
		

		
		
	}
}

