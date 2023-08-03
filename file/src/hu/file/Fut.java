package hu.file;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Fut {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Kiir szoveg=(Kiir)factory.getBean("kiir");
		szoveg.adatbeker();
		
/*		Beolvas beolvas=(Beolvas)factory.getBean("beolvas");
		beolvas.beolvasas();
		beolvas.tombbe();
		
		Megjelenit megjelenit=(Megjelenit)factory.getBean("megjelnit");
		megjelenit.visszafeleKiir();
*/		
		

	}
}
