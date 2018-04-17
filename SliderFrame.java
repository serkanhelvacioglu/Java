import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;


public class SliderFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderFrame frame = new SliderFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SliderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JSlider slider_blue = new JSlider();
		final JSlider slider_red = new JSlider();
		final JSlider slider_green = new JSlider();
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(21, 167, 200, 94);
		contentPane.add(panel);
		
		final JLabel lblBlue = new JLabel("");
		lblBlue.setBounds(231, 138, 46, 14);
		contentPane.add(lblBlue);
		
		final JLabel lblRed = new JLabel("");
		lblRed.setBounds(231, 35, 46, 14);
		contentPane.add(lblRed);
		
		final JLabel lblGreen = new JLabel("");
		lblGreen.setBounds(231, 87, 46, 14);
		contentPane.add(lblGreen);
		
		slider_red.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				panel.setBackground(new Color(slider_red.getValue(), 
											  slider_green.getValue(),
											  slider_blue.getValue()));
				
				lblRed.setText(slider_red.getValue()+"");
			}
		});
		
		
		slider_red.setMaximum(255);
		slider_red.setBounds(21, 35, 200, 18);
		contentPane.add(slider_red);
		
		
		slider_green.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				panel.setBackground(new Color(slider_red.getValue(), 
						  slider_green.getValue(),
						  slider_blue.getValue()));
				
				lblGreen.setText(slider_green.getValue()+"");
			}
		});
		slider_green.setMaximum(255);
		slider_green.setBounds(21, 87, 200, 18);
		contentPane.add(slider_green);
		
		
		slider_blue.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				panel.setBackground(new Color(slider_red.getValue(), 
						  slider_green.getValue(),
						  slider_blue.getValue()));
				lblBlue.setText(slider_blue.getValue()+"");
				
			}
		});
		slider_blue.setValue(10);
		slider_blue.setMaximum(255);
		slider_blue.setBounds(21, 138, 200, 18);
		contentPane.add(slider_blue);
		
		
	}
}
