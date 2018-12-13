#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include <iostream>

using namespace std;

long add( int arr[], int size)
{
  long sum = 0;
  for (int i = 0; i < size; i++)
    sum += arr[i];
  return sum;
}

TEST_CASE("TestAdd", "Adding elements inside an array"){
    int arr[3] = {23,4,5};
    int size = 3;
    REQUIRE( add(arr,size) == 32 );
}

long multiply (int arr[], int size)
{
  long product = 1;
  for (int i = 0; i < size; i++)
    product = product * arr[i];
  return product;
}

TEST_CASE("TestMultiply", "Multiply elements inside and array" ){
    int arr[3] = {1,2,3};
    int size = 3;
    REQUIRE( multiply(arr,size) == 6 );
}

int var_calc(int arr[], int avg , int size)
{
  int variance = 0;
  for (int i = 0; i < size; i++)
    variance += (arr[i] -  avg) * (arr[i] -  avg);
  return variance;
}

TEST_CASE("TestVariance", "Calculate variance of an input" ){
    int arr[2] = {1,2};
    int size = 2;
    REQUIRE( var_calc(arr, 1.5, size) == 1 );
}

int small_calc(int arr[], int size)
{
  int smallest = arr[0];
  for (int i = 1; i < size; i++)
  {
    if (arr[i] < smallest)
    {
      smallest = arr[i];
    }
  }
  return smallest;
}

TEST_CASE("TestSmallest", "Calculate smallest value of inputs" ){
    int arr[2] = {1,2};
    int size = 2;
    REQUIRE( small_calc(arr,size) == 1 );
}

int large_calc(int arr[], int n)
{
  int largest = arr[0];
  for (size_t i = 1; i < n; i++)
  {
    if (arr[i] > largest)
    {
      largest = arr[i];
    }
  }
  return largest;
}

TEST_CASE("TestLargest", "Calculate largest value of inputs" ){
    int arr[2] = {1,2};
    int size = 2;
    REQUIRE( large_calc(arr,size) == 2 );
}

int read_int_input(int lower, int upper, istream& stream)
{
  int input = 0;
  bool valid = false;
  do
  {
    stream >> input;
    if (stream.good() && lower <= input &&  input<= upper)
    {
      valid =  true;
    }
    else
    {
      stream.clear();
      stream.ignore(numeric_limits<streamsize>::max(),'\n');
      cout<< "Invalid entry ! Please re-enter the number "<< endl;
    }
  }
  while(!valid);
  return input;
}

TEST_CASE("TestReadingInput", "Read inputs values" ){
  cout << "Input integer 3" << endl;
	REQUIRE( read_int_input(1,100,cin) == 3 );
}

void calculator(int lower, int upper, istream& stream)
{
// 1. It first inputs an integer between 1 and 100 from the user.
// Let’s assume the user inputs n.

  int input_int = 0;
  cout << "Input an integer between "<< lower << " and " << upper << endl;
  input_int = read_int_input(lower , upper , stream);

// 2. It then reads n more integers and stores them.
  int arr[input_int] = {};
  cout<< "Input "<< input_int << " integers between "<< lower << " and " << upper << endl ;
  for (int i = 0; i < input_int; i++)
  {
    arr[i] = read_int_input(lower , upper , stream);
  }


// 3. It computes the sum, the product, the average, the variance,
// the smallest and the largest value of these numbers.
  long sum = add(arr , input_int);
  long product = multiply(arr , input_int);
  int average = sum/input_int;
  int variance = var_calc(arr, average, input_int);
  int smallest = small_calc(arr , input_int);
  int largest = large_calc(arr , input_int);


// 4. It outputs, in a nicely formatted way, all the numbers
//input and the statistics computed.
  cout<< "The input integers are : ";
  for (int i = 0; i < input_int; i++)
  {
    cout<< arr[i] << " ";
  }
  cout<< endl;
  cout<< "Sum : "<< sum << endl;
  cout<< "Product : "<< product << endl;
  cout<< "Average : "<< average << endl;
  cout<< "Variance : "<< variance << endl;
  cout<< "Smallest number : "<< smallest << endl;
  cout<< "Largest number : "<< largest << endl;

}

SCENARIO("TestingCalculatorProcedure", "Prints output from functions" ){
	GIVEN("Values to be calculated")
	{
		int arr[3] = {3,3,3};
    int size = 3;

	  WHEN("Calculator is run")
		{
			cout << "Input integer 3 and 3 3 3 as elements" << endl;
      calculator(1,100, cin);

	    THEN("Variable changed values")
			{
        REQUIRE( add(arr,size) == 9 );
			}
		}
	}
}
