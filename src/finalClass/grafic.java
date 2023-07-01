package finalClass;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class grafic implements ActionListener{
    public int raceIndex , genderIndex , animalIndex;
    int c;
    public String name, family , age , id , yearb , monthb , dayb, yeard , monthd , dayd , nameAnimal , numAnimal , idAnimal;
    boolean check;
    JTextField textname,textfamily , textage , textid , textyearb , textmonthb , textdayb, textyeard , textmonthd , textdayd ,
                textnameAnimal , textNum , textidAnimal , texttypelake , textnumlake ,textdepthlake , texttypesea , textnumsea ,textdepthsea ,
                texthektardesert ,  texthektarplain , textnummountain , textheightmountain , texthektarforest , texttypeforest ,
                texttypefruit , textnumfruit , texttypefruitless , textnumfruitless , texttypeflower , textnumflower , texttypemedical , textnummedical ,
                texttypefeedstuf , textnumfeedstuf , textsearchethnicity ;
    JCheckBox checkalive , checkdead , checkspecial;
    JFrame f1, f2, f3, f4 , f5 , f6 , f7, f8 , f9 , f10, f11 , f12 , f13;
    JButton f1b1 , f1b2 , f1b3 , f1b4 , f1b5,
            f2b1 , f2b2 , f2b3 ,
            f3b1 , f3b2 , f3b3 , f3b4 , f3b5 ,
            f4b1 , f4b2 , f4b3 , f4b4 , f4b5 ,
            f5b1 , f5b2 , f5b3 ,
            f6b1 , f6b2 , f6b3 ,
            f7b1 , f8b1 , f9b1 , f10b1 ,
            f11b1 , f11b2 , f11b3 , f11b4 ,
            f12b1 , f12b2 , f12b3 , f12b4 ,
            f13b1 , f13b2 ;
    JComboBox cbrace , cbgender, cbanimal , cbterrene , cbwater , cbland , cbplant , cbtree;

    public void menu1g ()
    {
        f1 = new JFrame("menu");
		f1.setSize(500, 500);
		f1.setLayout(null);
        f1.setVisible(true);

		f1b1=new JButton("record");
		f1.add(f1b1);
		f1b1.setBounds(100,100,100, 50);
        f1b1.addActionListener(this);

        f1b2=new JButton("edit");
		f1.add(f1b2);
		f1b2.setBounds(300,100,100, 50);
        f1b2.addActionListener(this);

        f1b3=new JButton("search");
		f1.add(f1b3);
		f1b3.setBounds(100,200,100, 50);
        f1b3.addActionListener(this);

        f1b4=new JButton("report");
		f1.add(f1b4);
		f1b4.setBounds(300,200,100, 50);
        f1b4.addActionListener(this);

        f1b5=new JButton("exit");
		f1.add(f1b5);
		f1b5.setBounds(200,300,100, 50);
        f1b5.addActionListener(this);
    }

    public void menu1_1g()
    {
        f2  = new JFrame("record");
        f2.setSize(500, 500);
		f2.setLayout(null);
        f2.setVisible(true);
		
		f2b1 = new JButton("alive creature");
        f2b1.setBounds(100,200, 130 , 50);
        f2.add(f2b1);
        f2b1.addActionListener(this);

		
		f2b2 = new JButton("natural resource");
        f2b2.setBounds(300,200, 130 , 50);
        f2.add(f2b2);
        f2b2.addActionListener(this);

        
		f2b3 = new JButton("back");
        f2b3.setBounds(200,300,100, 50);
        f2.add(f2b3);
        f2b3.addActionListener(this);
    }
    public void menu1_1_aliveg()
    {
        f5  = new JFrame("alive creature");
        f5.setSize(500, 500);
		f5.setLayout(null);
        f5.setVisible(true);
		
		f5b1 = new JButton("human resources");
        f5b1.setBounds(100,200, 130 , 50);
        f5.add(f5b1);
        f5b1.addActionListener(this);

		
		f5b2 = new JButton("animal resourses");
        f5b2.setBounds(300,200, 130 , 50);
        f5.add(f5b2);
        f5b2.addActionListener(this);

        
		f5b3 = new JButton("back");
        f5b3.setBounds(200,300,100, 50);
        f5.add(f5b3);
        f5b3.addActionListener(this);
    }

    public void menu1_1_aliveg_human()
    {
        f7 = new JFrame("human resource");
        f7.setLayout(null); 
        f7.setSize(500,500); 
        f7.setVisible(true); 
        String[] race = {"fars","arab","tork","kord","baloch","torkaman"}; 
        cbrace = new JComboBox(race); 
        cbrace.addActionListener(this);
        cbrace.setBounds(50, 50,90,20); 
        f7.add(cbrace);

        String[] gender = {"male","female"}; 
        cbgender = new JComboBox(gender); 
        cbgender.addActionListener(this);
        cbgender.setBounds(300, 50,90,20); 
        f7.add(cbgender);


        textname=new JTextField("Enter name"); 
        textname.setBounds(50,100, 200,30); 
        textfamily=new JTextField("Enter family"); 
        textfamily.setBounds(50,150, 200,30); 
        textage = new JTextField("Enter age"); 
        textage.setBounds(50,200, 200,30) ;
        textid = new JTextField("Enter id"); 
        textid.setBounds(50,200, 200,30) ;
        textyearb=new JTextField("Enter year of birth"); 
        textyearb.setBounds(50,250, 80,30); 
        textmonthb=new JTextField("Enter month of birth"); 
        textmonthb.setBounds(50,300, 80,30);
        textdayb=new JTextField("Enter day of birth"); 
        textdayb.setBounds(50,350, 80,30);
        textyeard=new JTextField("Enter year of dead"); 
        textyeard.setBounds(200,250, 80,30); 
        textmonthd=new JTextField("Enter month of dead"); 
        textmonthd.setBounds(200,300, 80,30);
        textdayd=new JTextField("Enter day of dead"); 
        textdayd.setBounds(200,350, 80,30);
        f7.add(textname); 
        f7.add(textfamily);
        f7.add(textage) ; 
        f7.add(textyearb);
        f7.add(textmonthb);
        f7.add(textdayb);
        checkalive = new JCheckBox("alive"); 
        checkalive.setBounds(300,100, 100,50);
        checkalive.addActionListener(this);
        checkdead = new JCheckBox("dead");
        checkdead.setBounds(300,150, 100,50);
        checkdead.addActionListener(this);

        f7.add(checkalive); 
        f7.add(checkdead);
        
         
        f7b1 = new JButton("done");
        f7b1.setBounds(100,400, 100 , 50);
        f7.add(f7b1);
        f7b1.addActionListener(this);

    }
    public void menu1_1_aliveg_animal()
    {
        f8 = new JFrame("animal resource");
        f8.setLayout(null); 
        f8.setSize(500,500); 
        f8.setVisible(true); 
        String[] animaltype = {"mamal","oviparous"}; 
        cbanimal = new JComboBox(animaltype); 
        cbanimal.addActionListener(this);
        cbanimal.setBounds(50, 50,90,20); 
        f8.add(cbanimal);
        textnameAnimal=new JTextField("Enter name"); 
        textnameAnimal.setBounds(50,100, 200,30); 
        textNum=new JTextField("Enter number "); 
        textNum.setBounds(50,150, 200,30); 
        textidAnimal =new JTextField("Enter id "); 
        textidAnimal.setBounds(50,200, 200,30); 
        f8.add(textnameAnimal);
        f8.add(textNum);

        checkspecial = new JCheckBox("special animal"); 
        checkspecial.setBounds(300,100, 100,50);
        checkspecial.addActionListener(this);

        f8.add(checkspecial);

        f8b1 = new JButton("done");
        f8b1.setBounds(100,300, 100 , 50);
        f8.add(f8b1);
        f8b1.addActionListener(this);

    }
    public void menu1_1_natural()
    {
        f6  = new JFrame("natural resources");
        f6.setSize(500, 500);
		f6.setLayout(null);
        f6.setVisible(true);
		
		f6b1 = new JButton("territorial resources");
        f6b1.setBounds(100,200, 130 , 50);
        f6.add(f6b1);
        f6b1.addActionListener(this);

		
		f6b2 = new JButton("plant resourses");
        f6b2.setBounds(300,200, 130 , 50);
        f6.add(f6b2);
        f6b2.addActionListener(this);

        
		f6b3 = new JButton("back");
        f6b3.setBounds(200,300,100, 50);
        f6.add(f6b3);
        f6b3.addActionListener(this);

    }
    public void menu1_1_naturalg_territorial()
    {
        f9 = new JFrame("territorial resource");
        f9.setLayout(null); 
        f9.setSize(500,500); 
        f9.setVisible(true);

        String[] terrene = {"water area","land"}; 
        cbterrene = new JComboBox(terrene); 
        cbterrene.addActionListener(this);
        cbterrene.setBounds(100, 50,90,20); 
        f9.add(cbterrene);
        String[] water = {"lake" , "sea"};
        cbwater = new JComboBox(water); 
        cbwater.addActionListener(this);
        cbwater.setBounds(200, 50,90,20);
        String[] land = {"desert" , "plain" , "mountain" , "forest" };
        cbland = new JComboBox(land); 
        cbland.addActionListener(this);
        cbland.setBounds(200, 50,90,20);

        texttypelake=new JTextField("Enter type"); 
        texttypelake.setBounds(50,100, 200,30); 
        textnumlake=new JTextField("Enter number"); 
        textnumlake.setBounds(50,150, 200,30); 
        textdepthlake = new JTextField("Enter depth"); 
        textdepthlake.setBounds(50,200, 200,30) ;

        texttypesea=new JTextField("Enter type"); 
        texttypesea.setBounds(50,100, 200,30); 
        textnumsea=new JTextField("Enter number"); 
        textnumsea.setBounds(50,150, 200,30); 
        textdepthsea = new JTextField("Enter depth"); 
        textdepthsea.setBounds(50,200, 200,30) ;

        texthektardesert=new JTextField("Enter hektar desert"); 
        texthektardesert.setBounds(50,100, 200,30); 

        texthektarplain=new JTextField("Enter hektar plain"); 
        texthektarplain.setBounds(50,100, 200,30);

        textnummountain=new JTextField("Enter number"); 
        textnummountain.setBounds(50,150, 200,30); 
        textheightmountain = new JTextField("Enter heigh"); 
        textheightmountain.setBounds(50,200, 200,30) ;

        texthektarforest=new JTextField("Enter hektar forest"); 
        texthektarforest.setBounds(50,100, 200,30); 
        texttypeforest=new JTextField("Enter type"); 
        texttypeforest.setBounds(50,100, 200,30);
        
        f9b1 = new JButton("done");
        f9b1.setBounds(100,300, 100 , 50);
        f9.add(f9b1);
        f9b1.addActionListener(this);



    }
    public void menu1_1_naturalg_plant()
    {
        f10 = new JFrame("plant resource");
        f10.setLayout(null); 
        f10.setSize(500,500); 
        f10.setVisible(true);
        
        String[] plant = {"tree","flower" , "medical" ,"feedstuf"}; 
        cbplant = new JComboBox(plant); 
        cbplant.addActionListener(this);
        cbplant.setBounds(100, 50,90,20); 
        f10.add(cbplant);
        String[] tree = {"fruit tree","fruitless tree"}; 
        cbtree = new JComboBox(tree); 
        cbtree.addActionListener(this);
        cbtree.setBounds(200, 50,90,20); 

        
        texttypefruit=new JTextField("Enter type fruit"); 
        texttypefruit.setBounds(50,100, 200,30); 
        textnumfruit=new JTextField("Enter number fruit"); 
        textnumfruit.setBounds(50,150, 200,30); 

        texttypefruitless=new JTextField("Enter type fruitless"); 
        texttypefruitless.setBounds(50,100, 200,30); 
        textnumfruitless=new JTextField("Enter number fruitless"); 
        textnumfruitless.setBounds(50,150, 200,30); 

        texttypeflower=new JTextField("Enter type flower"); 
        texttypeflower.setBounds(50,100, 200,30); 
        textnumflower=new JTextField("Enter number flower"); 
        textnumflower.setBounds(50,150, 200,30); 

        texttypemedical=new JTextField("Enter type medical"); 
        texttypemedical.setBounds(50,100, 200,30); 
        textnummedical=new JTextField("Enter number medical"); 
        textnummedical.setBounds(50,150, 200,30); 

        texttypefeedstuf=new JTextField("Enter type feedstuf"); 
        texttypefeedstuf.setBounds(50,100, 200,30); 
        textnumfeedstuf=new JTextField("Enter number feedstuf"); 
        textnumfeedstuf.setBounds(50,150, 200,30);

        f10b1 = new JButton("done");
        f10b1.setBounds(100,300, 100 , 50);
        f10.add(f10b1);
        f10b1.addActionListener(this);
        
    }
    public void menu1_2g()
    {
                  //edite
    }
    public void menu1_3g()
    {
        f3 = new JFrame("search");
		f3.setSize(500, 500);
		f3.setLayout(null);
        f3.setVisible(true);

		f3b1=new JButton("human resources");
		f3.add(f3b1);
		f3b1.setBounds(100,100,150, 50);
        f3b1.addActionListener(this);

        f3b2=new JButton("animal resources");
		f3.add(f3b2);
		f3b2.setBounds(300,100,150, 50);
        f3b2.addActionListener(this);

        f3b3=new JButton("plant resources");
		f3.add(f3b3);
		f3b3.setBounds(100,200,150, 50);
        f3b3.addActionListener(this);

        f3b4=new JButton("territorial resources");
		f3.add(f3b4);
		f3b4.setBounds(300,200,150, 50);
        f3b4.addActionListener(this);

        f3b5=new JButton("back");
		f3.add(f3b5);
		f3b5.setBounds(200,300,150, 50);
        f3b5.addActionListener(this);

    }
    public void menu1_3g_human()
    {
        f11 = new JFrame("search in human resources");
		f11.setSize(500, 500);
		f11.setLayout(null);
        f11.setVisible(true);

		f11b1=new JButton("based on ethnicity");
		f11.add(f11b1);
		f11b1.setBounds(100,100,100, 50);
        f11b1.addActionListener(this);

        f11b2=new JButton("based on gender");
		f11.add(f11b2);
		f11b2.setBounds(300,100,100, 50);
        f11b2.addActionListener(this);

        f11b3=new JButton("based on id");
		f11.add(f11b3);
		f11b3.setBounds(100,200,100, 50);
        f11b3.addActionListener(this);

        f11b4=new JButton("back");
		f11.add(f11b4);
		f11b4.setBounds(300,200,100, 50);
        f11b4.addActionListener(this);

    }
    public void menu1_3g_human_ethnicity()
    {
        f13 = new JFrame("search in human resources based on ethnicity");
		f13.setSize(500, 500);
		f13.setLayout(null);
        f13.setVisible(true);

        textsearchethnicity=new JTextField("Enter ethnicity"); 
        textsearchethnicity.setBounds(50,100, 200,30);
        f13.add(textsearchethnicity);

        f13b1 = new JButton("search");
        f13.add(f13b1);
		f13b1.setBounds(300,100,100, 30);
        f13b1.addActionListener(this);
        
        f13b2 = new JButton("back");
        f13.add(f13b2);
		f13b2.setBounds(100,300,100, 30);
        f13b2.addActionListener(this);

    }
    public void menu1_3g_human_gender()
    {

    }
    public void menu1_3g_human_id()
    {

    }
    public void menu1_3g_animal()
    {
        f12 = new JFrame("search in animal resources");
		f12.setSize(500, 500);
		f12.setLayout(null);
        f12.setVisible(true);

		f12b1=new JButton("based on type");
		f12.add(f12b1);
		f12b1.setBounds(100,100,100, 50);
        f12b1.addActionListener(this);

        f12b2=new JButton("based on name");
		f12.add(f12b2);
		f12b2.setBounds(300,100,100, 50);
        f12b2.addActionListener(this);

        f12b3=new JButton("based on id(Just for special animal)");
		f12.add(f12b3);
		f12b3.setBounds(100,200,100, 50);
        f12b3.addActionListener(this);

        f12b4=new JButton("back");
		f12.add(f12b4);
		f12b4.setBounds(300,200,100, 50);
        f12b4.addActionListener(this);

        

    }
    public void menu1_3g_animal_type()
    {

    }
    public void menu1_3g_animal_name()
    {

    }
    public void menu1_3g_animal_id()
    {

    }
    public void menu1_3g_plant()
    {

    }
    public void menu1_3g_territorial()
    {

    }
    public void menu1_4g()
    {
        f4 = new JFrame("report");
		f4.setSize(500, 500);
		f4.setLayout(null);
        f4.setVisible(true);

		f4b1=new JButton("number of human resources");
		f4.add(f4b1);
		f4b1.setBounds(100,100,150, 50);
        f4b1.addActionListener(this);

        f4b2=new JButton("number of animal resources");
		f4.add(f4b2);
		f4b2.setBounds(300,100,150, 50);
        f4b2.addActionListener(this);

        f4b3=new JButton("number of plant resources");
		f4.add(f4b3);
		f4b3.setBounds(100,200,150, 50);
        f4b3.addActionListener(this);

        f4b4=new JButton("number of territorial resources");
		f4.add(f4b4);
		f4b4.setBounds(300,200,150, 50);
        f4b4.addActionListener(this);

        f4b5=new JButton("back");
		f4.add(f4b5);
		f4b5.setBounds(200,300,150, 50);
        f4b5.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {     
        //menu
        if(e.getSource() == f1b1)
        {
            f1.setVisible(false);
            menu1_1g();
            
        }
        if(e.getSource() == f1b2)
        {
            
        }
        if(e.getSource() == f1b3)
        {
            f1.setVisible(false);
            menu1_3g();
            
        }
        if(e.getSource() == f1b4)
        {
            f1.setVisible(false);
            menu1_4g();
            
        }
        if(e.getSource() == f1b5)
        {
            System.exit(0);
           
        }

        //record
        if(e.getSource() == f2b1)
        {
            f2.setVisible(false);
            menu1_1_aliveg();
            

        }
        if(e.getSource() == f2b2)
        {
            f2.setVisible(false);
            menu1_1_natural();
            
        }
        if(e.getSource() == f2b3)
        {
            f2.setVisible(false);
            menu1g();
            

        }
        //record_alive

        if(e.getSource() == f5b1)
        {
            f5.setVisible(false);
            menu1_1_aliveg_human();
           
        }
        if(e.getSource() == f5b2)
        {
            f5.setVisible(false);
            menu1_1_aliveg_animal();

        }
        if(e.getSource() == f5b3)
        {
            f5.setVisible(false);
            menu1_1g();
            

        }
        //record_alive_human
        if(e.getSource()== cbrace)
        {
            raceIndex = cbrace.getSelectedIndex() +1;
        }
        if(e.getSource()== cbgender)
        {
            genderIndex = cbgender.getSelectedIndex() +1;
        }
        if(e.getSource() == f7b1)
        {
            name = textname.getText();
            family = textfamily.getText();
            age = textage.getText();
            id = textid.getText();
            yearb = textyearb.getText();
            monthb = textmonthb.getText();
            dayb = textdayb.getText();
            if(checkdead.isSelected() == true)
            {
                yeard = textyeard.getText();
                monthd = textmonthd.getText();
                dayd = textdayd.getText();
            }
            f7.setVisible(false);
            menu1_1_aliveg();

        }
        
        if(e.getSource() == checkdead)
        {

            if(checkdead.isSelected() == true)
            {
                
                f7.add(textyeard);
                f7.add(textmonthd);
                f7.add(textdayd);
                textyeard.setVisible(true);
                textmonthd.setVisible(true);
                textdayd.setVisible(true);
                checkalive.setSelected(false);
            }

        }
        if(e.getSource() == checkalive)
        {
            if(checkalive.isSelected() == true)
            {
                checkdead.setSelected(false);
                textyeard.setVisible(false);
                textmonthd.setVisible(false);
                textdayd.setVisible(false);
            }

        }
        //record_alive_animal
        if(e.getSource()== cbanimal)
        {
            animalIndex = cbanimal.getSelectedIndex() +1;
        }
        if(e.getSource() == checkspecial)
        {
            if(checkspecial.isSelected() == true)
            {
                textidAnimal.setVisible(true);
                f8.add(textidAnimal);
            }
            if(checkspecial.isSelected() == false)
            {
                textidAnimal.setVisible(false);
            }

        }
        if(e.getSource() == f8b1)
        {
            nameAnimal = textnameAnimal.getText();
            numAnimal = textNum.getText();
            
            if(checkspecial.isSelected() == true)
            {
                idAnimal = textidAnimal.getText();
            }
            f8.setVisible(false);
            menu1_1_aliveg();

        }

        //record_natural
        if(e.getSource() == f6b1)
        {
            f6.setVisible(false);
            menu1_1_naturalg_territorial();
        }
        if(e.getSource() == f6b2)
        {
            f6.setVisible(false);
            menu1_1_naturalg_plant();
        }
        if(e.getSource() == f6b3)
        {
            f6.setVisible(false);
            menu1_1g();

        }
        //record_natural_terrene
        if(e.getSource() == cbterrene)
        {
            if(this.texttypelake != null)
            {
                texttypelake.setVisible(false);
                textnumlake.setVisible(false);
                textdepthlake.setVisible(false);
            }
            if(this.texttypesea != null)
            {
                texttypesea.setVisible(false);
                textnumsea.setVisible(false);
                textdepthsea.setVisible(false);
            }
            if(this.texthektardesert != null)
            {
                texthektardesert.setVisible(false);
            }
            if(this.texthektarplain != null)
            {
                texthektarplain.setVisible(false);
            }
            if(this.textnummountain != null)
            {
                textnummountain.setVisible(false);
                textheightmountain.setVisible(false);
            }
            if(this.texthektarforest != null)
            {
                texthektarforest.setVisible(false);
                texttypeforest.setVisible(false);
            }
            
            if(cbterrene.getSelectedIndex() == 0)
            { 
                if(this.cbland != null)
                {
                    cbland.setVisible(false);
                }
                f9.add(cbwater);
                cbwater.setVisible(true);
            }
            if(cbterrene.getSelectedIndex() == 1)
            {
                if(this.cbwater != null)
                {
                    cbwater.setVisible(false);
                }
                f9.add(cbland); 
                cbland.setVisible(true);
            }
            
            
        }
        if(e.getSource() == cbwater)
        {
            if(cbwater.getSelectedIndex() == 0)
            {
                if(this.texttypesea != null)
                {
                    texttypesea.setVisible(false);
                    textnumsea.setVisible(false);
                    textdepthsea.setVisible(false);
                }
                f9.add(texttypelake);
                f9.add(textnumlake);
                f9.add(textdepthlake);
                texttypelake.setVisible(true);
                textnumlake.setVisible(true);
                textdepthlake.setVisible(true);
            }
            if(cbwater.getSelectedIndex() == 1)
            {
                if(this.texttypelake != null)
                {
                    texttypelake.setVisible(false);
                    textnumlake.setVisible(false);
                    textdepthlake.setVisible(false);
                }
                f9.add(texttypesea);
                f9.add(textnumsea);
                f9.add(textdepthsea);
                texttypesea.setVisible(true);
                textnumsea.setVisible(true);
                textdepthsea.setVisible(true);

            }


        }
        if(e.getSource() == cbland)
        {
            if(cbland.getSelectedIndex() == 0)
            {
                if(this.texthektarplain != null)
                {
                    texthektarplain.setVisible(false);
                }
                if(this.textnummountain != null)
                {
                    textnummountain.setVisible(false);
                    textheightmountain.setVisible(false);
                }
                if(this.texthektarforest != null)
                {
                    texthektarforest.setVisible(false);
                    texttypeforest.setVisible(false);
                }
                f9.add(texthektardesert);
                texthektardesert.setVisible(true);
            }
            if(cbland.getSelectedIndex() == 1)
            {
                if(this.texthektardesert != null)
                {
                    texthektardesert.setVisible(false);
                }
                if(this.textnummountain != null)
                {
                    textnummountain.setVisible(false);
                    textheightmountain.setVisible(false);
                }
                if(this.texthektarforest != null)
                {
                    texthektarforest.setVisible(false);
                    texttypeforest.setVisible(false);
                }
                f9.add(texthektarplain);
                texthektarplain.setVisible(true);
            }
            if(cbland.getSelectedIndex() == 2)
            {
                if(this.texthektardesert != null)
                {
                    texthektardesert.setVisible(false);
                }
                if(this.texthektarplain != null)
                {
                    texthektarplain.setVisible(false);
                }
                if(this.texthektarforest != null)
                {
                    texthektarforest.setVisible(false);
                    texttypeforest.setVisible(false);
                }
                f9.add(textnummountain);
                f9.add(textheightmountain);
                textnummountain.setVisible(true);
                textheightmountain.setVisible(true);
            }
            if(cbland.getSelectedIndex() == 3)
            {
                if(this.texthektardesert != null)
                {
                    texthektardesert.setVisible(false);
                }
                if(this.texthektarplain != null)
                {
                    texthektarplain.setVisible(false);
                }
                if(this.textnummountain != null)
                {
                    textnummountain.setVisible(false);
                    textheightmountain.setVisible(false);
                }
                f9.add(texthektarforest);
                f9.add(texttypeforest);
                texthektarforest.setVisible(true);
                texttypeforest.setVisible(true);
            }


        }
        if(e.getSource() == f9b1)
        {
            f9.setVisible(false);
            menu1_1_natural();
        }

        //record_natural_plant
        if(e.getSource() == cbplant)
        {
            if(this.cbtree != null)
            {
                cbtree.setVisible(false);
            }
            if(this.texttypefruit != null)
            {
                texttypefruit.setVisible(false);
                textnumfruit.setVisible(false);
            }
            if(this.texttypefruitless != null)
            {
                texttypefruitless.setVisible(false);
                textnumfruitless.setVisible(false);
            }
            if(this.texttypeflower != null)
            {
                texttypeflower.setVisible(false);
                textnumflower.setVisible(false);
            }
            if(this.texttypemedical != null)
            {
                texttypemedical.setVisible(false);
                textnummedical.setVisible(false);
            }
            if(this.texttypefeedstuf != null)
            {
                texttypefeedstuf.setVisible(false);
                textnumfeedstuf.setVisible(false);
            }
            if(cbplant.getSelectedIndex() == 0)
            {
                f10.add(cbtree);
                cbtree.setVisible(true);

            }
            if(cbplant.getSelectedIndex() == 1)
            {
                if(this.cbtree != null)
                {
                    cbtree.setVisible(false);
                }
                if(this.texttypefruit != null)
                {
                    texttypefruit.setVisible(false);
                    textnumfruit.setVisible(false);
                }
                if(this.texttypefruitless != null)
                {
                    texttypefruitless.setVisible(false);
                    textnumfruitless.setVisible(false);
                }
                if(this.texttypemedical != null)
                {
                    texttypemedical.setVisible(false);
                    textnummedical.setVisible(false);
                }
                if(this.texttypefeedstuf != null)
                {
                    texttypefeedstuf.setVisible(false);
                    textnumfeedstuf.setVisible(false);
                }
                f10.add(texttypeflower);
                f10.add(textnumflower);
                texttypeflower.setVisible(true);
                textnumflower.setVisible(true);

            }
            if(cbplant.getSelectedIndex() == 2)
            {
                if(this.cbtree != null)
                {
                    cbtree.setVisible(false);
                }
                if(this.texttypefruit != null)
                {
                    texttypefruit.setVisible(false);
                    textnumfruit.setVisible(false);
                }
                if(this.texttypefruitless != null)
                {
                    texttypefruitless.setVisible(false);
                    textnumfruitless.setVisible(false);
                }
                if(this.texttypeflower != null)
                {
                    texttypeflower.setVisible(false);
                    textnumflower.setVisible(false);
                }
                if(this.texttypefeedstuf != null)
                {
                    texttypefeedstuf.setVisible(false);
                    textnumfeedstuf.setVisible(false);
                }
                f10.add(texttypemedical);
                f10.add(textnummedical);
                texttypemedical.setVisible(true);
                textnummedical.setVisible(true);

            }
            if(cbplant.getSelectedIndex() == 3)
            {
                if(this.cbtree != null)
                {
                    cbtree.setVisible(false);
                }
                if(this.texttypefruit != null)
                {
                    texttypefruit.setVisible(false);
                    textnumfruit.setVisible(false);
                }
                if(this.texttypefruitless != null)
                {
                    texttypefruitless.setVisible(false);
                    textnumfruitless.setVisible(false);
                }
                if(this.texttypeflower != null)
                {
                    texttypeflower.setVisible(false);
                    textnumflower.setVisible(false);
                }
                if(this.texttypemedical != null)
                {
                    texttypemedical.setVisible(false);
                    textnummedical.setVisible(false);
                }
                f10.add(texttypefeedstuf);
                f10.add(textnumfeedstuf);
                texttypefeedstuf.setVisible(true);
                textnumfeedstuf.setVisible(true);

            }

        }
        if(e.getSource() == cbtree)
        {
            if(cbtree.getSelectedIndex() == 0)
            {
                if(this.texttypefruitless != null)
                {
                    texttypefruitless.setVisible(false);
                    textnumfruitless.setVisible(false);
                }
                if(this.texttypeflower != null)
                {
                    texttypeflower.setVisible(false);
                    textnumflower.setVisible(false);
                }
                if(this.texttypemedical != null)
                {
                    texttypemedical.setVisible(false);
                    textnummedical.setVisible(false);
                }
                if(this.texttypefeedstuf != null)
                {
                    texttypefeedstuf.setVisible(false);
                    textnumfeedstuf.setVisible(false);
                }
                f10.add(texttypefruit);
                f10.add(textnumfruit);
                texttypefruit.setVisible(true);
                textnumfruit.setVisible(true);

            }
            if(cbtree.getSelectedIndex() == 1)
            {

                if(this.texttypefruit != null)
                {
                    texttypefruit.setVisible(false);
                    textnumfruit.setVisible(false);
                }
                if(this.texttypeflower != null)
                {
                    texttypeflower.setVisible(false);
                    textnumflower.setVisible(false);
                }
                if(this.texttypemedical != null)
                {
                    texttypemedical.setVisible(false);
                    textnummedical.setVisible(false);
                }
                if(this.texttypefeedstuf != null)
                {
                    texttypefeedstuf.setVisible(false);
                    textnumfeedstuf.setVisible(false);
                }
                f10.add(texttypefruitless);
                f10.add(textnumfruitless);
                texttypefruitless.setVisible(true);
                textnumfruitless.setVisible(true);
            }
            
        }
        if(e.getSource() == f10b1)
        {
            f10.setVisible(false);
            menu1_1_natural();
        }


        //edit


        //search
        if(e.getSource() == f3b1)
        {
            f3.setVisible(false);
            menu1_3g_human();
        }
        if(e.getSource() == f3b2)
        {
            f3.setVisible(false);
            menu1_3g_animal();
        }
        if(e.getSource() == f3b3)
        {
            f3.setVisible(false);
            menu1_3g_plant();
        }
        if(e.getSource() == f3b4)
        {
            f3.setVisible(false);
            menu1_3g_territorial();
        }
        if(e.getSource() == f3b5)
        {
            f3.setVisible(false);
            menu1g();

        }
        //search_human
        if(e.getSource() == f11b1)
        {
            f11.setVisible(false);
            menu1_3g_human_ethnicity();
        }
        if(e.getSource() == f11b2)
        {
            f11.setVisible(false);
            menu1_3g_human_gender();
        }
        if(e.getSource() == f11b3)
        {
            f11.setVisible(false);
            menu1_3g_human_id();
        }
        if(e.getSource() == f11b4)
        {
            f11.setVisible(false);
            menu1_3g();
        }
        //search_human_ethnicity
        if(e.getSource() == f13b1)
        {
            
        }
        if(e.getSource() == f13b2)
        {
            f13.setVisible(false);
            menu1_3g_human();
        }
        //search_animal
        if(e.getSource() == f12b1)
        {
            f12.setVisible(false);
            menu1_3g_animal_type();
        }
        if(e.getSource() == f12b2)
        {
            f12.setVisible(false);
            menu1_3g_animal_name();
        }
        if(e.getSource() == f12b3)
        {
            f12.setVisible(false);
            menu1_3g_animal_id();
        }
        if(e.getSource() == f12b4)
        {
            f12.setVisible(false);
            menu1_3g();
        }


        //report
        if(e.getSource() == f4b1)
        {

        }
        if(e.getSource() == f4b2)
        {

        }
        if(e.getSource() == f4b3)
        {

        }
        if(e.getSource() == f4b4)
        {

        }
        if(e.getSource() == f4b5)
        {
            f4.setVisible(false);
            menu1g();

        }
    }
    
}
