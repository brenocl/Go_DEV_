/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_grafica;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import processamento_de_dados.Participantes;
import processamento_de_dados.Participantes_processados;
import processamento_de_dados.Salas;
import processamento_de_dados.Salas_participantes;
import processamento_de_dados.Salas_processadas;


/**
 *
 * @author Breno
 */
public class Janela_Principal extends javax.swing.JFrame {
    ArrayList<Salas> lista_salas;
    ArrayList<Participantes> lista_partc;
    ArrayList<Salas_processadas> lista_salasproc;
    ArrayList<Participantes_processados> lista_partcproc;
    ArrayList<Salas_participantes> lista_part_sala;
    int status;
    /**
     * Creates new form Janela_Principal
     */
    public Janela_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        lista_salas = new ArrayList();
        lista_partc = new ArrayList();
        lista_salasproc = new ArrayList();
        lista_partcproc = new ArrayList();
        lista_part_sala = new ArrayList();
        
        Salas S = new Salas(lista_salas.size()+1,"Café 1 Teste","Café",5);
                    lista_salas.add(S);
        S = new Salas(lista_salas.size()+1,"Café 2 Teste","Café",4);
                    lista_salas.add(S);
        S = new Salas(lista_salas.size()+1,"Evento 1 Teste","Evento",3);
                    lista_salas.add(S);
        S = new Salas(lista_salas.size()+1,"Evento 2 Teste","Evento",3);
                    lista_salas.add(S);
        S = new Salas(lista_salas.size()+1,"Evento 3 Teste","Evento",2);
                    lista_salas.add(S);            
        LoadTableSalas();
                    
                    
        Participantes P = new Participantes("Participante", "Número 1", lista_partc.size()+1);
                lista_partc.add(P);
        P = new Participantes("Participante", "Número 2", lista_partc.size()+1);
                lista_partc.add(P);
        P = new Participantes("Participante", "Número 3", lista_partc.size()+1);
                lista_partc.add(P);
        P = new Participantes("Participante", "Número 4", lista_partc.size()+1);
                lista_partc.add(P);
        P = new Participantes("Participante", "Número 5", lista_partc.size()+1);
                lista_partc.add(P);
        P = new Participantes("Participante", "Número 6", lista_partc.size()+1);
                lista_partc.add(P);
        P = new Participantes("Participante", "Número 7", lista_partc.size()+1);
                lista_partc.add(P);
        P = new Participantes("Participante", "Número 8", lista_partc.size()+1);
                lista_partc.add(P);
        LoadTablePartc();
    }

    private void LoadTableSalas(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Número","Nome","Tipo","Lotação"},0);
            
        for(int i=0;i<lista_salas.size();i++){
            Object linha[] = new Object[]{lista_salas.get(i).getNumero(),
                                          lista_salas.get(i).getNome(),
                                          lista_salas.get(i).getTipo(),
                                          lista_salas.get(i).getLotacao()};
            modelo.addRow(linha);
        }
        
        if (tbl_sal.getColumnModel().getColumnCount() > 0) {
            
            tbl_sal.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_sal.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbl_sal.getColumnModel().getColumn(2).setPreferredWidth(15);
        }
        tbl_sal.setModel(modelo);
    }
    
    private void LoadTablePartc(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Número","Nome","Sobrenome"},0);
        
        for(int i=0;i<lista_partc.size();i++){
            Object linha[] = new Object[]{lista_partc.get(i).getNumero(),
                                          lista_partc.get(i).getNome(),
                                          lista_partc.get(i).getSobrenome()};   
            modelo.addRow(linha);
        }
        if (tbl_part.getColumnModel().getColumnCount() > 0) {
            tbl_part.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_part.getColumnModel().getColumn(1).setPreferredWidth(30);
            tbl_part.getColumnModel().getColumn(2).setPreferredWidth(150);
        }
        tbl_part.setModel(modelo);
    }
    
    private void LoadTablePartcPc(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","Sobrenome","Etapa 1","Intervalo 1","Etapa 2","Intervalo 2",},0);
        
        for(int i=0;i<lista_partcproc.size();i++){
            Object linha[] = new Object[]{lista_partcproc.get(i).getNome(),
                                          lista_partcproc.get(i).getSobrenome(),
                                          lista_partcproc.get(i).getEtapa1(),
                                          lista_partcproc.get(i).getIntervalo1(),
                                          lista_partcproc.get(i).getEtapa2(),
                                          lista_partcproc.get(i).getIntervalo2()}; 
            modelo.addRow(linha);
        }
        tbl_partproc.setModel(modelo);
    }
    
    
    private void LoadTableSalasPc(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","Tipo","Alocação"},0);
        
        for(int i=0;i<lista_salasproc.size();i++){
            Object linha[] = new Object[]{lista_salasproc.get(i).getNome(),
                                          lista_salasproc.get(i).getTipo(),
                                          lista_salasproc.get(i).getAlocacao()};
            modelo.addRow(linha);                                
        }
        tbl_salproc.setModel(modelo);
    }
    
    private void LoadTableSalasPart(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","Sobrenome"},0);
        
        for(int i=0;i<lista_part_sala.size();i++){
            Object linha[] = new Object[]{lista_part_sala.get(i).getNome(),
                                          lista_part_sala.get(i).getSobrenome()};
            modelo.addRow(linha);                                
        }
        tbl_sal_part.setModel(modelo);
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_sal_tipo = new javax.swing.ButtonGroup();
        painel_abas = new javax.swing.JTabbedPane();
        aba_salas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sal = new javax.swing.JTable();
        painel_cadastro_salas = new javax.swing.JPanel();
        lab_sal_tipo = new javax.swing.JLabel();
        btn_sal_cadastrar = new javax.swing.JButton();
        btn_sal_cancelar = new javax.swing.JButton();
        rad_sal_evento = new javax.swing.JRadioButton();
        rad_sal_cafe = new javax.swing.JRadioButton();
        lab_sal_nome = new javax.swing.JLabel();
        lab_sal_lotacao = new javax.swing.JLabel();
        txt_sal_nome = new javax.swing.JTextField();
        txt_sal_lotacao = new javax.swing.JTextField();
        btn_sal_novo = new javax.swing.JButton();
        btn_sal_editar = new javax.swing.JButton();
        btn_sal_excluir = new javax.swing.JButton();
        aba_participantes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_part = new javax.swing.JTable();
        btn_part_novo = new javax.swing.JButton();
        btn_part_editar = new javax.swing.JButton();
        btn_part_excluir = new javax.swing.JButton();
        painel_cadastro_participantes = new javax.swing.JPanel();
        lab_part_sobrenome = new javax.swing.JLabel();
        btn_part_cadastrar = new javax.swing.JButton();
        btn_part_cancelar = new javax.swing.JButton();
        lab_part_nome = new javax.swing.JLabel();
        txt_part_nome = new javax.swing.JTextField();
        txt_part_sobrenome = new javax.swing.JTextField();
        aba_consulta = new javax.swing.JPanel();
        aba_sub_consulta = new javax.swing.JTabbedPane();
        aba_consulta_salas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_salproc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_sal_part = new javax.swing.JTable();
        aba_consulta_participantes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_partproc = new javax.swing.JTable();
        con_btn_gerareventos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Go_DEV_");

        tbl_sal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nome", "Tipo", "Lotação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sal.getTableHeader().setReorderingAllowed(false);
        tbl_sal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_salMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sal);
        if (tbl_sal.getColumnModel().getColumnCount() > 0) {
            tbl_sal.getColumnModel().getColumn(0).setResizable(false);
            tbl_sal.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_sal.getColumnModel().getColumn(1).setResizable(false);
            tbl_sal.getColumnModel().getColumn(2).setResizable(false);
            tbl_sal.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbl_sal.getColumnModel().getColumn(3).setResizable(false);
            tbl_sal.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        painel_cadastro_salas.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        lab_sal_tipo.setText("Tipo");

        btn_sal_cadastrar.setText("Cadastrar");
        btn_sal_cadastrar.setEnabled(false);
        btn_sal_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sal_cadastrarActionPerformed(evt);
            }
        });

        btn_sal_cancelar.setText("Cancelar");
        btn_sal_cancelar.setEnabled(false);
        btn_sal_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sal_cancelarActionPerformed(evt);
            }
        });

        grupo_sal_tipo.add(rad_sal_evento);
        rad_sal_evento.setSelected(true);
        rad_sal_evento.setText("Evento");
        rad_sal_evento.setEnabled(false);

        grupo_sal_tipo.add(rad_sal_cafe);
        rad_sal_cafe.setText("Café");
        rad_sal_cafe.setEnabled(false);

        lab_sal_nome.setText("Nome");

        lab_sal_lotacao.setText("Lotação");

        txt_sal_nome.setEnabled(false);

        txt_sal_lotacao.setEnabled(false);

        javax.swing.GroupLayout painel_cadastro_salasLayout = new javax.swing.GroupLayout(painel_cadastro_salas);
        painel_cadastro_salas.setLayout(painel_cadastro_salasLayout);
        painel_cadastro_salasLayout.setHorizontalGroup(
            painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastro_salasLayout.createSequentialGroup()
                .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_cadastro_salasLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lab_sal_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_sal_cafe)
                            .addComponent(rad_sal_evento)))
                    .addGroup(painel_cadastro_salasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_sal_cadastrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_cadastro_salasLayout.createSequentialGroup()
                        .addComponent(lab_sal_lotacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sal_lotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_sal_cancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(painel_cadastro_salasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lab_sal_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sal_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        painel_cadastro_salasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_sal_cadastrar, btn_sal_cancelar});

        painel_cadastro_salasLayout.setVerticalGroup(
            painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastro_salasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_sal_nome)
                    .addComponent(txt_sal_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_cadastro_salasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_sal_lotacao)
                            .addComponent(txt_sal_lotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_cadastro_salasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab_sal_tipo)
                            .addComponent(rad_sal_evento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rad_sal_cafe)
                        .addGap(17, 17, 17)
                        .addGroup(painel_cadastro_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sal_cadastrar)
                            .addComponent(btn_sal_cancelar))))
                .addContainerGap())
        );

        btn_sal_novo.setText("Novo");
        btn_sal_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sal_novoActionPerformed(evt);
            }
        });

        btn_sal_editar.setText("Editar");
        btn_sal_editar.setEnabled(false);
        btn_sal_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sal_editarActionPerformed(evt);
            }
        });

        btn_sal_excluir.setText("Excluir");
        btn_sal_excluir.setEnabled(false);
        btn_sal_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sal_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aba_salasLayout = new javax.swing.GroupLayout(aba_salas);
        aba_salas.setLayout(aba_salasLayout);
        aba_salasLayout.setHorizontalGroup(
            aba_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_cadastro_salas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aba_salasLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btn_sal_novo)
                .addGap(100, 100, 100)
                .addComponent(btn_sal_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btn_sal_excluir)
                .addGap(65, 65, 65))
        );

        aba_salasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_sal_editar, btn_sal_excluir, btn_sal_novo});

        aba_salasLayout.setVerticalGroup(
            aba_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_salasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(aba_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sal_novo)
                    .addComponent(btn_sal_editar)
                    .addComponent(btn_sal_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_cadastro_salas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painel_abas.addTab("Salas", aba_salas);

        tbl_part.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nome", "Sobrenome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_part.getTableHeader().setReorderingAllowed(false);
        tbl_part.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_partMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_part);
        if (tbl_part.getColumnModel().getColumnCount() > 0) {
            tbl_part.getColumnModel().getColumn(0).setResizable(false);
            tbl_part.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_part.getColumnModel().getColumn(1).setResizable(false);
            tbl_part.getColumnModel().getColumn(2).setResizable(false);
            tbl_part.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        btn_part_novo.setText("Novo");
        btn_part_novo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_part_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_part_novoActionPerformed(evt);
            }
        });

        btn_part_editar.setText("Editar");
        btn_part_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_part_editar.setEnabled(false);
        btn_part_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_part_editarActionPerformed(evt);
            }
        });

        btn_part_excluir.setText("Excluir");
        btn_part_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_part_excluir.setEnabled(false);
        btn_part_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_part_excluirActionPerformed(evt);
            }
        });

        painel_cadastro_participantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        lab_part_sobrenome.setText("Sobrenome");

        btn_part_cadastrar.setText("Cadastrar");
        btn_part_cadastrar.setEnabled(false);
        btn_part_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_part_cadastrarActionPerformed(evt);
            }
        });

        btn_part_cancelar.setText("Cancelar");
        btn_part_cancelar.setEnabled(false);
        btn_part_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_part_cancelarActionPerformed(evt);
            }
        });

        lab_part_nome.setText("Nome");

        txt_part_nome.setEnabled(false);

        txt_part_sobrenome.setEnabled(false);

        javax.swing.GroupLayout painel_cadastro_participantesLayout = new javax.swing.GroupLayout(painel_cadastro_participantes);
        painel_cadastro_participantes.setLayout(painel_cadastro_participantesLayout);
        painel_cadastro_participantesLayout.setHorizontalGroup(
            painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastro_participantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_cadastro_participantesLayout.createSequentialGroup()
                        .addComponent(btn_part_cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_part_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_cadastro_participantesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lab_part_nome)
                            .addComponent(lab_part_sobrenome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_part_sobrenome)
                            .addComponent(txt_part_nome))))
                .addContainerGap())
        );

        painel_cadastro_participantesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_part_cadastrar, btn_part_cancelar});

        painel_cadastro_participantesLayout.setVerticalGroup(
            painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastro_participantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_part_nome)
                    .addComponent(txt_part_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_part_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_part_sobrenome))
                .addGap(26, 26, 26)
                .addGroup(painel_cadastro_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_part_cadastrar)
                    .addComponent(btn_part_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout aba_participantesLayout = new javax.swing.GroupLayout(aba_participantes);
        aba_participantes.setLayout(aba_participantesLayout);
        aba_participantesLayout.setHorizontalGroup(
            aba_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_participantesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btn_part_novo)
                .addGap(100, 100, 100)
                .addComponent(btn_part_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btn_part_excluir)
                .addGap(65, 65, 65))
            .addComponent(painel_cadastro_participantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );

        aba_participantesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_part_editar, btn_part_excluir, btn_part_novo});

        aba_participantesLayout.setVerticalGroup(
            aba_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_participantesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(aba_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_part_novo)
                    .addComponent(btn_part_editar)
                    .addComponent(btn_part_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_cadastro_participantes, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painel_abas.addTab("Participantes", aba_participantes);

        tbl_salproc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sala", "Tipo", "Alocação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_salproc.getTableHeader().setReorderingAllowed(false);
        tbl_salproc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_salprocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_salproc);
        if (tbl_salproc.getColumnModel().getColumnCount() > 0) {
            tbl_salproc.getColumnModel().getColumn(0).setResizable(false);
            tbl_salproc.getColumnModel().getColumn(1).setResizable(false);
            tbl_salproc.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Sala"));

        tbl_sal_part.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sal_part.getTableHeader().setReorderingAllowed(false);
        tbl_sal_part.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sal_partMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_sal_part);
        if (tbl_sal_part.getColumnModel().getColumnCount() > 0) {
            tbl_sal_part.getColumnModel().getColumn(0).setResizable(false);
            tbl_sal_part.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_sal_part.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout aba_consulta_salasLayout = new javax.swing.GroupLayout(aba_consulta_salas);
        aba_consulta_salas.setLayout(aba_consulta_salasLayout);
        aba_consulta_salasLayout.setHorizontalGroup(
            aba_consulta_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        aba_consulta_salasLayout.setVerticalGroup(
            aba_consulta_salasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_consulta_salasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aba_sub_consulta.addTab("Salas", aba_consulta_salas);

        tbl_partproc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Etapa 1", "Intervalo 1", "Etapa 2", "Intervalo 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_partproc.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_partproc);
        if (tbl_partproc.getColumnModel().getColumnCount() > 0) {
            tbl_partproc.getColumnModel().getColumn(0).setResizable(false);
            tbl_partproc.getColumnModel().getColumn(1).setResizable(false);
            tbl_partproc.getColumnModel().getColumn(2).setResizable(false);
            tbl_partproc.getColumnModel().getColumn(3).setResizable(false);
            tbl_partproc.getColumnModel().getColumn(4).setResizable(false);
            tbl_partproc.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout aba_consulta_participantesLayout = new javax.swing.GroupLayout(aba_consulta_participantes);
        aba_consulta_participantes.setLayout(aba_consulta_participantesLayout);
        aba_consulta_participantesLayout.setHorizontalGroup(
            aba_consulta_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        aba_consulta_participantesLayout.setVerticalGroup(
            aba_consulta_participantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        aba_sub_consulta.addTab("Participantes", aba_consulta_participantes);

        con_btn_gerareventos.setText("Gerar Eventos");
        con_btn_gerareventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_btn_gerareventosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aba_consultaLayout = new javax.swing.GroupLayout(aba_consulta);
        aba_consulta.setLayout(aba_consultaLayout);
        aba_consultaLayout.setHorizontalGroup(
            aba_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aba_sub_consulta)
            .addGroup(aba_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(con_btn_gerareventos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aba_consultaLayout.setVerticalGroup(
            aba_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_consultaLayout.createSequentialGroup()
                .addComponent(aba_sub_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(con_btn_gerareventos))
        );

        painel_abas.addTab("Consulta", aba_consulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_abas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_abas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sal_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sal_editarActionPerformed
        status = 2;
                
        tbl_sal.setEnabled(false);
        
        txt_sal_nome.setEnabled(true);
        txt_sal_lotacao.setEnabled(true);
        
        btn_sal_cadastrar.setEnabled(true);
        btn_sal_cancelar.setEnabled(true);
        btn_sal_editar.setEnabled(false);
        btn_sal_excluir.setEnabled(false);
        btn_sal_novo.setEnabled(false);
    
        
        
    }//GEN-LAST:event_btn_sal_editarActionPerformed

    private void btn_part_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_part_editarActionPerformed
        status = 4;
        
        txt_part_nome.setEnabled(true);
        txt_part_sobrenome.setEnabled(true);
        
        tbl_part.setEnabled(false);
        
        btn_part_cadastrar.setEnabled(true);
        btn_part_cancelar.setEnabled(true);
        btn_part_editar.setEnabled(false);
        btn_part_excluir.setEnabled(false);
        btn_part_novo.setEnabled(false);
    }//GEN-LAST:event_btn_part_editarActionPerformed

    private void btn_part_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_part_novoActionPerformed
        
            status = 3;
        
            txt_part_nome.setEnabled(true);
            txt_part_nome.setText("");
            txt_part_sobrenome.setEnabled(true);
            txt_part_sobrenome.setText("");
        
            tbl_part.setEnabled(false);
            
            btn_part_cadastrar.setEnabled(true);
            btn_part_cancelar.setEnabled(true);
            btn_part_editar.setEnabled(false);
            btn_part_excluir.setEnabled(false);
            btn_part_novo.setEnabled(false);
     
    }//GEN-LAST:event_btn_part_novoActionPerformed

    private void btn_sal_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sal_novoActionPerformed
        status = 1;
        
        tbl_sal.setEnabled(false);
        
        txt_sal_nome.setText("");
        txt_sal_nome.setEnabled(true);
        txt_sal_lotacao.setText("");
        txt_sal_lotacao.setEnabled(true);
        
        btn_sal_cadastrar.setEnabled(true);
        btn_sal_cancelar.setEnabled(true);
        btn_sal_editar.setEnabled(false);
        btn_sal_excluir.setEnabled(false);
        btn_sal_novo.setEnabled(false);
        
        if(lista_salas.size()<2){
            rad_sal_cafe.setSelected(true);
        }
        else
        {
            rad_sal_evento.setSelected(true);        
        }    
            
        
        
    }//GEN-LAST:event_btn_sal_novoActionPerformed

    private void btn_sal_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sal_cancelarActionPerformed
        txt_sal_nome.setText("");
        txt_sal_nome.setEnabled(false);
        txt_sal_lotacao.setText("");
        txt_sal_lotacao.setEnabled(false);
        
        btn_sal_cadastrar.setEnabled(false);
        btn_sal_cancelar.setEnabled(false);
        btn_sal_excluir.setEnabled(false);
        btn_sal_editar.setEnabled(false);
        btn_sal_novo.setEnabled(true);
    
        tbl_sal.setEnabled(true);
    }//GEN-LAST:event_btn_sal_cancelarActionPerformed

    private void btn_part_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_part_cadastrarActionPerformed
        
        String Campo_nome = txt_part_nome.getText();
        String Campo_sobrenome = txt_part_sobrenome.getText();
        
        if(!Campo_nome.isEmpty() && !Campo_sobrenome.isEmpty()){
            
            if (status == 3){
                Participantes P = new Participantes(txt_part_nome.getText(), txt_part_sobrenome.getText(), lista_partc.size()+1);
                lista_partc.add(P);
            }
            
            else if (status == 4){
                
                int indice = tbl_part.getSelectedRow();
                lista_partc.get(indice).setNome(txt_part_nome.getText());
                lista_partc.get(indice).setSobrenome(txt_part_sobrenome.getText());
            }
        }
        else{
            
            JOptionPane.showMessageDialog(this, "Campo de informação vazio");
            
        }
        
        
        LoadTablePartc();
        
        txt_part_nome.setEnabled(false);
        txt_part_nome.setText("");
        txt_part_sobrenome.setEnabled(false);
        txt_part_sobrenome.setText("");
        
        tbl_part.setEnabled(false);
        
        btn_part_cadastrar.setEnabled(false);
        btn_part_cancelar.setEnabled(false);
        btn_part_excluir.setEnabled(false);
        btn_part_editar.setEnabled(false);
        btn_part_novo.setEnabled(true);
    }//GEN-LAST:event_btn_part_cadastrarActionPerformed

    private void btn_sal_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sal_cadastrarActionPerformed
        
        String Campo_lotacao = txt_sal_lotacao.getText();
        String Campo_nome = txt_sal_nome.getText();
        
        if(!Campo_lotacao.isEmpty() && !Campo_nome.isEmpty()){
            
            String tipo = "";
            
            if(rad_sal_cafe.isSelected()){
            tipo = "Café";
            }
            else if(rad_sal_evento.isSelected()){
            tipo = "Evento";
            }
            
            if (status == 1){
                                            
                try{
                    int lotacao = Integer.parseInt(txt_sal_lotacao.getText());
                    Salas S = new Salas(lista_salas.size()+1,txt_sal_nome.getText(),tipo,lotacao);
                    lista_salas.add(S);
                    
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Informe somente números inteiros na lotação");
                }
                
            }
            else if (status == 2){
                
                try{
                    int lotacao = Integer.parseInt(txt_sal_lotacao.getText());
                    int indice = tbl_sal.getSelectedRow();
                    lista_salas.get(indice).setNome(txt_sal_nome.getText());
                    lista_salas.get(indice).setLotacao(lotacao);
                    lista_salas.get(indice).setTipo(tipo);
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Informe somente números inteiros na lotação");
                }
                
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Campo de informação vazio");
        }
        btn_sal_editar.setEnabled(false);
        btn_sal_cadastrar.setEnabled(false);
        btn_sal_cancelar.setEnabled(false);
        btn_sal_excluir.setEnabled(false);
        btn_sal_novo.setEnabled(true);
        
        tbl_sal.setEnabled(true);
        
        txt_sal_nome.setText("");
        txt_sal_nome.setEnabled(false);
        txt_sal_lotacao.setText("");
        txt_sal_lotacao.setEnabled(false);
        
        /*rad_sal_cafe.setEnabled(false);
        rad_sal_evento.setEnabled(false);*/
        LoadTableSalas();
    }//GEN-LAST:event_btn_sal_cadastrarActionPerformed

    private void btn_part_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_part_cancelarActionPerformed
        txt_part_nome.setEnabled(false);
        txt_part_nome.setText("");
        txt_part_sobrenome.setEnabled(false);
        txt_part_sobrenome.setText("");
        
        tbl_part.setEnabled(true);
        
        btn_part_cadastrar.setEnabled(false);
        btn_part_cancelar.setEnabled(false);
        btn_part_editar.setEnabled(false);
        btn_part_excluir.setEnabled(false);
        btn_part_novo.setEnabled(true);
        
    }//GEN-LAST:event_btn_part_cancelarActionPerformed

    private void tbl_salMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_salMouseClicked
        if (tbl_sal.isEnabled()){
            
            int indice = tbl_sal.getSelectedRow();
            if(indice>=0 && indice<lista_salas.size()){
                Salas S = lista_salas.get(indice);
                txt_sal_nome.setText(S.getNome());
                txt_sal_lotacao.setText(String.valueOf(S.getLotacao()));
                String tipo = S.getTipo();
                if(tipo.equals("Café")){
                    rad_sal_cafe.setSelected(true);
                }
                else if(tipo.equals("Evento")){
                    rad_sal_evento.setSelected(true);
                }
            
                btn_sal_editar.setEnabled(true);
                btn_sal_excluir.setEnabled(true);
            
            }
        }
    }//GEN-LAST:event_tbl_salMouseClicked

    private void btn_sal_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sal_excluirActionPerformed
        int indice = tbl_sal.getSelectedRow();
                    
        if  (!lista_salas.get(indice).getTipo().equals("Café")){
                
            lista_salas.remove(indice);
            for (int i = indice;i<lista_salas.size();i++){
                lista_salas.get(i).setNumero(i+1);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Não é possível a exclusão das salas de café, use a opção editar.");
        }
        
        btn_sal_editar.setEnabled(false);
        btn_sal_cadastrar.setEnabled(false);
        btn_sal_cancelar.setEnabled(false);
        btn_sal_excluir.setEnabled(false);
        
        txt_sal_nome.setText("");
        txt_sal_nome.setEnabled(false);
        txt_sal_lotacao.setText("");
        txt_sal_lotacao.setEnabled(false);
       
        LoadTableSalas();
            
    }//GEN-LAST:event_btn_sal_excluirActionPerformed

    private void btn_part_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_part_excluirActionPerformed
        int indice = tbl_part.getSelectedRow();
        lista_partc.remove(indice);
        for (int i = indice;i<lista_partc.size();i++){
                lista_partc.get(i).setNumero(i+1);
            }
        
        txt_part_nome.setEnabled(false);
        txt_part_nome.setText("");
        txt_part_sobrenome.setEnabled(false);
        txt_part_sobrenome.setText("");
        
        btn_part_cadastrar.setEnabled(false);
        btn_part_cancelar.setEnabled(false);
        btn_part_editar.setEnabled(false);
        btn_part_excluir.setEnabled(false);
        
        LoadTablePartc();
        
    }//GEN-LAST:event_btn_part_excluirActionPerformed

    private void tbl_partMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_partMouseClicked
        if (tbl_part.isEnabled()){
            int indice = tbl_part.getSelectedRow();
            if(indice>=0 && indice<lista_partc.size()){
                Participantes P = lista_partc.get(indice);
                txt_part_nome.setText(P.getNome());
                txt_part_sobrenome.setText(String.valueOf(P.getSobrenome()));
            
                btn_part_editar.setEnabled(true);
                btn_part_excluir.setEnabled(true);
            
            }
        }
    }//GEN-LAST:event_tbl_partMouseClicked

    private void con_btn_gerareventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_btn_gerareventosActionPerformed
        int lotacao_maxima_cafe;
        int lotacao_maxima_cafe_total = 0;
        int lotacao_maxima_sala;
        int lotacao_maxima_sala_total = 0;
        int sala_menor = lista_salas.get(0).getLotacao();
        lista_salasproc.removeAll(lista_salasproc);
        lista_partcproc.removeAll(lista_partcproc);
        LoadTableSalasPc();
        LoadTablePartcPc();
        
        String Etapa1;
        String Etapa2;
        String Intervalo1;
        String Intervalo2;
        
        for (int i = 0;i<2;i++){
            if (lista_salas.get(i).getLotacao() < sala_menor){
                sala_menor = lista_salas.get(i).getLotacao();
                
            }                  
        }
        for (int i = 0;i<2;i++){
            if (lista_salas.get(i).getLotacao() > sala_menor){
                lotacao_maxima_cafe = sala_menor + 1;
                Salas_processadas Sp = new Salas_processadas("","",lotacao_maxima_cafe);
                lista_salasproc.add(Sp);
            }
            else{
                lotacao_maxima_cafe = lista_salas.get(i).getLotacao();
                Salas_processadas Sp = new Salas_processadas("","",lotacao_maxima_cafe);
                lista_salasproc.add(Sp);
            }                
            
            lotacao_maxima_cafe_total = lotacao_maxima_cafe + lotacao_maxima_cafe_total;
            lista_salasproc.get(i).setNome(lista_salas.get(i).getNome());
            lista_salasproc.get(i).setTipo(lista_salas.get(i).getTipo());            
        }
              
        sala_menor = lista_salas.get(2).getLotacao();
        
        for (int i = 2;i<lista_salas.size();i++){
            if (lista_salas.get(i).getLotacao() < sala_menor){
                sala_menor = lista_salas.get(i).getLotacao();
            }                  
        }
        for (int i = 2;i<lista_salas.size();i++){
            if (lista_salas.get(i).getLotacao() > sala_menor){
                lotacao_maxima_sala = sala_menor + 1;
                Salas_processadas Sp = new Salas_processadas("","",lotacao_maxima_sala);
                lista_salasproc.add(Sp);
            }
            else{
                lotacao_maxima_sala = lista_salas.get(i).getLotacao();
                Salas_processadas Sp = new Salas_processadas("","",lotacao_maxima_sala);
                lista_salasproc.add(Sp);
            }                
            
            lotacao_maxima_sala_total = lotacao_maxima_sala + lotacao_maxima_sala_total;
            lista_salasproc.get(i).setNome(lista_salas.get(i).getNome());
            lista_salasproc.get(i).setTipo(lista_salas.get(i).getTipo());
            
        }
        
        LoadTableSalasPc();     
                
        if (lista_salas.size() < 4){
            JOptionPane.showMessageDialog(this, "O evento não possui a quantidade mínima de salas cadastradas");
        }
        else if (lista_partc.size() > lotacao_maxima_cafe_total){
            JOptionPane.showMessageDialog(this, "O evento excedeu a capacidade máxima das salas de café");
        }
        
        else if (lista_partc.size() > lotacao_maxima_sala_total){            
            JOptionPane.showMessageDialog(this, "O evento excedeu a capacidade máxima das salas de evento");
        }
        
        else{
            
            int contador1 = 2;
            int contador2 = 2;
            int contador3 = 0;
            int contador4 = 0;
            int metade = lista_partc.size()/2;
            
                     
            for (int i=0; i<metade; i++){
                if(contador1 == lista_salas.size()){
                    contador1 = 2;
                }
                if(contador2 == lista_salas.size()){
                    contador2 = 2;
                }
                if(contador3 > 1){
                    contador3 = 0;
                }
                if(contador4 > 1){
                    contador4 = 0;
                }
                Etapa1 = lista_salas.get(contador1).getNome();
                Intervalo1 = lista_salas.get(contador3).getNome();
                Etapa2 = lista_salas.get(contador2).getNome();
                Intervalo2 = lista_salas.get(contador4).getNome();
                Salas_participantes Ps = new Salas_participantes(Etapa1, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Etapa 1");
                lista_part_sala.add(Ps);
                Ps = new Salas_participantes(Etapa2, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Etapa 2");
                lista_part_sala.add(Ps);
                Ps = new Salas_participantes(Intervalo1, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Intervalo 1");
                lista_part_sala.add(Ps);
                Ps = new Salas_participantes(Intervalo2, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Intervalo 2");
                lista_part_sala.add(Ps);
                Participantes_processados Pc = new Participantes_processados(lista_partc.get(i).getNome(),lista_partc.get(i).getSobrenome(),Etapa1,Intervalo1,Etapa2,Intervalo2);
                lista_partcproc.add(Pc);
                
                contador1++;
                contador2++;
                contador3++;
                contador4++;
                
            }
            
            contador1 = 2;
            contador2 = 3;
            contador3 = 0;
            contador4 = 1;
            for (int i=metade; i<lista_partc.size(); i++){
                if(contador1 == lista_salas.size()){
                    contador1 = 2;
                }
                if(contador2 == lista_salas.size()){
                    contador2 = 2;
                }
                if(contador3 > 1){
                    contador3 = 0;
                }
                if(contador4 > 1){
                    contador4 = 0;
                }
                
                Etapa1 = lista_salas.get(contador1).getNome();
                Intervalo1 = lista_salas.get(contador3).getNome();
                Etapa2 = lista_salas.get(contador2).getNome();
                Intervalo2 = lista_salas.get(contador4).getNome();
                Salas_participantes Ps = new Salas_participantes(Etapa1, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Etapa 1");
                lista_part_sala.add(Ps);
                Ps = new Salas_participantes(Etapa2, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Etapa 2");
                lista_part_sala.add(Ps); 
                Ps = new Salas_participantes(Intervalo1, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Intervalo 1");
                lista_part_sala.add(Ps);
                Ps = new Salas_participantes(Intervalo2, lista_partc.get(i).getNome(), lista_partc.get(i).getSobrenome(), "Intervalo 2");
                lista_part_sala.add(Ps);
                Participantes_processados Pc = new Participantes_processados(lista_partc.get(i).getNome(),lista_partc.get(i).getSobrenome(),Etapa1,Intervalo1,Etapa2,Intervalo2);
                lista_partcproc.add(Pc);
                
                contador1++;
                contador2++;
                contador3++;
                contador4++;
                
            }
            
            
            
            
            
            
            LoadTablePartcPc();            
        }
        
    }//GEN-LAST:event_con_btn_gerareventosActionPerformed

    private void tbl_sal_partMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sal_partMouseClicked
        
    }//GEN-LAST:event_tbl_sal_partMouseClicked

    private void tbl_salprocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_salprocMouseClicked
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","Sobrenome","Evento"},0);
        int indice = tbl_salproc.getSelectedRow();
        if(indice>=0 && indice<lista_salasproc.size()){
            
            for (int i=0;i<lista_part_sala.size();i++){
                if (lista_part_sala.get(i).getSala().equals(lista_salasproc.get(indice).getNome())){
                    Object linha[] = new Object[]{lista_part_sala.get(i).getNome(),
                                                  lista_part_sala.get(i).getSobrenome(),
                                                  lista_part_sala.get(i).getEvento()};
                    modelo.addRow(linha);                                
                }
            }
            tbl_sal_part.setModel(modelo);
        }
    }//GEN-LAST:event_tbl_salprocMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aba_consulta;
    private javax.swing.JPanel aba_consulta_participantes;
    private javax.swing.JPanel aba_consulta_salas;
    private javax.swing.JPanel aba_participantes;
    private javax.swing.JPanel aba_salas;
    private javax.swing.JTabbedPane aba_sub_consulta;
    private javax.swing.JButton btn_part_cadastrar;
    private javax.swing.JButton btn_part_cancelar;
    private javax.swing.JButton btn_part_editar;
    private javax.swing.JButton btn_part_excluir;
    private javax.swing.JButton btn_part_novo;
    private javax.swing.JButton btn_sal_cadastrar;
    private javax.swing.JButton btn_sal_cancelar;
    private javax.swing.JButton btn_sal_editar;
    private javax.swing.JButton btn_sal_excluir;
    private javax.swing.JButton btn_sal_novo;
    private javax.swing.JButton con_btn_gerareventos;
    private javax.swing.ButtonGroup grupo_sal_tipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lab_part_nome;
    private javax.swing.JLabel lab_part_sobrenome;
    private javax.swing.JLabel lab_sal_lotacao;
    private javax.swing.JLabel lab_sal_nome;
    private javax.swing.JLabel lab_sal_tipo;
    private javax.swing.JTabbedPane painel_abas;
    private javax.swing.JPanel painel_cadastro_participantes;
    private javax.swing.JPanel painel_cadastro_salas;
    private javax.swing.JRadioButton rad_sal_cafe;
    private javax.swing.JRadioButton rad_sal_evento;
    private javax.swing.JTable tbl_part;
    private javax.swing.JTable tbl_partproc;
    private javax.swing.JTable tbl_sal;
    private javax.swing.JTable tbl_sal_part;
    private javax.swing.JTable tbl_salproc;
    private javax.swing.JTextField txt_part_nome;
    private javax.swing.JTextField txt_part_sobrenome;
    private javax.swing.JTextField txt_sal_lotacao;
    private javax.swing.JTextField txt_sal_nome;
    // End of variables declaration//GEN-END:variables

}
