package pl.madison.utils;

import pl.madison.domain.Constellation;

import java.util.Comparator;

public class ConstellationComparator implements Comparator<Constellation> {

    public int compare(Constellation o1, Constellation o2) {
        return o2.getSurfaceInDegrees().compareTo(o1.getSurfaceInDegrees());
    }
}
