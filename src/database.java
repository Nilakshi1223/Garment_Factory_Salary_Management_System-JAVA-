import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilakshi
 */
public class database {
    
    public static Connection c;
    
    static {
    
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/sgs_garment_factory";
            String un = "root";
            String pw = "root";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/sgs_garment_factory?useSSL=false",un,pw);
            
        
        } catch (Exception e) {
            
            e.printStackTrace();
        
        }
    
    }
    
    public static void iud (String query) throws Exception{
    
        Statement   s = c.createStatement();
        s.executeUpdate(query);
    }
    
    public static ResultSet search (String query) throws Exception{
    
        Statement   s = c.createStatement();
        ResultSet  rs =s.executeQuery(query);
        return rs;
    }
    
    
     
     /*public void clearTextsEmployeeDetails () throws Exception{
         jTextField2.setText(null);
         jTextField3.setText(resultSet.getString("fullname"));
         jTextField4.setText(resultSet.getString("nic"));
         jTextField5.setText(resultSet.getString("contact_no"));
         jTextField6.setText(resultSet.getString("email"));
         jComboBox1.setSelectedItem(resultSet.getString("job_position"));
         jTextField8.setText(resultSet.getString("bank_account_no"));
         jTextField9.setText(resultSet.getString("guardian's_contact_no"));
     }*/
    
    
    
}
