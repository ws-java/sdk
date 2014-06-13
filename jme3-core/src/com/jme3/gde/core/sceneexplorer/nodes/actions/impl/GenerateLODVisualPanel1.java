 /*
 *  Copyright (c) 2009-2010 jMonkeyEngine
 *  All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 * 
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 
 *  * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.gde.core.sceneexplorer.nodes.actions.impl;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import jme3tools.optimize.LodGenerator;

public final class GenerateLODVisualPanel1 extends JPanel {

    private List<JTextField> valuesFields = new ArrayList<JTextField>();
    private List<JLabel> estimationFields = new ArrayList<JLabel>();
    private int triSize;

    /**
     * Creates new form GenerateLODVisualPanel1
     */
    public GenerateLODVisualPanel1() {
        initComponents();
        reductionMethod.setModel(new DefaultComboBoxModel());
        reductionMethod.addItem(LodGenerator.TriangleReductionMethod.PROPORTIONAL);
        reductionMethod.addItem(LodGenerator.TriangleReductionMethod.CONSTANT);

        valuesFields.add(valueLevel1);
        valuesFields.add(valueLevel2);
        valuesFields.add(valueLevel3);
        valuesFields.add(valueLevel4);
        valuesFields.add(valueLevel5);
        valuesFields.add(valueLevel6);
        valuesFields.add(valueLevel7);
        valuesFields.add(valueLevel8);
        valuesFields.add(valueLevel9);
        valuesFields.add(valueLevel10);

        estimationFields.add(estLabel1);
        estimationFields.add(estLabel2);
        estimationFields.add(estLabel3);
        estimationFields.add(estLabel4);
        estimationFields.add(estLabel5);
        estimationFields.add(estLabel6);
        estimationFields.add(estLabel7);
        estimationFields.add(estLabel8);
        estimationFields.add(estLabel9);
        estimationFields.add(estLabel10);
    }

    @Override
    public String getName() {
        return "Step #1";
    }

    public LodGenerator.TriangleReductionMethod getReducitonMethod() {
        return (LodGenerator.TriangleReductionMethod) reductionMethod.getSelectedItem();
    }

    public List<JTextField> getValuesFields() {
        return valuesFields;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        reductionMethod = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        reductionDescription = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        valuePanel = new javax.swing.JPanel();
        labelLevel1 = new javax.swing.JLabel();
        valueLevel1 = new javax.swing.JTextField();
        labelLevel2 = new javax.swing.JLabel();
        valueLevel2 = new javax.swing.JTextField();
        valueLevel3 = new javax.swing.JTextField();
        labelLevel3 = new javax.swing.JLabel();
        valueLevel4 = new javax.swing.JTextField();
        labelLevel4 = new javax.swing.JLabel();
        valueLevel5 = new javax.swing.JTextField();
        labelLevel5 = new javax.swing.JLabel();
        valueLevel6 = new javax.swing.JTextField();
        labelLevel6 = new javax.swing.JLabel();
        valueLevel7 = new javax.swing.JTextField();
        labelLevel7 = new javax.swing.JLabel();
        valueLevel8 = new javax.swing.JTextField();
        labelLevel8 = new javax.swing.JLabel();
        valueLevel9 = new javax.swing.JTextField();
        labelLevel9 = new javax.swing.JLabel();
        valueLevel10 = new javax.swing.JTextField();
        labelLevel10 = new javax.swing.JLabel();
        estLabel1 = new javax.swing.JLabel();
        estLabel2 = new javax.swing.JLabel();
        estLabel3 = new javax.swing.JLabel();
        estLabel4 = new javax.swing.JLabel();
        estLabel5 = new javax.swing.JLabel();
        estLabel6 = new javax.swing.JLabel();
        estLabel7 = new javax.swing.JLabel();
        estLabel8 = new javax.swing.JLabel();
        estLabel9 = new javax.swing.JLabel();
        estLabel10 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.jPanel1.border.title"))); // NOI18N

        reductionMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        reductionMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reductionMethodActionPerformed(evt);
            }
        });

        reductionDescription.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(reductionDescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(reductionMethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(reductionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.jPanel2.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.jLabel1.text")); // NOI18N
        jLabel1.setToolTipText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.jLabel1.toolTipText")); // NOI18N

        valuePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelLevel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel1, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel1.text")); // NOI18N

        valueLevel1.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel1.text")); // NOI18N
        valueLevel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel1KeyReleased(evt);
            }
        });

        labelLevel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel2, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel2.text")); // NOI18N

        valueLevel2.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel2.text")); // NOI18N
        valueLevel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel2KeyReleased(evt);
            }
        });

        valueLevel3.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel3.text")); // NOI18N
        valueLevel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel3KeyReleased(evt);
            }
        });

        labelLevel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel3, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel3.text")); // NOI18N

        valueLevel4.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel4.text")); // NOI18N
        valueLevel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel4KeyReleased(evt);
            }
        });

        labelLevel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel4, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel4.text")); // NOI18N

        valueLevel5.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel5.text")); // NOI18N
        valueLevel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel5KeyReleased(evt);
            }
        });

        labelLevel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel5, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel5.text")); // NOI18N
        labelLevel5.setToolTipText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel5.toolTipText")); // NOI18N

        valueLevel6.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel6.text")); // NOI18N
        valueLevel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel6KeyReleased(evt);
            }
        });

        labelLevel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel6, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel6.text")); // NOI18N

        valueLevel7.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel7.text")); // NOI18N
        valueLevel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel7KeyReleased(evt);
            }
        });

        labelLevel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel7, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel7.text")); // NOI18N

        valueLevel8.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel8.text")); // NOI18N
        valueLevel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel8KeyReleased(evt);
            }
        });

        labelLevel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel8, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel8.text")); // NOI18N

        valueLevel9.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel9.text")); // NOI18N
        valueLevel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel9KeyReleased(evt);
            }
        });

        labelLevel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel9, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel9.text")); // NOI18N

        valueLevel10.setText(org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.valueLevel10.text")); // NOI18N
        valueLevel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valueLevel10KeyReleased(evt);
            }
        });

        labelLevel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(labelLevel10, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.labelLevel10.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel1, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel2, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel3, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel4, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel5, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel6, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel7, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel7.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel8, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel9, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel9.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(estLabel10, org.openide.util.NbBundle.getMessage(GenerateLODVisualPanel1.class, "GenerateLODVisualPanel1.estLabel10.text")); // NOI18N

        javax.swing.GroupLayout valuePanelLayout = new javax.swing.GroupLayout(valuePanel);
        valuePanel.setLayout(valuePanelLayout);
        valuePanelLayout.setHorizontalGroup(
            valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(valuePanelLayout.createSequentialGroup()
                        .addComponent(labelLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLevel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(valuePanelLayout.createSequentialGroup()
                        .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valuePanelLayout.createSequentialGroup()
                                .addComponent(labelLevel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLevel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valuePanelLayout.createSequentialGroup()
                                .addComponent(labelLevel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLevel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(valuePanelLayout.createSequentialGroup()
                        .addComponent(labelLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLevel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(valuePanelLayout.createSequentialGroup()
                        .addComponent(labelLevel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLevel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(valuePanelLayout.createSequentialGroup()
                        .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valuePanelLayout.createSequentialGroup()
                                .addComponent(labelLevel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLevel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valuePanelLayout.createSequentialGroup()
                                .addComponent(labelLevel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLevel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valuePanelLayout.createSequentialGroup()
                                .addComponent(labelLevel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLevel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valuePanelLayout.createSequentialGroup()
                                .addComponent(labelLevel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLevel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valuePanelLayout.createSequentialGroup()
                                .addComponent(labelLevel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLevel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        valuePanelLayout.setVerticalGroup(
            valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel1)
                        .addComponent(valueLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel2)
                        .addComponent(valueLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel3)
                        .addComponent(valueLevel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel4)
                        .addComponent(valueLevel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel5)
                        .addComponent(valueLevel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel6)
                        .addComponent(valueLevel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel7)
                        .addComponent(valueLevel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel8)
                        .addComponent(valueLevel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLevel9)
                        .addComponent(valueLevel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLevel10)
                    .addComponent(valueLevel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setTriSize(int triSize) {
        this.triSize = triSize;
    }

    private int getIndex(JTextField field) {
        for (int i = 0; i < valuesFields.size(); i++) {
            if (valuesFields.get(i) == field) {
                return i;
            }
        }
        return -1;
    }

    private void estimate(int index) {
        JTextField field = valuesFields.get(index);
        JLabel est = estimationFields.get(index);

        float value = 0;
        try {
            value = Float.parseFloat(field.getText());
            int trinum = 0;
            if (reductionMethod.getSelectedItem() == LodGenerator.TriangleReductionMethod.PROPORTIONAL) {
                trinum = (int) (triSize - (triSize * value));
            } else {
                trinum = (int) (triSize - value);
            }
            est.setText("~ " + trinum + " triangles");
        } catch (NumberFormatException e) {
            est.setText("-");
            return;
        }
    }

    private void clear(){
        for (JTextField text : valuesFields) {
            text.setText("");
        }
        for (JLabel label : estimationFields) {
            label.setText("");
        }
    }
    
    private void reductionMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reductionMethodActionPerformed
        switch ((LodGenerator.TriangleReductionMethod) reductionMethod.getSelectedItem()) {
            case PROPORTIONAL:
                reductionDescription.setText("Enter float values from 0 to 1.\n each value represent the proportion of triangles to remove from the full mesh.");
                break;
            case CONSTANT:
                reductionDescription.setText("Enter integrer values from 0 to " + triSize + " of the mesh.\n each value represent the number of triangles to remove from the full mesh. ");
                break;
            case COLLAPSE_COST:
                reductionDescription.setText("Don't use this");
                break;
        }
        clear();
    }//GEN-LAST:event_reductionMethodActionPerformed

    private void valueLevel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel1KeyReleased
        estimate(getIndex((JTextField) evt.getSource()));    // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel1KeyReleased

    private void valueLevel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel2KeyReleased
       estimate(getIndex((JTextField) evt.getSource()));  // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel2KeyReleased

    private void valueLevel3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel3KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel3KeyReleased

    private void valueLevel4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel4KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel4KeyReleased

    private void valueLevel5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel5KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel5KeyReleased

    private void valueLevel6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel6KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel6KeyReleased

    private void valueLevel7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel7KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel7KeyReleased

    private void valueLevel8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel8KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel8KeyReleased

    private void valueLevel9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel9KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel9KeyReleased

    private void valueLevel10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueLevel10KeyReleased
 estimate(getIndex((JTextField) evt.getSource()));        // TODO add your handling code here:
    }//GEN-LAST:event_valueLevel10KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estLabel1;
    private javax.swing.JLabel estLabel10;
    private javax.swing.JLabel estLabel2;
    private javax.swing.JLabel estLabel3;
    private javax.swing.JLabel estLabel4;
    private javax.swing.JLabel estLabel5;
    private javax.swing.JLabel estLabel6;
    private javax.swing.JLabel estLabel7;
    private javax.swing.JLabel estLabel8;
    private javax.swing.JLabel estLabel9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLevel1;
    private javax.swing.JLabel labelLevel10;
    private javax.swing.JLabel labelLevel2;
    private javax.swing.JLabel labelLevel3;
    private javax.swing.JLabel labelLevel4;
    private javax.swing.JLabel labelLevel5;
    private javax.swing.JLabel labelLevel6;
    private javax.swing.JLabel labelLevel7;
    private javax.swing.JLabel labelLevel8;
    private javax.swing.JLabel labelLevel9;
    private javax.swing.JTextPane reductionDescription;
    private javax.swing.JComboBox reductionMethod;
    private javax.swing.JTextField valueLevel1;
    private javax.swing.JTextField valueLevel10;
    private javax.swing.JTextField valueLevel2;
    private javax.swing.JTextField valueLevel3;
    private javax.swing.JTextField valueLevel4;
    private javax.swing.JTextField valueLevel5;
    private javax.swing.JTextField valueLevel6;
    private javax.swing.JTextField valueLevel7;
    private javax.swing.JTextField valueLevel8;
    private javax.swing.JTextField valueLevel9;
    private javax.swing.JPanel valuePanel;
    // End of variables declaration//GEN-END:variables
}
