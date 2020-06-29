/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author me
 */
public class Startpage2 extends javax.swing.JFrame implements allFrames {

    /**
     * Creates new form Startpage2
     */
    
    public String clo,can = "",sup,decom,high,vfd;
    Set<Set<String>> KEYS = new HashSet<>();
    Set<String> k  = new HashSet<>();
        
    public Startpage2() {
        initComponents();
        System.gc();
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
        enterrelationnamelabel = new javax.swing.JLabel();
        enterattributeslabel = new javax.swing.JLabel();
        enterfdslabel = new javax.swing.JLabel();
        enterrelationnametextfield = new javax.swing.JTextField();
        enterattributestextfield = new javax.swing.JTextField();
        enterfdstextfield = new javax.swing.JTextField();
        canditateKeysButton = new javax.swing.JButton();
        attInputLabel = new javax.swing.JLabel();
        superKeysButton = new javax.swing.JButton();
        highestNFbutton = new javax.swing.JButton();
        decomposeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        fdINputLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enterrelationnamelabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterrelationnamelabel.setText("Enter Relation Name : ");

        enterattributeslabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterattributeslabel.setText("Enter Attributes : ");

        enterfdslabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterfdslabel.setText("Enter FD's :");

        enterattributestextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterattributestextfieldActionPerformed(evt);
            }
        });

        enterfdstextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterfdstextfieldActionPerformed(evt);
            }
        });

        canditateKeysButton.setText("CANDITATE KEYS");
        canditateKeysButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canditateKeysButtonActionPerformed(evt);
            }
        });

        attInputLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attInputLabel.setForeground(new java.awt.Color(255, 0, 51));
        attInputLabel.setText("Att input format : A,B,C,D,E ");

        superKeysButton.setText("SUPER KEYS");
        superKeysButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superKeysButtonActionPerformed(evt);
            }
        });

        highestNFbutton.setText("HIGHEST NF");
        highestNFbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highestNFbuttonActionPerformed(evt);
            }
        });

        decomposeButton.setText("DECOMPOSE");
        decomposeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decomposeButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        titleLabel.setText("DATABASE NORMALIZER");

        fdINputLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fdINputLabel.setForeground(new java.awt.Color(255, 0, 0));
        fdINputLabel.setText("FD's input format : A,B->C,D;B->E");

        jLabel1.setText("(Optional)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel)
                    .addComponent(fdINputLabel))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(enterrelationnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enterattributeslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enterfdslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(canditateKeysButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decomposeButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(enterrelationnametextfield)
                        .addComponent(enterattributestextfield)
                        .addComponent(enterfdstextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(superKeysButton)
                        .addGap(35, 35, 35)
                        .addComponent(highestNFbutton)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(13, 13, 13)
                .addComponent(attInputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fdINputLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterrelationnametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterrelationnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterattributeslabel)
                    .addComponent(enterattributestextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterfdslabel)
                    .addComponent(enterfdstextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(canditateKeysButton)
                        .addComponent(superKeysButton))
                    .addComponent(highestNFbutton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decomposeButton)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterattributestextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterattributestextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterattributestextfieldActionPerformed

    private void enterfdstextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterfdstextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterfdstextfieldActionPerformed
    
    private Set<String> getfdlist(){
        String FDs = enterfdstextfield.getText();
        StringTokenizer fd = new StringTokenizer(FDs,";");
        Set<String> fdlist = new HashSet<String>();
        while(fd.hasMoreTokens()){
            String tempfd = fd.nextToken();int i;
            String leftop = "", rightop = "";
            for(i=0;i<tempfd.length();i++){
                if(tempfd.charAt(i) != '-') leftop = leftop + tempfd.charAt(i);
                else break;
            }
            i+=2;
            for(i=i;i<tempfd.length();i++){
                rightop = rightop + tempfd.charAt(i);
            }
            StringTokenizer right = new StringTokenizer(rightop,",");
            while(right.hasMoreTokens()){
                String temp = right.nextToken();
                fdlist.add(leftop + "->" + temp);
            }
        }
        
        return fdlist;
    }
    private Set<String> getattributelist(){
        String attributes = enterattributestextfield.getText();
        StringTokenizer att = new StringTokenizer(attributes,",");
        Set<String> attributelist = new HashSet<String>();
        while(att.hasMoreTokens()){
            attributelist.add(att.nextToken());
        }
        
        return attributelist;
    }
    private Set<String> getleft(String fd){
        Set<String> left = new HashSet<>();
        int j;
        for(j=0;j<fd.length();j++){
            if(fd.charAt(j) == '-') break;
        }
        String L = fd.substring(0,j);
        StringTokenizer l = new StringTokenizer(L,",");
        while(l.hasMoreTokens()){
            left.add(l.nextToken());
        }
        return left;
    }
    private Set<String> getright(String fd){
        Set<String> right = new HashSet<>();
        int j;
        for(j=0;j<fd.length();j++){
            if(fd.charAt(j) == '-') break;
        }
        String R = fd.substring(j+2);
        right.add(R);
        
        return right;
    }
    
    private Set<String> check2nf(Set<String> fdlist,Set<String> attributelist){
        Set<Set<String>> keys = keys(fdlist,attributelist);
        Set<String> violating = new HashSet<>();
        for(String s1 : fdlist){
            String temp = s1;int j;
            for(j=0;j<temp.length();j++){
                if(temp.charAt(j) == '-') break;
            }
            Set<String> left = getleft(s1);
            Set<String> right = getright(s1);
            Set<String> key = new HashSet<>();
            for(Set<String> s:keys){
                for(String S:s)
                    key.add(S);
            }
            if(!key.containsAll(right)){
                boolean contains = false;
                for(String k:left){
                    if(key.contains(k)){
                        contains = true;
                        break;
                    }
                }
                if(contains){
                    boolean keypresent = false;
                    for(Set<String> k:keys){
                        if(k.equals(left)){
                            keypresent = true;
                            break;
                        }
                    }
                    if(!keypresent) violating.add(temp);
                }
            }
        }
        return violating;
    }
    private Set<String> check3nf(Set<String> fdlist,Set<String> attributelist){
        Set<Set<String>> keys = keys(fdlist,attributelist);
        Set<String> primes = new HashSet<>();
        for(Set<String> k:keys){
            primes.addAll(k);
        }
        
        Set<String> violating = new HashSet<>();
        for(String s1 : fdlist){
            String temp = s1;int j;
            for(j=0;j<temp.length();j++){
                if(temp.charAt(j) == '-') break;
            }
            Set<String> left = getleft(s1);
            Set<String> right = getright(s1);
            if(!primes.containsAll(right)){
                boolean contains = false;
                for(Set<String> k:keys){
                    if(left.containsAll(k)){
                        contains = true;
                        break;
                    }
                }
                
                if(!contains) 
                    violating.add(s1);
            }
        }
        
        return violating;
    }
    private Set<String> checkbcnf(Set<String> fdlist,Set<String> attributelist){
        Set<Set<String>> keys = keys(fdlist,attributelist);
        Set<String> violating = new HashSet<>();
        for(String s1 : fdlist){
            String temp = s1;int j;
            for(j=0;j<temp.length();j++){
                if(temp.charAt(j) == '-') break;
            }
            Set<String> left = getleft(s1);
            boolean contains = false;
            for(Set<String> k:keys){
                if(left.containsAll(k)){
                    contains = true;
                    break;
                }
            }
            
            if(!contains)
                violating.add(temp);
        }
        
        return violating;
    }

//    private Set<String> CHECK3NF(Set<String> fdlist,Set<String> attributelist){
//        Set<Set<String>> keys = keys(fdlist,attributelist);
//        Set<String> violating = new HashSet<String>();
//        for(String s1 : fdlist){
//            String temp = s1;int j;
//            for(j=0;j<temp.length();j++){
//                if(temp.charAt(j) == '-') break;
//            }
//            Set<String> left = getleft(s1);
//            Set<String> right = getright(s1);
//            Set<String> key = new HashSet<>();
//            for(Set<String> s:keys){
//                key.addAll(s);
//                break;
//            }
//            if(!key.equals(left)){
//                if(!key.containsAll(right)){
//                    violating.add(temp);
//                }
//            }
//        }
//        
//        return violating;
//    }
//    private Set<String> CHECKBCNF(Set<String> fdlist,Set<String> attributelist){
//        Set<Set<String>> keys = keys(fdlist,attributelist);
//        Set<String> violating = new HashSet<>();
//        for(String s1 : fdlist){
//            String temp = s1;int j;
//            for(j=0;j<temp.length();j++){
//                if(temp.charAt(j) == '-') break;
//            }
//            Set<String> left = getleft(s1);
//            Set<String> right = getright(s1);
//            Set<String> key = new HashSet<>();
//            for(Set<String> s:keys){
//                key.addAll(s);
//                break;
//            }
//            if(!key.equals(left)){
//                violating.add(temp);
//            }
//        }
//        
//        return violating;
//    }

    //keys method gives the canditate keys. superKeys method gives all the superkeys of the relation.
    //computeClosure computes the closure.
    private Set<Set<String>> keys(Set<String> fdlist,Set<String> attributelist){
        Set<Set<String>> superkeys = superKeys(fdlist,attributelist);
        Set<Set<String>> toRemove = new HashSet<>();
        for(Set<String> key: superkeys){
            for(String a:key){
                Set<String> remaining = new HashSet<>(key);
                remaining.remove(a);
                if(superkeys.contains(remaining)){
                    toRemove.add(key);
                    break;
                }
            }
        }
        superkeys.removeAll(toRemove);
        return superkeys;
    }
    private <String> Set<Set<String>> powerSet(Set<String> originalSet){
        Set<Set<String>> sets = new HashSet<>();
        if(originalSet.isEmpty()){
            sets.add(new HashSet<>());
            return sets;
        }
        List<String> list = new ArrayList<>(originalSet);
        String head = list.get(0);
        Set<String> rest = new HashSet<>(list.subList(1,list.size()));
        powerSet(rest).forEach((set) -> {
            Set<String> newSet = new HashSet<>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        });
        return sets;
    }
    private <String> Set<Set<String>> reducedPowerSet(Set<String> originalSet){
        Set<Set<String>> result = powerSet(originalSet);
        result.remove(new HashSet<String>());
        return result;
    }
    private Set<Set<String>> superKeys(Set<String> fdlist,Set<String> attributelist){
        Set<Set<String>> keys = new HashSet<>();
        if(attributelist.isEmpty()){
            for(String s : fdlist){
                String temp = s;int j;
                for(j=0;j<temp.length();j++){
                    if(temp.charAt(j) == '-') break;
                }
                Set<String> left = getleft(temp);
                Set<String> right = getright(temp);
                attributelist.addAll(left);
                attributelist.addAll(right);
            }  
        }
        Set<Set<String>> powerset = reducedPowerSet(attributelist);
        for(Set<String> sa : powerset){
            if(computeClosure(fdlist,sa).containsAll(attributelist)){
                keys.add(sa);
            }
        }
        return keys;
    }
    private Set<String> computeClosure(Set<String> fdlist,Set<String> attributelist){
        Set<String> closure = new HashSet<>(attributelist);
        boolean found = true;
        while(found){
            found = false;
            for(String s : fdlist){
                String temp = s;int j;
                for(j=0;j<temp.length();j++){
                    if(temp.charAt(j) == '-') break;
                }
                Set<String> left = getleft(temp);
                Set<String> right = getright(temp);
                if(closure.containsAll(left) && !closure.containsAll(right)){
                    closure.addAll(right);
                    found = true;
                }
            }
        }
        return closure;
    }
    
    private void canditateKeysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canditateKeysButtonActionPerformed
        if(enterfdstextfield.getText().isBlank() || enterattributestextfield.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "PLEASE ENTER PROPER INPUTS!!!");
        }
        else{
            Set<Set<String>> key = keys(getfdlist(),getattributelist());
            for(Set<String> s : key ){
                can += s.toString() + "\n";
            }
            of.ofLbl.setText("All canditate keys of the relation are :");
            of.ofTextArea.setText(can);
            this.setVisible(false);
            of.setVisible(true);
        }
    }//GEN-LAST:event_canditateKeysButtonActionPerformed

    private void superKeysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superKeysButtonActionPerformed
        // TODO add your handling code here:
        if(enterfdstextfield.getText().isBlank() || enterattributestextfield.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "PLEASE ENTER PROPER INPUTS!!!");
        }
        else{
            Set<Set<String>> key = superKeys(getfdlist(),getattributelist());
            sup="";
            for(Set<String> s : key ){
                sup += s.toString() + "\n";

            }
            of.ofLbl.setText("All super keys of the relation are :");
            of.ofTextArea.setText(sup);
            this.setVisible(false);
            of.setVisible(true);
        }
        
    }//GEN-LAST:event_superKeysButtonActionPerformed

    private void highestNFbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highestNFbuttonActionPerformed
        // TODO add your handling code here:
        if(enterfdstextfield.getText().isBlank() || enterattributestextfield.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "PLEASE ENTER PROPER INPUTS!!!");
        }
        else{
            Set<String> fdlist = getfdlist();
            Set<String> attributelist = getattributelist();
            String temp;
            if(!check2nf(fdlist,attributelist).isEmpty()){
                temp=" 1 ";
            }
            else if(!check3nf(fdlist,attributelist).isEmpty()){
                temp=" 2 ";
            }
            else if(!checkbcnf(fdlist,attributelist).isEmpty()){
                temp=" 3 ";
            }
            else{
                temp=" BC ";
            }
            of.ofLbl.setText("Highest NF satisfied by the given relation is :");
            of.ofTextArea.setText(temp+"NF");
            this.setVisible(false);
            of.setVisible(true);
        }
        
    }//GEN-LAST:event_highestNFbuttonActionPerformed

    private void decomposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decomposeButtonActionPerformed
        // TODO add your handling code here:
        if(enterfdstextfield.getText().isBlank() || enterattributestextfield.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "PLEASE ENTER PROPER INPUTS!!!");
        }
        else{
            Set<String> fdlist = getfdlist();
            Set<String> attributelist = getattributelist();
            String t1="",t2="";
            boolean flag=true;
            decom = "";
            Set<String> attinfds = new HashSet<>();
            String FDS = enterfdstextfield.getText();
            StringTokenizer St = new StringTokenizer(FDS,",->;");
            while(St.hasMoreTokens()){
                attinfds.add(St.nextToken());
            }
            Set<String> leftoutatt = new HashSet<String>(attributelist);
            leftoutatt.removeAll(attinfds);
            //2NF Decomposition
            if(!check2nf(fdlist,attributelist).isEmpty()){
                Set<String> v2 = check2nf(fdlist,attributelist);
                vfd = v2.toString();
                t1=" 2 ";t2=t1;
                Set<String> fdremove = new HashSet<String>();
                Set<String> removedright = new HashSet<String>();
                for(String i : v2){
                    removedright.addAll(getright(i));
                    Set<String> fd = new HashSet<String>();fd.add(i);
                    Set<String> att = new HashSet<String>();
                    StringTokenizer st = new StringTokenizer(i,"-,>");
                    while(st.hasMoreTokens()){
                        att.add(st.nextToken());
                    }
                    Set<String> key = new HashSet<>();
                    for(Set<String> s:keys(fd,att)){
                        key.addAll(s);
                        break;
                    }
                    decom += "R" + att + "; Key:" + key + "; FD's:" + fd + "\n";
                    fdremove.add(i);
                }
                fdlist.removeAll(fdremove);
                fdremove.clear();
                if(!fdlist.isEmpty()){
                    for(String f:fdlist){
                            if(removedright.containsAll(getright(f))){
                                fdremove.add(f);
                            }
                    }
                    fdlist.removeAll(fdremove);
                }
                if(!fdlist.isEmpty()){
                    attributelist.clear();
                    for(String r:fdlist){
                        StringTokenizer st = new StringTokenizer(r,"-,>");
                        while(st.hasMoreTokens()){
                            attributelist.add(st.nextToken());
                        }
                    }
                    Set<String> key = new HashSet<>();
                    for(Set<String> s:keys(fdlist,attributelist)){
                        key.addAll(s);
                        break;
                    }
                    decom += "R" + attributelist + "; Key:" + key + "; FD's:" + fdlist + "\n";
                }
                if(!leftoutatt.isEmpty()){
                    decom += "R" + leftoutatt + "; Key:" + leftoutatt + "; FD's: []" + "\n";
                }
            }
            //3NF Decomposition
            else if(!check3nf(fdlist,attributelist).isEmpty()){
                Set<String> v3 = check3nf(fdlist,attributelist);
                vfd = v3.toString();
                t1=" 3 ";t2=t1;
                Set<String> toremove = new HashSet<String>();
                Set<String> fdremove = new HashSet<String>();
                int index = 1;
                for(String i : v3){
                    Set<String> fd = new HashSet<>();fd.add(i);
                    Set<String> att = new TreeSet();
                    StringTokenizer st = new StringTokenizer(i,"-,>");
                    while(st.hasMoreTokens()){
                        att.add(st.nextToken());
                    }
                    Set<String> key = new HashSet<>();
                    for(Set<String> s:keys(fd,att)){
                        key.addAll(s);
                        break;
                    }
                    decom += "R" + att + "; Key:" + key + "; FD's:" + fd + "\n";
                    String remove = "";int q;
                    for(q=0;q<i.length();q++){
                        if(i.charAt(q) == '>') break;
                    }
                    for(q=q+1;q<i.length();q++){
                        remove += i.charAt(q);
                    }
                    toremove.add(remove);
                    fdremove.add(i);
                }
                attributelist.removeAll(toremove);
                fdremove.clear();
                if(!fdlist.isEmpty()){
                    for(String f:fdlist){
                            if(toremove.containsAll(getright(f))){
                                fdremove.add(f);
                            }
                    }
                    fdlist.removeAll(fdremove);
                }
                if(!fdlist.isEmpty()){
                    attributelist.clear();
                    for(String r:fdlist){
                        StringTokenizer st = new StringTokenizer(r,"-,>");
                        while(st.hasMoreTokens()){
                            attributelist.add(st.nextToken());
                        }
                    }
                    Set<String> key = new HashSet<>();
                    for(Set<String> s:keys(fdlist,attributelist)){
                        key.addAll(s);
                        break;
                    }
                    decom += "R" + attributelist + "; Key:" + key + "; FD's:" + fdlist + "\n";
                }
                if(!leftoutatt.isEmpty()){
                    decom += "R" + leftoutatt + "; Key:" + leftoutatt + "; FD's: []" + "\n";
                }
    //            fdlist.removeAll(fdremove);
    //            fdremove.clear();
    //            Set<String> temp = new HashSet<>();
    //            for(String r:fdlist){
    //                StringTokenizer st = new StringTokenizer(r,"-,>");
    //                while(st.hasMoreTokens()){
    //                    temp.add(st.nextToken());
    //                }
    //            }
    //            attributelist.addAll(temp);
    //            if(!fdlist.isEmpty()){
    //                Set<String> key = new HashSet<>();
    //                for(Set<String> s:keys(fdlist,attributelist)){
    //                    key.addAll(s);
    //                    break;
    //                }
    //                decom += "R" + attributelist + "; Key:" + key + "; FD's:" + fdlist + "\n";
    //            }
            }
            //BCNF Decomposition
            else if(!checkbcnf(fdlist,attributelist).isEmpty()){
                Set<String> vbc = checkbcnf(fdlist,attributelist);
                vfd = vbc.toString();
                t1=" BC ";t2=" BC ";
                JOptionPane.showMessageDialog(null, "Some FD's may be lost!!!");
                decomposetobcnf(fdlist,attributelist);
            }
            else{
                decom = "NO DECOMPOSITION IS NEEDED!";
                flag=false;
                JOptionPane.showMessageDialog(null, decom);
             }
            if(flag){
                d.nf1.setText(t1);
                d.nf2.setText(t2);
                d.txtAr.setText(decom);
                d.nfs.setText(vfd);
                this.setVisible(false);
                d.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_decomposeButtonActionPerformed
    
    private void decomposetobcnf(Set<String> fdlist,Set<String> attributelist){
        KEYS = keys(fdlist,attributelist);
        Set<String> vbc = checkbcnf(fdlist,attributelist);
//        System.out.println("\n" + vbc);
        if(vbc.isEmpty()){
            Set<String> KEY = new HashSet<>();
            for(Set<String> k:keys(fdlist,attributelist)){
                KEY = k;
                break;
            }
            decom += "R" + attributelist + "; Key:" + KEY + "; FD's:" + fdlist + "\n";
            return;
        }
        String fd = "";
        for(String i:vbc){
            fd = i;
            break;
        }
        int j;
        for(j=0;j<fd.length();j++){
            if(fd.charAt(j) == '-') break;
        }
        Set<String> left = new HashSet<>(),right = new HashSet<>(),att = new HashSet<>(),fds = new HashSet<>();
        fds.add(fd);
        String L = fd.substring(0,j),R = fd.substring(j+2);
        StringTokenizer l = new StringTokenizer(L,",");
        while(l.hasMoreTokens()){
            left.add(l.nextToken());
        }
        right.add(R);
        att.addAll(left);att.addAll(right);
        fdlist.remove(fd);
        Set<String> key = new HashSet<>();
        for(Set<String> s:keys(fds,att)){
            key.addAll(s);
            break;
        }
        decom += "R" + att + "; Key:" + key + "; FD's:" + fds + "\n";
        attributelist.addAll(left);
        attributelist.removeAll(right);
        Set<String> toremove = new HashSet<String>();
        for(String f:fdlist){
            Set<String> Left = getleft(f);
            Set<String> Right = getright(f);
            if(Right.contains(R) || Left.contains(R)){
                toremove.add(f);
            }           
        }
        fdlist.removeAll(toremove);
        Set<Set<String>> keyremove = new HashSet<>();
        for(Set<String> K:KEYS){
            if(K.contains(R))
                keyremove.add(K);
        }
//        System.out.println("befor" + KEYS);
        KEYS.removeAll(keyremove);
//                System.out.println("after" + KEYS);
        k = null;
        for(Set<String> i:KEYS){
            if(attributelist.containsAll(i)){
//                System.out.println(i);
                k = i;
                break;
            }
            
        }
//        System.out.println(k + " " + KEYS);
//        decomposetobcnf(fdlist,attributelist);
//        if(fdlist.isEmpty()){
            if(k==null){
                decom += "R" + attributelist + "; Key:" + attributelist + "\n";
            }
            else{
                if(!k.equals(attributelist)){
                    decom += "R" + attributelist + "; Key:" + k;
//                    attributelist.removeAll(k);
//                    decom += "; FD's: "+ k + "->" + attributelist +"\n";
                }
                else{
                    decom += "R" + attributelist + "; Key:" + attributelist + "\n";
                }
            }
            return;
//        }
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
            java.util.logging.Logger.getLogger(Startpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            sp2.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attInputLabel;
    private javax.swing.JButton canditateKeysButton;
    private javax.swing.JButton decomposeButton;
    private javax.swing.JLabel enterattributeslabel;
    private javax.swing.JTextField enterattributestextfield;
    private javax.swing.JLabel enterfdslabel;
    private javax.swing.JTextField enterfdstextfield;
    private javax.swing.JLabel enterrelationnamelabel;
    private javax.swing.JTextField enterrelationnametextfield;
    private javax.swing.JLabel fdINputLabel;
    private javax.swing.JButton highestNFbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton superKeysButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
