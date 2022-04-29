import java.awt.*;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.ghasemkiani.util.icu.PersianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
        Toolkit tool = this.getToolkit();
        Dimension screenSize = tool.getScreenSize();
        this.setLocation(screenSize.width / 4, screenSize.height / 5);     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAppName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuDataBaseView = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuLanguage = new javax.swing.JMenu();
        jMenuLanguageEn = new javax.swing.JMenuItem();
        jMenuLanguageFa = new javax.swing.JMenuItem();
        jMenuLanguageEb = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenu();
        jMenuAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 230, 140));

        jLabelAppName.setFont(new java.awt.Font("French Script MT", 1, 36)); // NOI18N
        jLabelAppName.setForeground(new java.awt.Color(167, 107, 150));
        jLabelAppName.setText("SoRoSh App");

        jTextFieldLastName.setBackground(new java.awt.Color(167, 107, 150));
        jTextFieldLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldLastName.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldFirstName.setBackground(new java.awt.Color(167, 107, 150));
        jTextFieldFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFirstName.setForeground(new java.awt.Color(255, 255, 255));

        jLabelFirstName.setText("First Name :");

        jLabelLastName.setText("Last Name :");

        btnSignUp.setBackground(new java.awt.Color(167, 107, 150));
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-sign-up-64.png"))); // NOI18N
        btnSignUp.setToolTipText("add user");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Attendance of Mr. Seidi's class");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Get a score of 20 from the master");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSignUp)
                        .addGap(245, 245, 245))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelLastName))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelAppName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldFirstName)
                        .addComponent(jTextFieldLastName)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAppName)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnSignUp)
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(167, 107, 150));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 255));

        jMenuFile.setBackground(new java.awt.Color(167, 107, 150));
        jMenuFile.setForeground(new java.awt.Color(199, 193, 117));
        jMenuFile.setText("File");

        jMenuDataBaseView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-database-export-16.png"))); // NOI18N
        jMenuDataBaseView.setText("DataBase view");
        jMenuDataBaseView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDataBaseViewActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuDataBaseView);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setForeground(new java.awt.Color(199, 193, 117));
        jMenuEdit.setText("Edit");

        jMenuLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-language-skill-16.png"))); // NOI18N
        jMenuLanguage.setText("Language");

        jMenuLanguageEn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-united-kingdom-16.png"))); // NOI18N
        jMenuLanguageEn.setText("English");
        jMenuLanguageEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLanguageEnActionPerformed(evt);
            }
        });
        jMenuLanguage.add(jMenuLanguageEn);

        jMenuLanguageFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-iran-16.png"))); // NOI18N
        jMenuLanguageFa.setText("فارسی");
        jMenuLanguageFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLanguageFaActionPerformed(evt);
            }
        });
        jMenuLanguage.add(jMenuLanguageFa);

        jMenuLanguageEb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-israel-16.png"))); // NOI18N
        jMenuLanguageEb.setText("עִברִית");
        jMenuLanguageEb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLanguageEbActionPerformed(evt);
            }
        });
        jMenuLanguage.add(jMenuLanguageEb);

        jMenuEdit.add(jMenuLanguage);

        jMenuBar1.add(jMenuEdit);

        jMenuAbout.setForeground(new java.awt.Color(199, 193, 117));
        jMenuAbout.setText("About-us");

        jMenuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-programmer-32.png"))); // NOI18N
        jMenuAboutUs.setText("?");
        jMenuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutUsActionPerformed(evt);
            }
        });
        jMenuAbout.add(jMenuAboutUs);

        jMenuBar1.add(jMenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuDataBaseViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDataBaseViewActionPerformed
        
        tabel e = new tabel();
        e.show();
        
    }//GEN-LAST:event_jMenuDataBaseViewActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        Date date1 = new Date();
        PersianCalendar date2 = new PersianCalendar();
        int date30 = date2.get(Calendar.YEAR);
        int date31 = date2.get(Calendar.MONTH)+1;
        int date32 = date2.get(Calendar.DAY_OF_MONTH);
        int date33 = date2.get(Calendar.HOUR);
        int date34 = date2.get(Calendar.MINUTE);
        int date35 = date2.get(Calendar.SECOND);
        int date36 = date2.get(Calendar.AM_PM);
        String AmPm ="";
        if (date36==0) {
        AmPm = "AM";    
        }else if (date36==1) {
        AmPm = "PM";    
        }    
        try {
        DataBase insertData = new DataBase();
        String getFirstName = jTextFieldFirstName.getText();
        String getLastName = jTextFieldLastName.getText();
            if (getFirstName.isEmpty() || getLastName.isEmpty()) {
            ImageIcon errorIcon = new ImageIcon(getClass().getResource("icons8-fill-in-form-16.png"));     
            JOptionPane.showMessageDialog(rootPane, "Fill in the fields.","SoRoSh App",JOptionPane.CLOSED_OPTION,errorIcon ); 
            }else{
            String getDat = String.format("%d/%d/%d %d:%d %s",date30,date31,date32,date33,date34,AmPm);
            String SeDeUp = "insert into costomer (name,family,time)"+"values ('%s','%s','%s')";
            SeDeUp = String.format(SeDeUp,getFirstName,getLastName,getDat);
            insertData.signUp(SeDeUp); 
            }
           
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void jMenuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutUsActionPerformed
    ImageIcon aboutIcon = new ImageIcon(getClass().getResource("icons8-programmer-32.png"));
    JOptionPane.showMessageDialog(null,"Sorosh Moradi","SoRoSh Brand",JOptionPane.INFORMATION_MESSAGE,aboutIcon);
    }//GEN-LAST:event_jMenuAboutUsActionPerformed

    private void jMenuLanguageEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLanguageEnActionPerformed
    jLabelFirstName.setText("First Name :");
    jLabelLastName.setText("Last Name :");
    jMenuFile.setText("File");
    jMenuDataBaseView.setText("DataBase view");
    jMenuEdit.setText("Edit");
    jMenuLanguage.setText("Language");
    jMenuAbout.setText("About-us");
    jLabel1.setText("Attendance of Mr. Seidi's class");
    jButton1.setText("Get a score of 20 from the master");
    btnSignUp.setToolTipText("add user");
    }//GEN-LAST:event_jMenuLanguageEnActionPerformed

    private void jMenuLanguageFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLanguageFaActionPerformed
    jLabelFirstName.setText("نام :");
    jLabelLastName.setText("نام خانوادگی :");
    jMenuFile.setText("فایل");
    jMenuDataBaseView.setText("نمایش دیتابیس");
    jMenuEdit.setText("ویرایش");
    jMenuLanguage.setText("زبان");
    jMenuAbout.setText("درباره-ما");
    jLabel1.setText("حضور و غیاب کلاس آقای صیدی");
    jButton1.setText("گرفتن نمره ۲۰ از استاد");
    btnSignUp.setToolTipText("اضافه کردن کاربر");
    }//GEN-LAST:event_jMenuLanguageFaActionPerformed

    private void jMenuLanguageEbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLanguageEbActionPerformed
    jLabelFirstName.setText("שם פרטי :");
    jLabelLastName.setText("שם משפחה :");
    jMenuFile.setText("קוֹבֶץ");
    jMenuDataBaseView.setText("תצוגת מסד נתונים");
    jMenuEdit.setText("לַעֲרוֹך");
    jMenuLanguage.setText("שפה");
    jMenuAbout.setText("עלינו");
    jLabel1.setText("נוכחות בשיעור של מר סיידי");
    jButton1.setText("קבל ציון של 20 מהמאסטר");
    btnSignUp.setToolTipText("הוסף משתמש");
    }//GEN-LAST:event_jMenuLanguageEbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String s1 = "زرشک";
    String s2 = "تازه ایمشو دیره مگر صبحا";
    String s3 = "آرزو بر جوانان عیب نیست";
    ArrayList<String>S=new ArrayList();
    S.add(s1);
    S.add(s2);
    S.add(s3);
    Random rand = new Random();
    int getText = rand.nextInt(3);
    String showText = S.get(getText);
    ImageIcon Icon = new ImageIcon(getClass().getResource("icons8-futurama-mom-48.png"));
    JOptionPane.showMessageDialog(null,showText,"!!!",JOptionPane.INFORMATION_MESSAGE,Icon);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAppName;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuItem jMenuAboutUs;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDataBaseView;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuLanguage;
    private javax.swing.JMenuItem jMenuLanguageEb;
    private javax.swing.JMenuItem jMenuLanguageEn;
    private javax.swing.JMenuItem jMenuLanguageFa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}
