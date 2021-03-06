package GUIView;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Controller.MatchCont;
import javax.swing.JOptionPane;

/**Group Names: Tyler Glass, Michael House, Holly Ruyle, Phu Hoang    
 * Project Part: GUI Display - Matchmaking View
 * Program Title: Tic-tac-toe Game 
 * Course: CSCE 320 - Software Engineering
 * Date: February 23, 2015
 * Language and Compiler: Java written in eclipse and Netbeans
 * Sources: CSCE 320 references - Trivial Java Example
*/

public class MatchMaking extends javax.swing.JFrame {

	 /**
     * Creates new form MatchMaking
     */
    public MatchMaking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        availableList = new javax.swing.JList();
        inviteButton = new javax.swing.JButton();
        InviteAllButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatBoxTA = new javax.swing.JTextArea();
        msgTF = new javax.swing.JTextField();
        acceptInvite = new javax.swing.JButton();
        declineInvite = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        inviteList = new javax.swing.JList();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        backMenu = new javax.swing.JMenu();
        logOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //setTitle("Lobby");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        availableList.setBackground(new java.awt.Color(51, 51, 51));
        availableList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        availableList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        availableList.setForeground(new java.awt.Color(255, 255, 255));
        availableList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(availableList);

        inviteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inviteButton.setText("Invite ");
        inviteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inviteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviteButtonActionPerformed(evt);
            }
        });

        InviteAllButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        InviteAllButton.setText("Invite All");
        InviteAllButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InviteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InviteAllButtonActionPerformed(evt);
            }
        });

        chatBoxTA.setEditable(false);
        chatBoxTA.setBackground(new java.awt.Color(51, 51, 51));
        chatBoxTA.setColumns(20);
        chatBoxTA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        chatBoxTA.setForeground(new java.awt.Color(255, 255, 255));
        chatBoxTA.setRows(5);
        chatBoxTA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System Chat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        jScrollPane2.setViewportView(chatBoxTA);

        msgTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msgTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTFActionPerformed(evt);
            }
        });

        acceptInvite.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        acceptInvite.setText("Accept");
        acceptInvite.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        acceptInvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptInviteActionPerformed(evt);
            }
        });

        declineInvite.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        declineInvite.setText("Decline");
        declineInvite.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        declineInvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineInviteActionPerformed(evt);
            }
        });

        inviteList.setBackground(new java.awt.Color(51, 51, 51));
        inviteList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game Invites", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        inviteList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        inviteList.setForeground(new java.awt.Color(255, 255, 255));
        inviteList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane4.setViewportView(inviteList);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Abstract-Green-Background-Wallpaper-Vector-Graphic2.jpg"))); // NOI18N

        backMenu.setText("Menu");

        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        backMenu.add(logOut);

        jMenuBar1.add(backMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(InviteAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(msgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(acceptInvite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(declineInvite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(inviteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(InviteAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(msgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(acceptInvite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(declineInvite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(inviteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                       
    //DefaultListModel list = new DefaultListModel();
    /**
     * ActionPerformed according to the msgTF.
     * @param evt
     */
    private void msgTFActionPerformed(java.awt.event.ActionEvent evt) {
        
    	controller.updateUserInfo("chat_" + msgTF.getText());
    	controller.listen("chat");
    	msgTF.setText("");
    }                                     

    /**
     * ActionPerformed according to the logOutButton.
     * @param evt
     */
    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        controller.listen("logOut");
    }                                            

    /**
     * ActionPerformed according to the inviteButton.
     * @param evt
     */
    private void inviteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String invite = "";
        if(availableList.getSelectedValue() != null){
        invite = "sInvite_" + availableList.getSelectedValue().toString();
        controller.updateUserInfo(invite);
        controller.listen("sInvite");
        }
        else{// nothing is selected so dont send empty info
            JOptionPane.showMessageDialog(null, "Please select some one to invite");
        }
            
    }                             

    /**
     * ActionPerformed according to the InviteAllButton.
     * @param evt
     */
    private void InviteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String invite = "";
        invite = "mInvite_" ;
        controller.updateUserInfo(invite);
        controller.listen("mInvite");
    }     
    
    /**
     * Listen to the accept button
     * @param evt 
     */
    private void acceptInviteActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String accept = "";
        if(inviteList.getSelectedValue() != null){
        accept = "accept_" + inviteList.getSelectedValue().toString();
        controller.updateUserInfo(accept);
        controller.listen("accept");
        // runs trhough the list of invites and deletes the one we selected
        
        inviter.removeElement(inviteList.getSelectedValue().toString());
        } else
            JOptionPane.showMessageDialog(null, "Please select a game invite to accept");       
    }                                            

    /**
     * Listen to the decline button.
     * @param evt 
     */
    private void declineInviteActionPerformed(java.awt.event.ActionEvent evt) {
        // runs trhough the list of invites and deletes the one we selected

        String user = "";

        controller.listen("decline");
        int length = temp.size();
        for (int i = 0; i < length; i++) {
            if (temp.get(i).equals(inviteList.getSelectedValue().toString())) {
                temp.remove(temp.get(i));                
            }
            if (temp.size() == 0 || temp.size() == 1) {
                    break;                    
            }
            user = temp.get(i) + "_";
        }
        setInviterList(user);
    }                             

    /**
     * ActionPerformed according to the login button.
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        controller.listen("close");
    }
    
    /**
     * method take a list of just the users and fills the available users list
     * with the user names; it creates one every time because it is simple to 
     * implement and the list will need to be re-populated every time a user plays a game or logs out
     * @param users list of just the users in format "User1_user2_..."
     */
    public void setList(String users) {
        //DEBUG
        System.out.println("This is the Match view: " + users);
        String[] split = users.split("_");        
        list = new DefaultListModel();
        
        for(String element: split)
            if(!element.equals("undef"))
                list.addElement(element);        
        availableList.setModel(list);
    }        
    
    /**
     * method take a list of just the users and fills the available users list
     * with the user names; it creates one every time because it is simple to 
     * implement and the list will need to be re-populated every time a user plays a game or logs out
     * @param users list of just the users in format "User1_user2_..."
     */
    public void setInviterList(String users) {
        //DEBUG
        System.out.println("This is the Match view: " + users);
        String[] split = users.split("_");  
        
        for (String name : split) {
            if (!temp.contains(name)) 
                temp.add(name);
        }
        inviter = new DefaultListModel();
        
        for(String element: temp)
            inviter.addElement(element);  
        
        inviteList.setModel(inviter);           
    }

    /**
     * Set the player name into the JFarme Title
     * @param title 
     */
    public void setViewTitle(String title){
        setTitle("Lobby of: "+ title);
    }
    /**
     * Set the controller to the matchmaking view
     * @param controller
     */
    public void setController(MatchCont controller){
    	this.controller = controller;
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
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchMaking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton InviteAllButton;
    private javax.swing.JButton acceptInvite;
    private javax.swing.JList availableList;
    private javax.swing.JMenu backMenu;
    private javax.swing.JLabel background;
    public  javax.swing.JTextArea chatBoxTA;
    private javax.swing.JButton declineInvite;
    private javax.swing.JButton inviteButton;
    private javax.swing.JList inviteList;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem logOut;
    private javax.swing.JTextField msgTF;
    private MatchCont controller;
    private DefaultListModel list;
    private DefaultListModel inviter;
    ArrayList<String> temp = new ArrayList<String>();
    // End of variables declaration//GEN-END:variables
}
