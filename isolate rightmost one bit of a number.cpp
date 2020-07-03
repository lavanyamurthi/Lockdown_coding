// C++ program to isolate rightmost one bit of a number.
#include <iostream>
using namespace std;

int isolate_rightmost_onebit(int n)
{
	//to compute -n, toggle all bits and add 1 to it 
	int mask=-n;
	// new number after isolating rightmost 1 bit 
	return (n&mask);
}

//driver program to check the code
int main() 
{
	int num;

	cout<<"Enter number: ";
	cin>>num;
	cout<<"original number before isolating rightmost 1 bit: "<<num<<endl;

	int new_number= isolate_rightmost_onebit(num);

	cout<<"new number after isolating rightmost 1 bit: "<<new_number<<endl;

	return 0;
}
