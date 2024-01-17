package homework.pattern.factory;

public class DeplaningFactory {
    public static void main(String[] args) {
        System.out.println(getType("Priority"));
    }

    public static Deplaning getType(String deplaningType){
        if (deplaningType.equalsIgnoreCase("Standard")){
            return new StandardDeplaning();

        } else if(deplaningType.equalsIgnoreCase("Priority")) {
            return new PriorityDeplaning();
        }
        throw new IllegalArgumentException("Invalid deplaning type");
    }
}
