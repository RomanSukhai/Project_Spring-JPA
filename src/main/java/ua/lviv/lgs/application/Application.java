package ua.lviv.lgs.application;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;


@SpringBootApplication()
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext cx =  SpringApplication.run(Application.class, args);
		UnivercityService univercityService =  cx.getBean(UnivercityService.class);
		
		Univercity univercity = new Univercity();
		univercity.setName("Nerf");
		univercity.setAdressUniversity("Berta 23/34");
		univercity.setCountInst(23);
		univercity.setCountPupils(2000);
		
		System.out.println(univercityService.findByName(univercity.getName()));
		System.out.println(univercityService.findById((long)3));
		univercityService.findByNameReturnsStream(univercity.getName()).forEach(e->System.out.println(e.getName()));
		
		Univercity univercity2 = (Univercity) univercityService.findByName("Bord");
		univercity2.setName("Nertor");
		univercityService.update(univercity2);
		
		univercityService.findAll().stream().forEach(e->System.out.println(e));
		univercityService.deleteById((long)3);
		
	
		
		
	}
}
