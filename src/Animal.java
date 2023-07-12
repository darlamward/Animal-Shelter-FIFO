abstract class Animal {
    private int order;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public boolean isOlderThan(Animal other) {
        return this.order < other.order;
    }

    public String getName() {
        return name;
    }
}
