package finalClass;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Menu {
	
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		
		System.out.printf("1.record\n");
		System.out.printf("2.edit\n");
		System.out.printf("3.search\n");
		System.out.printf("4.report\n");
		System.out.printf("5.exit\n");
		System.out.printf("Enter the desired number : \n");
		int x = console.nextInt();
		switch(x)
		{
		case 1 :record();
			break;
		case 2 :edit();
			break;
		case 3 :search();
			break;
		case 4 :report();
			break;
		case 5 : 
			System.exit(x);//check beshe
			break;
		default : System.out.printf("incorect\n");
		        menu();
		}
	}
	
	public static void record() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.alive creature\n2.natural resource \n>>>>>");
		int x = console.nextInt();
		switch (x) {
		case 1 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.human\n2.animal\n>>>>>");
			int y = console.nextInt();
			switch (y) {
			case 1 :
				human();
				break ;
			case 2 :
				animal();
				break ;
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				record() ;
				break ;
			}
			}
			break ;
		}
		case 2 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.terrene\n2.plant\n>>>>>");
			int z = console.nextInt();
			switch (z) {
			case 1 :
				terrene() ;
				break ;
			case 2 :
				plant() ;
				break ;
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				record() ;
				break ;
			}
			}
			break ;
		}
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			record() ;
			break ;
		}
		}
	}
	
	public static void human() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.fars\n2.arab\n3.tork\n4.kord\n5.baloch\n6.torkaman\n>>>>>");
		int k = console.nextInt();
		switch (k) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
		case 6 :
			person(k);
			break ;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			human() ;
			break ;
		}
		}
	}
	
	public static void animal() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.mamal\n2.oviparous\n>>>>>");
		int i = console.nextInt();
		switch (i) {
		case 1 :
		case 2 :
			animalInfo(i);
			break ;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			animal() ;
			break ;
		}
		}
	}

	public static void terrene() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.water area\n2.land\n>>>>>");
		int j = console.nextInt();
		switch (j) {
		case 1 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.lake\n2.sea\n>>>>>");
			int k = console.nextInt();
			switch (k) {
			case 1 :
			case 2 :
			{
				waterArea(k);
				break ;
			}
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				terrene() ;
				break ;
			}
			}
			break ;
		}
		case 2 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.desert\n2.plain\n3.mountain\n4.forest\n>>>>>");
			int k = console.nextInt();
			switch (k) {
			case 1 :
			case 2 :
			case 4 :
			{
				landTypeABD(k);
				break ;
			}
			case 3 :
			{
				mountain();
				break ;
			}
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				terrene() ;
				break ;
			}
			}
			break ;
		}
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			System.out.println("*Press the enter key and try again*");///////////////////////
			terrene() ;
			break ;
		}
		}
	}
	
	public static void plant() {
		
		System.out.println("Selact the desired option : ");
		System.out.println("1.tree\n2.flower\n3.medical\n4.feedstuf\n>>>>>");
		int m = console.nextInt();
		switch (m) {
		case 1 :
		{
			System.out.println("Selact the desired option : ");
			System.out.println("1.Fruit\n2.Fruitless\n>>>>>");
			int i = console.nextInt();
			switch (i) {
			case 1 :
			{
				m = 5 ;
				break ;
			}
			case 2 :
			{
				m = 6 ;
				break ;
			}
			default :
			{
				System.out.println("The desired option is not allowed!!!");
				plant() ;
				break ;
			}
			}
			plantInfo(m);
			break ;
		}
		case 2 :
		case 3 :
		case 4 :
			plantInfo(m);
			break ;
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			plant() ;
			break ;
		}
		}
	}
	
	public static void person(int number) {
		
		System.out.println("please select gender : ");
		System.out.println("1.male\n2.female");
		int gender = console.nextInt();
		if(gender!=2 && gender!=1)
		{
			System.out.println("The desired option is not allowed!!!");
			person(number);
		}
		String temp = console.nextLine();
		System.out.println("please enter the first name : ");
		String fname = console.nextLine();
		System.out.println("please enter the last name : ");
		String lname = console.nextLine();
		System.out.println("please enter the age : ");
		temp = console.nextLine();
		String age = checkFormat(temp);
		System.out.println("please enter the id : ");
		temp = console.nextLine();
		String id = checkFormat(temp);
		System.out.println("please enter the date of birth : ");
		System.out.println("-year :");
		temp = console.nextLine();
		String byear = checkFormat(temp);
		System.out.println("-month :");
		temp = console.nextLine();
		String bmonth = checkFormat(temp);
		System.out.println("-day :");
		temp = console.nextLine();
		String bday = checkFormat(temp);
		System.out.println("Is alive ?");
		System.out.println("1.yes\n2.no");
		int alive = console.nextInt();
		boolean  ISaLIVE = true ;
		String dyear = ""  , dmonth = "" , dday = "" ;
		switch(alive)
		{
		case 1 :
		{
			ISaLIVE = true;
			dyear = "0" ;
			dmonth = "0" ;
			dday = "0" ;
			break;
		}
		case 2 :
		{
			ISaLIVE = false;
			temp = console.nextLine();
			System.out.println("please enter the date of death : ");
			System.out.println("-year :");
			temp = console.nextLine();
			dyear = checkFormat(temp);
			System.out.println("-month :");
			temp = console.nextLine();
			dmonth = checkFormat(temp);
			System.out.println("-day :");
			temp = console.nextLine();
			dday = checkFormat(temp);
			break;
		}
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			person(number) ;
			break ;
		}
		}
		switch (number) {//1.fars\n2.arab\n3.tork\n4.kord\n5.baloch\n6.torkaman
		case 1 :
		{
			Farse person = new Farse();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("farse");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Successfully wrote to the file.");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Arab person = new Arab();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("arab");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Successfully wrote to the file.");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 3 :
		{
			Tork person = new Tork();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();	
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("tork");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Successfully wrote to the file.");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 4 :
		{
			Kord person = new Kord();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("kord");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Successfully wrote to the file.");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 5 :
		{
			Baloch person = new Baloch();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("baloch");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Successfully wrote to the file.");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 6 :
		{
			Torkaman person = new Torkaman();
			person.setId(id);
			if(gender == 1)
			{
				person.Male();
				temp = "male";
			}
			else
			{
				person.Female();
				temp = "female";
			}
			person.setFirstName(fname);
			person.setLastName(lname);
			person.setAge(age);
			person.setYeareOfBirth(byear);
			person.setMonthOfBirth(bmonth);
			person.setDayOfBirth(bday);
			person.isAlive = ISaLIVE ;
			person.setYearOfDeath(dyear);
			person.setMonthOfDeath(dmonth);
			person.setDayOfDeath(dday);
			try {  
			      FileWriter myWriter = new FileWriter("human.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(person.getId());
			      Writer.append("\n");
			      Writer.write("torkaman");
			      Writer.append("\n");
			      Writer.append(temp);//gender
			      Writer.append("\n");
			      Writer.append(person.getFirstName());
			      Writer.append("\n");
			      Writer.append(person.getLastName());
			      Writer.append("\n");
			      Writer.append(person.getAge());
			      Writer.append("\n");
			      Writer.append(person.getYearOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getDayOfBirth());
			      Writer.append("\n");
			      Writer.append(person.getYearOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getMonthOfDeath());
			      Writer.append("\n");
			      Writer.append(person.getDayOfDeath());
			      Writer.append("\n");
			      Writer.close();
			      System.out.println("Successfully wrote to the file.");
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		
		//bazgasht be menu
		menu();
		
	}
	
	public static void animalInfo(int number){
		
		System.out.println("please enter the type : ");
		String type = console.next();
		System.out.println("Is it a special animmal? ");
		System.out.println("1.Yes\n2.No\n>>>>>");
		int option = console.nextInt();
		String id = "0" ;
		String temp = "0" ;
		String num = "0" ;
		switch(option)
		{
		case 1 :
		{
			System.out.println("please enter the id : ");
			temp = console.next();
			id = checkFormat(temp);
			num = "1" ;
			break;
		}
		case 2 :
		{
			System.out.println("please enter the number : ");
			temp = console.next();
			num = checkFormat(temp);
			break;
		}
		default :
		{
			System.out.println("The desired option is not allowed!!!");
			animalInfo(number) ;
			break;
		}
		}
		switch(number) {//1.mamal\n2.oviparous
		case 1 :
		{
			Mamal animal = new Mamal();
			animal.setType(type);
			animal.setNumber(num);
			animal.setId(id);
			try {  
			      FileWriter myWriter = new FileWriter("animal.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(animal.getId());
			      Writer.append("\n");
			      Writer.write("mamal");
			      Writer.append("\n");
			      Writer.write(animal.getType());
			      Writer.append("\n");
			      Writer.write(animal.getNumber());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Oviparous animal = new Oviparous();
			animal.setType(type);
			animal.setNumber(num);
			animal.setId(id);
			try {  
			      FileWriter myWriter = new FileWriter("animal.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write(animal.getId());
			      Writer.append("\n");
			      Writer.write("oviparous");
			      Writer.append("\n");
			      Writer.write(animal.getType());
			      Writer.append("\n");
			      Writer.write(animal.getNumber());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
	}
	
	public static void waterArea(int number){
		
		System.out.println("please enter the type : ");
		String type = console.next();
		System.out.println("please enter the number : ");
		String temp = console.next();
		String num = checkFormat(temp);
		System.out.println("please enter the depth : ");
		temp = console.next();
		String depth = checkFormat(temp);
		switch(number) {//1.lake\n2.sea
		case 1 :
		{
			Lake area = new Lake();
			area.setType(type);
			area.setNumber(num);
			area.setDepth(depth);
			try {  
			      FileWriter myWriter = new FileWriter("waterArea.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("lake");
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      Writer.write(area.getDepth());
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Sea area = new Sea();
			area.setType(type);
			area.setNumber(num);
			area.setDepth(depth);
			try {  
			      FileWriter myWriter = new FileWriter("waterArea.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("sea");
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      Writer.write(area.getDepth());
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
		
	}
	
	public static void landTypeABD(int number){
		
		System.out.println("please enter the hectares : ");
		String temp = console.next();
		String hectares = checkFormat(temp);
		String type = "" ;
		if(number == 4)
		{
			System.out.println("please enter the type : ");
			type = console.next();
		}
		switch(number) {// 1.desert\n2.plain\n4.forest
		case 1 :
		{
			Desert area = new Desert();
			area.setNumber(hectares);
			try {  
			      FileWriter myWriter = new FileWriter("land.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("desert");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write("0");
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 2 :
		{
			Plain area = new Plain();
			area.setNumber(hectares);
			try {  
			      FileWriter myWriter = new FileWriter("land.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("plain");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write("0");
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 3 :
		{
			Forest area = new Forest();
			area.setType(type);
			area.setNumber(hectares);
			try {  
			      FileWriter myWriter = new FileWriter("land.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("forest");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;

		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
	}
	
	public static void mountain() {
		System.out.println("please enter the number : ");
		String temp = console.next();
		String num = checkFormat(temp);
		System.out.println("please enter the height : ");
		temp = console.next();
		String height = checkFormat(temp);
		Mountain area = new Mountain();
		area.setHeight(height);
		area.setNumber(num);
		try {  
		      FileWriter myWriter = new FileWriter("land.txt",true);
		      BufferedWriter Writer = new BufferedWriter(myWriter);
		      Writer.write("mountain");
		      Writer.append("\n");
		      Writer.write(area.getNumber());
		      Writer.append("\n");
		      Writer.write(area.getHeight());
		      Writer.append("\n");
		      System.out.println("Successfully wrote to the file.");
		      Writer.close();
		 } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		//bazgasht be menu
		menu();
	}
	
	public static void plantInfo(int number) {
		//2.flower\n3.medical\n4.feedstuf\n5.Fruit\n6.Fruitless
		System.out.println("please enter the type : ");
		String type = console.next();
		System.out.println("please enter the number : ");
		String temp = console.next();
		String num = checkFormat(temp);
		switch(number) {// 1.desert\n2.plain\n4.forest
		case 2 :
		{
			Flower area = new Flower();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("flower");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			break ;
		}
		case 3 :
		{
			Medical area = new Medical();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("medical");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;
		}
		case 4 :
		{
			FeedStuff area = new FeedStuff();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("feedStuf");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;

		}
		case 5 :
		{
			Fruit area = new Fruit();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("fruit");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;
		}
		case 6 :
		{
			FruitLess area = new FruitLess();
			area.setNumber(num);
			area.setType(type);
			try {  
			      FileWriter myWriter = new FileWriter("plant.txt",true);
			      BufferedWriter Writer = new BufferedWriter(myWriter);
			      Writer.write("fruitLess");
			      Writer.append("\n");
			      Writer.write(area.getNumber());
			      Writer.append("\n");
			      Writer.write(area.getType());
			      Writer.append("\n");
			      System.out.println("Successfully wrote to the file.");
			      Writer.close();
			 } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			break ;
		}
		//defult nadare chon vorodi kontorol shode
		}
		//bazgasht be menu
		menu();
	}
	
	public static String checkFormat(String temp) {
		boolean onlyDigit = true ;
		for(int i=0 ; i<temp.length() ; i++)
		{
			if(!Character.isDigit(temp.charAt(i)))
			{
				onlyDigit = false ;
				break;
			}
		}
		if(onlyDigit)
		{
			return temp ;	
		}
		else
		{
			System.out.print("You entered an illegal character instead of a number\n");
			System.out.print("Try again\n");
			menu();
			return "" ;
		}
	}
	
    public static void edit() {
		
	}
    
    public static void search() {
		
	}
    
    public static void report() {
		
	}
    
}
