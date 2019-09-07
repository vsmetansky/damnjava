package tasks.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

public class Airplane {
    public String model;
    private ArrayList<AirplanePart> parts;
    private ArrayList<City> route;
    private Date departureTime;

    public Airplane() {
        route = new ArrayList<City>();
        parts = new ArrayList<AirplanePart>();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other instanceof Airplane) {
            Airplane otherPlane = (Airplane) other;
            return modelEquals(otherPlane) &&
                    partsEqual(otherPlane) &&
                    routeEquals(otherPlane);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "";
    }

    private boolean modelEquals(Airplane other) {
        return model == other.model;
    }

    private boolean partsEqual(Airplane other) {
//        return parts.sort(Comparator.comparing());
//        //equals(other.parts);
        return false;
    }

    private boolean routeEquals(Airplane other) {
        return model == other.model;
    }

    public void setRoute(LinkedList<City> newRoute) {
        route.clear();
        for (City c : newRoute) {
            route.add(c);
        }
    }
}
