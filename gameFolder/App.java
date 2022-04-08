package gameFolder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class App {

        // Game button
        protected JButton startGame;
        protected JButton tryAgain;

        // Game icon

        protected ImageIcon boxUnpick_img;
        protected ImageIcon box0_img;
        protected ImageIcon box1_img;
        protected ImageIcon box2_img;
        protected ImageIcon box3_img;
        protected ImageIcon box4_img;
        protected ImageIcon box5_img;
        protected ImageIcon box6_img;
        protected ImageIcon box7_img;
        protected ImageIcon box8_img;
        protected ImageIcon box9_img;
        protected ImageIcon unselectSolveBox;

        protected ImageIcon num0_img;
        protected ImageIcon num1_img;
        protected ImageIcon num2_img;
        protected ImageIcon num3_img;
        protected ImageIcon num4_img;
        protected ImageIcon num5_img;
        protected ImageIcon num6_img;
        protected ImageIcon num7_img;
        protected ImageIcon num8_img;
        protected ImageIcon num9_img;

        protected ImageIcon operator_plus_img;
        protected ImageIcon operator_minus_img;
        protected ImageIcon operator_multiply_img;
        protected ImageIcon operator_divide_img;
        protected ImageIcon operator_bracketLeft_img;
        protected ImageIcon operator_bracketRight_img;
        protected ImageIcon operator_delete_img;
        protected ImageIcon operator_equal_img;
        protected ImageIcon operator_cat_img;

        protected ImageIcon choose2box;
        protected ImageIcon choose1box;
        protected ImageIcon choose0box;

        protected ImageIcon resultUN;
        protected ImageIcon resultNO;
        protected ImageIcon resultYES;
        protected ImageIcon resultERROR;

        protected ImageIcon beforeEaterEgg;
        protected ImageIcon afterEaterEgg;

        // Game box
        protected JButton boxUnpick;
        protected JButton box0;
        protected JButton box1;
        protected JButton box2;
        protected JButton box3;
        protected JButton box4;
        protected JButton box5;
        protected JButton box6;
        protected JButton box7;
        protected JButton box8;
        protected JButton box9;
        protected JLabel solveBox1;
        protected JLabel solveBox2;

        // Game calculator
        protected JButton num0;
        protected JButton num1;
        protected JButton num2;
        protected JButton num3;
        protected JButton num4;
        protected JButton num5;
        protected JButton num6;
        protected JButton num7;
        protected JButton num8;
        protected JButton num9;

        protected JButton operator_plus;
        protected JButton operator_minus;
        protected JButton operator_multiply;
        protected JButton operator_devide;
        protected JButton operator_bracketLeft;
        protected JButton operator_bracketRight;
        protected JButton operator_delete;
        protected JButton operator_equal;
        protected JLabel operator_cat;

        // Game frame and panel
        protected JFrame frame;
        protected JPanel bannerPanel;
        protected JPanel bannerPanel2;
        protected JPanel calculateField;

        protected JPanel boxPanel;
        protected JLabel boxAndOperatorBookMark0;
        protected JLabel boxAndOperatorBookMark1;
        protected JLabel boxAndOperatorBookMark2;
        protected JLabel boxAndOperatorBookMark3;
        protected JLabel boxAndOperatorBookMark4;
        protected JButton eaterEgg;
        protected JLabel banner;
        protected JLabel pleaseChoose;
        protected JLabel chooseBox;
        protected JLabel calculator;

        protected JLabel result;

        // Game inform
        protected ImageIcon[] boxArrays;
        protected ImageIcon[] boxChoose;
        protected Random random;
        protected int randomBox;
        protected int boxCount = 2;
        protected int numberFromBox1;
        protected int numberFromBox2;
        protected String solve;
        protected JLabel youNeedToSolve;
        protected JLabel calculatorSolve;
        protected String calculatorOutput = "";
        protected int numCount = 5;
        protected int sumCal;

        protected FullCalculator FullCal;

        protected boolean box0click = true;
        protected boolean box1click = true;
        protected boolean box2click = true;
        protected boolean box3click = true;
        protected boolean box4click = true;
        protected boolean box5click = true;
        protected boolean box6click = true;
        protected boolean box7click = true;
        protected boolean box8click = true;

        public App() {
                frame = new JFrame("Can you slove it?");
                frame.setIconImage(new ImageIcon("gameImage/appLogoImg.jpg").getImage());
                frame.setSize(1200, 1000);
                frame.getContentPane().setBackground(Color.BLACK);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameBox();

                frame.setVisible(true);
        }

        private void gameBox() {
                try {
                        // Game graphic
                        choose0box = new ImageIcon(new ImageIcon("gameImage/pleaseChoose0box.png").getImage()
                                        .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH));
                        choose1box = new ImageIcon(new ImageIcon("gameImage/pleaseChoose1box.png").getImage()
                                        .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH));
                        choose2box = new ImageIcon(new ImageIcon("gameImage/pleaseChoose2box.png").getImage()
                                        .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH));
                        // Game box
                        boxUnpick_img = new ImageIcon(
                                        new ImageIcon("gameImage/buttonPick.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box0_img = new ImageIcon(
                                        new ImageIcon("gameImage/0button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box1_img = new ImageIcon(
                                        new ImageIcon("gameImage/1button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box2_img = new ImageIcon(
                                        new ImageIcon("gameImage/2button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box3_img = new ImageIcon(
                                        new ImageIcon("gameImage/3button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box4_img = new ImageIcon(
                                        new ImageIcon("gameImage/4button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box5_img = new ImageIcon(
                                        new ImageIcon("gameImage/5button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box6_img = new ImageIcon(
                                        new ImageIcon("gameImage/6button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box7_img = new ImageIcon(
                                        new ImageIcon("gameImage/7button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box8_img = new ImageIcon(
                                        new ImageIcon("gameImage/8button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        box9_img = new ImageIcon(
                                        new ImageIcon("gameImage/9button.jpg").getImage().getScaledInstance(100, 100,
                                                        java.awt.Image.SCALE_SMOOTH));
                        unselectSolveBox = new ImageIcon(
                                        new ImageIcon("gameImage/unselectSolve.png").getImage().getScaledInstance(100,
                                                        100,
                                                        java.awt.Image.SCALE_SMOOTH));

                        /// OP

                        operator_plus_img = new ImageIcon(new ImageIcon("gameImage/Operator_plus.png").getImage()
                                        .getScaledInstance(100, 200, java.awt.Image.SCALE_SMOOTH));
                        operator_minus_img = new ImageIcon(new ImageIcon("gameImage/Operator_minus.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        operator_multiply_img = new ImageIcon(new ImageIcon("gameImage/Operator_multiply.png")
                                        .getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        operator_divide_img = new ImageIcon(new ImageIcon("gameImage/Operator_divide.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        operator_bracketLeft_img = new ImageIcon(new ImageIcon("gameImage/Operator_bracketLeft.png")
                                        .getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        operator_bracketRight_img = new ImageIcon(new ImageIcon("gameImage/Operator_bracketRight.png")
                                        .getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        operator_delete_img = new ImageIcon(new ImageIcon("gameImage/Operator_delete.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        operator_equal_img = new ImageIcon(new ImageIcon("gameImage/Operator_equal.png").getImage()
                                        .getScaledInstance(100, 200, java.awt.Image.SCALE_SMOOTH));
                        operator_cat_img = new ImageIcon(new ImageIcon("gameImage/Operator_cat.png").getImage()
                                        .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH));

                        // number
                        num0_img = new ImageIcon(new ImageIcon("gameImage/Operator_0.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num1_img = new ImageIcon(new ImageIcon("gameImage/Operator_1.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num2_img = new ImageIcon(new ImageIcon("gameImage/Operator_2.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num3_img = new ImageIcon(new ImageIcon("gameImage/Operator_3.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num4_img = new ImageIcon(new ImageIcon("gameImage/Operator_4.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num5_img = new ImageIcon(new ImageIcon("gameImage/Operator_5.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num6_img = new ImageIcon(new ImageIcon("gameImage/Operator_6.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num7_img = new ImageIcon(new ImageIcon("gameImage/Operator_7.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num8_img = new ImageIcon(new ImageIcon("gameImage/Operator_8.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        num9_img = new ImageIcon(new ImageIcon("gameImage/Operator_9.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

                        // result
                        resultUN = new ImageIcon(new ImageIcon("gameImage/resultUN.png").getImage()
                                        .getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH));
                        resultNO = new ImageIcon(new ImageIcon("gameImage/resultNO.png").getImage()
                                        .getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH));
                        resultYES = new ImageIcon(new ImageIcon("gameImage/resultYES.png").getImage()
                                        .getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH));
                        resultERROR = new ImageIcon(new ImageIcon("gameImage/notERROR.png").getImage()
                                        .getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH));

                        // eater egg
                        beforeEaterEgg = new ImageIcon(new ImageIcon("gameImage/eaterEgg1.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
                        afterEaterEgg = new ImageIcon(new ImageIcon("gameImage/eaterEgg.png").getImage()
                                        .getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

                } catch (Exception e) {
                        // TODO: handle exception
                }
                // Banner graphic
                // call
                bannerPanel = new JPanel();
                bannerPanel2 = new JPanel();

                banner = new JLabel(new ImageIcon("gameImage/banner.png"));
                pleaseChoose = new JLabel(new ImageIcon("gameImage/pleaseChoose.png"));
                chooseBox = new JLabel(choose2box);
                calculator = new JLabel(new ImageIcon("gameImage/calculator.png"));

                // set dimension
                banner.setPreferredSize(new Dimension(1000, 100));
                pleaseChoose.setPreferredSize(new Dimension(300, 100));
                chooseBox.setPreferredSize(new Dimension(200, 100));
                calculator.setPreferredSize(new Dimension(500, 100));

                // bannerPanel add
                GridBagLayout layout0 = new GridBagLayout();
                bannerPanel.setLayout(layout0);
                Border padding0 = BorderFactory.createEmptyBorder(00, 00, 00, 00);
                bannerPanel.setBorder(padding0);
                GridBagConstraints gbc0 = new GridBagConstraints();

                gbc0.fill = GridBagConstraints.HORIZONTAL;
                gbc0.gridwidth = 10;
                gbc0.weightx = 0.0;
                gbc0.gridx = 0;
                gbc0.gridy = 0;
                bannerPanel.add(banner, gbc0);

                GridBagLayout layout1 = new GridBagLayout();
                bannerPanel2.setLayout(layout1);
                Border padding1 = BorderFactory.createEmptyBorder(00, 00, 00, 00);
                bannerPanel2.setBorder(padding1);
                GridBagConstraints gbc1 = new GridBagConstraints();

                gbc1.fill = GridBagConstraints.HORIZONTAL;
                gbc1.gridx = 0;
                gbc1.gridy = 0;
                bannerPanel2.add(pleaseChoose, gbc1);

                gbc1.gridx = 1;
                gbc1.gridy = 0;
                bannerPanel2.add(chooseBox, gbc1);

                gbc1.gridx = 2;
                gbc1.gridy = 0;
                bannerPanel2.add(calculator, gbc1);
                // Game box

                // call
                eaterEgg = new JButton(beforeEaterEgg);
                eaterEgg.setFocusPainted(false);
                eaterEgg.setFocusable(false);
                eaterEgg.setBorder(BorderFactory.createEmptyBorder());
                eaterEgg.setPreferredSize(new Dimension(100, 100));
                boxAndOperatorBookMark0 = new JLabel(new ImageIcon("gameImage/bookMarkWeight.png"));
                boxAndOperatorBookMark0.setPreferredSize(new Dimension(200, 100));

                tryAgain = new JButton(new ImageIcon("gameImage/tryAgain.png"));

                boxPanel = new JPanel();
                boxUnpick = new JButton(boxUnpick_img);
                box0 = new JButton(boxUnpick_img);
                box1 = new JButton(boxUnpick_img);
                box2 = new JButton(boxUnpick_img);
                box3 = new JButton(boxUnpick_img);
                box4 = new JButton(boxUnpick_img);
                box5 = new JButton(boxUnpick_img);
                box6 = new JButton(boxUnpick_img);
                box7 = new JButton(boxUnpick_img);
                box8 = new JButton(boxUnpick_img);
                box9 = new JButton(boxUnpick_img);
                solveBox1 = new JLabel(unselectSolveBox);
                solveBox2 = new JLabel(unselectSolveBox);

                // set dimension boxPanel
                boxUnpick.setPreferredSize(new Dimension(100, 100));
                tryAgain.setPreferredSize(new Dimension(100, 100));
                box0.setPreferredSize(new Dimension(100, 100));
                box1.setPreferredSize(new Dimension(100, 100));
                box2.setPreferredSize(new Dimension(100, 100));
                box3.setPreferredSize(new Dimension(100, 100));
                box4.setPreferredSize(new Dimension(100, 100));
                box5.setPreferredSize(new Dimension(100, 100));
                box6.setPreferredSize(new Dimension(100, 100));
                box7.setPreferredSize(new Dimension(100, 100));
                box8.setPreferredSize(new Dimension(100, 100));
                box9.setPreferredSize(new Dimension(100, 100));
                solveBox1.setPreferredSize(new Dimension(100, 100));
                solveBox2.setPreferredSize(new Dimension(100, 100));

                GridBagLayout layout2 = new GridBagLayout();
                boxPanel.setLayout(layout2);
                Border padding2 = BorderFactory.createEmptyBorder(00, 00, 00, 00);
                boxPanel.setBorder(padding2);
                GridBagConstraints gbc2 = new GridBagConstraints();
                // boxPanel add
                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 0;
                gbc2.gridy = 0;
                boxPanel.add(box0, gbc2);

                gbc2.gridx = 1;
                gbc2.gridy = 0;
                boxPanel.add(box1, gbc2);

                gbc2.gridx = 2;
                gbc2.gridy = 0;
                boxPanel.add(box2, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 0;
                gbc2.gridy = 1;
                boxPanel.add(box3, gbc2);

                gbc2.gridx = 1;
                gbc2.gridy = 1;
                boxPanel.add(box4, gbc2);

                gbc2.gridx = 2;
                gbc2.gridy = 1;
                boxPanel.add(box5, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 0;
                gbc2.gridy = 2;
                boxPanel.add(box6, gbc2);

                gbc2.gridx = 1;
                gbc2.gridy = 2;
                boxPanel.add(box7, gbc2);

                gbc2.gridx = 2;
                gbc2.gridy = 2;
                boxPanel.add(box8, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 0;
                gbc2.gridy = 3;
                gbc2.gridwidth = 2;
                boxPanel.add(boxAndOperatorBookMark0, gbc2);
                gbc2.gridwidth = 1;

                gbc2.gridx = 2;
                gbc2.gridy = 3;
                boxPanel.add(eaterEgg, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 0;
                gbc2.gridy = 4;
                boxPanel.add(tryAgain, gbc2);

                gbc2.gridx = 1;
                gbc2.gridy = 4;
                boxPanel.add(solveBox1, gbc2);

                gbc2.gridx = 2;
                gbc2.gridy = 4;
                boxPanel.add(solveBox2, gbc2);

                //////// operator

                // call

                boxAndOperatorBookMark1 = new JLabel(new ImageIcon("gameImage/bookMark.png"));

                operator_delete = new JButton(operator_delete_img);
                operator_plus = new JButton(operator_plus_img);
                operator_minus = new JButton(operator_minus_img);
                operator_multiply = new JButton(operator_multiply_img);
                operator_devide = new JButton(operator_divide_img);
                operator_bracketLeft = new JButton(operator_bracketLeft_img);
                operator_bracketRight = new JButton(operator_bracketRight_img);
                operator_equal = new JButton(operator_equal_img);
                operator_cat = new JLabel(operator_cat_img);

                num0 = new JButton(num0_img);
                num1 = new JButton(num1_img);
                num2 = new JButton(num2_img);
                num3 = new JButton(num3_img);
                num4 = new JButton(num4_img);
                num5 = new JButton(num5_img);
                num6 = new JButton(num6_img);
                num7 = new JButton(num7_img);
                num8 = new JButton(num8_img);
                num9 = new JButton(num9_img);

                // set dimension
                boxAndOperatorBookMark1.setPreferredSize(new Dimension(100, 500));

                operator_delete.setPreferredSize(new Dimension(100, 100));
                operator_plus.setPreferredSize(new Dimension(100, 200));
                operator_minus.setPreferredSize(new Dimension(100, 100));
                operator_multiply.setPreferredSize(new Dimension(100, 100));
                operator_devide.setPreferredSize(new Dimension(100, 100));
                operator_bracketLeft.setPreferredSize(new Dimension(100, 100));
                operator_bracketRight.setPreferredSize(new Dimension(100, 100));
                operator_equal.setPreferredSize(new Dimension(100, 200));
                operator_cat.setPreferredSize(new Dimension(200, 100));

                num0.setPreferredSize(new Dimension(100, 100));
                num1.setPreferredSize(new Dimension(100, 100));
                num2.setPreferredSize(new Dimension(100, 100));
                num3.setPreferredSize(new Dimension(100, 100));
                num4.setPreferredSize(new Dimension(100, 100));
                num5.setPreferredSize(new Dimension(100, 100));
                num6.setPreferredSize(new Dimension(100, 100));
                num7.setPreferredSize(new Dimension(100, 100));
                num8.setPreferredSize(new Dimension(100, 100));
                num9.setPreferredSize(new Dimension(100, 100));

                // operatorPanel add
                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 5;
                gbc2.gridy = 0;
                gbc2.gridheight = 5;
                boxPanel.add(boxAndOperatorBookMark1, gbc2);

                // gbc2.gridx = 5;
                // gbc2.gridy = 1;
                // boxPanel.add(boxAndOperatorBookMark2, gbc2);

                // gbc2.gridx = 5;
                // gbc2.gridy = 2;
                // boxPanel.add(boxAndOperatorBookMark3, gbc2);

                // gbc2.gridx = 5;
                // gbc2.gridy = 3;
                // boxPanel.add(boxAndOperatorBookMark4, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridheight = 1;
                gbc2.gridx = 6;
                gbc2.gridy = 0;
                boxPanel.add(operator_minus, gbc2);

                gbc2.gridx = 7;
                gbc2.gridy = 0;
                boxPanel.add(operator_devide, gbc2);

                gbc2.gridx = 8;
                gbc2.gridy = 0;
                boxPanel.add(operator_multiply, gbc2);

                gbc2.gridx = 9;
                gbc2.gridy = 0;
                boxPanel.add(operator_delete, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 6;
                gbc2.gridy = 1;
                boxPanel.add(num7, gbc2);

                gbc2.gridx = 7;
                gbc2.gridy = 1;
                boxPanel.add(num8, gbc2);

                gbc2.gridx = 8;
                gbc2.gridy = 1;
                boxPanel.add(num9, gbc2);

                gbc2.gridx = 9;
                gbc2.gridy = 1;
                gbc2.gridheight = 2;
                boxPanel.add(operator_plus, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridheight = 1;
                gbc2.gridx = 6;
                gbc2.gridy = 2;
                boxPanel.add(num4, gbc2);

                gbc2.gridx = 7;
                gbc2.gridy = 2;
                boxPanel.add(num5, gbc2);

                gbc2.gridx = 8;
                gbc2.gridy = 2;
                boxPanel.add(num6, gbc2);

                gbc2.gridx = 9;
                gbc2.gridy = 3;
                gbc2.gridheight = 2;
                boxPanel.add(operator_equal, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridheight = 1;
                gbc2.gridx = 6;
                gbc2.gridy = 3;
                boxPanel.add(num1, gbc2);

                gbc2.gridx = 7;
                gbc2.gridy = 3;
                boxPanel.add(num2, gbc2);

                gbc2.gridx = 8;
                gbc2.gridy = 3;
                boxPanel.add(num3, gbc2);

                gbc2.gridx = 7;
                gbc2.gridy = 4;
                boxPanel.add(num0, gbc2);

                gbc2.fill = GridBagConstraints.HORIZONTAL;
                gbc2.gridx = 6;
                gbc2.gridy = 4;
                boxPanel.add(operator_bracketLeft, gbc2);

                gbc2.gridx = 8;
                gbc2.gridy = 4;
                boxPanel.add(operator_bracketRight, gbc2);

                // calculateField panel
                // call
                calculateField = new JPanel();

                youNeedToSolve = new JLabel("You need to pick two box first!", JLabel.CENTER);
                calculatorSolve = new JLabel("You calculate is : ", JLabel.CENTER);
                result = new JLabel(resultUN);

                // set diension
                youNeedToSolve.setPreferredSize(new Dimension(300, 100));
                youNeedToSolve.setForeground(Color.WHITE);
                calculatorSolve.setPreferredSize(new Dimension(300, 100));
                calculatorSolve.setForeground(Color.WHITE);
                result.setPreferredSize(new Dimension(300, 100));
                // add
                GridBagLayout layout3 = new GridBagLayout();
                calculateField.setLayout(layout3);
                Border padding3 = BorderFactory.createEmptyBorder(00, 00, 00, 00);
                calculateField.setBorder(padding3);
                GridBagConstraints gbc3 = new GridBagConstraints();

                gbc3.fill = GridBagConstraints.HORIZONTAL;
                gbc3.gridx = 0;
                gbc3.gridy = 0;
                calculateField.add(youNeedToSolve, gbc3);

                gbc3.gridx = 1;
                gbc3.gridy = 0;
                calculateField.add(result, gbc3);

                gbc3.gridx = 2;
                gbc3.gridy = 0;
                calculateField.add(calculatorSolve, gbc3);
                // gbc2.gridx = 8;
                // gbc2.gridy = 4;
                // gbc2.gridwidth = 2;
                // boxPanel.add(operator_cat, gbc2);

                // frame.setLayout(new FlowLayout());
                // frame.add(banner);
                // frame.add(pleaseChoose);
                // frame.add(chooseBox);
                // frame.add(boxAndOperatorBookMark0);
                // frame.add(calculator);

                frame.getContentPane().setBackground(Color.BLACK);

                // frame.add(bannerPanel);
                // frame.add(bannerPanel2);
                // frame.add(boxPanel);
                JPanel top = new JPanel();
                top.setLayout(new FlowLayout());

                top.add(bannerPanel);
                top.add(bannerPanel2);
                top.add(boxPanel);
                top.setPreferredSize(new Dimension(1000, 750));
                top.setBackground(Color.BLACK);
                frame.add(top, BorderLayout.NORTH);
                calculateField.setBackground(Color.BLACK);
                frame.add(calculateField, BorderLayout.CENTER);

                // Listener

                GameLogic gameLogic = new GameLogic();
                box0.addActionListener(gameLogic);
                box1.addActionListener(gameLogic);
                box2.addActionListener(gameLogic);
                box3.addActionListener(gameLogic);
                box4.addActionListener(gameLogic);
                box5.addActionListener(gameLogic);
                box6.addActionListener(gameLogic);
                box7.addActionListener(gameLogic);
                box8.addActionListener(gameLogic);
                tryAgain.addActionListener(gameLogic);
                num0.addActionListener(gameLogic);
                num1.addActionListener(gameLogic);
                num2.addActionListener(gameLogic);
                num3.addActionListener(gameLogic);
                num4.addActionListener(gameLogic);
                num5.addActionListener(gameLogic);
                num6.addActionListener(gameLogic);
                num7.addActionListener(gameLogic);
                num8.addActionListener(gameLogic);
                num9.addActionListener(gameLogic);
                operator_bracketLeft.addActionListener(gameLogic);
                operator_bracketRight.addActionListener(gameLogic);
                operator_delete.addActionListener(gameLogic);
                operator_devide.addActionListener(gameLogic);
                operator_equal.addActionListener(gameLogic);
                operator_minus.addActionListener(gameLogic);
                operator_multiply.addActionListener(gameLogic);
                operator_plus.addActionListener(gameLogic);
                eaterEgg.addActionListener(gameLogic);
                newGame();

        }

        protected void newGame() {
                boxCount = 2;
                numCount = 5;
                box0click = true;
                box1click = true;
                box2click = true;
                box3click = true;
                box4click = true;
                box5click = true;
                box6click = true;
                box7click = true;
                box8click = true;
        }

        public class FullCalculator {

                private Stack<Character> operatorStack;
                private Stack<Double> valueStack;
                private boolean error;

                public FullCalculator() {
                        operatorStack = new Stack<Character>();
                        valueStack = new Stack<Double>();
                        error = false;
                }

                private boolean isOperator(char ch) {
                        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
                }

                private int getPrecedence(char ch) {
                        if (ch == '+' || ch == '-') {
                                return 1;
                        }
                        if (ch == '*' || ch == '/') {
                                return 2;
                        }
                        return 0;
                }

                private void processOperator(char t) {
                        double a, b;
                        if (valueStack.empty()) {
                                System.out.println("Expression error.");
                                error = true;
                                return;
                        } else {
                                b = valueStack.peek();
                                valueStack.pop();
                        }
                        if (valueStack.empty()) {
                                System.out.println("Expression error.");
                                error = true;
                                return;
                        } else {
                                a = valueStack.peek();
                                valueStack.pop();
                        }
                        double r = 0;
                        if (t == '+') {
                                r = a + b;
                        } else if (t == '-') {
                                r = a - b;
                        } else if (t == '*') {
                                r = a * b;
                        } else if (t == '/') {
                                r = a / b;
                        } else {
                                System.out.println("Operator error.");
                                error = true;
                        }
                        valueStack.push(r);
                }

                public int processInput(String input) {
                        // The tokens that make up the input
                        String[] tokens = input.split(" ");

                        // Main loop - process all input tokens
                        for (int n = 0; n < tokens.length; n++) {
                                String nextToken = tokens[n];
                                char ch = nextToken.charAt(0);
                                if (ch >= '0' && ch <= '9') {
                                        double value = Double.parseDouble(nextToken);
                                        valueStack.push(value);
                                } else if (isOperator(ch)) {
                                        if (operatorStack.empty()
                                                        || getPrecedence(ch) > getPrecedence(operatorStack.peek())) {
                                                operatorStack.push(ch);
                                        } else {
                                                while (!operatorStack.empty() && getPrecedence(ch) <= getPrecedence(
                                                                operatorStack.peek())) {
                                                        char toProcess = operatorStack.peek();
                                                        operatorStack.pop();
                                                        processOperator(toProcess);
                                                }
                                                operatorStack.push(ch);
                                        }
                                } else if (ch == '(') {
                                        operatorStack.push(ch);
                                } else if (ch == ')') {
                                        while (!operatorStack.empty() && isOperator(operatorStack.peek())) {
                                                char toProcess = operatorStack.peek();
                                                operatorStack.pop();
                                                processOperator(toProcess);
                                        }
                                        if (!operatorStack.empty() && operatorStack.peek() == '(') {
                                                operatorStack.pop();
                                        } else {
                                                System.out.println("Error: unbalanced parenthesis.");
                                                error = true;
                                        }
                                }

                        }
                        // Empty out the operator stack at the end of the input
                        while (!operatorStack.empty() && isOperator(operatorStack.peek())) {
                                char toProcess = operatorStack.peek();
                                operatorStack.pop();
                                processOperator(toProcess);
                        }
                        // Print the result if no error has been seen.
                        if (error == false) {
                                double result = valueStack.peek();
                                valueStack.pop();
                                if (!operatorStack.empty() || !valueStack.empty()) {
                                        return (int) result;
                                } else {
                                        return (int) result;
                                }
                        }
                        double result = valueStack.peek();
                        return (int) result;
                }

                // public static void main(String[] args) {
                // Scanner input = new Scanner(System.in);

                // // The original input
                // System.out.print("Enter an expression to compute: ");
                // String userInput = input.nextLine();

                // FullCalculator calc = new FullCalculator();

                // System.out.println(calc.processInput(userInput));
                // }
        }

        protected class GameLogic implements ActionListener {
                ImageIcon[] boxArrays = { box0_img, box1_img, box2_img, box3_img, box4_img, box5_img, box6_img,
                                box7_img,
                                box8_img,
                                box9_img };
                ImageIcon[] boxChoose = { choose0box, choose1box, choose2box };
                Random random = new Random();

                @Override
                public void actionPerformed(ActionEvent event) {
                        JButton source = (JButton) event.getSource();

                        if ((source == box0) && (boxCount != 0) && box0click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box0.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box0click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));
                        } else if ((source == box1) && (boxCount != 0) && box1click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box1.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box1click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if ((source == box2) && (boxCount != 0) && box2click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box2.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box2click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if ((source == box3) && (boxCount != 0) && box3click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box3.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box3click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if ((source == box4) && (boxCount != 0) && box4click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box4.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box4click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if ((source == box5) && (boxCount != 0) && box5click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box5.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box5click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if ((source == box6) && (boxCount != 0) && box6click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box6.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box6click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if ((source == box7) && (boxCount != 0) && box7click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box7.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box7click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if ((source == box8) && (boxCount != 0) && box8click) {
                                randomBox = random.nextInt(10);
                                if (boxCount == 2) {
                                        solveBox1.setIcon(boxArrays[randomBox]);
                                        solve = "" + randomBox;
                                } else if (boxCount == 1) {
                                        solveBox2.setIcon(boxArrays[randomBox]);
                                        solve += randomBox;
                                }
                                box8.setIcon(boxArrays[randomBox]);
                                boxCount--;
                                chooseBox.setIcon(boxChoose[boxCount]);
                                box8click = false;
                                youNeedToSolve.setText("You need to solve : " + Integer.parseInt(solve));

                        } else if (source == tryAgain) {
                                newGame();
                                box0.setIcon(boxUnpick_img);
                                box1.setIcon(boxUnpick_img);
                                box2.setIcon(boxUnpick_img);
                                box3.setIcon(boxUnpick_img);
                                box4.setIcon(boxUnpick_img);
                                box5.setIcon(boxUnpick_img);
                                box6.setIcon(boxUnpick_img);
                                box7.setIcon(boxUnpick_img);
                                box8.setIcon(boxUnpick_img);
                                solveBox1.setIcon(unselectSolveBox);
                                solveBox2.setIcon(unselectSolveBox);
                                chooseBox.setIcon(choose2box);
                                youNeedToSolve.setText("You need to pick two box first!");
                                calculatorSolve.setText("You calculate is : ");
                                calculatorOutput = "";
                                result.setIcon(resultUN);
                                eaterEgg.setIcon(beforeEaterEgg);
                        } else if (source == eaterEgg) {
                                eaterEgg.setIcon(afterEaterEgg);
                        } else if (source == operator_delete) {
                                if (calculatorOutput.length() == 0) {

                                } else {
                                        calculatorOutput = calculatorOutput.substring(0, calculatorOutput.length() - 1);
                                        numCount++;
                                }
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                        } else if (source == operator_minus) {
                                calculatorOutput += "- ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                        } else if (source == operator_multiply) {
                                calculatorOutput += "* ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                        } else if (source == operator_devide) {
                                calculatorOutput += "/ ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                        } else if (source == operator_plus) {
                                calculatorOutput += "+ ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                        } else if ((source == num0) && (numCount != 0)) {
                                calculatorOutput += "0 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num1) && (numCount != 0)) {
                                calculatorOutput += "1 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num2) && (numCount != 0)) {
                                calculatorOutput += "2 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num3) && (numCount != 0)) {
                                calculatorOutput += "3 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num4) && (numCount != 0)) {
                                calculatorOutput += "4 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num5) && (numCount != 0)) {
                                calculatorOutput += "5 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num6) && (numCount != 0)) {
                                calculatorOutput += "6 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num0) && (numCount != 0)) {
                                calculatorOutput += "0 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num7) && (numCount != 0)) {
                                calculatorOutput += "7 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num8) && (numCount != 0)) {
                                calculatorOutput += "8 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == num9) && (numCount != 0)) {
                                calculatorOutput += "9 ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                                numCount--;
                        } else if ((source == operator_bracketLeft)) {
                                calculatorOutput += "( ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                        } else if (source == operator_bracketRight) {
                                calculatorOutput += ") ";
                                calculatorSolve.setText("You calculate is : " + calculatorOutput);
                        } else if (source == operator_equal) {
                                FullCalculator calculator = new FullCalculator();
                                try {
                                        sumCal = calculator.processInput(calculatorOutput);
                                        calculatorSolve.setText("You calculate is : " + calculatorOutput + " = "
                                                        + sumCal);
                                        if (Integer.parseInt(solve) == sumCal) {
                                                result.setIcon(resultYES);
                                        } else {
                                                result.setIcon(resultNO);
                                        }
                                } catch (Exception e) {
                                        calculatorSolve.setText(
                                                        "You calculate is : ERROR NUMBER INPUT");
                                        result.setIcon(resultERROR);
                                        // TODO: handle exception
                                }

                        }

                }

        }

}
