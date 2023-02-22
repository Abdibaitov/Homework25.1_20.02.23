public class Car {
    private int id;
    private int numberOfcar;

    public Car(int id, int numberOfcar) {
        this.id = id;
        this.numberOfcar = numberOfcar;
    }
    public Car(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfcar() {
        return numberOfcar;
    }

    public void setNumberOfcar(int numberOfcar) {
        this.numberOfcar = numberOfcar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberOfcar=" + numberOfcar +
                '}';
    }
}
