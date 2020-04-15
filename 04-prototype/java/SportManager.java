import java.util.HashMap;
public class SportManager {
    private HashMap<String, Sport> managerMap = new HashMap<>();

    public void register(String name,Sport sport) { 
        managerMap.put(name, sport); 
    } 
    public Sport create(String name) { 
        return managerMap.get(name).cloneSport(); 
    }

}
