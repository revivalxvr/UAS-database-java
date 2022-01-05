import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

private Connection con;
private Statement stat;
private ResultSet res;
public class App extends javax.swing.JFrame {
    koneksi();
    tabel();
    public App() {
        initComponents();
        private void koneksi(){
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/handphone", "root", "");
            stat=con.createStatement();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
            }
     public App() {
         initComponents();
         koneksi();
         tabel();
                }
                private void tabel(){
                    DefaultTableModel tb= new DefaultTableModel();
                    
                    tb.addColumn("id");
                    tb.addColumn("Nama Handphone");
                    tb.addColumn("Harga");
                    tabel.setModel(tb);
                    try{
                    
                    res=stat.executeQuery("select * from phone");
                    
                    while (res.next())
                    {
                        tb.addRow(new Object[]{
                            res.getString("id"),
                            res.getDate("Nama handphone"),
                            res.getString("Harga")
                            });
                            }
                            
                            }catch (Exception e){
                            }
                            }