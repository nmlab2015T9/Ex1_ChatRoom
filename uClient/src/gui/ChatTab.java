/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChatTab.java
 *
 * Created on 2010/4/9, 下午 08:48:15
 */

package gui;

import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.*;

import testclient.*;

/**
 *
 * @author Eddie
 */
public class ChatTab extends javax.swing.JPanel {

    //parent frame
    private ChatFrame CFrame;
    private Client ClientObject;

    //ChatRoom Objects
    private String username;
    private int RoomID;
    private Vector <String> ChatLines;
    private Vector <String> ChatLineTexture;
    private StyledDocument doc;
    private String newline;
    private Vector <String> UserList;

    private String lastWhisper;

    //chat texture
    private int texture;
    private Vector <String> smileys;


    /** Creates new form ChatTab */
    public ChatTab( int ID , String name ) {
        initComponents();

        RoomID = ID;
        username = new String(name);
        NameLabel.setText(name);

        ChatLines = new Vector<String>();
        ChatLineTexture = new Vector<String>();
        UserList = new Vector<String>();

        newline = new String("\n");
        texture = Color.black.getRGB();
        smileys = new Vector<String>();
        lastWhisper = new String("All Members");

        doc = ChatRoom.getStyledDocument();
        addStylesToDocument(doc);
        addSmileysToDocument(doc);
    }

