// Program needs to be compiled by C++ 11th version, use -std=c++11 to compile

#include<iostream>
#include<iomanip>
#include<limits>
#include<vector>
#include<ctime>
#include<tuple>

//Constructors
bool prime_num(long int max_long_int, int max_int);
long int count_int(int min_int, int max_int);
long long int count_long_int(int min_long_int, int max_long_int);
std::tuple<int,double> time_counter(long int min, long int max);

bool prime_num(long int max_long_int, int max_int)
{
    bool isRun = false;
    //Check prime numbers and prints
    for(long int i=2; i<=max_long_int; i++)
	{
		for(long int j=2; j<i; j++)
		{
			if(i%j == 0)
				break;
			else if(i == j+1)
			{
				if(i>max_int)
					std::cout << std::setw(10) << '-' << std::setw(20) << "|" << std::setw(10) << i << std::setw(20) << "\t" << std::endl;
				else
					std::cout << std::setw(10) << i << std::setw(20) << "|" << std::setw(10) << i << std::setw(20) << "\t" << std::endl;
			}
		}
	}
	isRun = true;
	return isRun;
}

// Counts the number of integers
long int count_int(int min_int, int max_int)
{
	int count=0;
	for(int i=min_int; i<=max_int; i++)
	{
		count += 1;
	}
	return count;
}

// Counts the number of long integers
long long int count_long_int(int min_long_int, int max_long_int)
{
	int count=0;
	for(int i=min_long_int; i<=max_long_int; i++)
	{
		count += 1;
	}
	return count;
}

std::tuple<int,double> time_counter(long int min, long int max)
{
	std::clock_t start;
	long long int counter;
	double duration;
	//Counter for integers
	if(max == std::numeric_limits<int>::max())
	{
		start = std::clock();
		counter = count_int(min, max);
		duration = ( std::clock() - start ) / (double) CLOCKS_PER_SEC;	
	}	
	//Counter for long integers
	else
	{
		start = std::clock();
		counter = count_long_int(min, max);
		duration = ( std::clock() - start ) / (double) CLOCKS_PER_SEC;		
	}
	return std::make_tuple(counter, duration);
}


int main()
{
	int min_int = std::numeric_limits<int>::min();
	int max_int = std::numeric_limits<int>::max();
	long int min_long_int = std::numeric_limits<long int>::min();
	long int max_long_int = std::numeric_limits<long int>::max();
	double duration_int, duration_long_int;
	long long int counter_int, counter_long_int;
	bool isRun;
	
	std::cout << std::setw(10) << "Prime number integer" << std::setw(20) << "|" << std::setw(10) << "Prime number long integer" << "\t" << std::endl;
	std::cout << std::setw(10) << "======================================================================================================================================================================================================" << std::setw(180) << "\t" << std::endl;
    
    //Prints table
    isRun = prime_num(max_long_int, max_int);
	
	// Duration for program to count number of integer or long integers
	auto t_int = time_counter(min_int,max_int);
	counter_int = std::get<0>(t_int);
	duration_int = std::get<1>(t_int);

	auto t_long_int = time_counter(min_long_int, max_long_int);
	counter_long_int = std::get<0>(t_long_int);
	duration_long_int = std::get<1>(t_long_int);

	std::cout << "Number of count needed for prime integer : " <<  counter_int << " completed in : " << duration_int << " seconds" << std::endl;
	std::cout << "Number of count needed for prime long integer : " << counter_long_int << " completed in : " << duration_long_int << " seconds" << std::endl;

	return 0;
}