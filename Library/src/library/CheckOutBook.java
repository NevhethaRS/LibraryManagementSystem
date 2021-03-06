/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.db.Connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivi
 */
public class CheckOutBook extends javax.swing.JFrame {

    private String book_isbn;
    private String branch_id;
    private String card_no;
    private DbConnection db;
    private Connection con;
    private Statement s;
    private String query;
    private ResultSet rs;
    private int count;
    private int no_of_loans_of_the_borrower;
    private int no_of_copies_loaned;
    private int num_of_copies;
    private int loanid;
    private Statement stmt;
    private ResultSet r;

    /**
     * Creates new form CheckOutBook
     */
    public CheckOutBook() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblBranch_id = new javax.swing.JLabel();
        lblCard_no = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        Branch_id = new javax.swing.JTextField();
        Card_no = new javax.swing.JTextField();
        btnCheckOut = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setBounds(new java.awt.Rectangle(100, 50, 1000, 650));

        jLabel1.setText("CheckOut Book");

        lblISBN.setText("Book ISBN *");

        lblBranch_id.setText("Branch_id *");

        lblCard_no.setText("Card_no *");

        Branch_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Branch_idActionPerformed(evt);
            }
        });

        Card_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_noActionPerformed(evt);
            }
        });

        btnCheckOut.setText("Check Out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel2.setText("* required fields");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblISBN)
                    .addComponent(lblBranch_id)
                    .addComponent(jLabel2)
                    .addComponent(lblCard_no))
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isbn)
                    .addComponent(Branch_id)
                    .addComponent(Card_no, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCheckOut)
                        .addGap(144, 144, 144)
                        .addComponent(btnReset)
                        .addGap(164, 164, 164)
                        .addComponent(btnHome)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(291, 291, 291))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBranch_id)
                    .addComponent(Branch_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCard_no)
                    .addComponent(Card_no, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnCheckOut)
                    .addComponent(btnHome))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Branch_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Branch_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Branch_idActionPerformed

    private void Card_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_noActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
            // TODO add your handling code here:
        Branch_id.setText("");
        Card_no.setText("");
        isbn.setText("");
  
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        book_isbn=isbn.getText();
        branch_id=Branch_id.getText();
        card_no=Card_no.getText();
        if(book_isbn.isEmpty()||branch_id.isEmpty()||card_no.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        }
        else
        {
            try
            {
                db = new DbConnection();
		con = db.getConnection();
                s = con.createStatement();
                
                query="SELECT isbn from BOOK WHERE isbn='"+book_isbn+"';";
                s = con.createStatement();
		rs=s.executeQuery(query);
                while (!rs.isBeforeFirst()) {
                        JOptionPane.showMessageDialog(this, "Invalid ISBN");
			return;
			}
				
		query="SELECT branch_id from LIBRARY_BRANCH WHERE branch_id = '"+branch_id+"';";
		s = con.createStatement();
		rs=s.executeQuery(query);
                int br=String.valueOf(branch_id).length();
                if(br!=1)
                {
                    JOptionPane.showMessageDialog(this, "Branch id is a one digit number");
                    return;
                }
		while (!rs.isBeforeFirst()) {
			JOptionPane.showMessageDialog(this,"There is no such branch");
			return;
			}
				
		query="SELECT card_no from BORROWER WHERE card_no = '"+card_no+"';";
		s = con.createStatement();
		rs=s.executeQuery(query);
                while (!rs.isBeforeFirst()) {
			JOptionPane.showMessageDialog(this, "Invalid Card Number");
			return;
			}
                query="SELECT book_id from BOOK_COPIES WHERE branch_id='"+branch_id+"' and book_id = '"+book_isbn+"';";
		s = con.createStatement();
		rs=s.executeQuery(query);
                while (!rs.isBeforeFirst()) {
			JOptionPane.showMessageDialog(this, "Book not available at the branch");
			return;
			}  
                //calculating current number of loans of the borrower
                query="SELECT count(*) as count FROM book_loans WHERE card_no='"+card_no+"' and date_in is NULL;";
                rs=s.executeQuery(query);
                if(rs.next())
                {
                    no_of_loans_of_the_borrower=rs.getInt("count");
                }
                //calculating number of loaned copies of the given book at the given branch
                query="SELECT count(*) as count FROM book_loans WHERE branch_id='"+branch_id+"' and isbn='"+book_isbn+"';";
                rs=s.executeQuery(query);
                if(rs.next())
                {
                    no_of_copies_loaned=rs.getInt("count");
                }
                //calculating number of copies of the given book at the given branch
                query="SELECT no_of_copies FROM book_copies where book_id='"+book_isbn+"' and branch_id='"+branch_id+"';";
                rs=s.executeQuery(query);
                if(rs.next())
                {
                    num_of_copies=rs.getInt("no_of_copies");
                }
                if(no_of_loans_of_the_borrower==3)
                {
                   JOptionPane.showMessageDialog(null, "Reached maximum number of loans");
                   return;
                }
                if(no_of_copies_loaned==num_of_copies)
                {
                    JOptionPane.showMessageDialog(null, "Book currently not available at this branch");
                    return;
                }
                query="select count(*) as count,sum(fine_amt) as fine,fname,lname from book_loans bl join fines f on f.loan_id=bl.loan_id join borrower b on b.card_no=bl.card_no where paid=false and bl.card_no='"+card_no+"'group by(b.card_no);";
                rs=s.executeQuery(query);
                if(rs.next())
                {
                int count=rs.getInt("count");
                Double fine=rs.getDouble("fine");
                if(!(count==0))
                {
                    JOptionPane.showMessageDialog(null, "Borrowed books not returned. Fine due is"+""+fine);
                    return;
                }
                }
                if(no_of_copies_loaned<num_of_copies&&no_of_loans_of_the_borrower<3)
                {
                    //loan_id
                    /*query="SELECT count(*) as count FROM BooK_LOANS;";
                    rs=s.executeQuery(query);
                    loanid=rs.getInt("count")+1;*/
                    query="INSERT INTO book_loans(isbn,branch_id,card_no,date_out,due_date) VALUES('"+book_isbn+"','"+branch_id+"','"+card_no+"',current_date(),date_add(current_date,interval 14 day));";
                    s.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "Check Out Successful");
                    return;
                }
                isbn.setText("");
                Branch_id.setText("");
                Card_no.setText("");
            }
            catch (SQLException exp) {
			JOptionPane.showMessageDialog(this, "Error:" + exp.getMessage());
                    }
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Home hm=new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOutBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOutBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Branch_id;
    private javax.swing.JTextField Card_no;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBranch_id;
    private javax.swing.JLabel lblCard_no;
    private javax.swing.JLabel lblISBN;
    // End of variables declaration//GEN-END:variables
}
