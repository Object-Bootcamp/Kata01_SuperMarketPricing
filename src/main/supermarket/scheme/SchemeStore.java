package supermarket.scheme;

import java.util.ArrayList;

public class SchemeStore {
    private ArrayList <Scheme>schemes;

    public SchemeStore() {
        this.schemes = new ArrayList();
    }

    public void registerScheme(Scheme scheme){
        this.schemes.add(scheme);
    }


    public ArrayList<Scheme> getSchemes() {
        return schemes;
    }
}
