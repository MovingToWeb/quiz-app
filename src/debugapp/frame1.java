/*
 * frame1.java
 *
 * Created on August 11, 2008, 11:42 PM
 */
package debugapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.TreeSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;



/**
 *
 * @author  Administrator
 * 
 */
public class frame1 extends javax.swing.JFrame {

    int min, sec;
    int no=0;
    Connection con;
    javax.swing.Timer tim;
    Iterator it;
    Random ran = new Random();
    TreeSet ts1,ts2,ts3;
    Statement st;
    ResultSet rs;
    Integer curr;
    PreparedStatement s, s1, s2,ps,s3;
    int score = 0;
    int flag = 0;
    String name;
    String id;
    HashMap qmap;
    Set qset;
    ArrayList visited;
    int qno=0,qcurrent=0;
    
   
    /** Creates new form frame1 */
    public frame1(String id) {
        this.id=id;
        System.out.println("got id="+id);
        qmap=new HashMap();
        ts1=new TreeSet();
         ts2=new TreeSet();
          ts3=new TreeSet();
        visited=new ArrayList();
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/debug", "root", "root");
             ps=con.prepareStatement("insert into login(id,mark) values(?,?);");
             
            
            
            
          
             
           
                   
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        quesframe.setDefaultCloseOperation(EXIT_ON_CLOSE);


    
        initComponents();
    }


    class Listen1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            min = Integer.parseInt(lb1.getText());
            sec = Integer.parseInt(lb2.getText());
            
