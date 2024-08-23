public class Cooking {
    int salt;
    int sugar;
    int timeHours;
    int temperatureCelsius;
    boolean isReady;
    String result;

    public Cooking(int salt, int sugar, int time, int temperature) {
        /* Or make the parameters' names different and do for example salt = inputSalt */
        this.salt = salt;
        this.sugar = sugar;
        this.timeHours = time;
        this.temperatureCelsius = temperature;
    }

    private String timeBaking() {
        if (timeHours == 120) {
            isReady = true;
            result = "This is tasty!";

        } else if (timeHours < 120) {
            isReady = false;
            result = "This tastes raw...";
        } else {
            isReady = false;
            result = "This is burnt!";
        }
        return result;
    }

    private String sugarAmount() {
        if (sugar == 100) {
            isReady = true;
            result = "This is tasty!";

        } else if (sugar < 100) {
            isReady = false;
            result = "This tastes bitter...";
        } else {
            isReady = false;
            result = "This is too sweet!";
        }
        return result;
    }

    public int getSalt() {
        return salt;
    }

    public int getSugar() {
        return sugar;
    }

    public int getTimeHours() {
        return timeHours;
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setTimeHours(int timeHours) {
        this.timeHours = timeHours;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }
}
