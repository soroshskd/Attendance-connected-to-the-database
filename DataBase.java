import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class DataBase{
private String url = "jdbc:mysql://localhost:3306/sorosh";
private String user = "root";
private String pass = "S33K66T99Ttaban*!&@^#%$";   

public DefaultTableModel select (String sqlDataBase){
    try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection connect = DriverManager.getConnection(url, user, pass);
    Statement state = connect.createStatement();
    ResultSet result1 = state.executeQuery(sqlDataBase);
    ResultSetMetaData result2 = result1.getMetaData();
    DefaultTableModel getDataForTabel = new DefaultTableModel();
    int columnCount = result2.getColumnCount();
        for (int i = 0; i <columnCount; i++) {
        getDataForTabel.addColumn(result2.getColumnLabel(i+1));
        }
    while(result1.next()){
    Object data[] = new Object[columnCount];
        for (int i = 0; i <columnCount; i++) {
        data[i]=result1.getString(i+1);
        }
        getDataForTabel.addRow(data);
    }
    state.close();
    connect.close();
    return getDataForTabel;
    } catch (Exception e) {
    System.out.println("can't connect becuse:");
    System.out.println(e);            
    }
return null;    
}

public void signUp(String SeDeUp){
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection connect = DriverManager.getConnection(url, user, pass);
    Statement state = connect.createStatement();
    state.executeUpdate(SeDeUp);
    } catch (Exception e) { 
    System.out.println("can't connect:");
    System.out.println(e);       
    }      
}
}