package pl.madison.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.madison.dao.ConstellationDao;
import pl.madison.domain.Constellation;
import pl.madison.utils.ConstellationComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    ConstellationDao constellationDao;

    @RequestMapping(value = "/showStars", method = RequestMethod.GET)
    public String show(){
        String cons = "";

        for (Constellation constellation : constellationDao.findAll()) {
            cons = cons + constellation;
        }

        return cons;
    }

    @RequestMapping(value = "/newOrder", method = RequestMethod.GET)
    public String newOrder(){
        List<Constellation> constellations = new ArrayList<Constellation>();
//        constellations = (List<Constellation>)constellationDao.findAll();

        for (Constellation constellation : constellationDao.findAll()) {
            constellations.add(constellation);
        }

        Collections.sort(constellations, new ConstellationComparator());

        return "new order" + constellations;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update(@RequestParam("id") Long id, @RequestParam("surfaceInDegrees") String surfaceInDegrees,
                         @RequestParam("name") String name, @RequestParam("theBrighestStar") String theBrighestStar){
        Constellation consTemp = constellationDao.findOne(id);
        consTemp.setSurfaceInDegrees(surfaceInDegrees);
        consTemp.setTheBrighestStar(theBrighestStar);
        consTemp.setName(name);
        constellationDao.save(consTemp);

        return "mission has been completed:)";
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public String add(@RequestParam("surfaceInDegrees") String surfaceInDegrees,
                         @RequestParam("name") String name, @RequestParam("theBrighestStar") String theBrighestStar){
//        Constellation consTemp = new Constellation();
//        consTemp.setSurfaceInDegrees(surfaceInDegrees);
//        consTemp.setTheBrighestStar(theBrighestStar);
//        consTemp.setName(name);
//        constellationDao.save(consTemp);

        return "mission has been completed:)";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public String delete(@RequestParam("id") Long id){
        constellationDao.delete(id);

        return "mission has been completed:)";
    }



}
