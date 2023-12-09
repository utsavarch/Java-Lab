import javax.swing.*;

class Menu1example {
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    Menu1example() {
        JFrame f = new JFrame("Menu and MenuItem Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");

        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");

        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");

        // Adding icons to menu items
        ImageIcon icon1 = new ImageIcon("D:/Downloads/Lab - 4 - Files/Lab - 4 - Files/icon.png");

        i1.setIcon(icon1);
        i2.setIcon(icon1);
        i3.setIcon(icon1);
        i4.setIcon(icon1);
        i5.setIcon(icon1);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Menu1example();
    }
}
