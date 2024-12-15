#include<iostream>
#include<string>

using namespace std;

class Persona{
public:
	string nombre;
	int edad;
	Persona(string n)
	{
		nombre = n;
	}
	~Persona()
	{
		cout<< "Destructor"<<endl;
	}
	void saludar()
	{
		cout<<nombre<<endl;;
	}
};
int main()
{
	Persona *p = new Persona("Edison");
	Persona *p2 = new Persona("Wilfrido");

	
	p->saludar();
	p2->saludar();
}