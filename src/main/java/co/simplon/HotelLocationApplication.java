package co.simplon;

import co.simplon.dao.VilleRepository;
import co.simplon.dao.HotelRepository;
import co.simplon.entities.Hotel;
import co.simplon.entities.Ville;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Random;

@SpringBootApplication
public class HotelLocationApplication implements CommandLineRunner {

	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private VilleRepository villeRepository;


	public static void main(String[] args) {
		SpringApplication.run(HotelLocationApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		villeRepository.save(new Ville(null,"Toulouse",null,null));
		villeRepository.save(new Ville(null,"Lyon",null,null));
		villeRepository.save(new Ville(null,"Paris",null,null));
		Random rnd=new Random();
		villeRepository.findAll().forEach(c->{
			Hotel p=new Hotel();
			p.setHotel(RandomString.make(20));
			p.setDescription(RandomString.make(50));
			p.setLit(rnd.nextInt(10));
			p.setCurrentPrice(50+rnd.nextInt(270));
			p.setPromotion(rnd.nextBoolean());
			p.setSelected(rnd.nextBoolean());
			p.setAvailable(rnd.nextBoolean());
			p.setVille(c);
			hotelRepository.save(p);

			});

		}
	}




