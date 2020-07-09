//Find next and previous power of two of a given number in C++
#include<bits/stdc++.h>

using namespace std;

long int  nextPowerOfTwo ( int  n )
{
	// Result is intialized as 1
	long int value = 1;
	// The following while loop will run until we 
	// get a number greater than n
	while(value<=n)
	{
		// value will be left shifted by 1 place in each iteration
		value=value << 1;
	}
	return value ;
}

int  previousPowerOfTwo(int  n )
{
	// If n is already a power of two, we can simply shift it right 
	// by 1 place and get the previous power of 2
	// (n&n-1) will be 0 if n is power of two ( for n > = 2 )
	// (n&&!(n&(n-1))) condition will take care of n < 2;
	if((n&&!(n&(n-1)))==1)
	{
		return (n>>1);
	}
	// This while loop will run until we get a number which is a power of 2
	while(n&n-1)
	{
		// Each time we are performing Bit wise And ( & )operation to clear bits
		n=n&n-1;
	}
	return  n ;
}

int main()
{
	int n;

	cout << "Enter Number\n";
	cin >> n;
	long int num=nextPowerOfTwo(n);
	cout << "Next power of two : " << num ;

	cout << "\n\nEnter Number\n";
	cin >> n;
	num=previousPowerOfTwo(n);
	cout << "Previous power of two : " << num ;
	return 0;
}
