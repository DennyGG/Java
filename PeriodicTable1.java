/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.Border;



/**
 *
 * @author Denny-NB
 */
public class PeriodicTable1 extends javax.swing.JFrame {
    boolean button1 = true;
    PTbutton[] PTB = new PTbutton[118];
    
    
    /**
     * Creates new form PeriodicTable
     */
    public PeriodicTable1() {
        initComponents();
//        PTbutton[] PTB = new PTbutton[118];
        
        for(int i = 0; i < 118; i++){
            PTB[i] = new PTbutton();
            //System.out.println("PTB["+ i +"].button = jButton"+ (i+1) + ";");
            //用來印下面那串又臭又長的東西，先把對應的按鈕指過去
        }
        PTB[0].button = jButton1;PTB[1].button = jButton2;PTB[2].button = jButton3;PTB[3].button = jButton4;PTB[4].button = jButton5;
        PTB[5].button = jButton6;PTB[6].button = jButton7;PTB[7].button = jButton8;PTB[8].button = jButton9;PTB[9].button = jButton10;
        PTB[10].button = jButton11;PTB[11].button = jButton12;PTB[12].button = jButton13;PTB[13].button = jButton14;PTB[14].button = jButton15;
        PTB[15].button = jButton16;PTB[16].button = jButton17;PTB[17].button = jButton18;PTB[18].button = jButton19;PTB[19].button = jButton20;
        PTB[20].button = jButton21;PTB[21].button = jButton22;PTB[22].button = jButton23;PTB[23].button = jButton24;PTB[24].button = jButton25;
        PTB[25].button = jButton26;PTB[26].button = jButton27;PTB[27].button = jButton28;PTB[28].button = jButton29;PTB[29].button = jButton30;
        PTB[30].button = jButton31;PTB[31].button = jButton32;PTB[32].button = jButton33;PTB[33].button = jButton34;PTB[34].button = jButton35;
        PTB[35].button = jButton36;PTB[36].button = jButton37;PTB[37].button = jButton38;PTB[38].button = jButton39;PTB[39].button = jButton40;
        PTB[40].button = jButton41;PTB[41].button = jButton42;PTB[42].button = jButton43;PTB[43].button = jButton44;PTB[44].button = jButton45;
        PTB[45].button = jButton46;PTB[46].button = jButton47;PTB[47].button = jButton48;PTB[48].button = jButton49;PTB[49].button = jButton50;
        PTB[50].button = jButton51;PTB[51].button = jButton52;PTB[52].button = jButton53;PTB[53].button = jButton54;PTB[54].button = jButton55;
        PTB[55].button = jButton56;PTB[56].button = jButton57;PTB[57].button = jButton58;PTB[58].button = jButton59;PTB[59].button = jButton60;
        PTB[60].button = jButton61;PTB[61].button = jButton62;PTB[62].button = jButton63;PTB[63].button = jButton64;PTB[64].button = jButton65;
        PTB[65].button = jButton66;PTB[66].button = jButton67;PTB[67].button = jButton68;PTB[68].button = jButton69;PTB[69].button = jButton70;
        PTB[70].button = jButton71;PTB[71].button = jButton72;PTB[72].button = jButton73;PTB[73].button = jButton74;PTB[74].button = jButton75;
        PTB[75].button = jButton76;PTB[76].button = jButton77;PTB[77].button = jButton78;PTB[78].button = jButton79;PTB[79].button = jButton80;
        PTB[80].button = jButton81;PTB[81].button = jButton82;PTB[82].button = jButton83;PTB[83].button = jButton84;PTB[84].button = jButton85;
        PTB[85].button = jButton86;PTB[86].button = jButton87;PTB[87].button = jButton88;PTB[88].button = jButton89;PTB[89].button = jButton90;
        PTB[90].button = jButton91;PTB[91].button = jButton92;PTB[92].button = jButton93;PTB[93].button = jButton94;PTB[94].button = jButton95;
        PTB[95].button = jButton96;PTB[96].button = jButton97;PTB[97].button = jButton98;PTB[98].button = jButton99;PTB[99].button = jButton100;
        PTB[100].button = jButton101;PTB[101].button = jButton102;PTB[102].button = jButton103;PTB[103].button = jButton104;PTB[104].button = jButton105;
        PTB[105].button = jButton106;PTB[106].button = jButton107;PTB[107].button = jButton108;PTB[108].button = jButton109;PTB[109].button = jButton110;
        PTB[110].button = jButton111;PTB[111].button = jButton112;PTB[112].button = jButton113;PTB[113].button = jButton114;PTB[114].button = jButton115;
        PTB[115].button = jButton116;PTB[116].button = jButton117;PTB[117].button = jButton118;
        //將元素週期表的No,Name,是否要選的csv資料寫進RTbutton class裏頭
        try{
            FileReader fr = new FileReader("setting/PeriodicTablelist.csv");
            BufferedReader br = new BufferedReader(fr);
            String line=null;
            while((line=br.readLine())!=null){
                PTB[Integer.parseInt(line.split(",")[0])-1].No = Integer.parseInt(line.split(",")[0]);
                PTB[Integer.parseInt(line.split(",")[0])-1].Name = line.split(",")[1];
                PTB[Integer.parseInt(line.split(",")[0])-1].click = Boolean.parseBoolean(line.split(",")[2]);
                
                
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        //將按鈕依照PeriodicTablelist.csv顯示升起或降下
        //"<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>"
        for(int i = 0; i<PTB.length;i++){         
            showPeriodicTable(i);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButtonDefault = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PeriodicTable");

        jPanel1.setToolTipText(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 103));
        jButton1.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton1.setToolTipText(null);
        jButton1.setActionCommand("");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton3.setToolTipText(null);
        jButton3.setActionCommand("");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 102, 102));
        jButton11.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton11.setToolTipText(null);
        jButton11.setActionCommand("");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 102, 102));
        jButton19.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton19.setToolTipText(null);
        jButton19.setActionCommand("");
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(255, 102, 102));
        jButton37.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton37.setToolTipText(null);
        jButton37.setActionCommand("");
        jButton37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton37.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(255, 102, 102));
        jButton55.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton55.setToolTipText(null);
        jButton55.setActionCommand("");
        jButton55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton55.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton55.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton87.setBackground(new java.awt.Color(255, 102, 102));
        jButton87.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton87.setToolTipText(null);
        jButton87.setActionCommand("");
        jButton87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton87.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton87.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton87.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 222, 173));
        jButton4.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton4.setToolTipText(null);
        jButton4.setActionCommand("");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 222, 173));
        jButton12.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton12.setToolTipText(null);
        jButton12.setActionCommand("");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 222, 173));
        jButton20.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton20.setToolTipText(null);
        jButton20.setActionCommand("");
        jButton20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(255, 222, 173));
        jButton38.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton38.setToolTipText(null);
        jButton38.setActionCommand("");
        jButton38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton38.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton38.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(255, 222, 173));
        jButton56.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton56.setToolTipText(null);
        jButton56.setActionCommand("");
        jButton56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton56.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton56.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton88.setBackground(new java.awt.Color(255, 222, 173));
        jButton88.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton88.setToolTipText(null);
        jButton88.setActionCommand("");
        jButton88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton88.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton88.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton88.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 192, 192));
        jButton21.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton21.setToolTipText(null);
        jButton21.setActionCommand("");
        jButton21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton21.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(255, 192, 192));
        jButton39.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton39.setToolTipText(null);
        jButton39.setActionCommand("");
        jButton39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton39.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton39.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(255, 192, 192));
        jButton22.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton22.setToolTipText(null);
        jButton22.setActionCommand("");
        jButton22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton22.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 192, 192));
        jButton23.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton23.setToolTipText(null);
        jButton23.setActionCommand("");
        jButton23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 192, 192));
        jButton24.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton24.setToolTipText(null);
        jButton24.setActionCommand("");
        jButton24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton24.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(255, 192, 192));
        jButton25.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton25.setToolTipText(null);
        jButton25.setActionCommand("");
        jButton25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton25.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(255, 192, 192));
        jButton26.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton26.setToolTipText(null);
        jButton26.setActionCommand("");
        jButton26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton26.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(255, 192, 192));
        jButton27.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton27.setToolTipText(null);
        jButton27.setActionCommand("");
        jButton27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton27.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 192, 192));
        jButton28.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton28.setToolTipText(null);
        jButton28.setActionCommand("");
        jButton28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton28.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(255, 192, 192));
        jButton29.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton29.setToolTipText(null);
        jButton29.setActionCommand("");
        jButton29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton29.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(154, 154, 153));
        jButton30.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton30.setToolTipText(null);
        jButton30.setActionCommand("");
        jButton30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton30.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(154, 154, 153));
        jButton31.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton31.setToolTipText(null);
        jButton31.setActionCommand("");
        jButton31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton31.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(195, 195, 153));
        jButton32.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton32.setToolTipText(null);
        jButton32.setActionCommand("");
        jButton32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton32.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(195, 195, 153));
        jButton33.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton33.setToolTipText(null);
        jButton33.setActionCommand("");
        jButton33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton33.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(255, 255, 103));
        jButton34.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton34.setToolTipText(null);
        jButton34.setActionCommand("");
        jButton34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton34.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(255, 255, 103));
        jButton35.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton35.setToolTipText(null);
        jButton35.setActionCommand("");
        jButton35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton35.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(192, 255, 255));
        jButton36.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton36.setToolTipText(null);
        jButton36.setActionCommand("");
        jButton36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton36.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton58.setBackground(new java.awt.Color(255, 191, 255));
        jButton58.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton58.setToolTipText(null);
        jButton58.setActionCommand("");
        jButton58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton58.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton58.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(255, 153, 204));
        jButton90.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton90.setToolTipText(null);
        jButton90.setActionCommand("");
        jButton90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton90.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton90.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton90.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(255, 191, 255));
        jButton59.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton59.setToolTipText(null);
        jButton59.setActionCommand("");
        jButton59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton59.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton59.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton91.setBackground(new java.awt.Color(255, 153, 204));
        jButton91.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton91.setToolTipText(null);
        jButton91.setActionCommand("");
        jButton91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton91.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton91.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton91.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(192, 255, 255));
        jButton18.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton18.setToolTipText(null);
        jButton18.setActionCommand("");
        jButton18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(192, 255, 255));
        jButton10.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton10.setToolTipText(null);
        jButton10.setActionCommand("");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(192, 255, 255));
        jButton2.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton2.setToolTipText(null);
        jButton2.setActionCommand("");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 103));
        jButton9.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton9.setToolTipText(null);
        jButton9.setActionCommand("");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 255, 103));
        jButton17.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton17.setToolTipText(null);
        jButton17.setActionCommand("");
        jButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 103));
        jButton8.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton8.setToolTipText(null);
        jButton8.setActionCommand("");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 103));
        jButton16.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton16.setToolTipText(null);
        jButton16.setActionCommand("");
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 103));
        jButton7.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton7.setToolTipText(null);
        jButton7.setActionCommand("");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 255, 103));
        jButton15.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton15.setToolTipText(null);
        jButton15.setActionCommand("");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 103));
        jButton6.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton6.setToolTipText(null);
        jButton6.setActionCommand("");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(195, 195, 153));
        jButton14.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton14.setToolTipText(null);
        jButton14.setActionCommand("");
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(195, 195, 153));
        jButton5.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton5.setToolTipText(null);
        jButton5.setActionCommand("");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(154, 154, 153));
        jButton13.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton13.setToolTipText(null);
        jButton13.setActionCommand("");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(255, 192, 192));
        jButton40.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton40.setToolTipText(null);
        jButton40.setActionCommand("");
        jButton40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton40.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton40.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(255, 192, 192));
        jButton41.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton41.setToolTipText(null);
        jButton41.setActionCommand("");
        jButton41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton41.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton41.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(255, 192, 192));
        jButton42.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton42.setToolTipText(null);
        jButton42.setActionCommand("");
        jButton42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton42.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton42.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(255, 192, 192));
        jButton43.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton43.setToolTipText(null);
        jButton43.setActionCommand("");
        jButton43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton43.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton43.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(255, 192, 192));
        jButton44.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton44.setToolTipText(null);
        jButton44.setActionCommand("");
        jButton44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton44.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton44.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(255, 192, 192));
        jButton45.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton45.setToolTipText(null);
        jButton45.setActionCommand("");
        jButton45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton45.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton45.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(255, 192, 192));
        jButton46.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton46.setToolTipText(null);
        jButton46.setActionCommand("");
        jButton46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton46.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton46.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(255, 192, 192));
        jButton47.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton47.setToolTipText(null);
        jButton47.setActionCommand("");
        jButton47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton47.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton47.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(154, 154, 153));
        jButton48.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton48.setToolTipText(null);
        jButton48.setActionCommand("");
        jButton48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton48.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton48.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setBackground(new java.awt.Color(154, 154, 153));
        jButton49.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton49.setToolTipText(null);
        jButton49.setActionCommand("");
        jButton49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton49.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton49.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setBackground(new java.awt.Color(154, 154, 153));
        jButton50.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton50.setToolTipText(null);
        jButton50.setActionCommand("");
        jButton50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton50.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton50.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(195, 195, 153));
        jButton51.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton51.setToolTipText(null);
        jButton51.setActionCommand("");
        jButton51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton51.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton51.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setBackground(new java.awt.Color(195, 195, 153));
        jButton52.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton52.setToolTipText(null);
        jButton52.setActionCommand("");
        jButton52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton52.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton52.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(255, 255, 103));
        jButton53.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton53.setToolTipText(null);
        jButton53.setActionCommand("");
        jButton53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton53.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton53.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setBackground(new java.awt.Color(192, 255, 255));
        jButton54.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton54.setToolTipText(null);
        jButton54.setActionCommand("");
        jButton54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton54.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton54.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton86.setBackground(new java.awt.Color(192, 255, 255));
        jButton86.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton86.setToolTipText(null);
        jButton86.setActionCommand("");
        jButton86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton86.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton86.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton86.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        jButton118.setBackground(new java.awt.Color(232, 232, 232));
        jButton118.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton118.setToolTipText(null);
        jButton118.setActionCommand("");
        jButton118.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton118.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton118.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton118.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });

        jButton57.setBackground(new java.awt.Color(255, 191, 255));
        jButton57.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton57.setToolTipText(null);
        jButton57.setActionCommand("");
        jButton57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton57.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton57.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton72.setBackground(new java.awt.Color(255, 192, 192));
        jButton72.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton72.setToolTipText(null);
        jButton72.setActionCommand("");
        jButton72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton72.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton72.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton72.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(255, 192, 192));
        jButton73.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton73.setToolTipText(null);
        jButton73.setActionCommand("");
        jButton73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton73.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton73.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton73.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setBackground(new java.awt.Color(255, 192, 192));
        jButton74.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton74.setToolTipText(null);
        jButton74.setActionCommand("");
        jButton74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton74.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton74.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton74.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(255, 192, 192));
        jButton75.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton75.setToolTipText(null);
        jButton75.setActionCommand("");
        jButton75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton75.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton75.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton75.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setBackground(new java.awt.Color(255, 192, 192));
        jButton76.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton76.setToolTipText(null);
        jButton76.setActionCommand("");
        jButton76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton76.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton76.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton76.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton89.setBackground(new java.awt.Color(255, 153, 204));
        jButton89.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton89.setToolTipText(null);
        jButton89.setActionCommand("");
        jButton89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton89.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton89.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton89.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton104.setBackground(new java.awt.Color(255, 192, 192));
        jButton104.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton104.setToolTipText(null);
        jButton104.setActionCommand("");
        jButton104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton104.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton104.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton104.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });

        jButton105.setBackground(new java.awt.Color(255, 192, 192));
        jButton105.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton105.setToolTipText(null);
        jButton105.setActionCommand("");
        jButton105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton105.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton105.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton105.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });

        jButton106.setBackground(new java.awt.Color(255, 192, 192));
        jButton106.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton106.setToolTipText(null);
        jButton106.setActionCommand("");
        jButton106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton106.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton106.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton106.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jButton107.setBackground(new java.awt.Color(255, 192, 192));
        jButton107.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton107.setToolTipText(null);
        jButton107.setActionCommand("");
        jButton107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton107.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton107.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton107.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });

        jButton108.setBackground(new java.awt.Color(255, 192, 192));
        jButton108.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton108.setToolTipText(null);
        jButton108.setActionCommand("");
        jButton108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton108.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton108.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton108.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });

        jButton60.setBackground(new java.awt.Color(255, 191, 255));
        jButton60.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton60.setToolTipText(null);
        jButton60.setActionCommand("");
        jButton60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton60.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton60.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(255, 191, 255));
        jButton61.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton61.setToolTipText(null);
        jButton61.setActionCommand("");
        jButton61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton61.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton61.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.setBackground(new java.awt.Color(255, 191, 255));
        jButton62.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton62.setToolTipText(null);
        jButton62.setActionCommand("");
        jButton62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton62.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton62.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(255, 191, 255));
        jButton63.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton63.setToolTipText(null);
        jButton63.setActionCommand("");
        jButton63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton63.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton63.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(255, 191, 255));
        jButton64.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton64.setToolTipText(null);
        jButton64.setActionCommand("");
        jButton64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton64.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton64.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(255, 191, 255));
        jButton65.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton65.setToolTipText(null);
        jButton65.setActionCommand("");
        jButton65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton65.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton65.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.setBackground(new java.awt.Color(255, 191, 255));
        jButton66.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton66.setToolTipText(null);
        jButton66.setActionCommand("");
        jButton66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton66.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton66.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton66.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.setBackground(new java.awt.Color(255, 191, 255));
        jButton67.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton67.setToolTipText(null);
        jButton67.setActionCommand("");
        jButton67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton67.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton67.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setBackground(new java.awt.Color(255, 191, 255));
        jButton68.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton68.setToolTipText(null);
        jButton68.setActionCommand("");
        jButton68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton68.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton68.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(255, 191, 255));
        jButton69.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton69.setToolTipText(null);
        jButton69.setActionCommand("");
        jButton69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton69.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton69.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton69.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.setBackground(new java.awt.Color(255, 191, 255));
        jButton70.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton70.setToolTipText(null);
        jButton70.setActionCommand("");
        jButton70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton70.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton70.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.setBackground(new java.awt.Color(255, 191, 255));
        jButton71.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton71.setToolTipText(null);
        jButton71.setActionCommand("");
        jButton71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton71.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton71.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(255, 192, 192));
        jButton77.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton77.setToolTipText(null);
        jButton77.setActionCommand("");
        jButton77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton77.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton77.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton77.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.setBackground(new java.awt.Color(255, 192, 192));
        jButton78.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton78.setToolTipText(null);
        jButton78.setActionCommand("");
        jButton78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton78.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton78.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton78.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(255, 192, 192));
        jButton79.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton79.setToolTipText(null);
        jButton79.setActionCommand("");
        jButton79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton79.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton79.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton79.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton80.setBackground(new java.awt.Color(154, 154, 153));
        jButton80.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton80.setToolTipText(null);
        jButton80.setActionCommand("");
        jButton80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton80.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton80.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton80.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.setBackground(new java.awt.Color(154, 154, 153));
        jButton81.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton81.setToolTipText(null);
        jButton81.setActionCommand("");
        jButton81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton81.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton81.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton81.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jButton82.setBackground(new java.awt.Color(154, 154, 153));
        jButton82.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton82.setToolTipText(null);
        jButton82.setActionCommand("");
        jButton82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton82.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton82.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton82.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(154, 154, 153));
        jButton83.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton83.setToolTipText(null);
        jButton83.setActionCommand("");
        jButton83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton83.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton83.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton83.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton84.setBackground(new java.awt.Color(154, 154, 153));
        jButton84.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton84.setToolTipText(null);
        jButton84.setActionCommand("");
        jButton84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton84.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton84.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton84.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        jButton85.setBackground(new java.awt.Color(195, 195, 153));
        jButton85.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton85.setToolTipText(null);
        jButton85.setActionCommand("");
        jButton85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton85.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton85.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton85.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jButton109.setBackground(new java.awt.Color(232, 232, 232));
        jButton109.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton109.setToolTipText(null);
        jButton109.setActionCommand("");
        jButton109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton109.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton109.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton109.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        jButton110.setBackground(new java.awt.Color(232, 232, 232));
        jButton110.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton110.setToolTipText(null);
        jButton110.setActionCommand("");
        jButton110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton110.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton110.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton110.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jButton111.setBackground(new java.awt.Color(232, 232, 232));
        jButton111.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton111.setToolTipText(null);
        jButton111.setActionCommand("");
        jButton111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton111.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton111.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton111.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jButton112.setBackground(new java.awt.Color(154, 154, 153));
        jButton112.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton112.setToolTipText(null);
        jButton112.setActionCommand("");
        jButton112.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton112.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton112.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton112.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setBackground(new java.awt.Color(232, 232, 232));
        jButton113.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton113.setToolTipText(null);
        jButton113.setActionCommand("");
        jButton113.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton113.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton113.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton113.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });

        jButton114.setBackground(new java.awt.Color(232, 232, 232));
        jButton114.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton114.setToolTipText(null);
        jButton114.setActionCommand("");
        jButton114.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton114.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton114.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton114.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });

        jButton115.setBackground(new java.awt.Color(232, 232, 232));
        jButton115.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton115.setToolTipText(null);
        jButton115.setActionCommand("");
        jButton115.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton115.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton115.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton115.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });

        jButton116.setBackground(new java.awt.Color(232, 232, 232));
        jButton116.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton116.setToolTipText(null);
        jButton116.setActionCommand("");
        jButton116.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton116.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton116.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton116.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });

        jButton117.setBackground(new java.awt.Color(232, 232, 232));
        jButton117.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton117.setToolTipText(null);
        jButton117.setActionCommand("");
        jButton117.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton117.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton117.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton117.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });

        jButton92.setBackground(new java.awt.Color(255, 153, 204));
        jButton92.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton92.setToolTipText(null);
        jButton92.setActionCommand("");
        jButton92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton92.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton92.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton92.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(255, 153, 204));
        jButton93.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton93.setToolTipText(null);
        jButton93.setActionCommand("");
        jButton93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton93.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton93.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton93.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        jButton94.setBackground(new java.awt.Color(255, 153, 204));
        jButton94.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton94.setToolTipText(null);
        jButton94.setActionCommand("");
        jButton94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton94.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton94.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton94.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jButton95.setBackground(new java.awt.Color(255, 153, 204));
        jButton95.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton95.setToolTipText(null);
        jButton95.setActionCommand("");
        jButton95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton95.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton95.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton95.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });

        jButton96.setBackground(new java.awt.Color(255, 153, 204));
        jButton96.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton96.setToolTipText(null);
        jButton96.setActionCommand("");
        jButton96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton96.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton96.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton96.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton97.setBackground(new java.awt.Color(255, 153, 204));
        jButton97.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton97.setToolTipText(null);
        jButton97.setActionCommand("");
        jButton97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton97.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton97.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton97.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton98.setBackground(new java.awt.Color(255, 153, 204));
        jButton98.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton98.setToolTipText(null);
        jButton98.setActionCommand("");
        jButton98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton98.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton98.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });

        jButton99.setBackground(new java.awt.Color(255, 153, 204));
        jButton99.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton99.setToolTipText(null);
        jButton99.setActionCommand("");
        jButton99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton99.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton99.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton99.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });

        jButton100.setBackground(new java.awt.Color(255, 153, 204));
        jButton100.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton100.setToolTipText(null);
        jButton100.setActionCommand("");
        jButton100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton100.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton100.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jButton102.setBackground(new java.awt.Color(255, 153, 204));
        jButton102.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton102.setToolTipText(null);
        jButton102.setActionCommand("");
        jButton102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton102.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton102.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton102.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jButton101.setBackground(new java.awt.Color(255, 153, 204));
        jButton101.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton101.setToolTipText(null);
        jButton101.setActionCommand("");
        jButton101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton101.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton101.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton101.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jButton103.setBackground(new java.awt.Color(255, 153, 204));
        jButton103.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>1</b></font> <br><font size=\"6\">H</font> </p> </div>  </html>");
        jButton103.setToolTipText(null);
        jButton103.setActionCommand("");
        jButton103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton103.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton103.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton103.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        jButtonDefault.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonDefault.setText("Default");
        jButtonDefault.setToolTipText(null);
        jButtonDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefaultActionPerformed(evt);
            }
        });

        jButtonOK.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.setToolTipText(null);
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.setToolTipText(null);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buttoms with colored fonts are used chemical elements. ");

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>\n<tr>\n<td style=\"padding:0 5;background: #ff6666;\">Alkali metal\n</td>\n<td style=\"padding:0 5; background:#ffdead;\">Alkaline earth metal\n</td>\n<td style=\"padding:0 5; background:#ffbfff;\">Lan­thanide\n</td>\n<td style=\"padding:0 5; background:#ff99cc;\">Actinide\n</td>\n<td style=\"padding:0 5; background:#ffc0c0;\">Transition metal\n</td>\n<td style=\"padding:0 5; background:#9A9A99;\">Post-​transition metal\n</td>\n<td style=\"padding:0 5; background:#C3C399;\">Metalloid\n</td>\n<td style=\"padding:0 5; background:#FFFF67;\">Reactive nonmetal\n</td>\n<td style=\"padding:0 5; background:#c0ffff;\">Noble gas\n</td>\n<td style=\"padding:0 5; background:#e8e8e8;\">Unknown chemical properties\n</td></tr>\n</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jButtonDefault)
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(72, 72, 72)
                                                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton92, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDefault)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonCancel))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Border raisedbevel, loweredbevel;
        raisedbevel = BorderFactory.createRaisedBevelBorder();//按鍵升起
        loweredbevel = BorderFactory.createLoweredBevelBorder();//按鍵降下
        //jButton1.setBorder(loweredbevel);
        //jButton3.setText("33333");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * 按下jButton後要執行的動作。
     *
     * @param i 第i個按鈕
     */
    public void jButtonAction(int i){
        if(PTB[i-1].click == true){
            PTB[i-1].button.setBorder(BorderFactory.createRaisedBevelBorder());
            PTB[i-1].button.setText("<html>  <div style=\"color:#AAAAAA; text-align:center;\" > <p> <font size=\"4\"><b>"
                +PTB[i-1].No+"</b></font> <br><font size=\"6\">"
                +PTB[i-1].Name+"</font> </p> </div>  </html>");
            PTB[i-1].click =false;
        }
        else{
            PTB[i-1].button.setBorder(BorderFactory.createLoweredBevelBorder());
            PTB[i-1].button.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>"
                +PTB[i-1].No+"</b></font> <br><font size=\"6\">"
                +PTB[i-1].Name+"</font> </p> </div>  </html>");
            PTB[i-1].click = true;
        }
    }
    /**
     * 顯示元素週期表選擇的元素。
     *
     * @param i PTButtom class中第i個
     */
    public void showPeriodicTable(int i){
        if(PTB[i].click == true){
                PTB[i].button.setBorder(BorderFactory.createLoweredBevelBorder());
                PTB[i].button.setText("<html>  <div style=\"color:#0000FF; text-align:center;\" > <p> <font size=\"4\"><b>"
                    +PTB[i].No+"</b></font> <br><font size=\"6\">"
                    +PTB[i].Name+"</font> </p> </div>  </html>");
            }
            else{
                PTB[i].button.setBorder(BorderFactory.createRaisedBevelBorder());
                PTB[i].button.setText("<html>  <div style=\"color:#AAAAAA; text-align:center;\" > <p> <font size=\"4\"><b>"
                    +PTB[i].No+"</b></font> <br><font size=\"6\">"
                    +PTB[i].Name+"</font> </p> </div>  </html>");
            }
        
    }
    /**
     * 回傳要排除的元素陣列
     *
     * @return Sting的list
     */
    public String[] getExceptStringList(){
        int countF = 0;
        int j = 0;
        for(int i = 0; i<PTB.length;i++){         
            if(PTB[i].click==false){
                countF++;
            }
        }
        String[] list = new String[countF];
        for(int i = 0; i<PTB.length;i++){
            if(PTB[i].click==false){
                list[j] = PTB[i].Name;
                j++;
            }       
        }
        
        return list;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // TODO add your handling code here:
        jButtonAction(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButtonAction(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButtonAction(11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        jButtonAction(19);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        jButtonAction(37);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
        jButtonAction(55);
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
        jButtonAction(87);
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButtonAction(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jButtonAction(12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        jButtonAction(20);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        jButtonAction(38);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        jButtonAction(56);
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
        jButtonAction(88);
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        jButtonAction(21);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        jButtonAction(39);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        jButtonAction(22);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        jButtonAction(23);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        jButtonAction(24);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        jButtonAction(25);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        jButtonAction(26);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        jButtonAction(27);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        jButtonAction(28);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        jButtonAction(29);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        jButtonAction(30);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        jButtonAction(31);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        jButtonAction(32);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        jButtonAction(33);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        jButtonAction(34);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        jButtonAction(35);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        jButtonAction(36);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        jButtonAction(58);
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
        jButtonAction(90);
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        jButtonAction(59);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
        jButtonAction(91);
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButtonAction(10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButtonAction(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButtonAction(9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        jButtonAction(17);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButtonAction(8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jButtonAction(16);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButtonAction(7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        jButtonAction(15);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButtonAction(6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jButtonAction(14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButtonAction(5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jButtonAction(13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        jButtonAction(40);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        jButtonAction(41);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        jButtonAction(42);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        jButtonAction(43);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        jButtonAction(44);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        jButtonAction(45);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        jButtonAction(46);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        jButtonAction(47);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        jButtonAction(48);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        jButtonAction(49);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        jButtonAction(50);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        jButtonAction(51);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
        jButtonAction(52);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        jButtonAction(53);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
        jButtonAction(54);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
        jButtonAction(86);
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
        // TODO add your handling code here:
        jButtonAction(118);
    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
        jButtonAction(57);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        // TODO add your handling code here:
        jButtonAction(72);
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
        jButtonAction(73);
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
        jButtonAction(74);
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
        jButtonAction(75);
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
        jButtonAction(76);
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
        jButtonAction(89);
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        // TODO add your handling code here:
        jButtonAction(104);
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
        // TODO add your handling code here:
        jButtonAction(105);
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        // TODO add your handling code here:
        jButtonAction(106);
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        // TODO add your handling code here:
        jButtonAction(107);
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
        // TODO add your handling code here:
        jButtonAction(108);
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
        jButtonAction(60);
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        jButtonAction(61);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        jButtonAction(62);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        jButtonAction(63);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        jButtonAction(64);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
        jButtonAction(65);
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
        jButtonAction(66);
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
        jButtonAction(67);
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
        jButtonAction(68);
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
        jButtonAction(69);
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
        jButtonAction(70);
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
        jButtonAction(71);
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
        jButtonAction(77);
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
        jButtonAction(78);
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
        jButtonAction(79);
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
        jButtonAction(80);
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
        jButtonAction(81);
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
        jButtonAction(82);
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
        jButtonAction(83);
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
        jButtonAction(84);
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
        jButtonAction(85);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
        // TODO add your handling code here:
        jButtonAction(109);
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        // TODO add your handling code here:
        jButtonAction(110);
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
        // TODO add your handling code here:
        jButtonAction(111);
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        // TODO add your handling code here:
        jButtonAction(112);
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
        // TODO add your handling code here:
        jButtonAction(113);
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
        // TODO add your handling code here:
        jButtonAction(114);
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
        // TODO add your handling code here:
        jButtonAction(115);
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
        // TODO add your handling code here:
        jButtonAction(116);
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
        // TODO add your handling code here:
        jButtonAction(117);
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
        jButtonAction(92);
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
        jButtonAction(93);
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
        jButtonAction(94);
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        // TODO add your handling code here:
        jButtonAction(95);
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
       jButtonAction(96); 
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
        jButtonAction(97);
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
        jButtonAction(98);
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        // TODO add your handling code here:
        jButtonAction(99);
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
        jButtonAction(100);
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        // TODO add your handling code here:
        jButtonAction(102);
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        // TODO add your handling code here:
        jButtonAction(101);
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        // TODO add your handling code here:
        jButtonAction(103);
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jButtonAction(18);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButtonDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDefaultActionPerformed
        // TODO add your handling code here:
        try {
        InputStream is=this.getClass().getResourceAsStream("/system_default/PeriodicTablelist_default.csv");
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        FileWriter fw = new FileWriter("setting/PeriodicTablelist.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        StringBuilder builder = new StringBuilder();
        String line = null;        
        while((line=br.readLine())!=null){
            PTB[Integer.parseInt(line.split(",")[0])-1].No = Integer.parseInt(line.split(",")[0]);
            PTB[Integer.parseInt(line.split(",")[0])-1].Name = line.split(",")[1];
            PTB[Integer.parseInt(line.split(",")[0])-1].click = Boolean.parseBoolean(line.split(",")[2]);
            builder.append(line);
            builder.append("\r\n");
        }
        bw.write(builder.toString());
        bw.flush();
        bw.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
        for(int i = 0; i<PTB.length;i++){         
            showPeriodicTable(i);
        }
        
    }//GEN-LAST:event_jButtonDefaultActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Do you really want to exit this window ?", "Warning", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try{
            FileWriter fw = new FileWriter("setting/PeriodicTablelist.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i<PTB.length;i++){
                builder.append(PTB[i].No);
                builder.append(",");
                builder.append(PTB[i].Name);
                builder.append(",");
                builder.append(PTB[i].click);
                builder.append("\r\n");
            }
            bw.write(builder.toString());
            bw.flush();
            bw.close();
            dispose();
            
        }catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonOKActionPerformed
    public static class PTbutton{
        JButton button ;
        Integer No;
        String Name;
        Boolean click;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeriodicTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeriodicTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeriodicTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeriodicTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeriodicTable1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDefault;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
