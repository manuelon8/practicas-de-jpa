package testhibernate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javassist.Loader.Simple;
import qtx.entitys.NombreCompleto;
import qtx.entitys.Person;
import qtx.services.PersonService;

public class insertTest {
	
	public static void main(String[] args) {
		PersonService ps = new PersonService();
//		Persona nuevaPersona = getPersona();
//		
//		
//		if(ps.insertPersona(nuevaPersona)) {
//			System.out.println("Persona Insertada");
//		}
//		else {
//			System.out.println("Persona no Insertada");
//		}
//		
		
	}

//	private static Persona getPersona() {
//		Persona persona = new Persona();
//		try {
//			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//			Date fechanacimiento = sf.parse("2008-08-09");
// 
//			NombreCompleto nombreCompleto = new NombreCompleto("Manuel", "Alejandro", "Martinez", "Gutierrez");
//		    Persona per = new Persona("Manulito", "123", 967879, "Parque Patricios",  fechanacimiento, nombreCompleto);
// 		  
//		    return per;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return persona;
//	}

}
