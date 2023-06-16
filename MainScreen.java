import javax.swing.*;
public class MainScreen {
private JButton CUSTOMERButton;
private JButton ADMINButton;
private JPanel auctionPanel;
JFrame auctionF = new JFrame();
public MainScreen(){
auctionF.setContentPane(auctionPanel);
auctionF.pack();
auctionF.setVisible(true);
CUSTOMERButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
new Customer();
}
});
ADMINButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
new Admin();
}
});
}
}