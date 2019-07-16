package rocks.zipcode.quiz4.collections.culonary;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food <SpiceType extends Class<? extends Spice>> {
    private ArrayList<Spice> spiceList;
    private Map<SpiceType, Integer> spiceMap;


    public Food(){
        this.spiceList = new ArrayList<>();
        this.spiceMap = new LinkedHashMap<>();
    }

    public List<Spice> getAllSpices() {
        return this.spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        for (Spice spice : this.spiceList){
            this.spiceMap.merge(getType(spice), 1, Integer::sum);
        }
        return (Map<SpiceType, Integer>) this.spiceMap;
    }

    public SpiceType getType(Spice spice){
        return (SpiceType) spice.getClass();

        //return spice.getClass().getComponentType().asSubclass(SpiceType);
    }


    public void applySpice(Spice spice) {
        this.spiceList.add(spice);
    }
}
