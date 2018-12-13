// Program needs to be compiled by C++ 11th version, use -std=c++11 to compile

#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include <climits>
#include<tuple>

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


SCENARIO("Testing Prime Number", "Prints prime numbers in int range and long int range " )
{
	GIVEN("Values to be calculated")
	{
		bool isRun = false;

		WHEN("Prime Number is run")
		{
			isRun = prime_num(100,10);

			THEN("Variable changed values")
			{
				REQUIRE( isRun == true );
			}
		}
	}
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


TEST_CASE( "Test count_int", "Couting the number of integer inputs between a lower and upper limits " )
{
    REQUIRE(count_int(0,10) ==  11);
}


long long int count_long_int(int min_long_int, int max_long_int)
{
	int count=0;
	for(int i=min_long_int; i<=max_long_int; i++)
	{
		count += 1;
	}
	return count;
}

TEST_CASE( "Test count_long_int", "Couting the number of long integer inputs between a lower and upper limits " )
{
    REQUIRE(count_long_int(-20,100) == 121);
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

TEST_CASE( "Test time_counter", "Counts the time to increment from the lower to upper limit and returns the count an duration " )
{
  long long int counter = 101;
	double duration = 0.000065;
  REQUIRE(std::get<0>(time_counter(400,500)) == counter);
  REQUIRE(std::get<1>(time_counter(40000,50000)) <= duration);
}
