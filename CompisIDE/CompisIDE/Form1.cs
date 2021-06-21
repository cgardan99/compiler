using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Windows;
using ICSharpCode.TextEditor;
using ICSharpCode.TextEditor.Document;
using System.Diagnostics;
using System.Collections.ObjectModel;
using System.Management.Automation;
using System.Management.Automation.Runspaces;




namespace CompisIDE
{
    public partial class IDE : Form
    {
        public TextEditorControl textEditor = new TextEditorControl();
        string currentDir = "C:\\Users\\cgardan\\Downloads\\";
        string[] files = new DirectoryInfo("C:\\Users\\cgardan\\Downloads\\").GetFiles("*.ty").Select(o => o.Name).ToArray();
        string current_file = null;
        BindingList<String> archivos = new BindingList<string>();
        
        
        public IDE()
        {
            InitializeComponent();
            foreach (string i in files)
            {
                archivos.Add(i);
            }
            lista_archivos.DataSource = archivos;
            var synDir = Application.StartupPath + "\\Resources";
            // check if directory exists to prevent throwing an exception
            if (Directory.Exists(synDir))
            {
                // create new provider with the highlighting directory
                var fsmProvider = new FileSyntaxModeProvider(synDir);
                // attach to the text editor
                HighlightingManager.Manager.AddSyntaxModeFileProvider(fsmProvider);
                // activate the highlighting, use the name from the SyntaxDefinition node in the .xshd file
                main_editor.SetHighlighting("C#");
            }
            else { MessageBox.Show("\u0027" + synDir + "\u0027" + " doesn't exist"); }
        }


        private void lista_archivos_SelectedValueChanged(object sender, EventArgs e)
        {
            main_editor.Clear();

            try
            {
                if(lista_archivos.SelectedValue != null) { 
                string archivo = lista_archivos.SelectedItem.ToString();
                current_file = archivo;
                string t = System.IO.File.ReadAllText(currentDir + "\\" + archivo);
                main_editor.Text = t;
                }
            }
            catch(NullReferenceException error)
            {}
            
            
        }


       
        private void guardarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string texto = main_editor.Text;
            if (current_file != null)
            {
                FileStream fParameter = new FileStream(currentDir + "\\" + current_file, FileMode.Create, FileAccess.Write);
                StreamWriter m_WriterParameter = new StreamWriter(fParameter);
                m_WriterParameter.BaseStream.Seek(0, SeekOrigin.End);
                m_WriterParameter.Write(texto);
                m_WriterParameter.Flush();
                m_WriterParameter.Close();
            }
        }

