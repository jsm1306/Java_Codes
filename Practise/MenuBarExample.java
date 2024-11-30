import javax.swing.*;

public class MenuBarExample {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Menu Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the File menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners for File menu items
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New file created!"));
        exitItem.addActionListener(e -> System.exit(0));

        // Add items to the File menu
        fileMenu.add(newItem);
        fileMenu.addSeparator();  // Adds a separator between menu items
        fileMenu.add(exitItem);

        // Create the Edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add action listeners for Edit menu items
        cutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Cut action performed!"));
        copyItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Copy action performed!"));
        pasteItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Paste action performed!"));

        // Add items to the Edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}
