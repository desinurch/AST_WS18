// Program needs to be compiled by C++ 11th version, use -std=c++11 to compile

#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include<limits>


int isValid_r(std::istream& stream)
{
    bool state = false;
    int radius;
    while(!state)
    {
        stream >> radius;
        if(!stream.fail() && (stream.peek()==EOF || stream.peek()=='\n'))
        {
            state = true;
        }
        else
        {
            stream.clear();
            stream.ignore(std::numeric_limits<std::streamsize>::max(),'\n');
            std::cout << "Not a suitable input. Please enter the radius of the circle : " << std::endl;
        }
    }
   	return radius;
}

TEST_CASE( "Test isValid_r", "Testing the validity of the radius input from user" )
{
	// only positive tests can be performed
	std::cout <<"Input the radius 56"<<"\n";
  REQUIRE(isValid_r(std::cin) == 56 );
}

//Check the validity of precision as an input, if it is not valid, use default precision
int isValid_p(std::istream& stream)
{
	int precision;
	stream >> precision;
	if(stream.fail() || precision>15)
	{
		std::cout << "Not a suitable input. Using default maximum precision (15)" << std::endl;
		precision = 15;
	}
	return precision;
}

TEST_CASE( "Test isValid_p" , " Testing the validity of the precision input from user")
{
	// only positive tests can be performed
	std::cout <<"Input the precision 56"<<"\n";
  REQUIRE(isValid_p(std::cin) == 15 );
	std::cout <<"Input the precision 2"<<"\n";
  REQUIRE(isValid_p(std::cin) == 2 );
}

//Printing tables for area and circumference of circle
bool Iteration(int radius,int precision)
{
	long double area, circ, incr_area=0, incr_circ=0, old_area, old_circ;
	double pi = M_PIl, pi_;
	bool isRun = false;

	std::cout << std::setw(5) << "Precision" << std::setw(35) << "pi" << std::setw(35) << "Area of a circle" << std::setw(35) << "Increase perentage of area" << std::setw(35) << "Circumference  " << std::setw(30) << "Increase percentage of Circumference" << std::setw(40) <<"\t" << std::endl;
	std::cout << std::setw(10) << "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" << std::setw(200) << "\t" << std::endl;

	// Initialize for the first value
	old_area = 3 * radius * radius;
	old_circ = 2 * 3 * radius;
	std::cout << std::setw(5) << 0 << std::setw(35) << 3 << std::setw(35) << old_area << std::setw(35) << 0 << std::setw(35) << old_circ << std::setw(35) << 0 << std::setw(35) << "\t" << std::endl;

	// Iteration for next values
	for(int i=1; i<=precision; i++)
	{
		pi_ = floor(pi * pow(10,i))/pow(10,i);
		area = pi_ * radius * radius;
		circ = 2 * pi_ * radius;
		incr_area = (area-old_area)/old_area*100;
		incr_circ = (circ-old_circ)/old_circ*100;
		std::cout << std::setw(5) << i << std::setw(35) << std::setprecision(i+1) << pi_ << std::setw(35) << area << std::setw(35) << incr_area << std::setw(35) << circ << std::setw(35) << incr_circ << std::setw(35) << "\t" << std::endl;
		old_area = area;
		old_circ = circ;
	}

	//Indicator procedure had been completed
	isRun = true;
	return isRun;
}


SCENARIO("Testing Iteration", "Prints tables for area and circumference of circle " )
{
	GIVEN("Values to be calculated")
	{
		bool isRun = false;

		WHEN("Prime Number is run")
		{
			isRun = Iteration(100,10);

			THEN("Variable changed values")
			{
				REQUIRE( isRun == true );
			}
		}
	}
}
