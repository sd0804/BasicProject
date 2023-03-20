package org.example.collections;
import java.util.stream.*;
import java.util.*;

class MusicalInstrument {
    private String name;
    private String type;
    public MusicalInstrument(String name, String type) {
        setName(name);
        setType(type);
    }
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name=name;
    }
    public String getType() {
        return type;
    }
    public void setType (String type) {
        this.type=type;
    }
    public String toString() {
        return name + " is a " + type + " instrument";
    }
}

class UseComparatorcomparingMethod {
    private static List musicalInstruments=new ArrayList<>();
    static {
        musicalInstruments.add(new MusicalInstrument("Trumpet","brass"));
        musicalInstruments.add(new MusicalInstrument("Tuba","brass"));
        musicalInstruments.add(new MusicalInstrument("Timpani","percussion"));
        musicalInstruments.add(new MusicalInstrument("Piano","keyboard"));
    }
    public static void main (String args[]) {
        System.out.println("Musical instruments in the collection sorted by name:");
        Collections.sort(musicalInstruments, Comparator.comparing((MusicalInstrument instrument) -> instrument.getName()));
        musicalInstruments.stream().forEach(System.out::println);

        System.out.println("Musical instruments in the collection sorted by type:");
        Collections.sort(musicalInstruments, Comparator.comparing((MusicalInstrument instrument) -> instrument.getType()));
        musicalInstruments.stream().forEach(instrument->System.out.println(instrument));
    }
}