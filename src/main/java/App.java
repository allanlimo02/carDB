import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class App {
    public void add(Cars cars){
        try{
            Sql2o sql2o = new Sql2o("jdbc:h2:allan_cars", "ngetich", "12345");
            String addNewCar="INSERT INTO all_cars (model,designer) VALUES (:model,:designer)";
            Connection conn= sql2o.open();
            int id= (int) conn.createQuery(addNewCar,true)
                    .bind(cars)
                    .executeUpdate()
                    .getKey();
            System.out.println("The code is okay");
        }catch(Exception ex){
            System.out.println("Invalid input");
            ex.printStackTrace();

        }
    }

    public static void main(String[] args) {
        Connector connect=new Connector();
        Cars car1=new Cars("Murano","Nissan");
        new Cars.add(car1);
        //final var add = new Cars.connect.add(car1);


    }

}
