import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

private void bActionPerformed(java.awt.event.ActionEvent evt) {

    String username = t1.getText();
    int password = Integer.parseInt(t2.getText());

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn =
        DriverManager.getConnection("jdbc:mysql://localhost:3306/har","root","");

        String query = "insert into employee(username,password) values(?,?)";

        System.out.println("Connection success");

        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setString(1, username);
        stmt.setInt(2, password);

        stmt.executeUpdate();

    } catch(ClassNotFoundException | SQLException e) {

    }
}

public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        new newframe().setVisible(true);
    });
}
