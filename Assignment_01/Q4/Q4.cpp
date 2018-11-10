#include<iostream>
#include<math.h>
#include<iomanip>
#include<cstdio>
#include<limits>

//Check the validity of radius as an input
int isValid_r(int radius)
{
	bool state = false;
	while(!state)
	{
		std::cin >> radius;
		if(!std::cin.fail() && (std::cin.peek()==EOF || std::cin.peek()=='\n'))
		{
			state = true;
		}
		else
		{
			std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(),'\n');
        	std::cout << "Not a suitable input. Please enter the radius of the circle : " << std::endl;
		}
	}
	return radius;	
}

//Check the validity of precision as an input, if it is not valid, use default precision
int isValid_p(int precision)
{
	std::cin >> precision;
	if(std::cin.fail() || precision>15)
	{
		std::cout << "Not a suitable input. Using default maximum precision (15)" << std::endl;
		precision = 15;
	}
	return precision;
}

//Printing tables for area and circumference of circle
void Iteration(int radius,int precision)
{
	long double area, circ, incr_area=0, incr_circ=0, old_area, old_circ;
	double pi = M_PIl, pi_;

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
}

int main()
{
	int radius = 0;
	int precision = 0;
	bool isValid = false;
	
	std::cout << "Please enter the radius of the circle : " << std::endl;
	radius = isValid_r(radius);

	std::cout << "Please enter the maximum precision : " << std::endl;
	precision = isValid_p(precision);

	Iteration(radius, precision);
}