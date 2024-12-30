# include <iostream>
# include <windows.h>
# include <conio.h>
#include <stdlib.h>
# include <cctype>
# include <string.h>
using namespace std;
struct Address
{
	string address;
	string Nationality;
};
struct DMY
{   int Date;
    int Month;
    int Year;
};
struct dmy
{   int date;
    int month;
    int year;
};
struct Employee
{    int    ID;
    string Name;
    string FatherName;
    DMY      DOB;
    int    Age;
    string Gender;
    long long int   Contact;
    long long int   CNIC;
    Address add;
    string Qualification;
    string Dept;
    dmy   DOJ;
    int Salary;
};
 
 int total=0;
 Employee e[100];

void Employeedata(){
	

	int user=0;
    cout<<"\n\t\t\t **************Add Employee**************"<<endl; 
	cout<<"\n\t\t\t How many employees data do you want to enter?";
    cin>>user;

	for(int i=total;i<total+user;i++){

		cout<<"\n\t\t\t Enter Employee Data: "<<i+1<<endl<<endl;
		
		cout<<"\n\t\t\t Enter Employee ID: ";
        cin>>e[i].ID;
		cout<<"\n\t\t\t Enter Employee Name: ";cin.ignore();
        getline(cin,e[i].Name);
	    cout<<"\n\t\t\t Enter Employee Father Name: ";
        getline(cin,e[i].FatherName);
		cout<<"\n\t\t\t Enter Birth Date by pressing spacekey as(D_M_Y): ";
        cin>>e[i].DOB.Date>>e[i].DOB.Month>>e[i].DOB.Year;
        cout<<"\n\t\t\t Enter Age:";
        cin>>e[i].Age;
		cout<<"\n\t\t\t Enter Gender: ";
        cin>>e[i].Gender;
	    cout<<"\n\t\t\t Enter Phone Number: ";
        cin>>e[i].Contact;
		cout<<"\n\t\t\t Enter CNIC (without spaces): ";
		cin>>e[i].CNIC;
		cout<<"\n\t\t\t Enter Address: ";cin.ignore();
		getline(cin,e[i].add.address);
		cout<<"\n\t\t\t Enter Nationality: ";
		getline(cin,e[i].add.Nationality);
		cout<<"\n\t\t\t Enter Qualification :";
		cin>>e[i].Qualification;
		cout<<"\n\t\t\t Enter Department name :";
		cin>>e[i].Dept;
		cout<<"\n\t\t\t Enter Joing Date by pressing spacekey as(D_M_Y): ";
		cin>>e[i].DOJ.date>>e[i].DOJ.month>>e[i].DOJ.year;
		cout<<"\n\t\t\t Enter Salary : ";
		cin>>e[i].Salary;

	}

	total=total+user;
	cout<<"n\t\t\t New Record is entered Successfully";
  	for(int i=0;i<6;i++)

	{   cout<<".";
		Sleep(500);
	}
} 
void show(){
    cout<<"\n\t\t\t ************Show Record************"<<endl;
	if(total!=0){
    	int id;
		cout<<"\n\t\t\t Enter Employee ID which you want to View Record: ";
		cin>>id;
	for(int i=0;i<total;i++){
        	if(e[i].ID==id){
		cout<<"\n\t\t\t Data of Employee "<<i+1<<endl;

		cout<<"\n\t\t\t ID : "<<e[i].ID<<endl;

		cout<<"\n\t\t\t Employee name : "<<e[i].Name<<endl;

		cout<<"\n\t\t\t Employee's Father Name :"<<e[i].FatherName<<endl;

		cout<<"\n\t\t\t Birth Date :"<<e[i].DOB.Date<<" "<<e[i].DOB.Month<<" "<<e[i].DOB.Year<<endl;

		cout<<"\n\t\t\t Age :"<<e[i].Age<<endl;
		
		cout<<"\n\t\t\t Gender :"<<e[i].Gender<<endl;
		
		cout<<"\n\t\t\t Phone number :"<<e[i].Contact<<endl;
	
		cout<<"\n\t\t\t CNIC :"<<e[i].CNIC<<endl;
	
		cout<<"\n\t\t\t Address :"<<e[i].add.address<<endl;
		
		cout<<"\n\t\t\t Nationality :"<<e[i].add.Nationality<<endl;
		
		cout<<"\n\t\t\t Qualification :"<<e[i].Qualification<<endl;
		
	    cout<<"\n\t\t\t Department :"<<e[i].Dept<<endl;
			
	    cout<<"\n\t\t\t Joing Date :"<<e[i].DOJ.date<<" "<<e[i].DOJ.month<<" "<<e[i].DOJ.year<<endl;
	   
	    cout<<"\n\t\t\t Salary :"<<e[i].Salary<<endl;
       break;
	}
     	if( i==total-1){
		cout<<"\n\t\t\t No such record found "<<endl;
			}
    } }

    else{

    	cout<<"\n\t\t\t No data is entered"<<endl;

	} }
  
 

