package Java_Interview;

import java.sql.*;

public class EmployeeQueries {
    public static void main(String[] args) {

        // Database connection info
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your DB URL
        String user = "root"; // Your DB username
        String password = "your_password"; // Your DB password

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // 1. Combine FirstName and LastName as "Name"
            System.out.println("1. Full Name:");
            ResultSet rs1 = stmt.executeQuery("SELECT CONCAT(FirstName, ' ', LastName) AS Name FROM EmployeeDetail;");
            while (rs1.next()) {
                System.out.println(rs1.getString("Name"));
            }

            // 2. Gender ends with 'le' and has 4 letters
            System.out.println("\n2. Gender like '__le':");
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM EmployeeDetail WHERE Gender LIKE '__le';");
            while (rs2.next()) {
                System.out.println(rs2.getString("FirstName") + " - " + rs2.getString("Gender"));
            }

            // 3. Salary < 2400 and Hire year > 2005
            System.out.println("\n3. Salary < 2400 & Hire year > 2005:");
            ResultSet rs3 = stmt.executeQuery("SELECT * FROM EmployeeDetail WHERE Salary < 2400 AND YEAR(HireDate) > 2005;");
            while (rs3.next()) {
                System.out.println(rs3.getString("FirstName") + " - " + rs3.getDouble("Salary") + " - " + rs3.getDate("HireDate"));
            }

            // 4. Max salary employee
            System.out.println("\n4. Employee(s) with Max Salary:");
            ResultSet rs4 = stmt.executeQuery(
                "SELECT FirstName, LastName, Salary FROM EmployeeDetail WHERE Salary = (SELECT MAX(Salary) FROM EmployeeDetail);");
            while (rs4.next()) {
                System.out.println(rs4.getString("FirstName") + " " + rs4.getString("LastName") + " - " + rs4.getDouble("Salary"));
            }

            // 5. Departments with total salary > 2500 and employee count < 10
            System.out.println("\n5. Departments with Total Salary > 2500 and Count < 10:");
            ResultSet rs5 = stmt.executeQuery(
                "SELECT DepartmentName FROM EmployeeDetail GROUP BY DepartmentName HAVING SUM(Salary) > 2500 AND COUNT(*) < 10;");
            while (rs5.next()) {
                System.out.println(rs5.getString("DepartmentName"));
            }

            // 6. Update salary by 15% where region is 'Asia'
            System.out.println("\n6. Updating Salary by 15% for Region 'Asia'...");
            int updated = stmt.executeUpdate("UPDATE EmployeeDetail SET Salary = Salary * 1.15 WHERE Region = 'Asia';");
            System.out.println("Updated rows: " + updated);

            // Close connection
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

