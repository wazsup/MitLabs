package lab1_cont;


public class Ball {

    private double capacity = 0;
    private double weight = 0;

    /**
     * Constructor that creates a new ball object with the specified weight and
     * capacity.
     *
     * @param capacity
     *            Capacity of the new object.
     */
    public Ball(double capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    /**
     * Returns the capacity of the Ball.
     *
     * @return the capacity of the Ball.
     */
    public double getCapacity() {
        return capacity;
    }

}
