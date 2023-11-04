public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean isOpen;

    public Bottle(double totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = 0.0;
        this.isOpen = false;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String openBottle() {
        if (isOpen) {
            return "Bottle is already open";
        } else {
            isOpen = true;
            return "Bottle is opened";
        }
    }

    public String closeBottle() {
        if (!isOpen) {
            return "Bottle is already closed";
        } else {
            isOpen = false;
            return "Bottle is closed";
        }
    }

    public String drinkLiquid(double amount) {
        if (!isOpen) {
            return "Bottle is closed. You need to open it first.";
        }

        if (availableLiquid < amount) {
            return "Not enough liquid to drink. Available: " + availableLiquid;
        }

        availableLiquid -= amount;
        return "You drank " + amount + " ml of liquid.";
    }

    public void addLiquid(double amount) {
        if (isOpen) {
            double spaceLeft = totalCapacity - availableLiquid;
            if (amount <= spaceLeft) {
                availableLiquid += amount;
            } else {
                availableLiquid = totalCapacity;
            }
        }
    }
}
