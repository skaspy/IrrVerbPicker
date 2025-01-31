/*
 * MIT License
 * 
 * Copyright (c) 2021 Sabine Kasparek
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package irrverbpicker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class provides the GUI for the project.
 *
 * @version 1.2
 * @author Sabine Kasparek
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private WordPicker wp;
  
  private String loadError = "\"FEHLER: \nZuerst den Button 'Pick verbs!' anklicken!!!\"";
  private String[] amount = new String[] {"1","2","3","4","5","6","7","8","9","10","12","14","16","18","20"};
  
  private JLabel lIrregularVerbPicker = new JLabel();
  private JRadioButton rb1Lernjahr = new JRadioButton();
  private JRadioButton rb2Lernjahr = new JRadioButton();
  private JRadioButton rb3Lernjahr = new JRadioButton();
  private JRadioButton rb4Lernjahr = new JRadioButton();
  private JRadioButton rb5Lernjahr = new JRadioButton();
  private JRadioButton rb6Lernjahr = new JRadioButton();
  
  
  private JTextArea jTextArea1 = new JTextArea("");
  private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JComboBox<String> jComboBox1 = new JComboBox<String>();
  private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<String>(amount);
  private JLabel lAnzahlderVerben = new JLabel();
  private JLabel lLernjahr = new JLabel();
  private JButton bInfinitive = new JButton();
  private JButton bSimplePast = new JButton();
  private JButton bInfinitiveSimplePast = new JButton();
  private JButton bLoadVerbs = new JButton();
  private JButton bInfinitiveSPPP = new JButton();
  private JButton bPastParticiple = new JButton();
  private ButtonGroup buttonGroup1 = new ButtonGroup();
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public GUI(WordPicker wp) { 
    // initialization of frame
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 519; 
    int frameHeight = 439;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Irregular Verb Picker");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    this.wp = wp;
    
    // start of components
    
    lIrregularVerbPicker.setBounds(24, 16, 199, 28);
    lIrregularVerbPicker.setText("Irregular Verb Picker");
    lIrregularVerbPicker.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(lIrregularVerbPicker);
    
    lLernjahr.setBounds(27, 56, 110, 20);
    lLernjahr.setText("Lernjahr:");
    cp.add(lLernjahr);
    
    rb1Lernjahr.setBounds(80, 56, 35, 20);
    rb1Lernjahr.setOpaque(false);
    rb1Lernjahr.setSelected(true);
    rb1Lernjahr.setText("1.");
    cp.add(rb1Lernjahr);
    rb1Lernjahr.addActionListener((ActionEvent evt) -> {
        rb1Lernjahr_ActionPerformed(evt);
    });
    rb2Lernjahr.setBounds(115, 56, 35, 20);
    rb2Lernjahr.setOpaque(false);
    rb2Lernjahr.setText("2.");
    cp.add(rb2Lernjahr);
    rb2Lernjahr.addActionListener((ActionEvent evt) -> {
        rb2Lernjahr_ActionPerformed(evt);
    });
    rb3Lernjahr.setBounds(150, 56, 35, 20);
    rb3Lernjahr.setOpaque(false);
    rb3Lernjahr.setText("3.");
    cp.add(rb3Lernjahr);
    rb3Lernjahr.addActionListener((ActionEvent evt) -> {
        rb3Lernjahr_ActionPerformed(evt);
    });
    rb4Lernjahr.setBounds(185, 56, 35, 20);
    rb4Lernjahr.setOpaque(false);
    rb4Lernjahr.setText("4.");
    cp.add(rb4Lernjahr);
    rb4Lernjahr.addActionListener((ActionEvent evt) -> {
        rb4Lernjahr_ActionPerformed(evt);
    });
    rb5Lernjahr.setBounds(220, 56, 35, 20);
    rb5Lernjahr.setOpaque(false);
    rb5Lernjahr.setText("5.");
    cp.add(rb5Lernjahr);
    rb5Lernjahr.addActionListener((ActionEvent evt) -> {
        rb5Lernjahr_ActionPerformed(evt);
    });
    rb6Lernjahr.setBounds(250, 56, 35, 20);
    rb6Lernjahr.setOpaque(false);
    rb6Lernjahr.setText("6.");
    cp.add(rb6Lernjahr);
    rb6Lernjahr.addActionListener((ActionEvent evt) -> {
        rb6Lernjahr_ActionPerformed(evt);
    });
    buttonGroup1.add(rb1Lernjahr);
    buttonGroup1.add(rb2Lernjahr);
    buttonGroup1.add(rb3Lernjahr);
    buttonGroup1.add(rb4Lernjahr);
    buttonGroup1.add(rb5Lernjahr);
    buttonGroup1.add(rb6Lernjahr);

    jTextArea1ScrollPane.setBounds(24, 88, 265, 289);
    cp.add(jTextArea1ScrollPane);
    
    jComboBox1.setModel(jComboBox1Model);
    jComboBox1.setBounds(410, 56, 50, 20);
    cp.add(jComboBox1);
    lAnzahlderVerben.setBounds(296, 56, 110, 20);
    lAnzahlderVerben.setText("Anzahl der Verben");
    cp.add(lAnzahlderVerben);
    
    bInfinitive.setBounds(296, 192, 123, 25);
    bInfinitive.setText("Infinitive");
    bInfinitive.setMargin(new Insets(2, 2, 2, 2));
    bInfinitive.setBackground(new Color(0xB8CFE5));
    bInfinitive.addActionListener(new ActionListener() { 
      @Override
      public void actionPerformed(ActionEvent evt) { 
        bSimpePresent_ActionPerformed(evt);
      }
    });
    cp.add(bInfinitive);
    
    bSimplePast.setBounds(296, 232, 123, 25);
    bSimplePast.setText("Simple Past");
    bSimplePast.setMargin(new Insets(2, 2, 2, 2));
    bSimplePast.setBackground(new Color(0xB8CFE5));
    bSimplePast.addActionListener(new ActionListener() { 
      @Override
      public void actionPerformed(ActionEvent evt) { 
        bSimplePast_ActionPerformed(evt);
      }
    });
    cp.add(bSimplePast);
    bInfinitiveSimplePast.setBounds(296, 312, 187, 25);
    bInfinitiveSimplePast.setText("Infinitive + Simple Past");
    bInfinitiveSimplePast.setMargin(new Insets(2, 2, 2, 2));
    bInfinitiveSimplePast.setBackground(new Color(0xB8CFE5));
    bInfinitiveSimplePast.addActionListener(new ActionListener() { 
      @Override
      public void actionPerformed(ActionEvent evt) { 
        bSimplePresentSimplePast_ActionPerformed(evt);
      }
    });
    cp.add(bInfinitiveSimplePast);
    bInfinitiveSPPP.setBounds(296, 352, 187, 25);
    bInfinitiveSPPP.setText("Infinitive + S.Past + P.Participle");
    bInfinitiveSPPP.setMargin(new Insets(2, 2, 2, 2));
    bInfinitiveSPPP.setBackground(new Color(0xCFE5B8));
    bInfinitiveSPPP.addActionListener(new ActionListener() { 
      @Override
      public void actionPerformed(ActionEvent evt) { 
        bInfintitiveSPPP_ActionPerformed(evt);
      }
    });
    cp.add(bInfinitiveSPPP);
    bPastParticiple.setBounds(296, 272, 123, 25);
    bPastParticiple.setText("Past Participle");
    bPastParticiple.setMargin(new Insets(2, 2, 2, 2));
    bPastParticiple.setBackground(new Color(0xCFE5B8));
    bPastParticiple.addActionListener(new ActionListener() { 
      @Override
      public void actionPerformed(ActionEvent evt) { 
        bPastParticiple_ActionPerformed(evt);
      }
    });
    cp.add(bPastParticiple);
   
    
    bLoadVerbs.setBounds(296, 88, 123, 25);
    bLoadVerbs.setText("Pick verbs!");
    bLoadVerbs.setMargin(new Insets(2, 2, 2, 2));
    bLoadVerbs.addActionListener(new ActionListener() { 
      @Override
      public void actionPerformed(ActionEvent evt) { 
        bLoadVerbs_ActionPerformed(evt);
      }
    });
    cp.add(bLoadVerbs);
    
    jLabel1.setBounds(24, 376, 150, 20);
    jLabel1.setText("© 2021-22 S. Kasparek");
    jLabel1.setFont(new Font("Dialog", Font.PLAIN, 10));
    jLabel1.setForeground(Color.GRAY);
    cp.add(jLabel1);
    // end of components
    
    setVisible(true);
  } // end of public IrrVerbGUI
  
  // start of methods
  public void bSimpePresent_ActionPerformed(ActionEvent evt) {
    if (wp.getPicks() == null) {
        jTextArea1.setText(loadError);
    } else {
    jTextArea1.setText(wp.showInfinitive());
    }
  } // end of bSimpePresent_ActionPerformed

  public void bSimplePast_ActionPerformed(ActionEvent evt) {
    if (wp.getPicks() == null) {
        jTextArea1.setText(loadError);
    }   else {
    jTextArea1.setText(wp.showSimplePast());
    }
  } // end of bSimplePast_ActionPerformed

  public void bSimplePresentSimplePast_ActionPerformed(ActionEvent evt) {
    if (wp.getPicks() == null) {
        jTextArea1.setText(loadError);
    } else {
    jTextArea1.setText(wp.showInfinitiveSimplePast());
    }
  } // end of bSimplePresentSimplePast_ActionPerformed

  public void bLoadVerbs_ActionPerformed(ActionEvent evt) {
    int number = Integer.parseInt(jComboBox1.getSelectedItem().toString());
    wp.pickVerbs(number);
    
  } // end of bLoadVerbs_ActionPerformed

  public void rb1Lernjahr_ActionPerformed(ActionEvent evt) {
    wp.setYearOfLearning(1);
    wp.loadFile();
  } 
  
  public void rb2Lernjahr_ActionPerformed(ActionEvent evt) {
    wp.setYearOfLearning(2);
    wp.loadFile();
  } 
  public void rb3Lernjahr_ActionPerformed(ActionEvent evt) {
    wp.setYearOfLearning(3);
    wp.loadFile();
  } 
  public void rb4Lernjahr_ActionPerformed(ActionEvent evt) {
    wp.setYearOfLearning(4);
    wp.loadFile();
  } 
  public void rb5Lernjahr_ActionPerformed(ActionEvent evt) {
    wp.setYearOfLearning(5);
    wp.loadFile();
  } 
  public void rb6Lernjahr_ActionPerformed(ActionEvent evt) {
    wp.setYearOfLearning(6);
    wp.loadFile();
  } 
  
  public void bInfintitiveSPPP_ActionPerformed(ActionEvent evt) {
    if (wp.getPicks() == null) {
        jTextArea1.setText(loadError);
    } else {
    jTextArea1.setText(wp.showInfinitiveSPPP());
    }
  } // end of bSimplePresentSimplePast1_ActionPerformed

  public void bPastParticiple_ActionPerformed(ActionEvent evt) {
    if (wp.getPicks() == null) {
        jTextArea1.setText(loadError);
    } else {
    jTextArea1.setText(wp.showPastParticiple());
    }
  } // end of bSimplePast1_ActionPerformed
  
  public String buttonGroup1_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = buttonGroup1.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) 
          return b.getText();
    }
    return "";
  }

  // end of methods
} // end of class IrrVerbGUI