            if (min !=0 && sec == 1) 
            {
                min = min - 1;
                sec = 59;
            } 
            else if(sec==0 && min==0)
            {
                
               try
               {
                JOptionPane.showMessageDialog(null, "TimeOver");   
                System.out.println("Timeout");
                System.out.println("id="+id);
               
                String s=  (new Integer(score)).toString();
                System.out.println("score="+s);
                ps.setString(1, id);
                ps.setString(2, s);
                System.out.println("Executing update");
               
                ps.executeUpdate();
                
                
                System.exit(0);
            
               }
               catch(SQLException e1)
               {
                   System.out.println("exception in frame 1" + e1);
               }
            }
            
                    
            else if (sec == 0) 
            {
                min = min - 1;
                sec = 59;
            } 
            else 
            {
                sec = sec - 1;
            }
             
            
            if(min<0)
            {
            lb1.setText("0"+new Integer(min).toString());
            }
            else
            {
                 lb1.setText(new Integer(min).toString());
            }
            if(sec<10)
            {
                    
            lb2.setText("0"+new Integer(sec).toString());
            }
            else
            {
                lb2.setText(new Integer(sec).toString());
            }
       
    }
    }

    class Listen3 implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
           JRadioButton r=(JRadioButton)event.getSource();
           String ac=r.getActionCommand();
           System.out.println("Radio button predd"+ac);
           
           if(ac.equals("r1"))
           {
               Integer q=((Integer)qmap.get(new Integer(0))).intValue();
               zeroto14(0,q);
           
           }
           else if(ac.equals("r2"))
           {
               Integer q=((Integer)qmap.get(new Integer(1))).intValue();
                zeroto14(1,q);
           
           }
           else if(ac.equals("r3"))
           {
               Integer q=((Integer)qmap.get(new Integer(2))).intValue();
                zeroto14(2,q);
           
           }
           else if(ac.equals("r4"))
           {
               Integer q=((Integer)qmap.get(new Integer(3))).intValue();
                zeroto14(3,q);
           
           } 
           else if(ac.equals("r5"))
           {
               Integer q=((Integer)qmap.get(new Integer(4))).intValue();
                zeroto14(4,q);
           
           } 
           else if(ac.equals("r6"))
           {
               Integer q=((Integer)qmap.get(new Integer(5))).intValue();
                zeroto14(5,q);
           
           } 
           else if(ac.equals("r7"))
           {
               Integer q=((Integer)qmap.get(new Integer(6))).intValue();
                zeroto14(6,q);
           
           } 
           else if(ac.equals("r8"))
           {
               Integer q=((Integer)qmap.get(new Integer(7))).intValue();
                zeroto14(7,q);
           
           } 
           else if(ac.equals("r9"))
           {
               Integer q=((Integer)qmap.get(new Integer(8))).intValue();
           
                zeroto14(8,q);
           } 
           else if(ac.equals("r10"))
           {
               Integer q=((Integer)qmap.get(new Integer(9))).intValue();
                zeroto14(9,q);
           
           } 
           else if(ac.equals("r11"))
           {
               Integer q=((Integer)qmap.get(new Integer(10))).intValue();
                zeroto14(10,q);
           
           } 
           else if(ac.equals("r12"))
           {
               Integer q=((Integer)qmap.get(new Integer(11))).intValue();
                zeroto14(11,q);
           
           } 
           else if(ac.equals("r13"))
           {
               Integer q=((Integer)qmap.get(new Integer(12))).intValue();
                zeroto14(12,q);
           
           } 
           else if(ac.equals("r14"))
           {
               Integer q=((Integer)qmap.get(new Integer(13))).intValue();
                zeroto14(13,q);
           
           } 
           else if(ac.equals("r15"))
           {
               Integer q=((Integer)qmap.get(new Integer(14))).intValue();
                 zeroto14(14,q);
           
           } 
           else if(ac.equals("r16"))
           {
               Integer q=((Integer)qmap.get(new Integer(15))).intValue();
                fifteento19(15,q);
           
           } 
           else if(ac.equals("r17"))
           {
               Integer q=((Integer)qmap.get(new Integer(16))).intValue();
                fifteento19(16,q);
           
           } 
           else if(ac.equals("r18"))
           {
               Integer q=((Integer)qmap.get(new Integer(17))).intValue();
                fifteento19(17,q);
           
           } 
           else if(ac.equals("r19"))
           {
               Integer q=((Integer)qmap.get(new Integer(18))).intValue();
                fifteento19(18,q);
           
           } 
           else if(ac.equals("r20"))
           {
               Integer q=((Integer)qmap.get(new Integer(19))).intValue();
               fifteento19(19,q);
           
           } 
           else if(ac.equals("r21"))
           {
               Integer q=((Integer)qmap.get(new Integer(20))).intValue();
               twentyto24(20,q);
           
           } 
           else if(ac.equals("r22"))
           {
               Integer q=((Integer)qmap.get(new Integer(21))).intValue();
               twentyto24(21,q);
           
           } 
           else if(ac.equals("r23"))
           {
               Integer q=((Integer)qmap.get(new Integer(22))).intValue();
               twentyto24(22,q);
           
           } 
           else if(ac.equals("r24"))
           {
               Integer q=((Integer)qmap.get(new Integer(23))).intValue();
               twentyto24(23,q);
           
           } 
           else if(ac.equals("r25"))
           {
               Integer q=((Integer)qmap.get(new Integer(24))).intValue();
               twentyto24(24,q);
           
           }
        
        
        
        
        
        
        
        
        }
    }
    
    void zeroto14(int x,Integer a)
    {
               try
               {
                s1 = con.prepareStatement("Select * from c where qno=?");
                
                
                s1.setInt(1, a);
                
                rs = s1.executeQuery();
                rs.next();
                txtq.setText(rs.getString("ques"));
                op1.setText(rs.getString("o1"));
                op2.setText(rs.getString("o2"));
                op3.setText(rs.getString("o3"));
                op4.setText(rs.getString("o4"));
                no++;
                
                questionno.setText((new Integer(x+1)).toString());
                qcurrent=x+1;
               }
               catch(SQLException e)
               {
                   System.out.println("Exception in 0 to 14");
               }
    }
    
    void fifteento19(int x,Integer a)
    {
    
                 try
               {
                s1 = con.prepareStatement("Select * from cpp where qno=?");
                
                
                s1.setInt(1, a);
                
                rs = s1.executeQuery();
                rs.next();
                txtq.setText(rs.getString("ques"));
                op1.setText(rs.getString("o1"));
                op2.setText(rs.getString("o2"));
                op3.setText(rs.getString("o3"));
                op4.setText(rs.getString("o4"));
                no++;
                
                questionno.setText((new Integer(x+1)).toString());
                qcurrent=x+1;
               }
               catch(SQLException e)
               {
                   System.out.println("Exception in 15 to 19");
               }
    
    
    
    
    
    }
    
    void twentyto24(int x,Integer a)
    {
        
        try
               {
                s1 = con.prepareStatement("Select * from java where qno=?");
                
                
                s1.setInt(1, a);
                
                rs = s1.executeQuery();
                rs.next();
                txtq.setText(rs.getString("ques"));
                op1.setText(rs.getString("o1"));
                op2.setText(rs.getString("o2"));
                op3.setText(rs.getString("o3"));
                op4.setText(rs.getString("o4"));
                no++;
                
                questionno.setText((new Integer(x+1)).toString());
                qcurrent=x+1;
               }
               catch(SQLException e)
               {
                   System.out.println("Exception in 20 to 14");
               }
        
        
    }
    
    class Listen2 implements ActionListener {

       public void actionPerformed(ActionEvent e) {
          
        try {
     
                   
            ps.setString(1, name);
            ps.setInt(4,0);
            ps.executeUpdate();
        }
        
        
        catch(SQLException ex2) {
            JOptionPane.showMessageDialog(null,ex2.getMessage());
        }
        
        
        finstr.setSize(600,600);
        finstr.getContentPane().setBackground(Color.white);
        finstr.setVisible(true);
        
       // this.setVisible(false);
    
        }
    }
    


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quesframe = new javax.swing.JFrame();
        pques = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtq = new javax.swing.JTextArea();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        bconfirm = new javax.swing.JButton();
        bnext = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        r16 = new javax.swing.JRadioButton();
        r17 = new javax.swing.JRadioButton();
        r18 = new javax.swing.JRadioButton();
        r19 = new javax.swing.JRadioButton();
        r20 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        r13 = new javax.swing.JRadioButton();
        r14 = new javax.swing.JRadioButton();
        r15 = new javax.swing.JRadioButton();
        r21 = new javax.swing.JRadioButton();
        r22 = new javax.swing.JRadioButton();
        r23 = new javax.swing.JRadioButton();
        r24 = new javax.swing.JRadioButton();
        r25 = new javax.swing.JRadioButton();
        finish = new javax.swing.JButton();
        questionno = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        finstr = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bstart = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        bstart1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        quesframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quesframe.setSize(800, 600);

        pques.setBackground(new java.awt.Color(0, 0, 0));
        pques.setSize(640,450);

        txtq.setColumns(20);
        txtq.setEditable(false);
        txtq.setRows(5);
        jScrollPane1.setViewportView(txtq);

        op1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(op1);
        op1.setForeground(new java.awt.Color(255, 102, 0));
        op1.setText("jRadioButton1");

        op2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(op2);
        op2.setForeground(new java.awt.Color(255, 102, 0));
        op2.setText("jRadioButton2");

        op3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(op3);
        op3.setForeground(new java.awt.Color(255, 102, 0));
        op3.setText("jRadioButton3");

        op4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(op4);
        op4.setForeground(new java.awt.Color(255, 102, 0));
        op4.setText("jRadioButton4");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        bconfirm.setText("Submit");
        bconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconfirmActionPerformed(evt);
            }
        });

        bnext.setText("Next");
        bnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnextActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 0, 0));
        lb1.setText("20");

        lb2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 0, 0));
        lb2.setText("00");

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText(":");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText(":");

        r1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r1);
        r1.setForeground(new java.awt.Color(255, 102, 0));
        r1.setActionCommand("r1");
        r1.setText("01");
        r1.addActionListener(new Listen3());

        r2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r2);
        r2.setForeground(new java.awt.Color(255, 102, 0));
        r2.setActionCommand("r2");
        r2.setText("02");
        r2.addActionListener(new Listen3());

        r3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r3);
        r3.setForeground(new java.awt.Color(255, 102, 0));
        r3.setActionCommand("r3");
        r3.setText("03");
        r3.addActionListener(new Listen3());

        r4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r4);
        r4.setForeground(new java.awt.Color(255, 102, 0));
        r4.setActionCommand("r4");
        r4.setText("04");
        r4.addActionListener(new Listen3());

        r5.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r5);
        r5.setForeground(new java.awt.Color(255, 102, 0));
        r5.setActionCommand("r5");
        r5.setText("05");
        r5.addActionListener(new Listen3());

        r6.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r6);
        r6.setForeground(new java.awt.Color(255, 102, 0));
        r6.setActionCommand("r6");
        r6.setText("06");
        r6.addActionListener(new Listen3());

        r7.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r7);
        r7.setForeground(new java.awt.Color(255, 102, 0));
        r7.setActionCommand("r7");
        r7.setText("07");
        r7.addActionListener(new Listen3());

        r8.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r8);
        r8.setForeground(new java.awt.Color(255, 102, 0));
        r8.setActionCommand("r8");
        r8.setText("08");
        r8.addActionListener(new Listen3());

        r9.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r9);
        r9.setForeground(new java.awt.Color(255, 102, 0));
        r9.setText("09");
        r9.setActionCommand("r9");
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });
        r9.addActionListener(new Listen3());

        r10.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r10);
        r10.setForeground(new java.awt.Color(255, 102, 0));
        r10.setText("10");
        r10.setActionCommand("r10");

        r16.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r16);
        r16.setForeground(new java.awt.Color(255, 102, 0));
        r16.setText("16");
        r16.setActionCommand("r16");

        r17.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r17);
        r17.setForeground(new java.awt.Color(255, 102, 0));
        r17.setText("17");
        r17.setActionCommand("r17");

        r18.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r18);
        r18.setForeground(new java.awt.Color(255, 102, 0));
        r18.setText("18");
        r18.setActionCommand("r18");

        r19.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r19);
        r19.setForeground(new java.awt.Color(255, 102, 0));
        r19.setText("19");
        r19.setActionCommand("r19");
        r19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r19ActionPerformed(evt);
            }
        });
        r19.addActionListener(new Listen3());

        r20.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r20);
        r20.setForeground(new java.awt.Color(255, 102, 0));
        r20.setText("20");
        r20.setActionCommand("r20");

        r11.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r11);
        r11.setForeground(new java.awt.Color(255, 102, 0));
        r11.setText("11");
        r11.setActionCommand("r11");

        r12.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r12);
        r12.setForeground(new java.awt.Color(255, 102, 0));
        r12.setText("12");
        r12.setActionCommand("r12");

        r13.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r13);
        r13.setForeground(new java.awt.Color(255, 102, 0));
        r13.setText("13");
        r13.setActionCommand("r13");

        r14.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r14);
        r14.setForeground(new java.awt.Color(255, 102, 0));
        r14.setText("14");
        r14.setActionCommand("r14");

        r15.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r15);
        r15.setForeground(new java.awt.Color(255, 102, 0));
        r15.setText("15");
        r15.setActionCommand("r15");

        r21.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r21);
        r21.setForeground(new java.awt.Color(255, 102, 0));
        r21.setText("21");
        r21.setActionCommand("r21");

        r22.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r22);
        r22.setForeground(new java.awt.Color(255, 102, 0));
        r22.setText("22");
        r22.setActionCommand("r22");
        r22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r22ActionPerformed(evt);
            }
        });
        r22.addActionListener(new Listen3());

        r23.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r23);
        r23.setForeground(new java.awt.Color(255, 102, 0));
        r23.setText("23");
        r23.setActionCommand("r23");
        r23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r23ActionPerformed(evt);
            }
        });
        r23.addActionListener(new Listen3());

        r24.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r24);
        r24.setForeground(new java.awt.Color(255, 102, 0));
        r24.setText("24");
        r24.setActionCommand("r24");

        r25.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(r25);
        r25.setForeground(new java.awt.Color(255, 102, 0));
        r25.setText("25");
        r25.setActionCommand("r25");

        finish.setText("Finish the Test");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        questionno.setEditable(false);
        questionno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionnoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pquesLayout = new org.jdesktop.layout.GroupLayout(pques);
        pques.setLayout(pquesLayout);
        pquesLayout.setHorizontalGroup(
            pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pquesLayout.createSequentialGroup()
                .add(94, 94, 94)
                .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pquesLayout.createSequentialGroup()
                        .add(op4)
                        .addContainerGap())
                    .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(pquesLayout.createSequentialGroup()
                            .add(op3)
                            .addContainerGap())
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(pquesLayout.createSequentialGroup()
                                .add(op2)
                                .addContainerGap())
                            .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(pquesLayout.createSequentialGroup()
                                    .add(op1)
                                    .addContainerGap())
                                .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, pquesLayout.createSequentialGroup()
                                        .add(questionno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 305, Short.MAX_VALUE)
                                        .add(lb1)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel8)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(lb2)
                                        .add(327, 327, 327))
                                    .add(pquesLayout.createSequentialGroup()
                                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 392, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(pquesLayout.createSequentialGroup()
                                                .add(47, 47, 47)
                                                .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                    .add(pquesLayout.createSequentialGroup()
                                                        .add(r11)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r12)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r13)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r14)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                        .add(r15))
                                                    .add(pquesLayout.createSequentialGroup()
                                                        .add(r6)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r7)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r8)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r9)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                        .add(r10))
                                                    .add(pquesLayout.createSequentialGroup()
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 272, Short.MAX_VALUE)
                                                        .add(jLabel4))
                                                    .add(pquesLayout.createSequentialGroup()
                                                        .add(r1)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r2)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r3)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                        .add(r4)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                        .add(r5))
                                                    .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                                        .add(pquesLayout.createSequentialGroup()
                                                            .add(r21)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                            .add(r22)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .add(r23)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                            .add(r24)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                            .add(r25)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                                                        .add(pquesLayout.createSequentialGroup()
                                                            .add(r16)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                            .add(r17)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                            .add(r18)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                            .add(r19)
                                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                            .add(r20)))))
                                            .add(pquesLayout.createSequentialGroup()
                                                .add(34, 34, 34)
                                                .add(bconfirm)
                                                .add(18, 18, 18)
                                                .add(bnext)
                                                .add(18, 18, 18)
                                                .add(finish)))
                                        .addContainerGap())))))))
        );
        pquesLayout.setVerticalGroup(
            pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pquesLayout.createSequentialGroup()
                .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, pquesLayout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(jLabel4)
                        .add(jLabel4)
                        .add(164, 164, 164)
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(r1)
                            .add(r2)
                            .add(r3)
                            .add(r4)
                            .add(r5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(r6)
                            .add(r10)
                            .add(r7)
                            .add(r8)
                            .add(r9))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(r11)
                            .add(r12)
                            .add(r13)
                            .add(r14)
                            .add(r15))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(r16)
                            .add(r20)
                            .add(r17)
                            .add(r18)
                            .add(r19))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(r21)
                            .add(r22)
                            .add(r25)
                            .add(r24)
                            .add(r23))
                        .add(43, 43, 43)
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(bconfirm)
                            .add(bnext)
                            .add(finish)))
                    .add(pquesLayout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, pquesLayout.createSequentialGroup()
                                .add(pquesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(lb1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel8)
                                    .add(lb2))
                                .add(18, 18, 18))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, pquesLayout.createSequentialGroup()
                                .add(questionno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(26, 26, 26)))
                        .add(8, 8, 8)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 332, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(32, 32, 32)
                        .add(op1)
                        .add(32, 32, 32)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(op2)
                .add(36, 36, 36)
                .add(op3)
                .add(31, 31, 31)
                .add(op4)
                .add(84, 84, 84))
        );

        r10.addActionListener(new Listen3());
        r16.addActionListener(new Listen3());
        r17.addActionListener(new Listen3());
        r18.addActionListener(new Listen3());
        r20.addActionListener(new Listen3());
        r11.addActionListener(new Listen3());
        r12.addActionListener(new Listen3());
        r13.addActionListener(new Listen3());
        r14.addActionListener(new Listen3());
        r15.addActionListener(new Listen3());
        r21.addActionListener(new Listen3());
        r24.addActionListener(new Listen3());
        r25.addActionListener(new Listen3());

        org.jdesktop.layout.GroupLayout quesframeLayout = new org.jdesktop.layout.GroupLayout(quesframe.getContentPane());
        quesframe.getContentPane().setLayout(quesframeLayout);
        quesframeLayout.setHorizontalGroup(
            quesframeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(quesframeLayout.createSequentialGroup()
                .add(pques, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        quesframeLayout.setVerticalGroup(
            quesframeLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, quesframeLayout.createSequentialGroup()
                .add(85, 85, 85)
                .add(pques, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("INSTRUCTIONS");

        bstart.setText("Start");
        bstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bstartActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Preliminary Round");

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("1.Press submit for each question to register answer. If you   ");

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("fail to do ur answers will not be registered in the database");

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("2.Press Next to go the next question. You cannot go ");

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("to the previous question");

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("3.Questions will be from c,c++,java");

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("4.There will be no negative marking");

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 14));
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("5. You will have 20 minutes time to answer 25 questions");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(256, 256, 256)
                        .add(bstart))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel2)
                                .add(172, 172, 172)
                                .add(jLabel7))
                            .add(jLabel9)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(jLabel10))
                            .add(jLabel11)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(jLabel12))
                            .add(jLabel13)
                            .add(jLabel14)
                            .add(jLabel15))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(72, 72, 72)
                        .add(jLabel1)
                        .add(84, 84, 84)
                        .add(jLabel2))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(181, 181, 181)
                        .add(jLabel7)))
                .add(26, 26, 26)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel11)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel12)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel13)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel14)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel15)
                .add(73, 73, 73)
                .add(bstart)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout finstrLayout = new org.jdesktop.layout.GroupLayout(finstr.getContentPane());
        finstr.getContentPane().setLayout(finstrLayout);
        finstrLayout.setHorizontalGroup(
            finstrLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        finstrLayout.setVerticalGroup(
            finstrLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        bstart1.setText("Start!!!!");
        bstart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bstart1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/debugapp/loading.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(78, 78, 78)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 454, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(51, 51, 51)
                .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
            .add(jPanel2Layout.createSequentialGroup()
                .add(256, 256, 256)
                .add(bstart1)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(100, 100, 100)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 362, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(80, 80, 80)
                .add(bstart1)
                .add(107, 107, 107))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void bstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bstartActionPerformed
        // TODO add your handling code here:
        finstr.setVisible(false);
        quesframe.setSize(600, 650);
        quesframe.getContentPane().setBackground(Color.white);
        quesframe.setVisible(true);

        tim = new javax.swing.Timer(1000, new Listen1());
        tim.start();


        int e = 0;

        while (e != 15) {
            int n=0;
            for(int z=0;z<100;z++)
            {
            n = ran.nextInt(24);
            }
            Integer n1 = new Integer(n);
            if (ts1.contains(n1)) {
                continue;

            } else {
                ts1.add(n1);
                qmap.put(new Integer(qno),n1);
                qno++;
                e++;
            }
        }
        e = 0;
        while (e != 5) {
            
            int n=0;
            for(int z=0;z<100;z++)
            {
            n = ran.nextInt(15);
            }
            Integer n1 = new Integer(n);
            if (ts2.contains(n1)) {
                continue;

            } else {
                ts2.add(n1);
                qmap.put(new Integer(qno),n1);
                qno++;
                e++;
            }
        }
        e = 0;
        while (e != 5) {
            
            int n=0;
            for(int z=0;z<100;z++)
            {
            n = ran.nextInt(28);
            }
            Integer n1 = new Integer(n);
            if (ts3.contains(n1)) {
                continue;

            } else {
                ts3.add(n1);
                qmap.put(new Integer(qno),n1); 
                qno++;
                e++;
            }
        }
        System.out.println("The map content is ");
        qset=qmap.keySet();
        Iterator i=qset.iterator();
        while(i.hasNext())
        {
        Integer n=(Integer)i.next();
       
        System.out.println("n="+n+" value= "+qmap.get(n));
        
        }
        questionno.setText(new Integer(qcurrent+1).toString());
        txtq.setText("Hello");

        System.out.println(ts1 + "" + ts2 + "" + ts3);
        it = ts1.iterator();
        curr = (Integer) it.next();
        try {
            s = con.prepareStatement("Select * from c where qno=?");
            Integer q=((Integer)qmap.get(new Integer(qcurrent))).intValue();
            s.setInt(1, q);

            rs = s.executeQuery();
            rs.next();
            txtq.setText(rs.getString("ques"));
            op1.setText(rs.getString("o1"));
            op2.setText(rs.getString("o2"));
            op3.setText(rs.getString("o3"));
            op4.setText(rs.getString("o4"));
            no++;
            qcurrent++;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "2" + ex.getMessage());
        }
     
     
    }//GEN-LAST:event_bstartActionPerformed

