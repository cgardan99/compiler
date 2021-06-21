
namespace CompisIDE
{
    partial class IDE
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(IDE));
            this.lista_archivos = new System.Windows.Forms.ListBox();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.archivoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.guardarToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.abrirFolderToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ediciónToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.deshacerToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.rehacerToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.cortarToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.copiarToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.pegarToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.compilarToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ayudaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.lateralTabControl = new System.Windows.Forms.TabControl();
            this.semanticoTabPage = new System.Windows.Forms.TabPage();
            this.codigoTabPage = new System.Windows.Forms.TabPage();
            this.lexicoTabPage = new System.Windows.Forms.TabPage();
            this.lexicoTextBox = new System.Windows.Forms.RichTextBox();
            this.sintacticoTabPage = new System.Windows.Forms.TabPage();
            this.inferiorTabControl = new System.Windows.Forms.TabControl();
            this.errorTabPage = new System.Windows.Forms.TabPage();
            this.erroresTextBox = new System.Windows.Forms.RichTextBox();
            this.resultsTabPage = new System.Windows.Forms.TabPage();
            this.resultadosTextBox = new System.Windows.Forms.RichTextBox();
            this.iniciarButton = new System.Windows.Forms.Button();
            this.main_editor = new ICSharpCode.TextEditor.TextEditorControl();
            this.richTextBox1 = new System.Windows.Forms.RichTextBox();
            this.menuStrip1.SuspendLayout();
            this.lateralTabControl.SuspendLayout();
            this.lexicoTabPage.SuspendLayout();
            this.sintacticoTabPage.SuspendLayout();
            this.inferiorTabControl.SuspendLayout();
            this.errorTabPage.SuspendLayout();
            this.resultsTabPage.SuspendLayout();
            this.SuspendLayout();
            // 
            // lista_archivos
            // 
            this.lista_archivos.AccessibleName = "";
            this.lista_archivos.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F);
            this.lista_archivos.FormattingEnabled = true;
            this.lista_archivos.ItemHeight = 15;
            this.lista_archivos.Location = new System.Drawing.Point(9, 37);
            this.lista_archivos.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.lista_archivos.Name = "lista_archivos";
            this.lista_archivos.Size = new System.Drawing.Size(176, 619);
            this.lista_archivos.TabIndex = 0;
            this.lista_archivos.SelectedValueChanged += new System.EventHandler(this.lista_archivos_SelectedValueChanged);
            // 
            // menuStrip1
            // 
            this.menuStrip1.Font = new System.Drawing.Font("Segoe UI Symbol", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.archivoToolStripMenuItem,
            this.ediciónToolStripMenuItem,
            this.compilarToolStripMenuItem,
            this.ayudaToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Padding = new System.Windows.Forms.Padding(4, 2, 0, 2);
            this.menuStrip1.Size = new System.Drawing.Size(1155, 24);
            this.menuStrip1.TabIndex = 3;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // archivoToolStripMenuItem
            // 
            this.archivoToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.guardarToolStripMenuItem,
            this.abrirFolderToolStripMenuItem});
            this.archivoToolStripMenuItem.Name = "archivoToolStripMenuItem";
            this.archivoToolStripMenuItem.Size = new System.Drawing.Size(60, 20);
            this.archivoToolStripMenuItem.Text = "Archivo";
            // 
            // guardarToolStripMenuItem
            // 
            this.guardarToolStripMenuItem.Name = "guardarToolStripMenuItem";
            this.guardarToolStripMenuItem.Size = new System.Drawing.Size(136, 22);
            this.guardarToolStripMenuItem.Text = "Guardar";
            this.guardarToolStripMenuItem.Click += new System.EventHandler(this.guardarToolStripMenuItem_Click);
            // 
            // abrirFolderToolStripMenuItem
            // 
            this.abrirFolderToolStripMenuItem.Name = "abrirFolderToolStripMenuItem";
            this.abrirFolderToolStripMenuItem.Size = new System.Drawing.Size(136, 22);
            this.abrirFolderToolStripMenuItem.Text = "Abrir Folder";
            this.abrirFolderToolStripMenuItem.Click += new System.EventHandler(this.abrirFolderToolStripMenuItem_Click);
            // 
            // ediciónToolStripMenuItem
            // 
            this.ediciónToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.deshacerToolStripMenuItem,
            this.rehacerToolStripMenuItem,
            this.toolStripSeparator1,
            this.cortarToolStripMenuItem,
            this.copiarToolStripMenuItem,
            this.pegarToolStripMenuItem});
            this.ediciónToolStripMenuItem.Name = "ediciónToolStripMenuItem";
            this.ediciónToolStripMenuItem.Size = new System.Drawing.Size(58, 20);
            this.ediciónToolStripMenuItem.Text = "Edición";
            this.ediciónToolStripMenuItem.Click += new System.EventHandler(this.ediciónToolStripMenuItem_Click);
            this.ediciónToolStripMenuItem.MouseEnter += new System.EventHandler(this.ediciónToolStripMenuItem_MouseEnter);
            // 
            // deshacerToolStripMenuItem
            // 
            this.deshacerToolStripMenuItem.Name = "deshacerToolStripMenuItem";
            this.deshacerToolStripMenuItem.ShortcutKeyDisplayString = "Ctrl + Z";
            this.deshacerToolStripMenuItem.Size = new System.Drawing.Size(169, 22);
            this.deshacerToolStripMenuItem.Text = "Deshacer";
            this.deshacerToolStripMenuItem.Click += new System.EventHandler(this.deshacerToolStripMenuItem_Click);
            // 
            // rehacerToolStripMenuItem
            // 
            this.rehacerToolStripMenuItem.Name = "rehacerToolStripMenuItem";
            this.rehacerToolStripMenuItem.ShortcutKeyDisplayString = "Ctrl + Y";
            this.rehacerToolStripMenuItem.Size = new System.Drawing.Size(169, 22);
            this.rehacerToolStripMenuItem.Text = "Rehacer";
            this.rehacerToolStripMenuItem.Click += new System.EventHandler(this.rehacerToolStripMenuItem_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(166, 6);
            // 
            // cortarToolStripMenuItem
            // 
            this.cortarToolStripMenuItem.Enabled = false;
            this.cortarToolStripMenuItem.Name = "cortarToolStripMenuItem";
            this.cortarToolStripMenuItem.ShortcutKeyDisplayString = "Ctrl + X";
            this.cortarToolStripMenuItem.Size = new System.Drawing.Size(169, 22);
            this.cortarToolStripMenuItem.Text = "Cortar";
            this.cortarToolStripMenuItem.Click += new System.EventHandler(this.cortarToolStripMenuItem_Click);
            // 
            // copiarToolStripMenuItem
            // 
            this.copiarToolStripMenuItem.Enabled = false;
            this.copiarToolStripMenuItem.Name = "copiarToolStripMenuItem";
            this.copiarToolStripMenuItem.ShortcutKeyDisplayString = "Ctrl + C";
            this.copiarToolStripMenuItem.Size = new System.Drawing.Size(169, 22);
            this.copiarToolStripMenuItem.Text = "Copiar";
            this.copiarToolStripMenuItem.Click += new System.EventHandler(this.copiarToolStripMenuItem_Click);
            // 
            // pegarToolStripMenuItem
            // 
            this.pegarToolStripMenuItem.Enabled = false;
            this.pegarToolStripMenuItem.Name = "pegarToolStripMenuItem";
            this.pegarToolStripMenuItem.ShortcutKeyDisplayString = "Ctrl + V";
            this.pegarToolStripMenuItem.Size = new System.Drawing.Size(169, 22);
            this.pegarToolStripMenuItem.Text = "Pegar";
            this.pegarToolStripMenuItem.Click += new System.EventHandler(this.pegarToolStripMenuItem_Click);
            // 
            // compilarToolStripMenuItem
            // 
            this.compilarToolStripMenuItem.Name = "compilarToolStripMenuItem";
            this.compilarToolStripMenuItem.Size = new System.Drawing.Size(68, 20);
            this.compilarToolStripMenuItem.Text = "Compilar";
            // 
            // ayudaToolStripMenuItem
            // 
            this.ayudaToolStripMenuItem.Name = "ayudaToolStripMenuItem";
            this.ayudaToolStripMenuItem.Size = new System.Drawing.Size(53, 20);
            this.ayudaToolStripMenuItem.Text = "Ayuda";
            // 
            // lateralTabControl
            // 
            this.lateralTabControl.Controls.Add(this.semanticoTabPage);
            this.lateralTabControl.Controls.Add(this.codigoTabPage);
            this.lateralTabControl.Controls.Add(this.lexicoTabPage);
            this.lateralTabControl.Controls.Add(this.sintacticoTabPage);
            this.lateralTabControl.Location = new System.Drawing.Point(909, 58);
            this.lateralTabControl.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.lateralTabControl.Name = "lateralTabControl";
            this.lateralTabControl.SelectedIndex = 0;
            this.lateralTabControl.Size = new System.Drawing.Size(237, 612);
            this.lateralTabControl.TabIndex = 4;
            // 
            // semanticoTabPage
            // 
            this.semanticoTabPage.Location = new System.Drawing.Point(4, 22);
            this.semanticoTabPage.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.semanticoTabPage.Name = "semanticoTabPage";
            this.semanticoTabPage.Padding = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.semanticoTabPage.Size = new System.Drawing.Size(229, 586);
            this.semanticoTabPage.TabIndex = 0;
            this.semanticoTabPage.Text = "Semántico";
            this.semanticoTabPage.UseVisualStyleBackColor = true;
            // 
            // codigoTabPage
            // 
            this.codigoTabPage.Location = new System.Drawing.Point(4, 22);
            this.codigoTabPage.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.codigoTabPage.Name = "codigoTabPage";
            this.codigoTabPage.Padding = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.codigoTabPage.Size = new System.Drawing.Size(229, 586);
            this.codigoTabPage.TabIndex = 1;
            this.codigoTabPage.Text = "Código Intermedio";
            this.codigoTabPage.UseVisualStyleBackColor = true;
            // 
            // lexicoTabPage
            // 
            this.lexicoTabPage.Controls.Add(this.lexicoTextBox);
            this.lexicoTabPage.Location = new System.Drawing.Point(4, 22);
            this.lexicoTabPage.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.lexicoTabPage.Name = "lexicoTabPage";
            this.lexicoTabPage.Size = new System.Drawing.Size(229, 586);
            this.lexicoTabPage.TabIndex = 2;
            this.lexicoTabPage.Text = "Léxico";
            this.lexicoTabPage.UseVisualStyleBackColor = true;
            // 
            // lexicoTextBox
            // 
            this.lexicoTextBox.Location = new System.Drawing.Point(2, 2);
            this.lexicoTextBox.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.lexicoTextBox.Name = "lexicoTextBox";
            this.lexicoTextBox.ReadOnly = true;
            this.lexicoTextBox.Size = new System.Drawing.Size(228, 584);
            this.lexicoTextBox.TabIndex = 2;
            this.lexicoTextBox.Text = "";
            // 
            // sintacticoTabPage
            // 
            this.sintacticoTabPage.Controls.Add(this.richTextBox1);
            this.sintacticoTabPage.Location = new System.Drawing.Point(4, 22);
            this.sintacticoTabPage.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.sintacticoTabPage.Name = "sintacticoTabPage";
            this.sintacticoTabPage.Size = new System.Drawing.Size(229, 586);
            this.sintacticoTabPage.TabIndex = 3;
            this.sintacticoTabPage.Text = "Sintáctico";
            this.sintacticoTabPage.UseVisualStyleBackColor = true;
            // 
            // inferiorTabControl
            // 
            this.inferiorTabControl.Controls.Add(this.errorTabPage);
            this.inferiorTabControl.Controls.Add(this.resultsTabPage);
            this.inferiorTabControl.Location = new System.Drawing.Point(189, 561);
            this.inferiorTabControl.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.inferiorTabControl.Name = "inferiorTabControl";
            this.inferiorTabControl.SelectedIndex = 0;
            this.inferiorTabControl.Size = new System.Drawing.Size(718, 109);
            this.inferiorTabControl.TabIndex = 5;
            // 
            // errorTabPage
            // 
            this.errorTabPage.Controls.Add(this.erroresTextBox);
            this.errorTabPage.Location = new System.Drawing.Point(4, 22);
            this.errorTabPage.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.errorTabPage.Name = "errorTabPage";
            this.errorTabPage.Padding = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.errorTabPage.Size = new System.Drawing.Size(710, 83);
            this.errorTabPage.TabIndex = 0;
            this.errorTabPage.Text = "Errores";
            this.errorTabPage.UseVisualStyleBackColor = true;
            // 
            // erroresTextBox
            // 
            this.erroresTextBox.Location = new System.Drawing.Point(4, 5);
            this.erroresTextBox.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.erroresTextBox.Name = "erroresTextBox";
            this.erroresTextBox.ReadOnly = true;
            this.erroresTextBox.Size = new System.Drawing.Size(704, 76);
            this.erroresTextBox.TabIndex = 0;
            this.erroresTextBox.Text = "";
            // 
            // resultsTabPage
            // 
            this.resultsTabPage.Controls.Add(this.resultadosTextBox);
            this.resultsTabPage.Location = new System.Drawing.Point(4, 22);
            this.resultsTabPage.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.resultsTabPage.Name = "resultsTabPage";
            this.resultsTabPage.Padding = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.resultsTabPage.Size = new System.Drawing.Size(710, 83);
            this.resultsTabPage.TabIndex = 1;
            this.resultsTabPage.Text = "Resultados";
            this.resultsTabPage.UseVisualStyleBackColor = true;
            // 
            // resultadosTextBox
            // 
            this.resultadosTextBox.Location = new System.Drawing.Point(4, 5);
            this.resultadosTextBox.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.resultadosTextBox.Name = "resultadosTextBox";
            this.resultadosTextBox.ReadOnly = true;
            this.resultadosTextBox.Size = new System.Drawing.Size(704, 76);
            this.resultadosTextBox.TabIndex = 1;
            this.resultadosTextBox.Text = "";
            // 
            // iniciarButton
            // 
            this.iniciarButton.Image = ((System.Drawing.Image)(resources.GetObject("iniciarButton.Image")));
            this.iniciarButton.Location = new System.Drawing.Point(192, 37);
            this.iniciarButton.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.iniciarButton.Name = "iniciarButton";
            this.iniciarButton.Size = new System.Drawing.Size(28, 27);
            this.iniciarButton.TabIndex = 6;
            this.iniciarButton.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.iniciarButton.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.iniciarButton.UseVisualStyleBackColor = true;
            this.iniciarButton.Click += new System.EventHandler(this.iniciarButton_Click);
            // 
            // main_editor
            // 
            this.main_editor.Highlighting = null;
            this.main_editor.Location = new System.Drawing.Point(189, 78);
            this.main_editor.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.main_editor.Name = "main_editor";
            this.main_editor.Size = new System.Drawing.Size(718, 479);
            this.main_editor.TabIndex = 2;
            // 
            // richTextBox1
            // 
            this.richTextBox1.Location = new System.Drawing.Point(3, 3);
            this.richTextBox1.Name = "richTextBox1";
            this.richTextBox1.ReadOnly = true;
            this.richTextBox1.Size = new System.Drawing.Size(227, 474);
            this.richTextBox1.TabIndex = 0;
            this.richTextBox1.Text = "";
            // 
            // IDE
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1155, 687);
            this.Controls.Add(this.iniciarButton);
            this.Controls.Add(this.inferiorTabControl);
            this.Controls.Add(this.lateralTabControl);
            this.Controls.Add(this.main_editor);
            this.Controls.Add(this.lista_archivos);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.Name = "IDE";
            this.Text = "IDE";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.lateralTabControl.ResumeLayout(false);
            this.lexicoTabPage.ResumeLayout(false);
            this.sintacticoTabPage.ResumeLayout(false);
            this.inferiorTabControl.ResumeLayout(false);
            this.errorTabPage.ResumeLayout(false);
            this.resultsTabPage.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox lista_archivos;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem archivoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem guardarToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ediciónToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem cortarToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem compilarToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem ayudaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem copiarToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem pegarToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem deshacerToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem rehacerToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.TabControl lateralTabControl;
        private System.Windows.Forms.TabPage semanticoTabPage;
        private System.Windows.Forms.TabPage codigoTabPage;
        private System.Windows.Forms.TabPage lexicoTabPage;
        private System.Windows.Forms.TabPage sintacticoTabPage;
        private System.Windows.Forms.TabControl inferiorTabControl;
        private System.Windows.Forms.TabPage errorTabPage;
        private System.Windows.Forms.TabPage resultsTabPage;
        private System.Windows.Forms.Button iniciarButton;
        private System.Windows.Forms.RichTextBox erroresTextBox;
        private System.Windows.Forms.RichTextBox lexicoTextBox;
        private ICSharpCode.TextEditor.TextEditorControl main_editor;
        private System.Windows.Forms.RichTextBox resultadosTextBox;
        private System.Windows.Forms.ToolStripMenuItem abrirFolderToolStripMenuItem;
        private System.Windows.Forms.RichTextBox richTextBox1;
    }
}

