package kantan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ExcelProcessorGUI extends JFrame {
    private static final long serialVersionUID = 1L;
	private JTextField pathTextField;
    private JButton searchButton;
    private JComboBox<String> excelFileComboBox;
    private JTextArea resultTextArea;
    private JButton executeButton;
    
    public ExcelProcessorGUI() {
        initializeComponents();
        setupLayout();
        setupEventHandlers();
        
        setTitle("Excel Processor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }
    
    private void initializeComponents() {
        // パス入力フィールド
        pathTextField = new JTextField(25);
        
        // サーチボタン
        searchButton = new JButton("サーチ");
        
        // エクセルファイル選択コンボボックス
        excelFileComboBox = new JComboBox<>();
        excelFileComboBox.addItem("ディレクトリを検索してください");
        
        // 実行結果表示エリア
        resultTextArea = new JTextArea(15, 40);
        resultTextArea.setEditable(false);
        resultTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        
        // 実行ボタン
        executeButton = new JButton("実行");
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout());
        
        // 上部パネル（入力フィールド）
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // パス入力行
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        inputPanel.add(new JLabel("パス:"), gbc);
        
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        inputPanel.add(pathTextField, gbc);
        
        gbc.gridx = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        inputPanel.add(searchButton, gbc);
        
        // エクセルファイル選択行
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        inputPanel.add(new JLabel("エクセルファイル:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        inputPanel.add(excelFileComboBox, gbc);
        
        add(inputPanel, BorderLayout.NORTH);
        
        // 中央パネル（結果表示エリア）
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("実行結果"));
        resultPanel.add(new JScrollPane(resultTextArea), BorderLayout.CENTER);
        add(resultPanel, BorderLayout.CENTER);
        
        // 下部パネル（実行ボタン）
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(executeButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    private void setupEventHandlers() {
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeProcess();
            }
        });
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchExcelFiles();
            }
        });
    }
    
    // サーチ処理（ディレクトリからエクセルファイルを検索）
    private void searchExcelFiles() {
        String path = pathTextField.getText().trim();
        
        if (path.isEmpty()) {
            appendResult("パスが入力されていません");
            return;
        }
        
        File directory = new File(path);
        
        if (!directory.exists()) {
            appendResult("指定されたパスが存在しません: " + path);
            return;
        }
        
        if (!directory.isDirectory()) {
            appendResult("指定されたパスはディレクトリではありません: " + path);
            return;
        }
        
        // コンボボックスのアイテムをクリア
        excelFileComboBox.removeAllItems();
        
        // ディレクトリ内のエクセルファイルを検索
        File[] files = directory.listFiles();
        int excelFileCount = 0;
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && isExcelFile(file.getName())) {
                    excelFileComboBox.addItem(file.getName());
                    excelFileCount++;
                }
            }
        }
        
        if (excelFileCount == 0) {
            excelFileComboBox.addItem("エクセルファイルが見つかりません");
            appendResult("ディレクトリにエクセルファイルが見つかりませんでした");
        } else {
            appendResult(excelFileCount + "個のエクセルファイルが見つかりました");
        }
    }
    
    // エクセルファイルかどうかを判定
    private boolean isExcelFile(String fileName) {
        String lowerName = fileName.toLowerCase();
        return lowerName.endsWith(".xlsx") || lowerName.endsWith(".xls");
    }
    
    // 実行処理（空のメソッド）
    private void executeProcess() {
        String path = pathTextField.getText();
        String selectedFile = (String) excelFileComboBox.getSelectedItem();
        
        // ここに実際の処理を記述
        resultTextArea.append("実行開始...\n");
        resultTextArea.append("パス: " + path + "\n");
        resultTextArea.append("選択ファイル: " + selectedFile + "\n");
        resultTextArea.append("処理完了\n");
        resultTextArea.append("------------------------\n");
        
        // 自動スクロール
        resultTextArea.setCaretPosition(resultTextArea.getDocument().getLength());
    }
    
    // パス取得メソッド
    public String getPath() {
        return pathTextField.getText();
    }
    
    // 選択されたエクセルファイル取得メソッド
    public String getSelectedExcelFile() {
        return (String) excelFileComboBox.getSelectedItem();
    }
    
    // 結果表示メソッド
    public void appendResult(String message) {
        resultTextArea.append(message + "\n");
        resultTextArea.setCaretPosition(resultTextArea.getDocument().getLength());
    }
    
    // 結果クリアメソッド
    public void clearResult() {
        resultTextArea.setText("");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                try {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeel());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                
                new ExcelProcessorGUI().setVisible(true);
            }
        });
    }
}