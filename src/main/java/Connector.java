import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

public class Connector {

//    public void add(Cars cars){
//        try{
//            Sql2o sql2o = new Sql2o("jdbc:h2:allan_cars", "ngetich", "12345");
//            String addNewCar="INSERT INTO all_cars (model,designer) VALUES (:model,:designer)";
//            Connection conn= sql2o.open();
//            int id= (int) conn.createQuery(addNewCar,true)
//                    .bind(cars)
//                    .executeUpdate()
//                    .getKey();
//        }catch(Exception ex){
//            System.out.println("Invalid input");
//            ex.printStackTrace();
//
//        }
//    }
}
