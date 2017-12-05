package pl.madison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.madison.dao.ConstellationDao;
import pl.madison.domain.Constellation;

@SpringBootApplication
public class ConstallationApplication implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(ConstallationApplication.class, args);
    }


    @Autowired
    ConstellationDao constellationDao;

//    public Constellation createConstellation(String name, String surfaceInDegrees, String theBrighestStar){
//        Constellation c = new Constellation();
//        c.setName(name);
//        c.setSurfaceInDegrees(surfaceInDegrees);
//        c.setTheBrighestStar(theBrighestStar);
//        return c;
//    }

    public void run(String... strings) throws Exception {
//        Constellation c1 = new Constellation();
//        Constellation c2 = new Constellation();
//        Constellation c3 = new Constellation();
//        Constellation c4 = new Constellation();
//
//        c1.setName("Aries");
//        c2.setName("Cassiopeia");
//        c3.setName("Lyra");
//        c4.setName("Orion");
//
//        c1.setSurfaceInDegrees("441");
//        c2.setSurfaceInDegrees("598");
//        c3.setSurfaceInDegrees("286");
//        c4.setSurfaceInDegrees("594");
//
//
//        c1.setTheBrighestStar("Hamal");
//        c2.setTheBrighestStar("Cih");
//        c3.setTheBrighestStar("Vega");
//        c4.setTheBrighestStar("Rigel");
//
//        constellationDao.save(c1);
//        constellationDao.save(c2);
//        constellationDao.save(c3);
//        constellationDao.save(c4);
    }
}
