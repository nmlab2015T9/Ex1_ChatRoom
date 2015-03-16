/*
 * Display.java
 *
 * Created on 2010/3/27, 下午 05:38:10
 */

package gui;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import userver.*;
/**
 *
 * @author StarryDawn
 */
public class Display extends javax.swing.JFrame {

    /** Creates new form Display */
    public Display( UServer us ) {
		this.us = us;
		user = new DefaultListModel();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        kickSel = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList( user );
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        kickSel.setText("Kick User");
        kickSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kickSelActionPerformed(evt);
            }
        });
        popup.add(kickSel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        log.setColumns(20);
        log.setRows(5);
        jScrollPane1.setViewportView(log);

        userList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        userList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userListMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                userListMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(userList);

        jLabel1.setText("Chat users:");

        jLabel2.setText("Chat log:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void kickSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kickSelActionPerformed
		int index = userList.getSelectedIndex();
		us.kick( index );
	}//GEN-LAST:event_kickSelActionPerformed

	private void userListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListMousePressed
		userList.clearSelection();
		Rectangle r = userList.getCellBounds( 0, user.getSize()-1 );
		if( r!=null && r.contains(evt.getPoint()) ) {
			int index = userList.locationToIndex(evt.getPoint());
			userList.setSelectedIndex(index);
		}
	}//GEN-LAST:event_userListMousePressed

	private void userListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListMouseReleased
		if( userList.getSelectedIndex() != -1 && evt.isPopupTrigger() ) {
			popup.show(evt.getComponent(), evt.getX(), evt.getY());
		}
	}//GEN-LAST:event_userListMouseReleased

	public void addText(String str) {
		log.append( (new Date()).toString() + "\n" );
		log.append( " " + str + "\n");
		Document d = log.getDocument();
		log.select(d.getLength(), d.getLength());
	}

	public void addUser(String name) {
		user.addElement(name);
	}

	public void removeUser(int id) {
		user.remove(id);
	}
	public void removeUser(String name) {
		user.removeElement(name);
	}

	private UServer us;
	private DefaultListModel user;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem kickSel;
    private javax.swing.JTextArea log;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JList userList;
    // End of variables declaration//GEN-END:variables

}
