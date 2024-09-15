import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MySwingAddSub extends JFrame
{ JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    public void set_Componet()
    {
        l1=new JLabel(" Simple Calculator");
        l2=new JLabel("Enter 1st integer Number");
        l3=new JLabel("Enter 2nd integer Number");
        l4=new JLabel("Result = ");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        b1=new JButton(" +");
        b2=new JButton(" -");
        b3=new JButton(" *");
        b4=new JButton(" /");

        setLayout(null);
        l1.setBounds(200,50,200,30);
        l2.setBounds(50,80,200,30);
        t1.setBounds(250,80,200,30);
        l3.setBounds(50,110,200,30);
        t2.setBounds(250,110,200,30);
        b1.setBounds (250,140,100,30);
        b2.setBounds (250,170,100,30);
        b3.setBounds (250,200,100,30);
        b4.setBounds (250,230,100,30);
        l4.setBounds (150,270,200,30);
        t3.setBounds(250,270,200,30);
        b1.addActionListener( new Handler_Airthm());
        b2.addActionListener( new Handler_Airthm());
        b3.addActionListener( new Handler_Airthm());
        b4.addActionListener( new Handler_Airthm());
        add(l1); add(l2); add(l3); add(l4);
        add(t1); add(t2); add(t3);
        add(b1); add(b2);
        add(b3); add(b4);
    }
    class Handler_Airthm implements ActionListener
    { public void actionPerformed(ActionEvent ae)
    {   int a= Integer.parseInt(t1.getText());
        int b= Integer.parseInt(t2.getText());
        int temp;

        if(ae.getSource()==b1)
        {
            temp=a+b;
            t3.setText("  The sum of 2 Nos = "+temp);
        }
        if(ae.getSource()==b2)
        {
            temp=a-b;
            t3.setText("  The subtraction  of 2 Nos = "+temp);
        }
        if(ae.getSource()==b3)
        {
            temp=a*b;
            t3.setText("  The multiplication of 2 Nos = "+temp);
        }
        if(ae.getSource()==b4)
        {
            temp=a/b;
            t3.setText("  The division  of 2 Nos = "+temp);
        }
    }
    }
    public static void main(String arg[])
    { JFrame jf=new JFrame("To Add & SUB");
        MySwingAddSub ms=new MySwingAddSub();
        ms.set_Componet();
        ms.setVisible(true);
        ms.setSize(500,500);
        ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color c= new Color(0,140,245);
        ms.getContentPane().setBackground(c);
        ms.getContentPane().setForeground(c);
    }
}

