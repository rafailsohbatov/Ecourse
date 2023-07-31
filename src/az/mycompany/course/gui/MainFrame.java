/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package az.mycompany.course.gui;

import az.mycompany.course.model.Lesson;
import az.mycompany.course.model.Payment;
import az.mycompany.course.model.Student;
import az.mycompany.course.model.Teacher;
import az.mycompany.course.service.LessonService;
import az.mycompany.course.service.PaymentService;
import az.mycompany.course.service.StudentService;
import az.mycompany.course.service.TeacherService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class MainFrame extends javax.swing.JFrame {

    private String gloBtnName = "";
    private StudentService studentService;
    private TeacherService teacherService;
    private LessonService lessonService;
    private PaymentService paymentService;

    MainFrame(StudentService studentService, TeacherService teacherService, LessonService lessonService, PaymentService paymentService) {
        initComponents();
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.lessonService = lessonService;
        this.paymentService = paymentService;
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
        newBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        studentDataBtn = new javax.swing.JButton();
        teacherDataBtn = new javax.swing.JButton();
        lessonDataBtn = new javax.swing.JButton();
        PaymentDataBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        newBtn.setText("new");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jButton5.setText("delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newBtn)
                .addGap(30, 30, 30)
                .addComponent(updateBtn)
                .addGap(37, 37, 37)
                .addComponent(jButton5)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        studentDataBtn.setText("Student Data");
        studentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDataBtnActionPerformed(evt);
            }
        });

        teacherDataBtn.setText("Teacher Data");
        teacherDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDataBtnActionPerformed(evt);
            }
        });

        lessonDataBtn.setText("Lesson Data");
        lessonDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonDataBtnActionPerformed(evt);
            }
        });

        PaymentDataBtn.setText("Payment Data");
        PaymentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lessonDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(studentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teacherDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lessonDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaymentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDataBtnActionPerformed
        showStudentData();
        gloBtnName = "student";
    }//GEN-LAST:event_studentDataBtnActionPerformed

    private void teacherDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDataBtnActionPerformed
        showTeacherData();
        gloBtnName = "teacher";
    }//GEN-LAST:event_teacherDataBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        switch (gloBtnName) {
            case "student" -> {
                NewStudentFrame newStudentFrame = new NewStudentFrame(studentService);
                newStudentFrame.setVisible(true);
            }
            case "teacher" -> {
            }
            default ->
                JOptionPane.showMessageDialog(null, "Please,first click table");
        }
    }//GEN-LAST:event_newBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        if(rowIndex == -1){
            JOptionPane.showMessageDialog(null, "Please,first click row");
            return;
        }
        Long selectedRow = (Long) jTable1.getValueAt(rowIndex, 0);
      
        switch (gloBtnName) {
            case "student" -> {
                UpdateStudentFrame updateStudentFrame = new UpdateStudentFrame(studentService,selectedRow);
                updateStudentFrame.setVisible(true);
            }
            case "teacher" -> {
            }
            default ->
                JOptionPane.showMessageDialog(null, "Please,first click table");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lessonDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonDataBtnActionPerformed
        showLessonData();
        gloBtnName = "lesson";
    }//GEN-LAST:event_lessonDataBtnActionPerformed

    private void PaymentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentDataBtnActionPerformed
        showPaymentData();
        gloBtnName = "payment";
    }//GEN-LAST:event_PaymentDataBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PaymentDataBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton lessonDataBtn;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton studentDataBtn;
    private javax.swing.JButton teacherDataBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void showStudentData() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Dob");
            model.addColumn("Address");
            model.addColumn("Phone");

            List<Student> studentList = studentService.getStudentList();
            for (Student student : studentList) {
                Object[] object = new Object[]{
                    student.getId(), student.getName(), student.getSurname(), student.getDob(),
                    student.getAddress(), student.getPhone()
                };
                model.addRow(object);
                model.fireTableDataChanged();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void showTeacherData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Dob");
            model.addColumn("Address");
            model.addColumn("Phone");
            model.addColumn("Work_Experience");

            List<Teacher> teacherList = teacherService.getTeacherList();
            for (Teacher teacher : teacherList) {
                Object[] obj = new Object[]{teacher.getId(), teacher.getName(), teacher.getSurname(),
                    teacher.getDob(), teacher.getAddress(), teacher.getPhone(), teacher.getWork_experience()};
                model.addRow(obj);
                model.fireTableDataChanged();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void showLessonData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Time");
            model.addColumn("Price");

            List<Lesson> teacherList = lessonService.getStudentList();
            for (Lesson lesson : teacherList) {
                Object[] obj = new Object[]{lesson.getId(), lesson.getName(), lesson.getTime(),
                    lesson.getPrice()};
                model.addRow(obj);
                model.fireTableDataChanged();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showPaymentData() {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);

            model.addColumn("№");
            model.addColumn("Student Name & Surname");
            model.addColumn("Teacher Name & Surname");
            model.addColumn("Lesson Name");
            model.addColumn("Lesson Time");
            model.addColumn("Lesson Price");
            model.addColumn("Amount");

            List<Payment> paymentList = paymentService.getPaymentList();

            for (Payment payment : paymentList) {
                Student student = payment.getStudentTeacherLesson().getStudent();
                Teacher teacher = payment.getStudentTeacherLesson().getTeacherLesson().getTeacher();
                Lesson lesson = payment.getStudentTeacherLesson().getTeacherLesson().getLesson();
                Object[] object = {payment.getId(), student.getName() + " " + student.getSurname(), teacher.getName() + " " + teacher.getSurname(),
                    lesson.getName(), lesson.getTime(), lesson.getPrice(), payment.getAmount()};
                model.addRow(object);
                model.fireTableDataChanged();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