void search(){ cout<<"\n\t\t\t ************Search Record************"<<endl;
	if(total!=0){
		int id;
		cout<<"\n\t\t\t Enter Employee ID which you want to search: ";
		cin>>id;
		for(int i=0;i<total;i++){
			if(e[i].ID==id){
		cout<<"\n\t\t\t Data of employee :"<<i+1<<endl;
		cout<<"\n\t\t\t Name :"<<e[i].Name<<endl;
		cout<<"\n\t\t\t Father Name :"<<e[i].FatherName<<endl;
		cout<<"\n\t\t\t Birth Date :"<<e[i].DOB.Date<<" "<<e[i].DOB.Month<<" "<<e[i].DOB.Year<<endl;
		cout<<"\n\t\t\t Age :"<<e[i].Age<<endl;
		cout<<"\n\t\t\t Gender :"<<e[i].Gender<<endl;
		cout<<"\n\t\t\t Contact :"<<e[i].Contact<<endl;
		cout<<"\n\t\t\t CNIC :"<<e[i].CNIC<<endl;
		cout<<"\n\t\t\t Address :"<<e[i].add.address<<endl;
		cout<<"\n\t\t\t Nationality :"<<e[i].add.Nationality<<endl;
		cout<<"\n\t\t\t Qualification :"<<e[i].Qualification<<endl;
		cout<<"\n\t\t\t Department :"<<e[i].Dept<<endl;
		cout<<"\n\t\t\t Date Joined :"<<e[i].DOJ.date<<" "<<e[i].DOJ.month<<" "<<e[i].DOJ.year<<endl;
		cout<<"\n\t\t\t Salary :"<<e[i].Salary<<endl;
			break;	}
			if( i==total-1){
		cout<<"\n\t\t\t No such record found "<<endl;
			}}}
	
      	
	      else{
	    cout<<"\n\t\t\t No data is entered"<<endl;
		  }	}
	
	
	
