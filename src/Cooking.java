public class Cooking {
    int salt;
    int sugar;
    int timeHours;
    int temperatureCelsius;
    String result;

    public Cooking(int salt, int sugar, int time, int temperature) {
        /* Or make the parameters' names different and do for example salt = inputSalt */
        this.salt = salt;
        this.sugar = sugar;
        this.timeHours = time;
        this.temperatureCelsius = temperature;
    }
    public void startCooking() {
        System.out.println("Lets start cooking");
        if (timeHours == 120) {
            result = "This is tasty!";
            sugarAmount();
        } else if (timeHours < 120) {
            result = "This tastes raw...";
        } else {
            result = "This is burnt!";
        }
        System.out.println(result);
    }

    private void sugarAmount() {
        if (sugar == 100) {
            result = "This is tasty!";
            saltAmount();
        } else if (sugar < 100) {
            result = "This tastes bitter...";
        } else {
            result = "This is too sweet!";
        }
        System.out.println(result);
    }

    private void saltAmount() {
        if (salt == 50) {
            result = "This is tasty!";

        } else if (sugar < 50) {
            result = "This tastes bland...";
        } else {
            result = "This is too salty!";
        }
        System.out.println(result);
    }
    /*
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
*/
}