import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class main {

	protected static final Object Method = null;
	public static void main(String[] args) {
	
	
main();
	}
	public static void main() {
		String Currency[]= {"IQD to USD","USD to IQD"};
		 JFrame f = new JFrame("CONVERTER");
		 
	        JPanel P1=new JPanel();
	        P1.setLayout(null);
	    
	        f.add(P1);
	        JComboBox comboDigi=new JComboBox(Currency);
		       
	        comboDigi.setBounds(100, 10, 200, 25);
	        JLabel l1 =new JLabel("From-To");
	        l1.setBounds(50,10,200,25);
	        P1.add(l1);
	        P1.add(comboDigi);
	        JLabel l2 =new JLabel("The Price Of Today of 1$");
	        l2.setBounds(0,50,200,25);
	        P1.add(l2);
	        JTextArea ta1=new JTextArea();
	        ta1.setBounds(150,50,200,25);
	        P1.add(ta1);
	        
	        JLabel l3 =new JLabel("Value");
	        l3.setBounds(0,100,200,25);
	        P1.add(l3);
	        
	        JLabel l4 =new JLabel("TYPE");
	        l4.setBounds(10,220,200,25);
	        P1.add(l4);
	        JTextArea ta2=new JTextArea();
	        ta2.setBounds(150,100,200,25);
	        P1.add(ta2);
	        
	        JButton Conv=new JButton("CONVERT");
	        Conv.setBounds(150,150,150,45);
	        P1.add(Conv);
	        final String[] columns = {
		            "Convert Type", "From", "To"
		        };
	        DefaultTableModel model = new DefaultTableModel(columns,0);
	        JTable table = new JTable(model);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	        JPanel Tpanel=new JPanel();
	        Tpanel.setBounds(20, 250, 400, 210);
	       
	        Tpanel.add(scrollPane);
	      
	        P1.add(Tpanel);
	        
	        P1.add(l4);
	      
	    	
			comboDigi.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 int index = comboDigi.getSelectedIndex();
	            	   String Method = comboDigi.getSelectedItem().toString();
					
			
			switch(index)
        	{
        	case 1:
        		l4.setText("USD TO IQD");
            	break;
        	case 2:
        		l4.setText("IQD TO USD");
        		break;
        	
        	default:
        		l4.setText("IQD TO USD");
        		break;
        		
            	
        	}	}
				
				
			});
			
			Conv.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					double total;
					double value1= Double.parseDouble(ta1.getText());
					double value2= Double.parseDouble(ta2.getText());
					if(comboDigi.getSelectedItem().toString() == "IQD to USD") {
						total=  (value2 / value1);
						model.addRow(
                				new Object[]{
                						comboDigi.getSelectedItem().toString(), 
                                       ta2.getText(),
                                        total
                                  });
						
					}else if(comboDigi.getSelectedItem().toString() == "USD to IQD") {
						double total1;
						double value11= Double.parseDouble(ta1.getText());
						double value21= Double.parseDouble(ta2.getText());
						total1=  (value21 * value11);
						
						model.addRow(
                				new Object[]{
                						comboDigi.getSelectedItem().toString(), 
                                       ta2.getText(),
                                        total1
                                  });
					}
					
				}
				
			});
	        
	        f.setSize(500,500);
			 f.setVisible(true);
	}

}
