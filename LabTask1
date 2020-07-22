public class Tables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}
		JTable table;
		public table() {
			setlayout(new FlowLayout());
			String[] colums = {"data type","size in bits","size in bytes","range"};
			Object[][] data = {
					{"byte"," "," ","from to"},
					{"short"," "," ","from to"},
					{"int"," "," ","from to"},
					{"long"," "," ","from to"},
					{"float"," "," ","from to"},
					{"double"," "," ","from to"},
					{"char"," "," ","from to"},
					{"boolean","*","*","has and"}
			};
			table = new JTable(data,colums);
			table.setPreferredScrollableViewportSize(new Dimension(500,50));
			table.setFillsViewportHeight(true);
			
			JScrollPane scrollPane = new JScrollPane(table);
			add(scrollPane);
		}
		
		public static void main(String args[]) {
			table gui = new table();
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(600,200);
			gui.setVisible(true);
			gui.setTitle("DATA TYPES");
		}
}
