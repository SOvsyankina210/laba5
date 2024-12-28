public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "Unknown";
        this.model = "Unknown";
        this.weight = 0.0;
    }


    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String Number) {
        System.out.println("Звонит " + name + " с номера " + Number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.print("Сообщения отправлены на номера: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


    public String getNumberBean() {
        return number;
    }

    public void setNumberBean(String number) {
        this.number = number;
    }

    public String getModelBean() {
        return model;
    }

    public void setModelBean(String model) {
        this.model = model;
    }

    public double getWeightBean() {
        return weight;
    }

    public void setWeightBean(double weight) {
        this.weight = weight;
    }
}