void update()
{    cout<<"\n\t\t\t ************Update Record************"<<endl;

  if(total!=0)
  {  	int Press;
  		cout<<"\n\t\t\t [1.] to Update Specific record "<<endl;
  		cout<<"\n\t\t\t [2.] to Update Full record "<<endl;
  		cout<<"\n\t\t\t Enter choice...";
  		cin>>Press;
  		if(Press==1){
  	int id;
  	cout<<"\n\t\t\t Enter Employee ID which you want to update :";
  	cin>>id;
  	for(int i=0;i<total;i++)
  	{
  		if(e[i].ID==id)
  		{
		cout<<"\n\t\t\t *********MENU*********"<<endl;
  		cout<<"\n\t\t\t [ 1.]  Update Name"<<endl;
  		cout<<"\n\t\t\t [ 2.]  Update Birth Date"<<endl;
  		cout<<"\n\t\t\t [ 3.]  Update Age"<<endl;
  		cout<<"\n\t\t\t [ 4.]  Update Gender"<<endl;
  		cout<<"\n\t\t\t [ 5.]  Update Contact"<<endl;
  		cout<<"\n\t\t\t [ 6.]  Update CNIC"<<endl;
  		cout<<"\n\t\t\t [ 7.]  Update Address"<<endl;
  		cout<<"\n\t\t\t [ 8.]  Update Qualification"<<endl;
  		cout<<"\n\t\t\t [ 9.]  Update Department"<<endl;
  		cout<<"\n\t\t\t [10.]  Update Joining Date"<<endl;
  		cout<<"\n\t\t\t [11.]  Update Salary"<<endl;
  		int choice;
  		cout<<"\n\t\t\t Enter choice :";
  		cin>>choice;
  	
		  switch(choice)
		  {
		  case 1:
		  cout<<"\n\t\t\t Enter Name to update : ";cin.ignore();
		  getline(cin,e[i].Name);
		  break;
		
		  
		  case 2:
		  cout<<"\n\t\t\t Enter Birth Date to update as(D_M_Y) : ";
		  cin>>e[i].DOB.Date>>e[i].DOB.Month>>e[i].DOB.Year;
		  
		  break;
		  
		  case 3:
		  cout<<"\n\t\t\t Enter Age to update : ";
		  cin>>e[i].Age;
		 
		  break;
		  
		  case 4:
		  cout<<"\n\t\t\t Enter Gender to update : ";
		  cin>>e[i].Gender;
		 
		  break;
		  
		  case 5:
		  cout<<"\n\t\t\t Enter Contact to update : ";
		  cin>>e[i].Contact;
		 
		  break;
		  
		  case 6:
		  cout<<"\n\t\t\t Enter CNIC to update : ";
		  cin>>e[i].CNIC;
		 
		  break;
		  
		  case 7:
		  cout<<"\n\t\t\t Enter Address to update : ";cin.ignore();
		  getline(cin,e[i].add.address);

		  break;
		
		  
		  case 8:
		  cout<<"\n\t\t\t Enter Qualification to update : ";
		  cin>>e[i].Qualification;
	
		  break;
		  
		  case 9:
		  cout<<"\n\t\t\t Enter Department to update : ";
		  cin>>e[i].Dept;
		 
		  break;
		  
		  case 10:
		  cout<<"\n\t\t\t Enter Date of Join to update as(D_M_Y) : ";
		  cin>>e[i].DOJ.date>>e[i].DOJ.month>>e[i].DOJ.year;
		  
		  break;
		  
		   
		  case 11:
		  cout<<"\n\t\t\t Enter Salary to update : ";
		  cin>>e[i].Salary;
		  cout<<endl;
		  break;
		  
		  default :
	      cout<<"\n\t\t\t Invalid Choice "<<endl;
		   break;}
		
		cout<<"\n\t\t\t Your record is updated"<<endl; 
		   }
		  if(i==total-1){

			cout<<"\n\t\t\t    "<<endl;} }}
			
           else if(Press==2){
           	for(int i=0;i<total;i++){
           		int id;
  	         cout<<"\n\t\t\t Enter Employee ID which you want to update :";
  	         cin>>id;
			   if(e[i].ID==id) {  
		  cout<<"\n\t\t\t Enter Name to update : ";cin.ignore();
		  getline(cin,e[i].Name);
		  cout<<"\n\t\t\t Enter Father Name to update : ";
		  getline(cin,e[i].FatherName);
		  cout<<"\n\t\t\t Enter Birth Date to update : ";
		  cin>>e[i].DOB.Date>>e[i].DOB.Month>>e[i].DOB.Year;
		  cout<<endl;
		  cout<<"\n\t\t\t Enter Age to update : ";
		  cin>>e[i].Age;
		  cout<<endl;
		  cout<<"\n\t\t\t Enter Gender to update : ";
		  cin>>e[i].Gender;
		  cout<<endl;
		  cout<<"\n\t\t\t Enter Contact to update : ";
		  cin>>e[i].Contact;
		  cout<<endl;
		  cout<<"\n\t\t\t Enter CNIC to update : ";
		  cin>>e[i].CNIC;
		  cout<<endl;
		  cout<<"\n\t\t\t Enter Address to update : ";cin.ignore();
		  getline(cin,e[i].add.address);
		  cout<<"\n\t\t\t Enter Nationality to update : ";
		  getline(cin,e[i].add.Nationality);
		  cout<<"\n\t\t\t Enter Qualification to update : ";
		  cin>>e[i].Qualification;
		  cout<<endl;
		  cout<<"\n\t\t\t Enter Department to update : ";
		  cin>>e[i].Dept;
		  cout<<endl;
		  cout<<"\n\t\t\t Enter Date of Join to update : ";
		  cin>>e[i].DOJ.date>>e[i].DOJ.month>>e[i].DOJ.year;
		  cout<<endl;
		   cout<<"\n\t\t\t Enter Salary to update : ";
		  cin>>e[i].Salary;
		  
		  cout<<"\n\t\t\t Record is Upated.....";
		  break;} 
		  if(i==total-1){

			cout<<"\n\t\t\t No such record found"<<endl;}}
		   }}
		  
	 	
            else{

	       cout<<"\n\t\t\t No data is entered"<<endl;}
	    
}
void deleterecord(){
	
      cout<<"\n\t\t\t ************Delete Record************"<<endl;

	if(total!=0){

	int press;

    	cout<<"\n\t\t\t [1.]  Delete Specific record "<<endl;
  		cout<<"\n\t\t\t [2.]  Delete  Full record "<<endl;
  		cout<<"\n\t\t\t Enter choice...";

    	cin>>press;

	if(press==1){

		int Id;

		cout<<"\n\t\t\t Enter  Employee ID which you want to delete: ";

		cin>>Id;

		for(int i=0;i<total;i++){

			if(e[i].ID == Id){
				e[i].ID=e[i+1].ID;
                e[i].Name=e[i+1].Name;
				e[i].FatherName=e[i+1].FatherName;
				e[i].DOB=e[i+1].DOB;
				e[i].Age=e[i+1].Age;
				e[i].Gender=e[i+1].Gender;
                e[i].Contact=e[i+1].Contact;
              	e[i].CNIC=e[i+1].CNIC;
				e[i].add.address=e[i+1].add.address;
				e[i].add.Nationality=e[i+1].add.Nationality;
				e[i].Qualification=e[i+1].Qualification;
                e[i].Dept=e[i+1].Dept;
                e[i].DOJ=e[i+1].DOJ;
				e[i].Salary=e[i+1].Salary;

				total--;

				cout<<"n\t\t\t Record is Deleted"<<endl;

				break;

			}

			if(i==total-1){

			cout<<"n\t\t\t No such record found"<<endl;

		}

		}

	}

	else if(press==2){

		total=0;

		cout<<"n\t\t\t All record is deleted"<<endl;

	}

	else{

		cout<<"n\t\t\t Invalid Input"<<endl;

	}

}else{

	cout<<"n\t\t\t No data is entered"<<endl;

}

}






