#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include<iostream>
#include<math.h>
#include<stdio.h>
#include<iomanip>
#include<string>
#include<climits>
#include<cmath>

using namespace std;

int* func_1()
{
  //f (n) = 2n
  static int arr[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    arr[i] = 2*i;
  }
  return arr;
}

TEST_CASE("TestFunction1", "2 to the power of iteration"){

    REQUIRE( func_1()[0] == 0 );
    REQUIRE( func_1()[100] == 200 );
}

float* func_2()
{
  //f (n) = sqrt(n)
  static float arr[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    arr[i] = sqrt(i);
  }
  return arr;
}

TEST_CASE("TestFunction2", "square root"){

    REQUIRE( func_2()[0] == 0 );
    REQUIRE( func_2()[100] == 10 );
}

string* func_3()
{
  //f (n) = 10^n
  static long long int temp = 0;
  static string arr_str[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    temp = pow(10,i);
    if (abs(temp+1) >= LLONG_MAX)
    {
      arr_str[i] = "10^"+to_string(i);
    }
    else
    {
      arr_str[i] = to_string(temp);
    }
  }
  return arr_str;
}

TEST_CASE("TestFunction3", "10^n"){

    REQUIRE( func_3()[0] == "1" );
    REQUIRE( func_3()[100] == "10^100" );
}

int* func_4()
{
  //f (n) = n^3
  static int arr[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    arr[i] = pow(i,3);
  }
  return arr;
}

TEST_CASE("TestFunction4", "n^3"){

    REQUIRE( func_4()[0] == 0 );
    REQUIRE( func_4()[100] == 1000000 );
}

string * func_5()
{
  //f (n) = 2^(1/n)
  static string arr[101] = {};
  arr[0] = "Inf";
  for (int i = 1 ;i <=100; i++)
  {
    arr[i] = to_string(pow(2, 1/i));
  }
  return arr;
}

TEST_CASE("TestFunction5", "2^(1/n)"){

    REQUIRE( func_5()[0] == "Inf");
    REQUIRE( func_5()[100] == "1.000000" );
}

string * func_6()
{
  //f (n) = e^(n)
  static long long int temp = 0;
  static string arr_str[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    temp = exp(i);
    if (abs(temp+1) >= LLONG_MAX)
    {
      arr_str[i] = "e^("+to_string(i)+")";
    }
    else
    {
      arr_str[i] = to_string(temp);
    }
  }
  return arr_str;
}

TEST_CASE("TestFunction6", "e^n"){

    REQUIRE( func_6()[0] == "1" );
    REQUIRE( func_6()[100] == "e^(100)" );
}

bool print_table(int input, int arr_1[],float arr_2[],string arr_3[],int arr_4[],string arr_5[],string arr_6[])
{
  // printing the table
  bool indicator = false;
  cout << endl;
  for (int i = 0; i < 183; i++) {cout << "=";}
  cout << endl;
  printf("|%25s|%25s|%25s|%25s|%25s|%25s|%25s|\n", "Number", "2*n", "sqrt(n)", "10^(n)", "n^(3)", "2^(1/n)", "e^(n)");
  for (int i = 0; i < 183; i++) {cout << "=";}
  cout << endl;
  for (int i = 0; i < input ; i ++)
  {
    cout << setw(25) <<i << setw(25) << arr_1[i] << setw(28) << arr_2[i] << setw(27) << arr_3[i] << setw(25) << arr_4[i] << setw(25) << arr_5[i] << setw(25) << arr_6[i]<<"\n";
  }
  indicator = true;
  return indicator;
}

TEST_CASE("TestPrintTable", "Test printing the table output"){
	
	using namespace Catch;

	int input = 3;
	int arr_1[input] = {0, 2, 4};
	float arr_2[input] = {0, 1, 1.41421};
	string arr_3[input] = {"1", "10", "100"};
	int arr_4[input] = {0, 1, 8};
	string arr_5[input] = {"Inf", "2.000000", "1.000000"};
	string arr_6[input] = {"1", "2", "7"};

    REQUIRE( print_table(input,arr_1,arr_2,arr_3,arr_4,arr_5,arr_6) == true );
}