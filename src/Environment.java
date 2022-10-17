import java.util.HashMap;
import java.util.Map.Entry;

class Environment {
    private HashMap<String,Boolean> variableValues = new HashMap<String,Boolean>();
    public Environment() { }
    public void setVariable(String name, Boolean value) {
        variableValues.put(name, value);
    }

    public Boolean getVariable(String name){
        Boolean value = variableValues.get(name);
        if (value == null) { System.err.println("Variable not defined: "+name); System.exit(-1); }
        return value;
    }
    public Boolean containsKey(String input){
        if(variableValues.containsKey(input)){
            return true;
        }
        return false;
    }

    public Boolean toBoolean(int input){
        if(input == 1){
            return true;
        }else if(input == 0){
            return false;
        }
        return null; //TODO error handling
    }

    public String toString() {
        String table = "";
        for (Entry<String,Boolean> entry : variableValues.entrySet()) {
            table += entry.getKey() + "\t-> " + entry.getValue() + "\n";
        }
        return table;
    }
}

