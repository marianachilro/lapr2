/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author miniondevil
 */
public class MyFileChooser extends JFileChooser {

    public MyFileChooser() {
        super();
        definirFiltroExtensaoXml();
       
    }

    private void definirFiltroExtensaoXml() {
        setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String extensao = extensao(f);
                if (extensao != null) {
                    return extensao.equals("xml");
                }
                return false;
            }

            @Override
            public String getDescription() {
                return "*.xml";
            }

            private String extensao(File f) {
                String ext = null;
                String s = f.getName();
                int i = s.lastIndexOf(".");
                if (i != -1) {
                    ext = s.substring(i + 1).toLowerCase();
                }
                return ext;
            }
        });
    }


    public static void personalizarEmPortugues() {

        // Títulos das Caixas de Diálogo
        UIManager.put("FileChooser.openDialogTitleText", "Importar dados");
        UIManager.put("FileChooser.saveDialogTitleText", "Exportar dados");

        // Botão "Importar"
        UIManager.put("FileChooser.openButtonText", "Importar");
        UIManager.put("FileChooser.openButtonToolTipText", "Importar dados");

        // Botão "Exportar"
        UIManager.put("FileChooser.saveButtonText", "Exportar");
        UIManager.put("FileChooser.saveButtonToolTipText", "Exportar dados");

        // Botão "Cancelar"
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Cancelar");

        // Legenda "Procurar em:"
        UIManager.put("FileChooser.lookInLabelText", "Procurar em:");

        // Legenda "Guardar em:"
        UIManager.put("FileChooser.saveInLabelText", "Guardar em:");

        // Legenda "Tipo de ficheiros:"
        UIManager.put("FileChooser.filesOfTypeLabelText", "Ficheiros do tipo:");

        // Legenda "Nome do ficheiro:"
        UIManager.put("FileChooser.fileNameLabelText", "Nome do ficheiro:");

        // Filtro "Todos os Ficheiros"
        UIManager.put("FileChooser.acceptAllFileFilterText", "Todos os Ficheiros");

        // Botão "Um nível acima"
        UIManager.put("FileChooser.upFolderToolTipText", "Um nível acima");

        // Botão "Nova Pasta"
        UIManager.put("FileChooser.newFolderToolTipText", "Criar nova pasta");

        // Botão "Vista Lista"
        UIManager.put("FileChooser.listViewButtonToolTipText", "Lista");

        // Botão "Vista Detalhada"
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalhes");

    }

}
