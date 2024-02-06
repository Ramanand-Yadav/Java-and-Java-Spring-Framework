
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
//        String sql = "select * from student";
//        String sql = "insert into student values (5, 'John', 34)";
//        String sql = "update student set sname='Max' where sid=5";
        String sql = "delete student where sid=5";


        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Establish");

        Statement st = con.createStatement();
        boolean res = st.execute(sql);
        System.out.println(res);


        /* fetch data query
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getInt(3));
            System.out.println();
        }
        */


//        rs.next();
       // while(rs.next()){
//        rs.next();
//            String name = rs.getString("sname");
//            int id = rs.getInt("sid");
//            int mark = rs.getInt("mark");
//            System.out.println(id+" "+name+" "+mark);
//            rs.next();

//        String name = rs.getString("sname");
//        System.out.println(name);
        con.close();

        System.out.println("Connection Closed");

    }
}