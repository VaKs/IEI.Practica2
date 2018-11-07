/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vaks
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Main() {
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

        btnBuscar = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        LAutor = new javax.swing.JLabel();
        CBAmazon = new javax.swing.JCheckBox();
        CBFnac = new javax.swing.JCheckBox();
        TxTLibro = new javax.swing.JTextField();
        TxTAutor = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lTitulo.setText("Título del libro: ");

        LAutor.setText("Autor:");
        LAutor.setToolTipText("");

        CBAmazon.setText("Amazon");

        CBFnac.setText("Fnac");

        TxTLibro.setToolTipText("");

        TxTAutor.setToolTipText("");

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        TablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Web", "Título", "Autor", "Precio", "Descuento", "Enlace"
            }
        ));
        jScrollPane1.setViewportView(TablaResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LAutor)
                                .addGap(46, 46, 46))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnLimpiar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxTAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(CBFnac)
                        .addComponent(CBAmazon)
                        .addComponent(TxTLibro)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTitulo)
                            .addComponent(TxTLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LAutor)
                            .addComponent(TxTAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBAmazon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBFnac)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(BtnLimpiar))
                        .addGap(0, 293, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxTAutor.setText("");
        TxTLibro.setText("");
        CBAmazon.setSelected(false);
        CBFnac.setSelected(false);
        DefaultTableModel model = (DefaultTableModel) TablaResultado.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Recoger datos del formulario.
        String titulo=TxTLibro.getText();
        String autor=TxTAutor.getText(); 
        boolean amazon = CBAmazon.isSelected();
        boolean fnac = CBFnac.isSelected();
        ArrayList<Libro> libros = new ArrayList<>();
        
        //TODO: si no se ha seleccionado: titulo, autor y un sitio web mostrar error.    
        
        //Buscar resultados en Fnac si se ha pedido
        if(fnac){
            ArrayList<Libro> librosFnac = buscarFnac(titulo,autor); 
            libros.addAll(librosFnac);
        }
        //TODO: Buscar resultados en Amazon si se ha pedido
        if(amazon){
            ArrayList<Libro> librosAmazon = buscarAmazon(titulo,autor);
            libros.addAll(librosAmazon);
        }
        //Mostrar resultados en TablaResultado
        addLibrosToTabla(libros);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private ArrayList<Libro> buscarFnac(String titulo, String autor) {
        System.setProperty("webdriver.chrome.driver", ".\\webDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.fnac.es/");
        driver.manage().window().maximize();
        WebElement navBar = driver.findElement(By.id("Fnac_Search"));

        navBar.sendKeys(titulo+" "+autor);
        navBar.submit();
        
        WebElement categoriaLibro = driver.findElement(By.xpath("//*[contains(@data-category, '2!1')]"));
        categoriaLibro.click();
        
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<WebElement> listaAutores = driver.findElements(By.xpath("//div[contains(@id,'dontTouchThisDiv')]/ul/li[contains(@class, 'clearfix Article-item js-ProductList')]/div/div/div/p[contains(@class, 'Article-desc') and not(contains(@class, 'Article-descSub'))]/a[not(contains(@title, 'Ver todos los volúmenes de la serie.'))]"));
        List<WebElement> listaTitulos = driver.findElements(By.xpath("//div[contains(@id,'dontTouchThisDiv')]/ul/li[contains(@class, 'clearfix Article-item js-ProductList')]/div/div/div/p[contains(@class, 'Article-descSub')]/a[1]"));
        List<WebElement> listaPrecioFinal = driver.findElements(By.xpath("//div[contains(@id,'dontTouchThisDiv')]/ul/li[contains(@class, 'clearfix Article-item js-ProductList')]/div[contains(@class, 'Article-itemGroup')]//div[contains(@class,'floatl')]/a[contains(@class,'userPrice') or (strong[contains(@class, 'userPrice') and not(contains(@class, 'userPriceNumerical'))])]"));
        List<WebElement> listaOldPecios = driver.findElements(By.xpath("//div[contains(@id,'dontTouchThisDiv')]/ul/li[contains(@class, 'clearfix Article-item js-ProductList')]/div[contains(@class, 'Article-itemGroup')]//span[contains(@class,'oldPrice')]"));

        ArrayList<Libro> librosResultado = new ArrayList<>();
        Libro libro;
        String precioStr,descuentoStr;
        double precio,descuento;
        boolean tieneDescuento=false;
        
        for(int i=0; i<listaTitulos.size();i++){
            libro =new Libro("fnac.es");
            tieneDescuento=driver.findElements(By.xpath("//div[contains(@id,'dontTouchThisDiv')]/ul/li[contains(@class, 'clearfix Article-item js-ProductList')]["+(i+1)+"]/div[contains(@class, 'Article-itemGroup')]//span[contains(@class,'oldPrice')]")).size()>0;
            if(tieneDescuento){
                
                precioStr=listaOldPecios.get(0).getText();
                precioStr=precioStr.substring(0, precioStr.length() - 1);
                precioStr=precioStr.replace(',', '.');
                precio=Double.parseDouble(precioStr);
                
                descuentoStr=listaPrecioFinal.get(i).getText();
                descuentoStr=descuentoStr.substring(0, descuentoStr.length() - 1);
                descuentoStr=descuentoStr.replace(',', '.');
                descuento=Double.parseDouble(descuentoStr);

                listaOldPecios.remove(0);

                libro.setPrecio(precio);
                libro.setDescuento(descuento);
            } else {                
                precioStr=listaPrecioFinal.get(i).getText();
                precioStr=precioStr.substring(0, precioStr.length() - 1);
                precioStr=precioStr.replace(',', '.');
                precio=Double.parseDouble(precioStr);
                libro.setPrecio(precio);
                libro.setDescuento(0.0);// Preguntar como quiere el descuento
            
            }
            
            libro.setLink(listaAutores.get(i).getAttribute("href"));
            libro.setTitulo(listaTitulos.get(i).getText());
            libro.setAutor(listaAutores.get(i).getText());
            librosResultado.add(libro);
            
	}
        driver.quit();
        return librosResultado;
    }
    
    private ArrayList<Libro> buscarAmazon(String titulo, String autor){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void addLibrosToTabla(ArrayList<Libro> libros){
        DefaultTableModel model = (DefaultTableModel) TablaResultado.getModel();
        for (Libro libro: libros) {
            model.addRow(new Object[]{libro.getWeb(), libro.getAutor(), libro.getTitulo(), libro.getPrecio(), libro.getDescuento(), libro.getLink()});
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JCheckBox CBAmazon;
    private javax.swing.JCheckBox CBFnac;
    private javax.swing.JLabel LAutor;
    private javax.swing.JTable TablaResultado;
    private javax.swing.JTextField TxTAutor;
    private javax.swing.JTextField TxTLibro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
