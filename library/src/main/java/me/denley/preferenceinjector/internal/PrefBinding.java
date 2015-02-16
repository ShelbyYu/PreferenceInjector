package me.denley.preferenceinjector.internal;

/**
 * Created by Denley on 16/02/2015.
 */
public class PrefBinding implements Binding {
    private final String name;
    private final String type;

    public PrefBinding(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override public String getName(){
        return name;
    }

    @Override public String getType(){
        return type;
    }

    @Override public String getDescription() {
        return "field '" + name + "'";
    }

}
