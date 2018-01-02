package com.cybersoft.specialProject;

import com.cybersoft.specialProject.document.Secenek;
import com.cybersoft.specialProject.document.Soru;
import com.cybersoft.specialProject.repository.SoruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class SpecialProjectApplication extends SpringBootServletInitializer implements CommandLineRunner{

	@Autowired
	SoruRepository soruRepository;
	@Autowired
	MappingMongoConverter mappingMongoConverter;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpecialProjectApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(SpecialProjectApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {

		mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));       // _class üretmesini engellemek için

		// açılışta soruları doldur

		/*List<Secenek> secenekler = new ArrayList<>();
		secenekler.add(new Secenek("A", "Güneş ısı ve ışık kaynağımızdır"));
		secenekler.add(new Secenek("B", "Güneş bize en yakın yıldızdır"));
		secenekler.add(new Secenek("C", "Güneş farklı katmanlardan oluşur"));
		secenekler.add(new Secenek("D", "Güneş’in şekli düzdür"));
		Soru soru1 = new Soru("Fen Bilimleri", "Güneş, Dünya ve Ay", "Güneş’in Yapısı ve Özellikleri", "Güneş ile ilgili verilen bilgilerden hangisi yanlıştır?", secenekler, "D", "coktansecmeli", "kolay");
		soruRepository.insert(soru1);

		List<Secenek> secenekler2 = new ArrayList<>();
		secenekler2.add(new Secenek("A", "Dürbün"));
		secenekler2.add(new Secenek("B", "Teleskop"));
		secenekler2.add(new Secenek("C", "Kamera"));
		secenekler2.add(new Secenek("D", "Mikroskop"));
		Soru soru2 = new Soru("Fen Bilimleri", "Güneş, Dünya ve Ay", "Güneş’in Yapısı ve Özellikleri", "Aşağıdaki araçlardan hangisi ile Güneş gözlemlenebilir?", secenekler2, "B", "coktansecmeli", "orta");
		soruRepository.insert(soru2);

		List<Secenek> secenekler3 = new ArrayList<>();
		secenekler3.add(new Secenek("A", "Bütün yıldızlardan büyük olması"));
		secenekler3.add(new Secenek("B", "Bize en yakın yıldız olması"));
		secenekler3.add(new Secenek("C", "Güneş’in kütlesinin büyük olması"));
		secenekler3.add(new Secenek("D", "Diğer yıldızların küçük olması"));
		Soru soru3 = new Soru("Fen Bilimleri", "Güneş, Dünya ve Ay", "Güneş’in Yapısı ve Özellikleri", "Güneş’in diğer yıldızlardan daha büyük görünmesinin sebebi nedir?", secenekler3, "B", "coktansecmeli", "zor");
		soruRepository.insert(soru3);*/

		List<Soru> findByBransAndUnite = soruRepository.findByBransAndUnite("Fen Bilimleri", "Güneş, Dünya ve Ay", new PageRequest(0, 2));
		for (int i = 0; i < findByBransAndUnite.size(); i++) {
			System.out.println("id -> " + findByBransAndUnite.get(i).getId());
			System.out.println("brans -> " + findByBransAndUnite.get(i).getBrans());
			System.out.println("unite -> " + findByBransAndUnite.get(i).getUnite());
			System.out.println("bolum -> " + findByBransAndUnite.get(i).getBolum());
			System.out.println("metin -> " + findByBransAndUnite.get(i).getMetin());

			System.out.println("secenekler -> ");
			for (int j = 0; j < findByBransAndUnite.get(i).getSecenekler().size(); j++) {
				List<Secenek> secnkler = findByBransAndUnite.get(i).getSecenekler();
				System.out.println("\ttip -> " + secnkler.get(j).getTip());
				System.out.println("\tmetin -> " + secnkler.get(j).getMetin());
			}

			System.out.println("dogruSecenekTip -> " + findByBransAndUnite.get(i).getDogruSecenekTip());
			System.out.println("soruTip -> " + findByBransAndUnite.get(i).getSoruTip());
			System.out.println("zorlukSeviye -> " + findByBransAndUnite.get(i).getZorlukSeviye());
			System.out.println();
			System.out.println();
		}

		//List<Soru> findByBransAndUniteAndBolum = soruRepository.findByBransAndUniteAndBolum("Fen Bilimleri", "Güneş, Dünya ve Ay", "Güneş’in Yapısı ve Özellikleri", new PageRequest(0, 1));


	}
}
