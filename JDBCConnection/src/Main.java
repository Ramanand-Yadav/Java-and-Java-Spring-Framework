
import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the result
        closer
         */
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "Shiva#$9812";
        String sql = "select sname from student where sid=1";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Establish");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs.next();
       // while(rs.next()){
        rs.next();
            String name = rs.getString("sname");
            int id = rs.getInt("sid");
            int mark = rs.getInt("mark");
            System.out.println(id+" "+name+" "+mark);
            rs.next();

//        String name = rs.getString("sname");
//        System.out.println(name);
        con.close();

        System.out.println("Connection Closed");

    }
}