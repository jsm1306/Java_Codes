import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awtapp extends Frame {

    awtapp() {
        Label firstName = new Label("First Name");
        firstName.setBounds(20, 50, 80, 20);

        Label lastName = new Label("Last Name");
        lastName.setBounds(20, 80, 80, 20);

        Label dob = new Label("Date of Birth");
        dob.setBounds(20, 110, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);

        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 160, 100, 30);

        Button reset = new Button("Reset");
        reset.setBounds(120, 160, 100, 30);

        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(sbmt);
        add(reset);

        // Add action listener to Submit button
        sbmt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve data from text fields
                String firstName = firstNameTF.getText();
                String lastName = lastNameTF.getText();
                String dob = dobTF.getText();

                // Display the data
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Date of Birth: " + dob);

                // Alternatively, show data in a dialog box
                Dialog dialog = new Dialog(awtapp.this, "Data Submitted", true);
                dialog.setLayout(new FlowLayout());
                dialog.setSize(250, 150);
                dialog.add(new Label("First Name: " + firstName));
                dialog.add(new Label("Last Name: " + lastName));
                dialog.add(new Label("DOB: " + dob));
                Button close = new Button("Close");
                close.addActionListener(event -> dialog.setVisible(false));
                dialog.add(close);
                dialog.setVisible(true);
            }
        });

        // Add action listener to Reset button
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNameTF.setText("");
                lastNameTF.setText("");
                dobTF.setText("");
            }
        });

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        awtapp awt = new awtapp();
    }
}
