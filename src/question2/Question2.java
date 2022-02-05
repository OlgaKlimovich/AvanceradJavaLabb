//Skapa en bilfabrik, med hjälp av factory pattern

package question2;

@FunctionalInterface
interface Car{
    void carRelease();
}
class Toyota implements Car{
    @Override
    public void carRelease() {
        System.out.println("A new Toyota released.");
    }
}
class Lexus implements Car{
    @Override
    public void carRelease() {
        System.out.println("A new Lexus released.");
    }
}
class Daihatsu implements Car{
    @Override
    public void carRelease() {
        System.out.println("A new Daihatsu released.");
    }
}
class Factory{
    public Car create(String model){
        switch (model){
            case "Toyota": return new Toyota();
            case "Lexus": return new Lexus();
            case "Daihatsu": return new Daihatsu();
            default:return null;
            }
        }
    }
public class Question2 {
    public static void main(String[] args) {
        Factory carFactory= new Factory();
        Car toyota=carFactory.create("Toyota");
        Car lexus=carFactory.create("Lexus");
        Car daihatsu=carFactory.create("Daihatsu");
        toyota.carRelease();
        lexus.carRelease();
        daihatsu.carRelease();
    }
}