private void bstart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bstart1ActionPerformed
//name=tname.getText();
        /*String id=tid.getText();
        String pass=new String(tpass.getPassword());
       System.out.println(tid.getText());*/
        System.out.println("hi");
       
        
        
        
        finstr.setSize(600,622);
        finstr.getContentPane().setBackground(Color.black);
        finstr.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_bstart1ActionPerformed

private void bnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnextActionPerformed
    // TODO add your handling code here:
    op1.setSelected(false);
    op2.setSelected(false);
    op3.setSelected(false);
    op4.setSelected(false);
    
     
    try
    {
     
    
        if(qcurrent<=14)
        {
        
            
               
                s1 = con.prepareStatement("Select * from c where qno=?");
                
                Integer q=((Integer)qmap.get(new Integer(qcurrent))).intValue();
                s1.setInt(1, q);
                
                rs = s1.executeQuery();
                rs.next();
                txtq.setText(rs.getString("ques"));
                op1.setText(rs.getString("o1"));
                op2.setText(rs.getString("o2"));
                op3.setText(rs.getString("o3"));
                op4.setText(rs.getString("o4"));
                no++;
                questionno.setText(new Integer(qcurrent+1).toString());
                qcurrent++;
                System.out.println("The value of qcurrent is "+qcurrent);
                //System.out.println("no="+no);
        }   
        else if(qcurrent >=15 && qcurrent <=19)
        {
                s1 = con.prepareStatement("Select * from cpp where qno=?");
                
                Integer q=((Integer)qmap.get(new Integer(qcurrent))).intValue();
                s1.setInt(1, q);
                
                rs = s1.executeQuery();
                rs.next();
                txtq.setText(rs.getString("ques"));
                op1.setText(rs.getString("o1"));
                op2.setText(rs.getString("o2"));
                op3.setText(rs.getString("o3"));
                op4.setText(rs.getString("o4"));
                questionno.setText(new Integer(qcurrent+1).toString());
                no++; 
                qcurrent++;
                   System.out.println("The value of qcurrent is "+qcurrent);
        
        
        }
        else if(qcurrent >=20 && qcurrent<=24)
        {
                s1 = con.prepareStatement("Select * from java where qno=?");
                
                Integer q=((Integer)qmap.get(new Integer(qcurrent))).intValue();
                s1.setInt(1, q);
                
                rs = s1.executeQuery();
                rs.next();
                txtq.setText(rs.getString("ques"));
                op1.setText(rs.getString("o1"));
                op2.setText(rs.getString("o2"));
                op3.setText(rs.getString("o3"));
                op4.setText(rs.getString("o4"));
                questionno.setText(new Integer(qcurrent+1).toString());
                no++;
                qcurrent++;
                   System.out.println("The value of qcurrent is "+qcurrent);
        }
    
        else if(qcurrent==25)
        {
            JOptionPane.showMessageDialog(null, "Yu have reached the end of questions");
        }
   
    }
    catch(SQLException e)
    {
        System.out.println("SQL exception in next");
    }
}//GEN-LAST:event_bnextActionPerformed
void changeColor(Object item[])
{
    
    for(int i=0;i<item.length;i++)
    {
        
        switch(((Integer)item[i]).intValue())
        {
            
            case 1:
               r1.setForeground(java.awt.Color.GREEN); 
            break;
            
            case 2:
                r2.setForeground(java.awt.Color.GREEN); 
            break;
            case 3:
                r3.setForeground(java.awt.Color.GREEN); 
            break;
            case 4:
                r4.setForeground(java.awt.Color.GREEN); 
            break;
            case 5:
                r5.setForeground(java.awt.Color.GREEN); 
            break;
            case 6:
                r6.setForeground(java.awt.Color.GREEN); 
            break;
            case 7:
                r7.setForeground(java.awt.Color.GREEN); 
            break;
            case 8:
                r8.setForeground(java.awt.Color.GREEN); 
            break;
            case 9:
                r9.setForeground(java.awt.Color.GREEN); 
            break;
            case 10:
                r10.setForeground(java.awt.Color.GREEN); 
            break;
            case 11:
                r11.setForeground(java.awt.Color.GREEN); 
            break;
            case 12:
                r12.setForeground(java.awt.Color.GREEN); 
            break;
            case 13:
                r13.setForeground(java.awt.Color.GREEN); 
            break;
            case 14:
                r14.setForeground(java.awt.Color.GREEN); 
            break;
            case 15:
                r15.setForeground(java.awt.Color.GREEN); 
            break;
            case 16:
                r16.setForeground(java.awt.Color.GREEN); 
            break;
            case 17:
                r17.setForeground(java.awt.Color.GREEN); 
            break;
            case 18:
                r18.setForeground(java.awt.Color.GREEN); 
            break;
            case 19:
                r19.setForeground(java.awt.Color.GREEN); 
            break;
            case 20:
                r20.setForeground(java.awt.Color.GREEN); 
            break;
            case 21:
                r21.setForeground(java.awt.Color.GREEN); 
            break;
            case 22:
                r22.setForeground(java.awt.Color.GREEN); 
            break;
            case 23:
                r23.setForeground(java.awt.Color.GREEN); 
            break;
            case 24:
                r24.setForeground(java.awt.Color.GREEN); 
            break;
            case 25:
                r25.setForeground(java.awt.Color.GREEN); 
            break;
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
private void bconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconfirmActionPerformed
    // TODO add your handling code here:
    
   if(op1.isSelected() == false && op2.isSelected() == false && op3.isSelected()==false && op4.isSelected()==false)
   {
       JOptionPane.showMessageDialog(null, "Please Select a option");
   }   
   else
   {
    
    if(visited.contains(new Integer(qcurrent)))
    {
        JOptionPane.showMessageDialog(null, "The answer for this question is already posted."+"\n"+"It cannot be modified");
    }
    else
    {      
    visited.add(new Integer(qcurrent));
    
    Object ivisited[]=visited.toArray();
    
    changeColor(ivisited);
    System.out.println("You have answered question number "+qcurrent);   
    
    
    if(qcurrent<=14) {
        try {
            
             System.out.println("Checking in c database");
             System.out.println("for question number "+(qcurrent-1));
            s2 = con.prepareStatement("Select ans from c where qno=?");
            Integer q=((Integer)qmap.get(new Integer(qcurrent-1))).intValue();
            
            s2.setInt(1, q);
            
            rs = s2.executeQuery();
            rs.next();
            Integer ans = rs.getInt(1);
            if (op1.isSelected() && ans == 1) {
                score = score + 5;
            }
            if (op2.isSelected() && ans == 2) {
                score = score + 5;
            }
            if (op3.isSelected() && ans == 3) {
                score = score + 5;
            }
            if (op4.isSelected() && ans == 4) {
                score = score + 5;
            }
            
            
            
            }
            catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
                                   }                      
            
       }
    
    if(qcurrent>14 && qcurrent <20) {
        try {
            System.out.println("Checking in cpp database");
             System.out.println("for question number "+(qcurrent-1));
            s2 = con.prepareStatement("Select ans from cpp where qno=?");
            Integer q=((Integer)qmap.get(new Integer(qcurrent-1))).intValue();
            s2.setInt(1, q);
            
            rs = s2.executeQuery();
            rs.next();
            Integer ans = rs.getInt(1);
            if (op1.isSelected() && ans == 1) {
                score = score + 5;
            }
            if (op2.isSelected() && ans == 2) {
                score = score + 5;
            }
            if (op3.isSelected() && ans == 3) {
                score = score + 5;
            }
            if (op4.isSelected() && ans == 4) {
                score = score + 5;
            }
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    if(qcurrent >19 && qcurrent <=24) {
        try {
            System.out.println("Checking in java database");
             System.out.println("for question number "+(qcurrent-1));
            s2 = con.prepareStatement("Select ans from java where qno=?");
            Integer q=((Integer)qmap.get(new Integer(qcurrent-1))).intValue();
            s2.setInt(1, q);
            
            rs = s2.executeQuery();
            rs.next();
            Integer ans = rs.getInt(1);
            if (op1.isSelected() && ans == 1) {
                score = score + 5;
            }
            if (op2.isSelected() && ans == 2) {
                score = score + 5;
            }
            if (op3.isSelected() && ans == 3) {
                score = score + 5;
            }
            if (op4.isSelected() && ans == 4) {
                score = score + 5;
            }
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
    }
    }
}//GEN-LAST:event_bconfirmActionPerformed

private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_op4ActionPerformed

private void r19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r19ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_r19ActionPerformed

private void r22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r22ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_r22ActionPerformed

private void r23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r23ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_r23ActionPerformed

private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
                
                try
                {
                    
                
                System.out.print("Inside Finish");
                String s=  (new Integer(score)).toString();
                System.out.println("score="+s);
                ps.setString(1, id);
                ps.setString(2, s);
                System.out.println("Executing update");
               
                ps.executeUpdate();
                System.exit(0);
                }
                catch(SQLException e)
                {
                    System.out.println("\nException in FInish button");
                }
}//GEN-LAST:event_finishActionPerformed

private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_r9ActionPerformed

private void questionnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionnoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_questionnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frame1(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bconfirm;
    private javax.swing.JButton bnext;
    private javax.swing.JButton bstart;
    private javax.swing.JButton bstart1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton finish;
    private javax.swing.JFrame finstr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JPanel pques;
    private javax.swing.JFrame quesframe;
    private javax.swing.JTextField questionno;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r16;
    private javax.swing.JRadioButton r17;
    private javax.swing.JRadioButton r18;
    private javax.swing.JRadioButton r19;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r20;
    private javax.swing.JRadioButton r21;
    private javax.swing.JRadioButton r22;
    private javax.swing.JRadioButton r23;
    private javax.swing.JRadioButton r24;
    private javax.swing.JRadioButton r25;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    private javax.swing.JTextArea txtq;
    // End of variables declaration//GEN-END:variables
}