        private void ediciónToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cortarToolStripMenuItem.Enabled = main_editor.ActiveTextAreaControl.SelectionManager.SelectedText.Length > 0 ? true : false;
            copiarToolStripMenuItem.Enabled = main_editor.ActiveTextAreaControl.SelectionManager.SelectedText.Length > 0 ? true : false;
            pegarToolStripMenuItem.Enabled = Clipboard.GetDataObject().GetDataPresent(DataFormats.Text);
        }

        private void deshacerToolStripMenuItem_Click(object sender, EventArgs e)
        {
            main_editor.Undo();
        }

        private void rehacerToolStripMenuItem_Click(object sender, EventArgs e)
        {
            main_editor.Redo();
            //main_editor.
        }

        private void ediciónToolStripMenuItem_MouseEnter(object sender, EventArgs e)
        {
            ediciónToolStripMenuItem_Click(sender, e);
        }

        private void cortarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string clip;
            //MessageBox.Show(main_editor.ActiveTextAreaControl.SelectionManager.SelectedText.Clone().ToString());
            clip = main_editor.ActiveTextAreaControl.SelectionManager.SelectedText.Clone().ToString();
            main_editor.ActiveTextAreaControl.SelectionManager.RemoveSelectedText();
            Clipboard.SetText(clip);
            
        }

        private void copiarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string clip;
            //MessageBox.Show(main_editor.ActiveTextAreaControl.SelectionManager.SelectedText.Clone().ToString());
            clip = main_editor.ActiveTextAreaControl.SelectionManager.SelectedText.Clone().ToString();
  
            Clipboard.SetText(clip);
        }

        private void pegarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            main_editor.ActiveTextAreaControl.TextArea.ClipboardHandler.Paste(sender, e);
        }

        private void iniciarButton_Click(object sender, EventArgs e)
        {
            lexicoTextBox.Text = "";
            guardarToolStripMenuItem_Click(sender, e);
            saveExeccutionDocument();
            ejecutarLexico();
            ejecutarSintactico();
        }

        private void saveExeccutionDocument()
        {
            string texto = main_editor.Text;
            var lexDir = Application.StartupPath + "\\document.ty";
            FileStream fParameter = new FileStream(lexDir, FileMode.Create, FileAccess.Write);
            StreamWriter m_WriterParameter = new StreamWriter(fParameter);
            m_WriterParameter.BaseStream.Seek(0, SeekOrigin.End);
            m_WriterParameter.Write(texto);
            m_WriterParameter.Flush();
            m_WriterParameter.Close();
        }

        private void ejecutarLexico()
        {
            var lexDir = Application.StartupPath;
            ProcessStartInfo psi = new ProcessStartInfo();
            psi.UseShellExecute = false;
            psi.Arguments = "-jar -XX:+UseConcMarkSweepGC -Xmx1024M -Xms1024M START.jar";
            psi.CreateNoWindow = true;
            psi.WindowStyle = ProcessWindowStyle.Hidden;
            psi.FileName = lexDir + "\\script.bat";
            //MessageBox.Show(psi.FileName); 
            try
            {
                var proceso = Process.Start(psi);
                proceso.WaitForExit();
            }
            catch (Exception e)
            {
                Console.WriteLine("The process failed: {0}", e.ToString());
            }
            moverDocumento();
        }

        private void ejecutarSintactico()
        {
            var lexDir = Application.StartupPath;
            string path = lexDir + "\\document.ty";
            string path2 = lexDir + "\\Resources\\ANTLR\\document.ty";
            string path3 = lexDir + "\\Resources\\ANTLR";

            try
            {
                File.Delete(path2);
                File.Move(path, path2);
            }
            catch (Exception e)
            {
                Console.WriteLine("The process failed: {0}", e.ToString());
            }

            ProcessStartInfo psi = new ProcessStartInfo();
            psi.UseShellExecute = false;
            psi.Arguments = ".\\Resources\\ANTLR\\document.ty " + path3;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;
            psi.WindowStyle = ProcessWindowStyle.Hidden;
            psi.FileName = lexDir + "\\Resources\\ANTLR\\cmd.bat";
            // MessageBox.Show(psi.FileName); 
            try
            {
                var proceso = Process.Start(psi);
                string outprocess = "";
                while (!proceso.StandardOutput.EndOfStream)
                {
                    string line = proceso.StandardOutput.ReadLine();
                    outprocess += (line + "\n");
                }

                resultadosTextBox.Text = outprocess;
                string stderrx = proceso.StandardError.ReadToEnd();
                erroresTextBox.Text = stderrx;
                proceso.WaitForExit();
            }
            catch (Exception e)
            {
                Console.WriteLine("El proceso falló: {0}", e.ToString());
            }
            moverDocumentoSynt();
        }

        private void moverDocumentoSynt()
        {
            var lexDir = Application.StartupPath;
            string path = lexDir + "\\Resources\\ANTLR\\salida.txt";

            string t = System.IO.File.ReadAllText(path);
            richTextBox1.Text = t;
            lateralTabControl.SelectTab(3);
            try
            {
                File.Delete(path);
            }
            catch (Exception e)
            {
                Console.WriteLine("The process failed: {0}", e.ToString());
            }
            //resultsTabPage.Text = t;
            //inferiorTabControl.

        }

        private void moverDocumento()
        {
            var lexDir = Application.StartupPath;
            string path = lexDir + "\\salida.txt";
            string path2 = lexDir + "\\Resources\\lexico\\salida.txt";

            try
            {
                if (File.Exists(path2))
                    File.Delete(path2);
                File.Move(path, path2);
                File.Delete(path);
            }
            catch (Exception e)
            {
                Console.WriteLine("The process failed: {0}", e.ToString());
            }

            string t = System.IO.File.ReadAllText(lexDir + "\\Resources\\lexico\\salida.txt");
            lexicoTextBox.Text = t;
            lateralTabControl.SelectTab(2);
            //resultsTabPage.Text = t;
            //inferiorTabControl.

        }

        private void abrirFolderToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FolderBrowserDialog fdb = new FolderBrowserDialog();
            fdb.Description = "Selecciona un folder";
            if(fdb.ShowDialog() == System.Windows.Forms.DialogResult.OK)
            {
                currentDir = fdb.SelectedPath;
                borrarArchivos();
                
                //currentDir = "C:\\Users\\px100\\Downloads\\";
                files = new DirectoryInfo(currentDir).GetFiles("*.ty").Select(o => o.Name).ToArray();


                foreach (string i in files)
                {
                    //MessageBox.Show( archivos.ToArray());
                    //MessageBox.Show(i);
                    archivos.Add(i);
                    
                }
                
                //lista_archivos.Items.Clear();
                lista_archivos.DataSource = archivos;
                lista_archivos.Update();
            }
        }

        public async Task borrarArchivos()
        {
            Task<int> longRunningTask = LongRunningOperationAsync();
            // independent work which doesn't need the result of LongRunningOperationAsync can be done here
            archivos.Clear();
            //and now we call await on the task 
            int result = await longRunningTask;
            //use the result 
            Console.WriteLine(result);
        }

        public async Task<int> LongRunningOperationAsync() // assume we return an int from this long running operation 
        {
            await Task.Delay(1000); // 1 second delay
            return 1;
        }

    }
}