int main()
{    cout<<"\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<"<<endl;
     cout<<"\n\t\t\t\t\t        EMPLOYEE RECORD SYSTEM"<<endl;
	 cout<<"\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<"<<endl;
	 string Username;
	  char P[50];
     int upper=0,lower=0,digit=0;
	 cout<<"\n\t\t\t\t\t>>**************SIGN UP**************<<"<<endl;
	 cout<<"\n\t\t\t Enter username: ";
	 cin>>Username;
     cin.ignore();


  do { cout<<"\n\t\t\t Enter Password:";   
  cin.getline(P,50);

   for(int i=0;i<strlen(P);i++)
   { if(isupper(P[i]))
      upper++;
      if(islower(P[i]))
      lower++;
      if(isdigit(P[i]))
      digit++;
   }
   if(strlen(P)<6)
   cout<<"\n\t\t\t --> INVALID \a password should consist of at least 6 characters!!"<<endl;
   if(upper==0)
    cout<<"\n\t\t\t--> INVALID \a password should consist of at least one uppercase letter!!"<<endl;	
   if(lower==0)
     cout<<"\n\t\t\t--> INVALID \a password should consist of at least one lowercase letter!!"<<endl;
   if(digit==0)
     cout<<"\n\t\t\t --> INVALID \a  password should consist of at least one digit!!"<<endl;}
 while(strlen(P)<6 || upper==0 || lower==0 || digit==0);
   {  if(strlen(P)>=6 && upper>0 && lower>0 && digit>0)
cout<<"\n\t\t\t--------------------------------"<<endl;
   cout<<"\n\t\t\t Your PASSWORD is VERIFIED";}
	
     
     cout<<"\n\t\t\t Your new ID is creating please wait";
     
	for(int i=0;i<6;i++)

	{   cout<<".";
		Sleep(500);
	}
	cout<<"\n\t\t\t Your ID created successfully";

	Sleep(2000);
    start:
    system("CLS");
    string usrn,pswd;

	cout<<"\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<"<<endl;
    cout<<"\n\t\t\t\t\t        EMPLOYEE RECORD SYSTEM"<<endl;
    cout<<"\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<"<<endl;

	cout<<"\n\t\t\t\t>>***************LOGIN***************<<"<<endl;

	cout<<"\n\t\t\t Enter Username: ";

	cin>>usrn;

	cout<<"\n\t\t\t Enter Password: ";

	cin>>pswd;

	if(usrn==Username && pswd==P)

	{

	system("CLS");
	cout<<"\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<"<<endl;
    cout<<"\n\t\t\t\t\t        EMPLOYEE RECORD SYSTEM"<<endl;
	cout<<"\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<"<<endl;

	int choice;
	
	while(1){ 	

	cout<<"\n\t\t\t\t  [ 1.] Add Employee"<<endl;

	cout<<"\n\t\t\t\t  [ 2.] Show Record"<<endl;

	cout<<"\n\t\t\t\t  [ 3.] Search Record"<<endl;

	cout<<"\n\t\t\t\t  [ 4.] Update Record"<<endl;

	cout<<"\n\t\t\t\t  [ 5.] Delete Record"<<endl;

	cout<<"\n\t\t\t\t  [ 6.] Logout"<<endl;

	cout<<"\n\t\t\t\t  [ 7.] Exit"<<endl;

	cout<<"\n\t\t\t\t  Enter Choice...";
	cin>>choice;

	system("CLS");

	switch(choice){

		case 1:
			Employeedata();
          	break;
		case 2:
			show();
			break;
    
		case 3:

			search();

			break;

		case 4:

			update();
			break;

		case 5:

			deleterecord();

			break;

		case 6:

			goto start;

			break;

		case 7:

			exit(0);

			break;

		default:

			cout<<"\n\t\t\t\a Invalid Input"<<endl;

			break;
        system("CLS");
	}

}

}

  else if(usrn!=Username)

  {

  	cout<<"\n\t\t\t\a Invalid Username please try again";

  	Sleep(3000);

  	goto start;

  }

  else if(pswd!=P)

  {

  	cout<<"\n\t\t\t\a Invalid Password please try again";

  	Sleep(3000);

  	goto start;

  }

  else{

  	cout<<"\n\t\t\t\a Invalid username and password";

  	Sleep(3000);

  	goto start;

  }

}
    

