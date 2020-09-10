package swingFinalTogether;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Jpanel extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2989783291282589394L;
	private JButton button;
	private JButton startGame;
	private JLabel label;

	private int rows;
	private int cols;

	private String path = "";

	static JTextField nameUser;
	static JTextField rowField;
	static JTextField colsField;

	JLabel nameFields = new JLabel();
	JLabel rowsFields = new JLabel();
	JLabel columnFields = new JLabel();

	public Jpanel() {
		super("Set Picture Into A JLabel using");
		button = new JButton("Search");
		button.setBounds(300, 300, 100, 40);
		startGame = new JButton("Start Game");
		startGame.setBounds(550, 395, 100, 40);
		label = new JLabel();
		label.setBounds(10, 10, 670, 250);// lable

		nameFields.setText("Name player");
		nameFields.setBounds(65, 370, 150, 30);

		rowsFields.setText("Rows");
		rowsFields.setBounds(250, 370, 150, 30);

		columnFields.setText("Columns");
		columnFields.setBounds(430, 370, 150, 30);

		nameUser = new JTextField();
		nameUser.setBounds(30, 400, 150, 30);

		rowField = new JTextField();
		rowField.setBounds(380, 400, 150, 30);

		colsField = new JTextField();
		colsField.setBounds(200, 400, 150, 30);

		add(rowsFields);
		add(columnFields);
		add(nameFields);
		add(button);
		add(nameUser);
		add(rowField);
		add(colsField);
		add(startGame);
		add(label);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				file.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
				file.addChoosableFileFilter(filter);
				int result = file.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = file.getSelectedFile();
					path = selectedFile.getAbsolutePath();
					System.out.println(path);
					label.setIcon(ResizeImage(path));
				}

				else if (result == JFileChooser.CANCEL_OPTION) {
					System.out.println("No File Select");
				}
			}
		});

		startGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (path == null || path.equals("") || path.length() == 0) {
					JOptionPane.showMessageDialog(null, "Please choose image");
				} else {
					if (rowField.getText() == null || rowField.getText().equals("") || colsField.getText() == null
							|| colsField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please input data");
					} else {
						rows = Integer.parseInt(rowField.getText());
						cols = Integer.parseInt(colsField.getText());

						if (!(rows >= 1 && rows < 8) || !(cols >= 1 && cols < 8)) {

							JOptionPane.showMessageDialog(null, "Enter the correct data between 1 and 8");
						}

						Main main = new Main(path, nameUser.getText(), rows, cols);
						main.setVisible(true);

					}

				}
			}
		});

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(700, 500);
		setVisible(true);

	}

	public ImageIcon ResizeImage(String imagePath) {
		ImageIcon MyImage = new ImageIcon(imagePath);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);

		return image;
	}

	public static void main(String[] args) {
		new Jpanel();
	}
}