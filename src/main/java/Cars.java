public class Cars {

    private String model;
    private String designer;
    private int id;

    public Cars() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cars(String model, String designer) {
        this.model = model;
        this.designer = designer;
    }

    public static class add {
        public add(Cars car1) {
        }
    }
}
