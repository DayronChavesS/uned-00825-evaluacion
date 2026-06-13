/*
UNIVERSIDAD ESTATAL A DISTANCIA
VICERRECTORIA ACADÉMICA
ESCUELA DE CIENCIAS EXACTAS Y NATURALES
CARRERA DE INGENIERÍA INFORMÁTICA

PROYECTO EVALUATIVO
LISTAS ENLAZADAS

GRUPO 03
PROFESORA MIRIAM MORA MORALES

DAYRON ANTONY CHAVES SANDOVAL
305240018

CENTRO UNIVERSITARIO DE TURRIALBA

FECHA DE ENTREGA
25 DE ABRIL DEL 2021

PRIMER CUATRIMESTRE, 2021.
*/

package GUI;
import Estadia.*;
import ListaEnlazadaOrdenada.*;
import java.lang.reflect.Array;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends javax.swing.JFrame 
{
    ListaEnlazadaOrdenada ListaOrdenada = new ListaEnlazadaOrdenada();
    
    public VentanaPrincipal() 
    {
        initComponents();
        TABS.setEnabledAt(0, true);
        TABS.setEnabledAt(1, false);
        TABS.setEnabledAt(2, false);
        TABS.setEnabledAt(3, false);
        TABS.setEnabledAt(4, false);
        TABS.setEnabledAt(5, false);
        TABS.setEnabledAt(6, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TABS = new javax.swing.JTabbedPane();
        PANEL_Insertar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTFld_NombrePaciente = new javax.swing.JTextField();
        TXTFld_DiasInternado = new javax.swing.JTextField();
        BTN_InsertarEstadia = new javax.swing.JButton();
        PANEL_Extraer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TXTFld_Extraer_PosicionLista = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_ExtraerYEliminar = new javax.swing.JTable();
        BTN_Eliminar = new javax.swing.JButton();
        BTN_Extraer = new javax.swing.JButton();
        PANEL_RegistroEnPosicion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TXTFld_Obtener_PosicionLista = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLE_RegistroEnPosicion = new javax.swing.JTable();
        BTN_ObtenerRegistro = new javax.swing.JButton();
        PANEL_Tamaño = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LABEL_CantidadEstadias = new javax.swing.JLabel();
        PANEL_ListaCompleta = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLE_MostrarListaCompleta = new javax.swing.JTable();
        PANEL_Ganancias = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LABEL_Ganancias = new javax.swing.JLabel();
        PANEL_Vaciar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BTN_Vaciar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MENUITM_Insertar = new javax.swing.JMenuItem();
        MENUITM_Extraer = new javax.swing.JMenuItem();
        MENUITM_ObtenerEnPosicion = new javax.swing.JMenuItem();
        MENUITM_TamañoLista = new javax.swing.JMenuItem();
        MENUITM_MostrarLista = new javax.swing.JMenuItem();
        MENUITM_Ganancias = new javax.swing.JMenuItem();
        MENUITM_Vaciar = new javax.swing.JMenuItem();
        MENUITM_Terminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Paciente:");

        jLabel2.setText("Dias Internado:");

        BTN_InsertarEstadia.setText("INSERTAR ESTADIA");
        BTN_InsertarEstadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_InsertarEstadiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_InsertarLayout = new javax.swing.GroupLayout(PANEL_Insertar);
        PANEL_Insertar.setLayout(PANEL_InsertarLayout);
        PANEL_InsertarLayout.setHorizontalGroup(
            PANEL_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_InsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(BTN_InsertarEstadia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXTFld_DiasInternado)
                    .addComponent(TXTFld_NombrePaciente))
                .addContainerGap(597, Short.MAX_VALUE))
        );
        PANEL_InsertarLayout.setVerticalGroup(
            PANEL_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_InsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFld_NombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFld_DiasInternado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_InsertarEstadia)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        TABS.addTab("Insertar", PANEL_Insertar);

        jLabel3.setText("Posicion en Lista:");

        TABLE_ExtraerYEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABLE_ExtraerYEliminar);

        BTN_Eliminar.setText("ELIMINAR");
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EliminarActionPerformed(evt);
            }
        });

        BTN_Extraer.setText("EXTRAER");
        BTN_Extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ExtraerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_ExtraerLayout = new javax.swing.GroupLayout(PANEL_Extraer);
        PANEL_Extraer.setLayout(PANEL_ExtraerLayout);
        PANEL_ExtraerLayout.setHorizontalGroup(
            PANEL_ExtraerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ExtraerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_ExtraerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Eliminar)
                    .addGroup(PANEL_ExtraerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BTN_Extraer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTFld_Extraer_PosicionLista, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        PANEL_ExtraerLayout.setVerticalGroup(
            PANEL_ExtraerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ExtraerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFld_Extraer_PosicionLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Extraer)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_Eliminar)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        TABS.addTab("Extraer", PANEL_Extraer);

        jLabel4.setText("Posicion en Lista:");

        TABLE_RegistroEnPosicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TABLE_RegistroEnPosicion);

        BTN_ObtenerRegistro.setText("OBTENER REGISTRO");
        BTN_ObtenerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ObtenerRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_RegistroEnPosicionLayout = new javax.swing.GroupLayout(PANEL_RegistroEnPosicion);
        PANEL_RegistroEnPosicion.setLayout(PANEL_RegistroEnPosicionLayout);
        PANEL_RegistroEnPosicionLayout.setHorizontalGroup(
            PANEL_RegistroEnPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_RegistroEnPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_RegistroEnPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_RegistroEnPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TXTFld_Obtener_PosicionLista, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_ObtenerRegistro))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        PANEL_RegistroEnPosicionLayout.setVerticalGroup(
            PANEL_RegistroEnPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_RegistroEnPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFld_Obtener_PosicionLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_ObtenerRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        TABS.addTab("Registro En Posicion", PANEL_RegistroEnPosicion);

        jLabel5.setText("Cantidad de estadias en lista:");

        LABEL_CantidadEstadias.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        LABEL_CantidadEstadias.setText("N");

        javax.swing.GroupLayout PANEL_TamañoLayout = new javax.swing.GroupLayout(PANEL_Tamaño);
        PANEL_Tamaño.setLayout(PANEL_TamañoLayout);
        PANEL_TamañoLayout.setHorizontalGroup(
            PANEL_TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_TamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(LABEL_CantidadEstadias))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        PANEL_TamañoLayout.setVerticalGroup(
            PANEL_TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_TamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LABEL_CantidadEstadias)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        TABS.addTab("Tamaño", PANEL_Tamaño);

        TABLE_MostrarListaCompleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TABLE_MostrarListaCompleta);

        javax.swing.GroupLayout PANEL_ListaCompletaLayout = new javax.swing.GroupLayout(PANEL_ListaCompleta);
        PANEL_ListaCompleta.setLayout(PANEL_ListaCompletaLayout);
        PANEL_ListaCompletaLayout.setHorizontalGroup(
            PANEL_ListaCompletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ListaCompletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );
        PANEL_ListaCompletaLayout.setVerticalGroup(
            PANEL_ListaCompletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ListaCompletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TABS.addTab("Lista Completa", PANEL_ListaCompleta);

        jLabel6.setText("Total de Ganancias:");

        LABEL_Ganancias.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        LABEL_Ganancias.setText("N");

        javax.swing.GroupLayout PANEL_GananciasLayout = new javax.swing.GroupLayout(PANEL_Ganancias);
        PANEL_Ganancias.setLayout(PANEL_GananciasLayout);
        PANEL_GananciasLayout.setHorizontalGroup(
            PANEL_GananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_GananciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_GananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(LABEL_Ganancias))
                .addContainerGap(617, Short.MAX_VALUE))
        );
        PANEL_GananciasLayout.setVerticalGroup(
            PANEL_GananciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_GananciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LABEL_Ganancias)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        TABS.addTab("Ganancias", PANEL_Ganancias);

        jLabel7.setText("¿Vaciar Lista?");

        jLabel8.setText("Esta accion no se puede deshacer");

        BTN_Vaciar.setText("VACIAR TODO");
        BTN_Vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_VaciarLayout = new javax.swing.GroupLayout(PANEL_Vaciar);
        PANEL_Vaciar.setLayout(PANEL_VaciarLayout);
        PANEL_VaciarLayout.setHorizontalGroup(
            PANEL_VaciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_VaciarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_VaciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(BTN_Vaciar))
                .addContainerGap(516, Short.MAX_VALUE))
        );
        PANEL_VaciarLayout.setVerticalGroup(
            PANEL_VaciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_VaciarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Vaciar)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        TABS.addTab("Vaciar", PANEL_Vaciar);

        jMenu1.setText("Menu Hospital");

        MENUITM_Insertar.setText("Insertar Estadia");
        MENUITM_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_InsertarActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_Insertar);

        MENUITM_Extraer.setText("Extraer Registro");
        MENUITM_Extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_ExtraerActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_Extraer);

        MENUITM_ObtenerEnPosicion.setText("Obtener registro en posicion...");
        MENUITM_ObtenerEnPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_ObtenerEnPosicionActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_ObtenerEnPosicion);

        MENUITM_TamañoLista.setText("Tamaño de Lista");
        MENUITM_TamañoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_TamañoListaActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_TamañoLista);

        MENUITM_MostrarLista.setText("Mostrar Lista Completa");
        MENUITM_MostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_MostrarListaActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_MostrarLista);

        MENUITM_Ganancias.setText("Ganancias Totales");
        MENUITM_Ganancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_GananciasActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_Ganancias);

        MENUITM_Vaciar.setText("Vaciar Lista");
        MENUITM_Vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_VaciarActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_Vaciar);

        MENUITM_Terminar.setText("Terminar");
        MENUITM_Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_TerminarActionPerformed(evt);
            }
        });
        jMenu1.add(MENUITM_Terminar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TABS, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TABS, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUITM_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_InsertarActionPerformed
        TABS.setSelectedIndex(0);
        TABS.setEnabledAt(0, true);
        TABS.setEnabledAt(1, false);
        TABS.setEnabledAt(2, false);
        TABS.setEnabledAt(3, false);
        TABS.setEnabledAt(4, false);
        TABS.setEnabledAt(5, false);
        TABS.setEnabledAt(6, false);

    }//GEN-LAST:event_MENUITM_InsertarActionPerformed

    private void MENUITM_ExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_ExtraerActionPerformed
        TABS.setSelectedIndex(1);
        TABS.setEnabledAt(0, false);
        TABS.setEnabledAt(1, true);
        TABS.setEnabledAt(2, false);
        TABS.setEnabledAt(3, false);
        TABS.setEnabledAt(4, false);
        TABS.setEnabledAt(5, false);
        TABS.setEnabledAt(6, false);
        

        
    }//GEN-LAST:event_MENUITM_ExtraerActionPerformed

    private void MENUITM_ObtenerEnPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_ObtenerEnPosicionActionPerformed
        TABS.setSelectedIndex(2);
        TABS.setEnabledAt(0, false);
        TABS.setEnabledAt(1, false);
        TABS.setEnabledAt(2, true);
        TABS.setEnabledAt(3, false);
        TABS.setEnabledAt(4, false);
        TABS.setEnabledAt(5, false);
        TABS.setEnabledAt(6, false);
        
        //se crea un nuevo modelo de tabla
        DefaultTableModel NuevoModelo = new DefaultTableModel();
        //se añaden las siguientes columnas
        NuevoModelo.addColumn("Paciente");
        NuevoModelo.addColumn("Dias Internado");
        NuevoModelo.addColumn("Monto");
        
        TABLE_RegistroEnPosicion.setModel(NuevoModelo);
        
    }//GEN-LAST:event_MENUITM_ObtenerEnPosicionActionPerformed

    private void MENUITM_TamañoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_TamañoListaActionPerformed
        TABS.setSelectedIndex(3);
        TABS.setEnabledAt(0, false);
        TABS.setEnabledAt(1, false);
        TABS.setEnabledAt(2, false);
        TABS.setEnabledAt(3, true);
        TABS.setEnabledAt(4, false);
        TABS.setEnabledAt(5, false);
        TABS.setEnabledAt(6, false);
        
        
        
    }//GEN-LAST:event_MENUITM_TamañoListaActionPerformed

    private void MENUITM_MostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_MostrarListaActionPerformed
        TABS.setSelectedIndex(4);
        TABS.setEnabledAt(0, false);
        TABS.setEnabledAt(1, false);
        TABS.setEnabledAt(2, false);
        TABS.setEnabledAt(3, false);
        TABS.setEnabledAt(4, true);
        TABS.setEnabledAt(5, false);
        TABS.setEnabledAt(6, false);
        
        //se crea un nuevo modelo de tabla
        DefaultTableModel NuevoModelo = new DefaultTableModel();
        //se añaden las siguientes columnas
        NuevoModelo.addColumn("Paciente");
        NuevoModelo.addColumn("Dias Internado");
        NuevoModelo.addColumn("Monto");
        
        TABLE_MostrarListaCompleta.setModel(NuevoModelo);
        
    }//GEN-LAST:event_MENUITM_MostrarListaActionPerformed

    private void MENUITM_GananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_GananciasActionPerformed
        TABS.setSelectedIndex(5);
        TABS.setEnabledAt(0, false);
        TABS.setEnabledAt(1, false);
        TABS.setEnabledAt(2, false);
        TABS.setEnabledAt(3, false);
        TABS.setEnabledAt(4, false);
        TABS.setEnabledAt(5, true);
        TABS.setEnabledAt(6, false);
        
        
    }//GEN-LAST:event_MENUITM_GananciasActionPerformed

    private void MENUITM_VaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_VaciarActionPerformed
        TABS.setSelectedIndex(6);
        TABS.setEnabledAt(0, false);
        TABS.setEnabledAt(1, false);
        TABS.setEnabledAt(2, false);
        TABS.setEnabledAt(3, false);
        TABS.setEnabledAt(4, false);
        TABS.setEnabledAt(5, false);
        TABS.setEnabledAt(6, true);
        

        
    }//GEN-LAST:event_MENUITM_VaciarActionPerformed

    private void MENUITM_TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_TerminarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_MENUITM_TerminarActionPerformed

    private void BTN_InsertarEstadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_InsertarEstadiaActionPerformed
        
        String Nombre = "";
        int Dias = 0;
        int Monto = 0;
        
        try
        {
            //se intenta extraer la informacion
            //Dias puede arrojar excepcion
            Nombre = TXTFld_NombrePaciente.getText();
            Dias = Integer.parseInt(TXTFld_DiasInternado.getText());
            
            if ( Dias < 0 || Dias > 30)
            {
                   JOptionPane.showMessageDialog(this, "El valor que usted digito no es valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                Estadia NuevaEstadia = new Estadia();
                NuevaEstadia.nombre = Nombre;
                NuevaEstadia.dias = Dias;
                
                if (Dias == 1 || Dias == 2)
                {
                    Monto = 1000;
                }
                else if (Dias >= 3 && Dias <= 5)
                {
                    Monto = 3000;
                }
                else if (Dias >= 6 && Dias <= 10)
                {
                    Monto = 5000;
                }
                else if (Dias >= 11 && Dias <= 15)
                {
                    Monto = 8000;
                }
                else if (Dias >= 16 && Dias <= 30)
                {
                    Monto = 12000;
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Ocurrio un error al asignar el monto.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                
                NuevaEstadia.monto = Monto;
                
                
                
                //se crea un nuevo nodo para la lista enlazada ordenada
                //se le da la informacion por parametro
                Nodo NuevoNodo = new Nodo(NuevaEstadia);
                
                ListaOrdenada.InsertarNodo(NuevoNodo.Dato);
                JOptionPane.showMessageDialog(this, "Se ha guardado la informacion.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Por favor digite un numero.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


        
    }//GEN-LAST:event_BTN_InsertarEstadiaActionPerformed

    private void BTN_ExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ExtraerActionPerformed
        
        int Posicion = 0;
        Posicion = Integer.parseInt(TXTFld_Extraer_PosicionLista.getText());
        
        Nodo nodoactual = Iterador.PosicionActual.Dato.;
               
        for(int i = 0; i > Posicion; i++)
        {
            nodoactual  = nodoactual.Siguiente;
        }
        
        //se crea un nuevo modelo de tabla
        DefaultTableModel NuevoModelo = new DefaultTableModel();
        //se añaden las siguientes columnas
        NuevoModelo.addColumn("Paciente");
        NuevoModelo.addColumn("Dias Internado");
        NuevoModelo.addColumn("Monto");
       
        Vector a = new Vector();
        a.add(nodoactual);
        
        NuevoModelo.addRow(a);
        
        TABLE_ExtraerYEliminar.setModel(NuevoModelo);
    }//GEN-LAST:event_BTN_ExtraerActionPerformed

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EliminarActionPerformed
       
        
        
    }//GEN-LAST:event_BTN_EliminarActionPerformed

    private void BTN_ObtenerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ObtenerRegistroActionPerformed
      
        
        
    }//GEN-LAST:event_BTN_ObtenerRegistroActionPerformed

    private void BTN_VaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VaciarActionPerformed
       
        
        
    }//GEN-LAST:event_BTN_VaciarActionPerformed

    
    
    
    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Extraer;
    private javax.swing.JButton BTN_InsertarEstadia;
    private javax.swing.JButton BTN_ObtenerRegistro;
    private javax.swing.JButton BTN_Vaciar;
    private javax.swing.JLabel LABEL_CantidadEstadias;
    private javax.swing.JLabel LABEL_Ganancias;
    private javax.swing.JMenuItem MENUITM_Extraer;
    private javax.swing.JMenuItem MENUITM_Ganancias;
    private javax.swing.JMenuItem MENUITM_Insertar;
    private javax.swing.JMenuItem MENUITM_MostrarLista;
    private javax.swing.JMenuItem MENUITM_ObtenerEnPosicion;
    private javax.swing.JMenuItem MENUITM_TamañoLista;
    private javax.swing.JMenuItem MENUITM_Terminar;
    private javax.swing.JMenuItem MENUITM_Vaciar;
    private javax.swing.JPanel PANEL_Extraer;
    private javax.swing.JPanel PANEL_Ganancias;
    private javax.swing.JPanel PANEL_Insertar;
    private javax.swing.JPanel PANEL_ListaCompleta;
    private javax.swing.JPanel PANEL_RegistroEnPosicion;
    private javax.swing.JPanel PANEL_Tamaño;
    private javax.swing.JPanel PANEL_Vaciar;
    private javax.swing.JTable TABLE_ExtraerYEliminar;
    private javax.swing.JTable TABLE_MostrarListaCompleta;
    private javax.swing.JTable TABLE_RegistroEnPosicion;
    private javax.swing.JTabbedPane TABS;
    private javax.swing.JTextField TXTFld_DiasInternado;
    private javax.swing.JTextField TXTFld_Extraer_PosicionLista;
    private javax.swing.JTextField TXTFld_NombrePaciente;
    private javax.swing.JTextField TXTFld_Obtener_PosicionLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
