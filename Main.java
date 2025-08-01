import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Message;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/MEC";
    private static final String USER = "root";
    private static final String PASS = "root"; 

    public static void main(String[] args) {
        String insertSql = "INSERT INTO employees (name, salary) VALUES (?, ?)";
        String selectSql = "SELECT id, name, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         
            PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                System.out.println("---Executing INSERT operation ---");

             insertStmt.setString(1, "AJAYPRASATH N");
             insertStmt.setDouble(2, 5000);
             int rowsAffected = insertStmt.executeUpdate();
             System.out.println(rowsAffected + " row(s) inserted Successfully");

             insertStmt.setString(1, "GOKULPRASANNA T");
              insertStmt.setDouble(2, 6000);
              rowsAffected = insertStmt.executeUpdate();
               System.out.println(rowsAffected + " row(s) inserted Successfully");

             insertStmt.setString(1, "MANOJ");
             insertStmt.setDouble(2, 5500);
             rowsAffected = insertStmt.executeUpdate();
              System.out.println(rowsAffected + " row(s) inserted Successfully");

             insertStmt.setString(1, "GOKULNATH");
              insertStmt.setDouble(2, 5200);
                rowsAffected = insertStmt.executeUpdate();
               System.out.println(rowsAffected + " row(s) inserted Successfully");

             insertStmt.setString(1, "BARANIDHARAN");
             insertStmt.setDouble(2, 5800);
              rowsAffected = insertStmt.executeUpdate();
             System.out.println(rowsAffected + " row(s) inserted Successfully");

              System.out.println("\n --- Executing SELECT operation ---");
                try(
                    PreparedStatement selecStatement = conn.prepareStatement(selectSql);
                    ResultSet rs = selecStatement.executeQuery()){
                        System.out.println("Employee Data:");
                        System.out.println("---------------");
                        while (rs.next()) {
                            int id = rs.getInt("id");
                            String name = rs.getString("name");
                           Double salary = rs.getDouble("Salary");
                            System.out.printf("ID: %d, Name: %s, Salary: $%.2f%n", id, name, salary);
                        }
                    }
                }catch(SQLException e){
                    System.err.println("SQL Exception occured: "+ e.getMessage());
                    e.printStackTrace();
                }
            }
                }