    public void setFrame( ChatFrame cf ) { CFrame = cf; }
    public void setClientObject( Client co ) { ClientObject = co; }
    public void setUsername ( String name ) {
        NameLabel.setText(name);
    }
    public void setLastWhisper ( String name ) {
        lastWhisper = name;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserListPopup = new javax.swing.JPopupMenu();
        WhisperSel = new javax.swing.JMenuItem("Whisper");
        SendFileSel = new javax.swing.JMenuItem("Send File");
        SendButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserListPanel = new javax.swing.JList();
        NameLabel = new javax.swing.JLabel();
        UserBox = new javax.swing.JComboBox();
        ReplyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChatRoom = new javax.swing.JTextPane();
        ColorButton = new javax.swing.JButton();
        SmileyButton_smile = new javax.swing.JButton();
        SmileyButton_sad = new javax.swing.JButton();
        SmileyButton_laugh = new javax.swing.JButton();
        SmileyButton_angry = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        InputPane = new javax.swing.JTextPane();
        LeaveRoomButton = new javax.swing.JButton();
        InviteButton = new javax.swing.JButton();

        //WhisperSel.setLabel("Whisper");
        WhisperSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhisperSelActionPerformed(evt);
            }
        });
        UserListPopup.add(WhisperSel);

        //SendFileSel.setText("Send File");
        SendFileSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendFileSelActionPerformed(evt);
            }
        });
        UserListPopup.add(SendFileSel);

        SendButton.setBackground(new java.awt.Color(255, 255, 255));
        SendButton.setFont(new java.awt.Font("微軟正黑體", 1, 12));
        SendButton.setText("SEND");
        SendButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        UserListPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserListPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                UserListPanelMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(UserListPanel);

        NameLabel.setFont(new java.awt.Font("微軟正黑體", 1, 12));
        NameLabel.setText("USERNAME");

        UserBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Merbers" }));

        ReplyButton.setBackground(new java.awt.Color(255, 255, 255));
        ReplyButton.setFont(new java.awt.Font("微軟正黑體", 1, 12));
        ReplyButton.setText("Reply");
        ReplyButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ReplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplyButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        ChatRoom.setEditable(false);
        jScrollPane1.setViewportView(ChatRoom);

        ColorButton.setBackground(new java.awt.Color(255, 255, 255));
        ColorButton.setFont(new java.awt.Font("微軟正黑體", 1, 12));
        ColorButton.setText("Color");
        ColorButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorButtonActionPerformed(evt);
            }
        });

        SmileyButton_smile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/smile.png"))); // NOI18N
        SmileyButton_smile.setBorder(null);
        SmileyButton_smile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmileyButton_smileActionPerformed(evt);
            }
        });

        SmileyButton_sad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/saddy.png"))); // NOI18N
        SmileyButton_sad.setBorder(null);
        SmileyButton_sad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmileyButton_sadActionPerformed(evt);
            }
        });

        SmileyButton_laugh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/laugh.png"))); // NOI18N
        SmileyButton_laugh.setBorder(null);
        SmileyButton_laugh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmileyButton_laughActionPerformed(evt);
            }
        });

        SmileyButton_angry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/angry.png"))); // NOI18N
        SmileyButton_angry.setBorder(null);
        SmileyButton_angry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmileyButton_angryActionPerformed(evt);
            }
        });

        InputPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InputPaneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InputPaneKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(InputPane);

        LeaveRoomButton.setBackground(new java.awt.Color(255, 255, 255));
        LeaveRoomButton.setFont(new java.awt.Font("微軟正黑體", 1, 12));
        LeaveRoomButton.setText("Leave Room");
        LeaveRoomButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LeaveRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveRoomButtonActionPerformed(evt);
            }
        });

        InviteButton.setBackground(new java.awt.Color(255, 255, 255));
        InviteButton.setFont(new java.awt.Font("微軟正黑體", 1, 12));
        InviteButton.setText("Invite...");
        InviteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InviteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InviteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LeaveRoomButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(InviteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SmileyButton_smile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SmileyButton_sad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SmileyButton_laugh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SmileyButton_angry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InviteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ReplyButton)
                                .addComponent(SendButton)
                                .addComponent(ColorButton)
                                .addComponent(NameLabel))
                            .addComponent(SmileyButton_smile, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmileyButton_sad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmileyButton_laugh, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SmileyButton_angry, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LeaveRoomButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        prepareMsg(getInputText(InputPane));
        InputPane.setText(null);
}//GEN-LAST:event_SendButtonActionPerformed

    //same as send button when ENTER pressed
    //
    List<Element> getAllElements(JTextPane x) {
	Element[] roots = x.getStyledDocument().getRootElements();
	return getAllElements(roots);
    }
    private List<Element> getAllElements(Element[] roots) {
            List<Element> icons = new LinkedList<Element>();
            for (int a = 0; a < roots.length; a++) {
                    if(roots[a] == null)
                            continue ;
                    icons.add(roots[a]);
                    for (int c = 0; c < roots[a].getElementCount(); c++) {
                        Element element = roots[a].getElement(c);
                        icons.addAll(getAllElements(new Element[] { element }));
                    }
            }
            return icons;
    }
    public String getInputText(JTextPane x) {
            Map<Integer,String> mp = new HashMap<Integer,String>();
            String t =x.getText();
            List<Element> els = getAllElements(x);
            for(Element el : els) {
                    Icon icon = StyleConstants.getIcon(el.getAttributes());
                    if(icon != null) {
                            String tmp = ((ImageIcon)icon).getDescription();
                            // 假设 icon中的desc存放它的 filePath
                            mp.put(el.getStartOffset(), tmp);
                    }
            }
            StringBuffer tt = new StringBuffer("");
            char[] chr = t.toCharArray();
            for(int c=0; c<chr.length; c++) {
                    String v = mp.get(new Integer(c));
                    if(v == null)
                            tt.append(chr[c]);
                    else
                            tt.append(v);
            }
            return tt.toString();
    }
    //

    //send msg as public or whisper
    private void prepareMsg ( String msg ) {

        int t = UserBox.getSelectedIndex();
        //public msg
        if ( t == 0 ) {
            ClientObject.sendRMsg(msg, RoomID);
        }
        //whisper msg
        else {
            String tar = UserBox.getSelectedItem().toString();
            ClientObject.sendWMsg(msg, tar, RoomID);
        }
    }

    //change whisper target into the last who whisper
    private void ReplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplyButtonActionPerformed
        UserBox.setSelectedItem(lastWhisper);
}//GEN-LAST:event_ReplyButtonActionPerformed

    private void UserListPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserListPanelMousePressed
        UserListPanel.clearSelection();
	Rectangle r = UserListPanel.getCellBounds( 0, UserList.size()-1 );
	if( r!=null && r.contains(evt.getPoint()) ) {
		int index = UserListPanel.locationToIndex(evt.getPoint());
		UserListPanel.setSelectedIndex(index);
	}
    }//GEN-LAST:event_UserListPanelMousePressed

    private void UserListPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserListPanelMouseReleased
        if( UserListPanel.getSelectedIndex() != -1 && evt.isPopupTrigger() ) {
		UserListPopup.show(evt.getComponent(), evt.getX(), evt.getY());
	}
    }//GEN-LAST:event_UserListPanelMouseReleased

    //change whisper taget into select list item
    private void WhisperSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhisperSelActionPerformed
        String tar = UserListPanel.getSelectedValue().toString();
        UserBox.setSelectedItem(tar);
    }//GEN-LAST:event_WhisperSelActionPerformed

    //change texture
    private void ColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorButtonActionPerformed
        Color temp = JColorChooser.showDialog(this, "Choose color.", new Color(texture));
		if( temp != null ) {
			texture = temp.getRGB();
                        NameLabel.setForeground(temp);
		}
        ClientObject.sendColorChange(texture);
    }//GEN-LAST:event_ColorButtonActionPerformed

    private void SmileyButton_smileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmileyButton_smileActionPerformed
        InputPane.insertIcon(new ImageIcon("smile.png"));
    }//GEN-LAST:event_SmileyButton_smileActionPerformed

    private void SmileyButton_sadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmileyButton_sadActionPerformed
        InputPane.insertIcon(new ImageIcon("saddy.png"));
    }//GEN-LAST:event_SmileyButton_sadActionPerformed

    private void SmileyButton_laughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmileyButton_laughActionPerformed
        InputPane.insertIcon(new ImageIcon("laugh.png"));
    }//GEN-LAST:event_SmileyButton_laughActionPerformed

    private void SmileyButton_angryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmileyButton_angryActionPerformed
        InputPane.insertIcon(new ImageIcon("angry.png"));
    }//GEN-LAST:event_SmileyButton_angryActionPerformed

    private void SendFileSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendFileSelActionPerformed
        String tar = UserListPanel.getSelectedValue().toString();
        CFrame.sendFile(tar);
    }//GEN-LAST:event_SendFileSelActionPerformed

    private void LeaveRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveRoomButtonActionPerformed
        ClientObject.sendLeaveRoom(RoomID);
        CFrame.delTab(RoomID);
    }//GEN-LAST:event_LeaveRoomButtonActionPerformed

    private void InputPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputPaneKeyPressed
        if (evt.getKeyChar() == '\n') {
            prepareMsg(getInputText(InputPane));
            InputPane.setText(null);
        }
    }//GEN-LAST:event_InputPaneKeyPressed

    private void InputPaneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputPaneKeyReleased
        if (evt.getKeyChar() == '\n') {
            InputPane.setText(null);
        }
    }//GEN-LAST:event_InputPaneKeyReleased

    private void InviteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InviteButtonActionPerformed
        UserChoose uc = new UserChoose(CFrame, true, this);
        uc.setLocationRelativeTo(CFrame);
        Vector<String> MainUserList = CFrame.getUserList();
        for (String u: MainUserList) {
            uc.addUser(u);
        }
        for (String u: UserList) {
            uc.delUser(u);
        }
        uc.setVisible(true);
    }//GEN-LAST:event_InviteButtonActionPerformed

    public void inviteUser ( String tar ) {
        ClientObject.sendAddRoomUser(tar, RoomID);
    }

    // "/r+" command
    protected void addUser ( String user , int texture) {
        UserList.add(user);
        UserListPanel.setListData(UserList);
        UserBox.addItem(user);

        if (user.equals(username)) {
            NameLabel.setForeground(new Color(texture));
        }
        Style base = doc.getStyle("regular");
        Style s = doc.addStyle(user, base);
        StyleConstants.setForeground(s, new Color(texture));

        addSysLine(user + " joined.");
    }

    // "/r-" command
    protected void delUser ( String user ) {
        UserList.remove(user);
        UserListPanel.setListData(UserList);
        UserBox.removeItem(user);

        doc.removeStyle(user);

        addSysLine(user + " left.");
    }

    // "/c" command
    public void userChangeColor ( String name, int c ) {
        if (name.equals(username)) {
            NameLabel.setForeground(new Color(c));
        }
        Style s = doc.getStyle(name);
        StyleConstants.setForeground(s, new Color(c));
    }

    //add new lines
    public void addNewLine ( String text , String texture ) {
        ChatLines.add(text+newline);
        ChatLineTexture.add(texture);

        SingleLine s = new SingleLine(text+newline, texture, smileys);

        refreshChat(s);
    }

    public void addSysLine ( String text ) {
        ChatLines.add(text+newline);
        ChatLineTexture.add("system");
        refreshChat(text+newline, "system");
    }

    public void addWarnLine ( String text ) {
        ChatLines.add(text+newline);
        ChatLineTexture.add("warn");
        refreshChat(text+newline, "warn");
    }

    //refresh chat room text
    private void refreshChat ( String text, String texture) {
        try {
            doc.insertString( doc.getLength(),
                              text,
                              doc.getStyle(texture) );
        }
        catch (BadLocationException ble) {
            System.err.println("Couldn't insert initial text into text pane.");
        }

        ChatRoom.setCaretPosition(doc.getLength());
    }

    private void refreshChat ( SingleLine s ) {
        try {
            for (int i =0; i<s.texts.size(); i++) {
                doc.insertString( doc.getLength(),
                                  s.texts.elementAt(i),
                                  doc.getStyle(s.textures.elementAt(i)) );
            }
        }
        catch (BadLocationException ble) {
            System.err.println("Couldn't insert initial text into text pane.");
        }

        ChatRoom.setCaretPosition(doc.getLength());
    }

    public void clear () {
        UserBox.removeAllItems();
        UserBox.addItem("ALL Members");

        for (String u:UserList) {
            doc.removeStyle(u);
        }
        UserList.clear();
        UserListPanel.setListData(UserList);

        texture = Color.black.getRGB();
        NameLabel.setForeground(Color.black);
        lastWhisper = "All Members";
    }

    //Settings of JTextArea
    protected void addStylesToDocument(StyledDocument doc) {
        //Initialize some styles.
        Style def = StyleContext.getDefaultStyleContext().
                        getStyle(StyleContext.DEFAULT_STYLE);

        //base style
        Style regular = doc.addStyle("regular", def);
        StyleConstants.setFontFamily(def, "SansSerif");

        Style s = doc.addStyle("italic", regular);
        StyleConstants.setItalic(s, true);

        s = doc.addStyle("bold", regular);
        StyleConstants.setBold(s, true);

        s = doc.addStyle("small", regular);
        StyleConstants.setFontSize(s, 10);

        s = doc.addStyle("large", regular);
        StyleConstants.setFontSize(s, 16);

        //system style
        s = doc.addStyle("Server", regular);
        StyleConstants.setForeground(s, Color.BLUE);

        s = doc.addStyle("system", regular);
        StyleConstants.setBold(s, true);
        StyleConstants.setForeground(s, Color.BLUE);

        s = doc.addStyle("warn", regular);
        StyleConstants.setItalic(s, true);
        StyleConstants.setForeground(s, Color.RED);

        s = doc.addStyle("whisper", regular);
        StyleConstants.setForeground(s, Color.MAGENTA);

        //default style
        s = doc.addStyle("black", regular);
        StyleConstants.setForeground(s, Color.BLACK);

        s = doc.addStyle("red", regular);
        StyleConstants.setForeground(s, Color.RED);

        s = doc.addStyle("blue", regular);
        StyleConstants.setForeground(s, Color.BLUE);

        s = doc.addStyle("green", regular);
        StyleConstants.setForeground(s, Color.GREEN);

        s = doc.addStyle("orange", regular);
        StyleConstants.setForeground(s, Color.ORANGE);

        s = doc.addStyle("yellow", regular);
        StyleConstants.setForeground(s, Color.YELLOW);

        s = doc.addStyle("cyan", regular);
        StyleConstants.setForeground(s, Color.CYAN);

        s = doc.addStyle("gray", regular);
        StyleConstants.setForeground(s, Color.GRAY);
    }

    //smileys, regex's length should be 2
    protected void addSmileysToDocument(StyledDocument doc) {
        Style regular = doc.getStyle("regular");

        //icons
        Style s = doc.addStyle("smile.png", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        ImageIcon smileIcon = new javax.swing.ImageIcon("smile.png");
        if (smileIcon != null) {
            StyleConstants.setIcon(s, smileIcon);
        }
        smileys.add("smile.png");

        s = doc.addStyle("saddy.png", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        ImageIcon saddyIcon = new javax.swing.ImageIcon("saddy.png");
        if (saddyIcon != null) {
            StyleConstants.setIcon(s, saddyIcon);
        }
        smileys.add("saddy.png");

        s = doc.addStyle("laugh.png", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        ImageIcon laughIcon = new javax.swing.ImageIcon("laugh.png");
        if (laughIcon != null) {
            StyleConstants.setIcon(s, laughIcon);
        }
        smileys.add("laugh.png");

        s = doc.addStyle("angry.png", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        ImageIcon angryIcon = new javax.swing.ImageIcon("angry.png");
        if (angryIcon != null) {
            StyleConstants.setIcon(s, angryIcon);
        }
        smileys.add("angry.png");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ChatRoom;
    private javax.swing.JButton ColorButton;
    private javax.swing.JTextPane InputPane;
    private javax.swing.JButton InviteButton;
    private javax.swing.JButton LeaveRoomButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton ReplyButton;
    private javax.swing.JButton SendButton;
    private javax.swing.JMenuItem SendFileSel;
    private javax.swing.JButton SmileyButton_angry;
    private javax.swing.JButton SmileyButton_laugh;
    private javax.swing.JButton SmileyButton_sad;
    private javax.swing.JButton SmileyButton_smile;
    private javax.swing.JComboBox UserBox;
    private javax.swing.JList UserListPanel;
    private javax.swing.JPopupMenu UserListPopup;
    private javax.swing.JMenuItem WhisperSel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
