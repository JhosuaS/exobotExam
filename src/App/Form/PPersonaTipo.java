package App.Form;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

import App.Assets.IAStyle;
import App.CustomerControl.PatButton;
import App.CustomerControl.PatLabel;
import App.CustomerControl.PatTextBox;

public class PPersonaTipo extends JPanel{
    
    private BLFactory<DTOPersonaTipo> blFPersonaTipo = new BLFactory<>(DAOPersonaTipo :: new);
    private DTOPersonaTipo            dtoPersonaTipo = new DTOPersonaTipo();
    private Integer                   idTipoPersona = 0
                                     ,maxReg = 0;
    public PPersonaTipo() {
        initComponents();
        loadRowData();
        showRowData();
    }   

    private void loadRowData() throws Exception {
        idTipoPersona = 0;
        dtoPersonaTipo = blFPersonaTipo.getBy(idTipoPersona);
        maxReg = blFPersonaTipo.getMaxReg();
        
    }
         

    /***************************
     * FormDesign : 
     ***************************/

    private PatLabel
            lblTitulo   = new PatLabel("TIPO DE PERSONA", IAStyle.FONT_BOLD),
            lblIdTipo   = new PatLabel(" Codigo:         "),
            lblTipoPers = new PatLabel("*Tipo Persona: "),
            lblTotalReg = new PatLabel(" 0 de 0 ");
    private PatTextBox
            txtIdSexo   = new PatTextBox(),
            txtNombre   = new PatTextBox();
    private PatButton
            btnPageIni  = new PatButton(" |< "),
            btnPageAnt  = new PatButton(" << "),
            btnPageSig  = new PatButton(" >> "),
            btnPageFin  = new PatButton(" >| ");

            btnRowIni   = new PatButton(" |< "),
            btnRowAnt   = new PatButton(" << "),
            btnRowSig   = new PatButton(" >> "),
            btnRowFin   = new PatButton(" >| ");

            btnNuevo    = new PatButton(" Nuevo "),
            btnGuardar  = new PatButton(" Guardar "),
            btnCancel   = new PatButton(" Cancelar "),
            btnEliminar = new PatButton(" Eliminar "),
    private JPanel
            pnlTabla    = new JPanel(),
            pnlBtnRow   = new JPanel(new FlowLayout()),
            pnlBtnPage  = new JPanel(new FlowLayout());
            pnlBtnCRUD  = new JPanel(new FlowLayout());

    private void initComponents() {
        setLayout(new GridBagLayout());
        
        txtIdTipo.setEnabled(false);
        txtIdTipo.setBorderLine();
        txtTipo.setBoderLine();

        pnlBtnPage.add(btnPageIni);
        pnlBtnPage.add(btnPageAnt);
        pnlBtnPage.add(new PatLabel(" Page: (  "));
        pnlBtnPage.add(lblTotalReg); //cambiar
        pnlBtnPage.add(new PatLabel(" ) "));
        pnlBtnPage.add(btnPageSig);
        pnlBtnPage.add(btnPageFin);

        pnlBtnRow.add(btnRowIni);
        pnlBtnRow.add(btnRowAnt);
        pnlBtnRow.add(lblTotalReg);
        pnlBtnRow.add(btnRowSig);
        pnlBtnRow.add(btnRowFin);
        
        pnlBtnCRUD.add(btnNuevo);
        pnlBtnCRUD.add(btnGuardar);
        pnlBtnCRUD.add(btnCancel);
        pnlBtnCRUD.add(btnEliminar);
        pnlBtnCRUD.setBorder(IAStyle.createBoderRect());

        gbc.Insets = new Insets(5, 5, 5, 5);

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(New JLabel("■ Sección de datos: "), gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        add(pnlBtnPage, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.ipady = 150;
        gbc.ipadx = 450;
        pnlTabla.add(new JLabel("Loading data..."));
        add(pnlTabla, gbc);

        gbc.ipady = 1;
        gbc.ipadx = 1;

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.Insets = new Insets(50, 0, 0, 0); //Ajustar el valor superior a 50
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Box.createRigidArea(new Dimension(0, 0)), gbc);

        gbc.insets = new Insets(10, 0, 0, 0);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(new JLabel("■ Sección de registro: "), gbc);
        gbc.gridy = 4;
        gbc.gridx = 1;
        add(pnlBtnRow, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        add(lblIdTipo, gbc);
        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtIdSexo, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        add(lblTipoPers, gbc);
        gbc.gridy = 6;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtNombre, gbc);

        // gbc.gridy = 7;
        // gbc.gridx = 1;
        // gbc.gridwidth = 2;
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        // add(pnlBtnRow, gbc);

        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(30, 0, 0, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(pnlBtnCRUD, gbc);
    }
}


























        
    }

        


}
